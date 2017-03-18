/**
 * Created by RENT on 2017-03-18.
 */

$(document).ready(function () {
    $("button").on("click", function () {
            if ($(this).text() == "New Category") {
                $(this).text("List");
                $("#Category2").attr('type', 'text');
                $("#Category").hide();
            } else {
                $(this).text("New Category");
                $("#Category2").attr('type', 'hidden');
                $("#Category").show();
            }
        }
    );
});


