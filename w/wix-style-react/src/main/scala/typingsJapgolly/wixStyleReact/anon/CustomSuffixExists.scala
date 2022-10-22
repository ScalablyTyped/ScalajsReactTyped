package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSuffixExists extends StObject {
  
  def clickOnInputWrapper(): js.Promise[Unit]
  
  def customSuffixExists(): js.Promise[Any]
  
  def getMaxHeight(): js.Promise[Any]
  
  def getTagDriverByTagId(tagId: String): js.Promise[TagUniDriverisCloseButton]
  
  def getTagLabelAt(index: Double): js.Promise[String]
  
  def inputWrapperHasFocus(): js.Promise[Any]
  
  def inputWrapperIsDisabled(): js.Promise[Any]
  
  def numberOfTags(): js.Promise[Double]
  
  def pressCommaKey(): js.Promise[Unit]
}
object CustomSuffixExists {
  
  inline def apply(
    clickOnInputWrapper: CallbackTo[js.Promise[Unit]],
    customSuffixExists: CallbackTo[js.Promise[Any]],
    getMaxHeight: CallbackTo[js.Promise[Any]],
    getTagDriverByTagId: String => js.Promise[TagUniDriverisCloseButton],
    getTagLabelAt: Double => js.Promise[String],
    inputWrapperHasFocus: CallbackTo[js.Promise[Any]],
    inputWrapperIsDisabled: CallbackTo[js.Promise[Any]],
    numberOfTags: CallbackTo[js.Promise[Double]],
    pressCommaKey: CallbackTo[js.Promise[Unit]]
  ): CustomSuffixExists = {
    val __obj = js.Dynamic.literal(clickOnInputWrapper = clickOnInputWrapper.toJsFn, customSuffixExists = customSuffixExists.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getTagDriverByTagId = js.Any.fromFunction1(getTagDriverByTagId), getTagLabelAt = js.Any.fromFunction1(getTagLabelAt), inputWrapperHasFocus = inputWrapperHasFocus.toJsFn, inputWrapperIsDisabled = inputWrapperIsDisabled.toJsFn, numberOfTags = numberOfTags.toJsFn, pressCommaKey = pressCommaKey.toJsFn)
    __obj.asInstanceOf[CustomSuffixExists]
  }
  
  extension [Self <: CustomSuffixExists](x: Self) {
    
    inline def setClickOnInputWrapper(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnInputWrapper", value.toJsFn)
    
    inline def setCustomSuffixExists(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "customSuffixExists", value.toJsFn)
    
    inline def setGetMaxHeight(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getMaxHeight", value.toJsFn)
    
    inline def setGetTagDriverByTagId(value: String => js.Promise[TagUniDriverisCloseButton]): Self = StObject.set(x, "getTagDriverByTagId", js.Any.fromFunction1(value))
    
    inline def setGetTagLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getTagLabelAt", js.Any.fromFunction1(value))
    
    inline def setInputWrapperHasFocus(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "inputWrapperHasFocus", value.toJsFn)
    
    inline def setInputWrapperIsDisabled(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "inputWrapperIsDisabled", value.toJsFn)
    
    inline def setNumberOfTags(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numberOfTags", value.toJsFn)
    
    inline def setPressCommaKey(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pressCommaKey", value.toJsFn)
  }
}
