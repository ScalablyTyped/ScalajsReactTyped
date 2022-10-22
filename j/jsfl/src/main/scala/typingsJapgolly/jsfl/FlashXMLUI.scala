package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashXMLUI extends StObject {
  
  def accept(): Any
  
  def cancel(): Any
  
  def get(): Any
  
  def getControlItemElement(): Any
  
  def getEnabled(): Any
  
  def getVisible(): Any
  
  def set(): Any
  
  def setControItemElement(): Any
  
  def setControItemElements(): Any
  
  def setEnabled(): Any
  
  def setVisible(): Any
}
object FlashXMLUI {
  
  inline def apply(
    accept: CallbackTo[Any],
    cancel: CallbackTo[Any],
    get: CallbackTo[Any],
    getControlItemElement: CallbackTo[Any],
    getEnabled: CallbackTo[Any],
    getVisible: CallbackTo[Any],
    set: CallbackTo[Any],
    setControItemElement: CallbackTo[Any],
    setControItemElements: CallbackTo[Any],
    setEnabled: CallbackTo[Any],
    setVisible: CallbackTo[Any]
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, cancel = cancel.toJsFn, get = get.toJsFn, getControlItemElement = getControlItemElement.toJsFn, getEnabled = getEnabled.toJsFn, getVisible = getVisible.toJsFn, set = set.toJsFn, setControItemElement = setControItemElement.toJsFn, setControItemElements = setControItemElements.toJsFn, setEnabled = setEnabled.toJsFn, setVisible = setVisible.toJsFn)
    __obj.asInstanceOf[FlashXMLUI]
  }
  
  extension [Self <: FlashXMLUI](x: Self) {
    
    inline def setAccept(value: CallbackTo[Any]): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setCancel(value: CallbackTo[Any]): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetControlItemElement(value: CallbackTo[Any]): Self = StObject.set(x, "getControlItemElement", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Any]): Self = StObject.set(x, "getEnabled", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Any]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setSet(value: CallbackTo[Any]): Self = StObject.set(x, "set", value.toJsFn)
    
    inline def setSetControItemElement(value: CallbackTo[Any]): Self = StObject.set(x, "setControItemElement", value.toJsFn)
    
    inline def setSetControItemElements(value: CallbackTo[Any]): Self = StObject.set(x, "setControItemElements", value.toJsFn)
    
    inline def setSetEnabled(value: CallbackTo[Any]): Self = StObject.set(x, "setEnabled", value.toJsFn)
    
    inline def setSetVisible(value: CallbackTo[Any]): Self = StObject.set(x, "setVisible", value.toJsFn)
  }
}
