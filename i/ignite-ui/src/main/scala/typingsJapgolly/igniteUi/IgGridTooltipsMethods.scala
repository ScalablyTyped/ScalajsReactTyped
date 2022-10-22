package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridTooltipsMethods extends StObject {
  
  /**
    * Destroys the tooltip widget.
    */
  def destroy(): Unit
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String
}
object IgGridTooltipsMethods {
  
  inline def apply(destroy: Callback, id: CallbackTo[String]): IgGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, id = id.toJsFn)
    __obj.asInstanceOf[IgGridTooltipsMethods]
  }
  
  extension [Self <: IgGridTooltipsMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
  }
}
