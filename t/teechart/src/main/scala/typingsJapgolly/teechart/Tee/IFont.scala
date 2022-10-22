package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFont extends StObject {
  
  var baseLine: String
  
  var chart: IChart
  
  var fill: String
  
  def getSize(): Double
  
  var gradient: IGradient
  
  def setSize(size: Double): Unit
  
  var shadow: IShadow
  
  var stroke: IStroke
  
  var style: String
  
  var textAlign: String
}
object IFont {
  
  inline def apply(
    baseLine: String,
    chart: IChart,
    fill: String,
    getSize: CallbackTo[Double],
    gradient: IGradient,
    setSize: Double => Callback,
    shadow: IShadow,
    stroke: IStroke,
    style: String,
    textAlign: String
  ): IFont = {
    val __obj = js.Dynamic.literal(baseLine = baseLine.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getSize = getSize.toJsFn, gradient = gradient.asInstanceOf[js.Any], setSize = js.Any.fromFunction1((t0: Double) => setSize(t0).runNow()), shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  
  extension [Self <: IFont](x: Self) {
    
    inline def setBaseLine(value: String): Self = StObject.set(x, "baseLine", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setGetSize(value: CallbackTo[Double]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGradient(value: IGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setSetSize(value: Double => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShadow(value: IShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
