package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAriaDescribedBy extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getAriaDescribedBy(): js.Promise[Any]
  
  def getAriaLabel(): js.Promise[Any]
  
  def getAriaLabeledBy(): js.Promise[Any]
  
  def iconExists(): js.Promise[Boolean]
  
  def id(): js.Promise[String]
  
  def isChecked(): js.Promise[Boolean]
  
  def isDisabled(): js.Promise[Boolean]
  
  def isFocusVisible(): js.Promise[Boolean]
  
  def isFocused(): js.Promise[Boolean]
  
  def isInputFocused(): js.Promise[Boolean]
  
  def isRequired(): js.Promise[Boolean]
  
  def keyDown(key: Any): js.Promise[Unit]
  
  def labelExists(): js.Promise[Boolean]
  
  def name(): js.Promise[String]
  
  def value(): js.Promise[String]
}
object GetAriaDescribedBy {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getAriaDescribedBy: CallbackTo[js.Promise[Any]],
    getAriaLabel: CallbackTo[js.Promise[Any]],
    getAriaLabeledBy: CallbackTo[js.Promise[Any]],
    iconExists: CallbackTo[js.Promise[Boolean]],
    id: CallbackTo[js.Promise[String]],
    isChecked: CallbackTo[js.Promise[Boolean]],
    isDisabled: CallbackTo[js.Promise[Boolean]],
    isFocusVisible: CallbackTo[js.Promise[Boolean]],
    isFocused: CallbackTo[js.Promise[Boolean]],
    isInputFocused: CallbackTo[js.Promise[Boolean]],
    isRequired: CallbackTo[js.Promise[Boolean]],
    keyDown: Any => js.Promise[Unit],
    labelExists: CallbackTo[js.Promise[Boolean]],
    name: CallbackTo[js.Promise[String]],
    value: CallbackTo[js.Promise[String]]
  ): GetAriaDescribedBy = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAriaDescribedBy = getAriaDescribedBy.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getAriaLabeledBy = getAriaLabeledBy.toJsFn, iconExists = iconExists.toJsFn, id = id.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isFocusVisible = isFocusVisible.toJsFn, isFocused = isFocused.toJsFn, isInputFocused = isInputFocused.toJsFn, isRequired = isRequired.toJsFn, keyDown = js.Any.fromFunction1(keyDown), labelExists = labelExists.toJsFn, name = name.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[GetAriaDescribedBy]
  }
  
  extension [Self <: GetAriaDescribedBy](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetAriaDescribedBy(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getAriaDescribedBy", value.toJsFn)
    
    inline def setGetAriaLabel(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getAriaLabel", value.toJsFn)
    
    inline def setGetAriaLabeledBy(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getAriaLabeledBy", value.toJsFn)
    
    inline def setIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "iconExists", value.toJsFn)
    
    inline def setId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsFocusVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocusVisible", value.toJsFn)
    
    inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
    
    inline def setIsInputFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isInputFocused", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setKeyDown(value: Any => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setLabelExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "labelExists", value.toJsFn)
    
    inline def setName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
