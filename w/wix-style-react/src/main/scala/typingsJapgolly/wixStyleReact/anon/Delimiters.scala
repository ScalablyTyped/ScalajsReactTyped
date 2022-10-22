package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delimiters extends StObject {
  
  var delimiters: Any
  
  var disableEditing: Boolean
  
  var inputElement: typingsJapgolly.react.mod.global.JSX.Element
  
  def onKeyDown(event: Any): Unit
  
  def onPaste(): Unit
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object Delimiters {
  
  inline def apply(
    delimiters: Any,
    disableEditing: Boolean,
    inputElement: VdomElement,
    onKeyDown: Any => Callback,
    onPaste: Callback
  ): Delimiters = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], disableEditing = disableEditing.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1((t0: Any) => onKeyDown(t0).runNow()), onPaste = onPaste.toJsFn)
    __obj.asInstanceOf[Delimiters]
  }
  
  extension [Self <: Delimiters](x: Self) {
    
    inline def setDelimiters(value: Any): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
    
    inline def setInputElement(value: VdomElement): Self = StObject.set(x, "inputElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: Any => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnPaste(value: Callback): Self = StObject.set(x, "onPaste", value.toJsFn)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
