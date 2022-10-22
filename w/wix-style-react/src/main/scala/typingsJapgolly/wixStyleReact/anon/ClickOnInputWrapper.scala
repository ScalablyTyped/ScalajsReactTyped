package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesTagTagDotdriverMod.TagDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOnInputWrapper extends StObject {
  
  def clickOnInputWrapper(): Unit
  
  def customSuffixExists(): HTMLElement
  
  def getMaxHeight(): String
  
  def getTagDriverByTagId(tagId: String): TagDriver
  
  def getTagLabelAt(index: Double): String
  
  def inputWrapperHasFocus(): Boolean
  
  def inputWrapperIsDisabled(): Boolean
  
  def numberOfTags(): Double
  
  def pressCommaKey(): Unit
}
object ClickOnInputWrapper {
  
  inline def apply(
    clickOnInputWrapper: Callback,
    customSuffixExists: CallbackTo[HTMLElement],
    getMaxHeight: CallbackTo[String],
    getTagDriverByTagId: String => TagDriver,
    getTagLabelAt: Double => String,
    inputWrapperHasFocus: CallbackTo[Boolean],
    inputWrapperIsDisabled: CallbackTo[Boolean],
    numberOfTags: CallbackTo[Double],
    pressCommaKey: Callback
  ): ClickOnInputWrapper = {
    val __obj = js.Dynamic.literal(clickOnInputWrapper = clickOnInputWrapper.toJsFn, customSuffixExists = customSuffixExists.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getTagDriverByTagId = js.Any.fromFunction1(getTagDriverByTagId), getTagLabelAt = js.Any.fromFunction1(getTagLabelAt), inputWrapperHasFocus = inputWrapperHasFocus.toJsFn, inputWrapperIsDisabled = inputWrapperIsDisabled.toJsFn, numberOfTags = numberOfTags.toJsFn, pressCommaKey = pressCommaKey.toJsFn)
    __obj.asInstanceOf[ClickOnInputWrapper]
  }
  
  extension [Self <: ClickOnInputWrapper](x: Self) {
    
    inline def setClickOnInputWrapper(value: Callback): Self = StObject.set(x, "clickOnInputWrapper", value.toJsFn)
    
    inline def setCustomSuffixExists(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "customSuffixExists", value.toJsFn)
    
    inline def setGetMaxHeight(value: CallbackTo[String]): Self = StObject.set(x, "getMaxHeight", value.toJsFn)
    
    inline def setGetTagDriverByTagId(value: String => TagDriver): Self = StObject.set(x, "getTagDriverByTagId", js.Any.fromFunction1(value))
    
    inline def setGetTagLabelAt(value: Double => String): Self = StObject.set(x, "getTagLabelAt", js.Any.fromFunction1(value))
    
    inline def setInputWrapperHasFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "inputWrapperHasFocus", value.toJsFn)
    
    inline def setInputWrapperIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "inputWrapperIsDisabled", value.toJsFn)
    
    inline def setNumberOfTags(value: CallbackTo[Double]): Self = StObject.set(x, "numberOfTags", value.toJsFn)
    
    inline def setPressCommaKey(value: Callback): Self = StObject.set(x, "pressCommaKey", value.toJsFn)
  }
}
