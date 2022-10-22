package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for focusable UI elements.
  */
trait UiFocusable extends StObject {
  
  /**
    * Sets focus on the element.
    */
  def setFocus(): Unit
}
object UiFocusable {
  
  inline def apply(setFocus: Callback): UiFocusable = {
    val __obj = js.Dynamic.literal(setFocus = setFocus.toJsFn)
    __obj.asInstanceOf[UiFocusable]
  }
  
  extension [Self <: UiFocusable](x: Self) {
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
  }
}
