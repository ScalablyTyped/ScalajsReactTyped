package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope
import typingsJapgolly.orbitUiReactComponents.distSharedMod.FocusManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowProps extends StObject {
  
  var arrowProps: RefUndefined | RefMergedRef
  
  var focusManager: FocusManager
  
  var focusScope: DomScope
  
  var isOpen: Boolean
  
  var overlayProps: Ref
  
  def setIsOpen(event: ReactEventFrom[Element], newValue: Boolean): Unit
  
  var triggerProps: Ariacontrols
}
object ArrowProps {
  
  inline def apply(
    arrowProps: RefUndefined | RefMergedRef,
    focusManager: FocusManager,
    focusScope: DomScope,
    isOpen: Boolean,
    overlayProps: Ref,
    setIsOpen: (ReactEventFrom[Element], Boolean) => Callback,
    triggerProps: Ariacontrols
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], focusManager = focusManager.asInstanceOf[js.Any], focusScope = focusScope.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], overlayProps = overlayProps.asInstanceOf[js.Any], setIsOpen = js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: Boolean) => (setIsOpen(t0, t1)).runNow()), triggerProps = triggerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowProps]
  }
  
  extension [Self <: ArrowProps](x: Self) {
    
    inline def setArrowProps(value: RefUndefined | RefMergedRef): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
    
    inline def setFocusManager(value: FocusManager): Self = StObject.set(x, "focusManager", value.asInstanceOf[js.Any])
    
    inline def setFocusScope(value: DomScope): Self = StObject.set(x, "focusScope", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOverlayProps(value: Ref): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
    
    inline def setSetIsOpen(value: (ReactEventFrom[Element], Boolean) => Callback): Self = StObject.set(x, "setIsOpen", js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setTriggerProps(value: Ariacontrols): Self = StObject.set(x, "triggerProps", value.asInstanceOf[js.Any])
  }
}
