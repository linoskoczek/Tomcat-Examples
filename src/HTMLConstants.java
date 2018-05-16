class HTMLConstants {

    final static String HEADER =
            "<head>" +
                "<title>Controller</title>" +
                "<script src='/jquery.js'></script>" +
                "<script src='/ajax.js'></script>" +
            "</head>" +
            "<body>" +
                "<b>Welcome to my page...</b><hr>";

    final static String PROLOG =
            "<h1>Calculator</h1>" +
            "<h2>GET form</h2>" +
            "<form method=\"GET\" action=\"/controller.servlet\">\n" +
            "    <input type=\"number\" name=\"number1\" placeholder=\"First number\">\n" +
            "    <input type=\"number\" name=\"number2\" placeholder=\"Second number\">\n" +
            "    <input type=\"submit\" value=\"Add these numbers\" />\n" +
            "</form>" +
            "<h2>POST form</h2>" +
            "<form method=\"POST\" action=\"/controller.servlet\">\n" +
            "    <input type=\"number\" name=\"number1\" placeholder=\"First number\">\n" +
            "    <input type=\"number\" name=\"number2\" placeholder=\"Second number\">\n" +
            "    <input type=\"submit\" value=\"Add these numbers\" />\n" +
            "</form>";

    final static String FOOTER = "<span id='date'></span>";
}
