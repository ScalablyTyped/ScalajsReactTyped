package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBinding extends StObject {
  
  def addKeyboardHandler(kb: KeyboardHandler, pos: Double): Unit
  
  def getKeyboardHandler(): KeyboardHandler
  
  def onCommandKey(e: Any, hashId: Double, keyCode: Double): Boolean
  
  def onTextInput(text: String): Boolean
  
  def removeKeyboardHandler(kb: KeyboardHandler): Boolean
  
  def setDefaultHandler(kb: KeyboardHandler): Unit
  
  def setKeyboardHandler(kb: KeyboardHandler): Unit
}
object KeyBinding {
  
  inline def apply(
    addKeyboardHandler: (KeyboardHandler, Double) => Callback,
    getKeyboardHandler: CallbackTo[KeyboardHandler],
    onCommandKey: (Any, Double, Double) => Boolean,
    onTextInput: String => Boolean,
    removeKeyboardHandler: KeyboardHandler => Boolean,
    setDefaultHandler: KeyboardHandler => Callback,
    setKeyboardHandler: KeyboardHandler => Callback
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2((t0: KeyboardHandler, t1: Double) => (addKeyboardHandler(t0, t1)).runNow()), getKeyboardHandler = getKeyboardHandler.toJsFn, onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1((t0: KeyboardHandler) => setDefaultHandler(t0).runNow()), setKeyboardHandler = js.Any.fromFunction1((t0: KeyboardHandler) => setKeyboardHandler(t0).runNow()))
    __obj.asInstanceOf[KeyBinding]
  }
  
  extension [Self <: KeyBinding](x: Self) {
    
    inline def setAddKeyboardHandler(value: (KeyboardHandler, Double) => Callback): Self = StObject.set(x, "addKeyboardHandler", js.Any.fromFunction2((t0: KeyboardHandler, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetKeyboardHandler(value: CallbackTo[KeyboardHandler]): Self = StObject.set(x, "getKeyboardHandler", value.toJsFn)
    
    inline def setOnCommandKey(value: (Any, Double, Double) => Boolean): Self = StObject.set(x, "onCommandKey", js.Any.fromFunction3(value))
    
    inline def setOnTextInput(value: String => Boolean): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
    
    inline def setRemoveKeyboardHandler(value: KeyboardHandler => Boolean): Self = StObject.set(x, "removeKeyboardHandler", js.Any.fromFunction1(value))
    
    inline def setSetDefaultHandler(value: KeyboardHandler => Callback): Self = StObject.set(x, "setDefaultHandler", js.Any.fromFunction1((t0: KeyboardHandler) => value(t0).runNow()))
    
    inline def setSetKeyboardHandler(value: KeyboardHandler => Callback): Self = StObject.set(x, "setKeyboardHandler", js.Any.fromFunction1((t0: KeyboardHandler) => value(t0).runNow()))
  }
}
