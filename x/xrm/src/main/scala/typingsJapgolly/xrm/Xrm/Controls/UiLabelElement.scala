package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements with labels.
  */
trait UiLabelElement extends StObject {
  
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): String
  
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit
}
object UiLabelElement {
  
  inline def apply(getLabel: CallbackTo[String], setLabel: String => Callback): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = getLabel.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[UiLabelElement]
  }
  
  extension [Self <: UiLabelElement](x: Self) {
    
    inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setSetLabel(value: String => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
