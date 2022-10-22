package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(event: ReactEventFrom[Element]): Unit
  
  var focusScope: DomScope
  
  var isOpen: Boolean
  
  var listboxProps: Arialabel
  
  def open(event: ReactEventFrom[Element], focusTarget: String): Unit
  
  var overlayProps: About
  
  var selectedItem: Avatar
  
  var selectedKey: String
  
  def setSelectedKey(event: ReactEventFrom[Element], newKeys: js.Array[String]): Unit
  
  var triggerProps: Ariaexpanded
}
object Close {
  
  inline def apply(
    close: ReactEventFrom[Element] => Callback,
    focusScope: DomScope,
    isOpen: Boolean,
    listboxProps: Arialabel,
    open: (ReactEventFrom[Element], String) => Callback,
    overlayProps: About,
    selectedItem: Avatar,
    selectedKey: String,
    setSelectedKey: (ReactEventFrom[Element], js.Array[String]) => Callback,
    triggerProps: Ariaexpanded
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => close(t0).runNow()), focusScope = focusScope.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], listboxProps = listboxProps.asInstanceOf[js.Any], open = js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: String) => (open(t0, t1)).runNow()), overlayProps = overlayProps.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], selectedKey = selectedKey.asInstanceOf[js.Any], setSelectedKey = js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: js.Array[String]) => (setSelectedKey(t0, t1)).runNow()), triggerProps = triggerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: ReactEventFrom[Element] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setFocusScope(value: DomScope): Self = StObject.set(x, "focusScope", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setListboxProps(value: Arialabel): Self = StObject.set(x, "listboxProps", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: (ReactEventFrom[Element], String) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOverlayProps(value: About): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Avatar): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedKey(value: (ReactEventFrom[Element], js.Array[String]) => Callback): Self = StObject.set(x, "setSelectedKey", js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def setTriggerProps(value: Ariaexpanded): Self = StObject.set(x, "triggerProps", value.asInstanceOf[js.Any])
  }
}
