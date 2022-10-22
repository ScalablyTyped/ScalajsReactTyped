package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgChartLegendMethods extends StObject {
  
  def destroy(): Unit
  
  def getLegend(): Unit
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String
}
object IgChartLegendMethods {
  
  inline def apply(destroy: Callback, getLegend: Callback, id: CallbackTo[String]): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getLegend = getLegend.toJsFn, id = id.toJsFn)
    __obj.asInstanceOf[IgChartLegendMethods]
  }
  
  extension [Self <: IgChartLegendMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetLegend(value: Callback): Self = StObject.set(x, "getLegend", value.toJsFn)
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
  }
}
