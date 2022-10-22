package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A text style configuration object. Used in charts options to configure text style for elements
  * that accepts it, such as title, horizontal axis, vertical axis, legend and tooltip.
  *
  *     // This example creates a chart specifying different text styles for the title and axes.
  *       var sampleData = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Seasons")
  *           .addColumn(Charts.ColumnType.NUMBER, "Rainy Days")
  *           .addRow(["Winter", 5])
  *           .addRow(["Spring", 12])
  *           .addRow(["Summer", 8])
  *           .addRow(["Fall", 8])
  *           .build();
  *
  *       var titleTextStyleBuilder = Charts.newTextStyle()
  *           .setColor('#0000FF').setFontSize(26).setFontName('Ariel');
  *       var axisTextStyleBuilder = Charts.newTextStyle()
  *           .setColor('#3A3A3A').setFontSize(20).setFontName('Ariel');
  *       var titleTextStyle = titleTextStyleBuilder.build();
  *       var axisTextStyle = axisTextStyleBuilder.build();
  *
  *       var chart = Charts.newLineChart()
  *           .setTitleTextStyle(titleTextStyle)
  *           .setXAxisTitleTextStyle(axisTextStyle)
  *           .setYAxisTitleTextStyle(axisTextStyle)
  *           .setTitle('Rainy Days Per Season')
  *           .setXAxisTitle('Season')
  *           .setYAxisTitle('Number of Rainy Days')
  *           .setDataTable(sampleData)
  *           .build();
  */
trait TextStyle extends StObject {
  
  def getColor(): String
  
  def getFontName(): String
  
  def getFontSize(): Double
}
object TextStyle {
  
  inline def apply(getColor: CallbackTo[String], getFontName: CallbackTo[String], getFontSize: CallbackTo[Double]): TextStyle = {
    val __obj = js.Dynamic.literal(getColor = getColor.toJsFn, getFontName = getFontName.toJsFn, getFontSize = getFontSize.toJsFn)
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetFontName(value: CallbackTo[String]): Self = StObject.set(x, "getFontName", value.toJsFn)
    
    inline def setGetFontSize(value: CallbackTo[Double]): Self = StObject.set(x, "getFontSize", value.toJsFn)
  }
}
