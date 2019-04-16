package com.shanghai.springboot.service;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.util.*;

public class ToPdf {

    public static void main(String[] args) {

        try {

            // 第一步，实例化一个document对象

            Document document = new Document();

            // 第二步，设置要到出的路径

            FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\workbook110.pdf");

            //如果是浏览器通过request请求需要在浏览器中输出则使用下面方式

            //OutputStream out = response.getOutputStream();

            // 第三步,设置字符

            BaseFont bfChinese = BaseFont.createFont("C:/windows/fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            Font fontZH = new Font(bfChinese, 12.0F, 0);

            // 第四步，将pdf文件输出到磁盘

            PdfWriter writer = PdfWriter.getInstance(document, out);

            // 第五步，打开生成的pdf文件

            document.open();

            // 第六步,设置内容

            String title = "导出pdf测试的情况";

            document.add(new Paragraph(new Chunk(title, fontZH).setLocalDestination(title)));

            document.add(new Paragraph("\n"));

            // 创建table,注意这里的2是两列的意思,下面通过table.addCell添加的时候必须添加整行内容的所有列

            PdfPTable table = new PdfPTable(4);

            table.setWidthPercentage(100.0F);

            //第一列是列表名

            table.setHeaderRows(1);

            table.getDefaultCell().setHorizontalAlignment(1);

            table.addCell(new Paragraph("序号", fontZH));

            table.addCell(new Paragraph("性别", fontZH));

            table.addCell(new Paragraph("姓名", fontZH));

            table.addCell(new Paragraph("年龄", fontZH));

            table.addCell(new Paragraph("1", fontZH));

            table.addCell(new Paragraph("男", fontZH));

            table.addCell(new Paragraph("测试名字1", fontZH));

            table.addCell(new Paragraph("20", fontZH));

            table.addCell(new Paragraph("2", fontZH));

            table.addCell(new Paragraph("女", fontZH));

            table.addCell(new Paragraph("测试名字2", fontZH));

            table.addCell(new Paragraph("21", fontZH));

            document.add(table);

            document.add(new Paragraph("\n"));


            // 第七步，关闭document

            document.close();

            System.out.println("导出pdf成功~");


        } catch (Exception e) {

            // TODO: handle exception

            e.printStackTrace();

        }

    }

    @Test
    public void testMap() {
                   //数组转换集合
            String [] strs = new String[]{"132","1321"};
            List<String> lists = Arrays.asList(strs);
            //集合转换数组
            String [] strs2  = (String[]) lists.toArray();
            //迭代器遍历集合
            Iterator iterator = lists.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
            //遍历map
            final Map<String, String> map;
            map = new HashMap<>();
            map.put("1", "asd");
            map.put("2", "asd");
            for (String key : map.keySet()) {

                System.out.println("key: " + key + "; value: " + map.get(key));

        }
    }

}
