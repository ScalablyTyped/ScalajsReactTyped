package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for DataViewDefinition objects.
  *
  * Here's an example of using the builder. The data is imported
  * from a Google spreadsheet.
  *
  *     function doGet() {
  *       // This example creates two table charts side by side. One uses a data view definition to
  *       // restrict the number of displayed columns.
  *
  *       // Get sample data from a spreadsheet.
  *       var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
  *           '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
  *
  *       // Create a chart to display all of the data.
  *       var originalChart = Charts.newTableChart()
  *           .setDimensions(600, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .build();
  *
  *       // Create another chart to display a subset of the data (only columns 1 and 4).
  *       var dataViewDefinition = Charts.newDataViewDefinition().setColumns([0, 3]);
  *       var limitedChart = Charts.newTableChart()
  *           .setDimensions(200, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .setDataViewDefinition(dataViewDefinition)
  *           .build();
  *
  *       var htmlOutput = HtmlService.createHtmlOutput();
  *       var originalChartData = Utilities.base64Encode(originalChart.getAs('image/png').getBytes());
  *       var originalChartUrl = "data:image/png;base64," + encodeURI(originalChartData);
  *       var limitedChartData = Utilities.base64Encode(limitedChart.getAs('image/png').getBytes());
  *       var limitedChartUrl = "data:image/png;base64," + encodeURI(limitedChartData);
  *       htmlOutput.append("<table><tr><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + originalChartUrl + "\">");
  *       htmlOutput.append("</td><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + limitedChartUrl + "\">");
  *       htmlOutput.append("</td></tr></table>");
  *       return htmlOutput;
  *     }
  */
trait DataViewDefinitionBuilder extends js.Object {
  def build(): DataViewDefinition
  def setColumns(columns: js.Array[_]): DataViewDefinitionBuilder
}

object DataViewDefinitionBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[DataViewDefinition],
    setColumns: js.Array[js.Any] => CallbackTo[DataViewDefinitionBuilder]
  ): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setColumns")(js.Any.fromFunction1((t0: js.Array[js.Any]) => setColumns(t0).runNow()))
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
}

