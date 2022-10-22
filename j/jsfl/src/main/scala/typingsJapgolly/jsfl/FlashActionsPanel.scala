package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashActionsPanel extends StObject {
  
  def getClassForObject(): Any
  
  def getScriptAssistMode(): Any
  
  def getSelectedText(): Any
  
  def getText(): Any
  
  def hasSelection(): Any
  
  def replaceSelectedText(): Any
  
  def setScriptAssistMode(): Any
  
  def setSelection(): Any
  
  def setText(): Any
}
object FlashActionsPanel {
  
  inline def apply(
    getClassForObject: CallbackTo[Any],
    getScriptAssistMode: CallbackTo[Any],
    getSelectedText: CallbackTo[Any],
    getText: CallbackTo[Any],
    hasSelection: CallbackTo[Any],
    replaceSelectedText: CallbackTo[Any],
    setScriptAssistMode: CallbackTo[Any],
    setSelection: CallbackTo[Any],
    setText: CallbackTo[Any]
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal(getClassForObject = getClassForObject.toJsFn, getScriptAssistMode = getScriptAssistMode.toJsFn, getSelectedText = getSelectedText.toJsFn, getText = getText.toJsFn, hasSelection = hasSelection.toJsFn, replaceSelectedText = replaceSelectedText.toJsFn, setScriptAssistMode = setScriptAssistMode.toJsFn, setSelection = setSelection.toJsFn, setText = setText.toJsFn)
    __obj.asInstanceOf[FlashActionsPanel]
  }
  
  extension [Self <: FlashActionsPanel](x: Self) {
    
    inline def setGetClassForObject(value: CallbackTo[Any]): Self = StObject.set(x, "getClassForObject", value.toJsFn)
    
    inline def setGetScriptAssistMode(value: CallbackTo[Any]): Self = StObject.set(x, "getScriptAssistMode", value.toJsFn)
    
    inline def setGetSelectedText(value: CallbackTo[Any]): Self = StObject.set(x, "getSelectedText", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[Any]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setHasSelection(value: CallbackTo[Any]): Self = StObject.set(x, "hasSelection", value.toJsFn)
    
    inline def setReplaceSelectedText(value: CallbackTo[Any]): Self = StObject.set(x, "replaceSelectedText", value.toJsFn)
    
    inline def setSetScriptAssistMode(value: CallbackTo[Any]): Self = StObject.set(x, "setScriptAssistMode", value.toJsFn)
    
    inline def setSetSelection(value: CallbackTo[Any]): Self = StObject.set(x, "setSelection", value.toJsFn)
    
    inline def setSetText(value: CallbackTo[Any]): Self = StObject.set(x, "setText", value.toJsFn)
  }
}
