package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILegend extends StObject {
  
  var align: Double
  
  def availRows(): Double
  
  var bounds: IRectangle
  
  var chart: IChart
  
  var dividing: IStroke
  
  var fontColor: Boolean
  
  var format: IFormat
  
  var innerOff: Double
  
  var inverted: Boolean
  
  def isVertical(): Boolean
  
  var itemHeight: Double
  
  def itemText(series: ISeries, index: Double): String
  
  def itemsCount(): Double
  
  var legendStyle: String
  
  var over: Double
  
  var padding: Double
  
  var position: String
  
  def showValues(): Boolean
  
  var symbol: ISymbol
  
  var textStyle: String
  
  var title: IAnnotation
  
  def totalWidth(): Double
  
  var transparent: Boolean
  
  var visible: Boolean
}
object ILegend {
  
  inline def apply(
    align: Double,
    availRows: CallbackTo[Double],
    bounds: IRectangle,
    chart: IChart,
    dividing: IStroke,
    fontColor: Boolean,
    format: IFormat,
    innerOff: Double,
    inverted: Boolean,
    isVertical: CallbackTo[Boolean],
    itemHeight: Double,
    itemText: (ISeries, Double) => String,
    itemsCount: CallbackTo[Double],
    legendStyle: String,
    over: Double,
    padding: Double,
    position: String,
    showValues: CallbackTo[Boolean],
    symbol: ISymbol,
    textStyle: String,
    title: IAnnotation,
    totalWidth: CallbackTo[Double],
    transparent: Boolean,
    visible: Boolean
  ): ILegend = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], availRows = availRows.toJsFn, bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dividing = dividing.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], innerOff = innerOff.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], isVertical = isVertical.toJsFn, itemHeight = itemHeight.asInstanceOf[js.Any], itemText = js.Any.fromFunction2(itemText), itemsCount = itemsCount.toJsFn, legendStyle = legendStyle.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showValues = showValues.toJsFn, symbol = symbol.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalWidth = totalWidth.toJsFn, transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
  
  extension [Self <: ILegend](x: Self) {
    
    inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAvailRows(value: CallbackTo[Double]): Self = StObject.set(x, "availRows", value.toJsFn)
    
    inline def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDividing(value: IStroke): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: Boolean): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setInnerOff(value: Double): Self = StObject.set(x, "innerOff", value.asInstanceOf[js.Any])
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setIsVertical(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVertical", value.toJsFn)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemText(value: (ISeries, Double) => String): Self = StObject.set(x, "itemText", js.Any.fromFunction2(value))
    
    inline def setItemsCount(value: CallbackTo[Double]): Self = StObject.set(x, "itemsCount", value.toJsFn)
    
    inline def setLegendStyle(value: String): Self = StObject.set(x, "legendStyle", value.asInstanceOf[js.Any])
    
    inline def setOver(value: Double): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShowValues(value: CallbackTo[Boolean]): Self = StObject.set(x, "showValues", value.toJsFn)
    
    inline def setSymbol(value: ISymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: IAnnotation): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTotalWidth(value: CallbackTo[Double]): Self = StObject.set(x, "totalWidth", value.toJsFn)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
