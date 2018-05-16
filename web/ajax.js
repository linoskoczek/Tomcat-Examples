function getDateFromServlet() {
    $.get( "date", function( data ) {
        $( "#date" ).html( data.date );
    });
}

setInterval(() => {getDateFromServlet();}, 1000);