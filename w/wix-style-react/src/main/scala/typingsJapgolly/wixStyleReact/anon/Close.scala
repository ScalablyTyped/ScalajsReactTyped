package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var delegateKeyDown: KeyboardEventHandler[org.scalajs.dom.Element]
  
  var isOpen: Boolean
  
  def open(): Unit
  
  var selectedOption: DropdownLayoutValueOption
  
  def toggle(): Unit
}
object Close {
  
  inline def apply(
    close: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    delegateKeyDown: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback,
    isOpen: Boolean,
    open: Callback,
    selectedOption: DropdownLayoutValueOption,
    toggle: Callback
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => close(t0).runNow()), delegateKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => delegateKeyDown(t0).runNow()), isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, selectedOption = selectedOption.asInstanceOf[js.Any], toggle = toggle.toJsFn)
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setDelegateKeyDown(value: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "delegateKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSelectedOption(value: DropdownLayoutValueOption): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
