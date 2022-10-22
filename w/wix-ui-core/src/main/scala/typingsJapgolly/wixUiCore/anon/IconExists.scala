package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconExists extends StObject {
  
  def blur(): Any
  
  def click(): Any
  
  def exists(): Boolean
  
  def iconExists(): Boolean
  
  def id(): String
  
  def isChecked(): Boolean
  
  def isDisabled(): Boolean
  
  def isFocusVisible(): Boolean
  
  def isFocused(): Boolean
  
  def isInputFocused(): Boolean
  
  def isRequired(): Boolean
  
  def keyDown(key: String): Any
  
  def labelExists(): Boolean
  
  def name(): String
  
  def select(): Any
  
  def value(): String
}
object IconExists {
  
  inline def apply(
    blur: CallbackTo[Any],
    click: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    iconExists: CallbackTo[Boolean],
    id: CallbackTo[String],
    isChecked: CallbackTo[Boolean],
    isDisabled: CallbackTo[Boolean],
    isFocusVisible: CallbackTo[Boolean],
    isFocused: CallbackTo[Boolean],
    isInputFocused: CallbackTo[Boolean],
    isRequired: CallbackTo[Boolean],
    keyDown: String => Any,
    labelExists: CallbackTo[Boolean],
    name: CallbackTo[String],
    select: CallbackTo[Any],
    value: CallbackTo[String]
  ): IconExists = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, exists = exists.toJsFn, iconExists = iconExists.toJsFn, id = id.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isFocusVisible = isFocusVisible.toJsFn, isFocused = isFocused.toJsFn, isInputFocused = isInputFocused.toJsFn, isRequired = isRequired.toJsFn, keyDown = js.Any.fromFunction1(keyDown), labelExists = labelExists.toJsFn, name = name.toJsFn, select = select.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[IconExists]
  }
  
  extension [Self <: IconExists](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "iconExists", value.toJsFn)
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsFocusVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusVisible", value.toJsFn)
    
    inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
    
    inline def setIsInputFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInputFocused", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setKeyDown(value: String => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setLabelExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "labelExists", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "select", value.toJsFn)
    
    inline def setValue(value: CallbackTo[String]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
