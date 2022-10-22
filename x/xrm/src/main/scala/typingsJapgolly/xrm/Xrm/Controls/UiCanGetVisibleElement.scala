package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the visibility value read.
  */
trait UiCanGetVisibleElement extends StObject {
  
  /**
    * Gets the visibility state.
    * @returns true if the tab is visible, otherwise false.
    */
  def getVisible(): Boolean
}
object UiCanGetVisibleElement {
  
  inline def apply(getVisible: CallbackTo[Boolean]): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = getVisible.toJsFn)
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
  
  extension [Self <: UiCanGetVisibleElement](x: Self) {
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
  }
}
