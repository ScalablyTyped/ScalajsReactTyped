package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttribute extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getAttribute(name: String): js.Promise[String]
  
  def getLabelTextContent(): js.Promise[String]
  
  def getValue(): js.Promise[String]
  
  def hasError(): js.Promise[Boolean]
  
  def isCompleted(): js.Promise[Boolean]
  
  def isErrorIconDisplayed(): js.Promise[Boolean]
  
  def isLabelDisplayed(): js.Promise[Boolean]
  
  def isPercentagesProgressDisplayed(): js.Promise[Boolean]
  
  def isSuccessIconDisplayed(): js.Promise[Boolean]
}
object GetAttribute {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getAttribute: String => js.Promise[String],
    getLabelTextContent: CallbackTo[js.Promise[String]],
    getValue: CallbackTo[js.Promise[String]],
    hasError: CallbackTo[js.Promise[Boolean]],
    isCompleted: CallbackTo[js.Promise[Boolean]],
    isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
    isLabelDisplayed: CallbackTo[js.Promise[Boolean]],
    isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
    isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]]
  ): GetAttribute = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = getLabelTextContent.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
    __obj.asInstanceOf[GetAttribute]
  }
  
  extension [Self <: GetAttribute](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetLabelTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelTextContent", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
    
    inline def setIsCompleted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCompleted", value.toJsFn)
    
    inline def setIsErrorIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
    
    inline def setIsLabelDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLabelDisplayed", value.toJsFn)
    
    inline def setIsPercentagesProgressDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
    
    inline def setIsSuccessIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
  }
}
