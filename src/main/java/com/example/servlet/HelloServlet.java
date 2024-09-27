package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>This is the second (not really) version of the app</h1>");

        response.getWriter().println("<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lobortis ex in augue ornare, non facilisis erat dictum. Etiam tempor magna est, vitae volutpat magna varius ac. Pellentesque vel porttitor nisi, nec efficitur sem. Maecenas finibus malesuada feugiat. Nunc lacinia diam tortor, a rhoncus nulla facilisis nec. Nulla congue lacus aliquet mi dapibus, nec tincidunt enim convallis. Aenean fermentum nibh vitae elementum euismod. Nullam mattis justo vel nibh pretium, ut imperdiet nisl elementum. Aliquam sed dapibus tellus. Nunc ac molestie enim. Cras vestibulum lorem lectus, at viverra risus hendrerit eget. Proin bibendum sollicitudin vestibulum. In commodo metus nisl, in posuere justo imperdiet sed. Curabitur erat mauris, facilisis at mattis non, scelerisque ornare felis. Etiam eu dolor non ante interdum pulvinar sed quis diam.\n" +
                "\n" +
                "Morbi dictum felis a tortor consequat, eget pharetra sapien consectetur. In hac habitasse platea dictumst. Pellentesque interdum dolor sed lectus euismod volutpat sit amet at neque. Maecenas iaculis turpis sed lectus suscipit bibendum. Fusce at nisi id eros semper malesuada suscipit eget erat. Proin vestibulum nisi sed enim tincidunt, id tempus justo viverra. Suspendisse accumsan arcu ex. Nulla facilisi. Duis velit justo, gravida id leo et, venenatis suscipit est.\n" +
                "\n" +
                "Donec dictum at est eu eleifend. Praesent egestas purus sagittis nibh porttitor, eu tincidunt sem vulputate. Donec tempor aliquet augue, nec congue diam porttitor eget. Etiam tincidunt ante molestie, iaculis tortor nec, sollicitudin neque. Aliquam egestas eros at justo vulputate laoreet. In eget mollis massa. Vivamus quis neque venenatis dolor ornare aliquet ac eu enim. Phasellus at leo iaculis, mattis metus in, ullamcorper purus. Duis gravida volutpat risus, ac ornare urna varius at. Nam nec enim eget est accumsan rhoncus in non sapien. Morbi viverra quis justo vitae euismod. Curabitur id felis sapien.\n" +
                "\n" +
                "Integer auctor efficitur nisi eget mattis. Nunc orci odio, bibendum et metus quis, efficitur dapibus ipsum. Maecenas imperdiet nibh nec nulla suscipit porttitor. Ut blandit quam sit amet lacus feugiat porttitor. Vivamus maximus, purus vel sollicitudin ultrices, neque ex venenatis leo, et porta erat est vitae arcu. Etiam rhoncus quis massa id efficitur. Fusce condimentum turpis vitae tortor vulputate, a tincidunt risus fermentum. Donec a elit sed ipsum mattis euismod a vel neque. Vestibulum mattis pretium volutpat.</p>");
    }
}
