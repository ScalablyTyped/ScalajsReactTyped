package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  def blur(): Any
  
  def exists(): Boolean
  
  def focus(): Any
  
  def getAutoComplete(): Any
  
  def getId(): Any
  
  def getInput(): Any
  
  def getPlaceholder(): Any
  
  def getPrefix(): Any
  
  def getSuffix(): Any
  
  def getValue(): Any
  
  def hasStyleState(stateName: Any): Boolean
  
  def isDisabled(): Any
  
  def isReadOnly(): Any
  
  def keyDown(key: Any): Any
  
  def setValue(value: Any): Unit
}
object Focus {
  
  inline def apply(
    blur: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    focus: CallbackTo[Any],
    getAutoComplete: CallbackTo[Any],
    getId: CallbackTo[Any],
    getInput: CallbackTo[Any],
    getPlaceholder: CallbackTo[Any],
    getPrefix: CallbackTo[Any],
    getSuffix: CallbackTo[Any],
    getValue: CallbackTo[Any],
    hasStyleState: Any => Boolean,
    isDisabled: CallbackTo[Any],
    isReadOnly: CallbackTo[Any],
    keyDown: Any => Any,
    setValue: Any => Callback
  ): Focus = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getAutoComplete = getAutoComplete.toJsFn, getId = getId.toJsFn, getInput = getInput.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getPrefix = getPrefix.toJsFn, getSuffix = getSuffix.toJsFn, getValue = getValue.toJsFn, hasStyleState = js.Any.fromFunction1(hasStyleState), isDisabled = isDisabled.toJsFn, isReadOnly = isReadOnly.toJsFn, keyDown = js.Any.fromFunction1(keyDown), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()))
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[Any]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetAutoComplete(value: CallbackTo[Any]): Self = StObject.set(x, "getAutoComplete", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetInput(value: CallbackTo[Any]): Self = StObject.set(x, "getInput", value.toJsFn)
    
    inline def setGetPlaceholder(value: CallbackTo[Any]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
    
    inline def setGetPrefix(value: CallbackTo[Any]): Self = StObject.set(x, "getPrefix", value.toJsFn)
    
    inline def setGetSuffix(value: CallbackTo[Any]): Self = StObject.set(x, "getSuffix", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setHasStyleState(value: Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    inline def setIsDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Any]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setKeyDown(value: Any => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
