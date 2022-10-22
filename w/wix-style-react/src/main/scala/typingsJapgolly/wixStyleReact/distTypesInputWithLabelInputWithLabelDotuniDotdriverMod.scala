package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithLabelInputWithLabelDotuniDotdriverMod {
  
  trait InputWithLabelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickInput(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getErrorMessage(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def getMaxLength(): js.Promise[String | Null]
    
    def getSuffixesCount(): js.Promise[Double]
    
    def getValue(): js.Promise[String]
    
    def hasErrorMessage(): js.Promise[Boolean]
    
    def isCustomInput(): js.Promise[Boolean]
    
    def isFocusedStyle(): js.Promise[Boolean]
  }
  object InputWithLabelUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickInput: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getErrorMessage: CallbackTo[js.Promise[String]],
      getLabelText: CallbackTo[js.Promise[String]],
      getMaxLength: CallbackTo[js.Promise[String | Null]],
      getSuffixesCount: CallbackTo[js.Promise[Double]],
      getValue: CallbackTo[js.Promise[String]],
      hasErrorMessage: CallbackTo[js.Promise[Boolean]],
      isCustomInput: CallbackTo[js.Promise[Boolean]],
      isFocusedStyle: CallbackTo[js.Promise[Boolean]]
    ): InputWithLabelUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickInput = clickInput.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getLabelText = getLabelText.toJsFn, getMaxLength = getMaxLength.toJsFn, getSuffixesCount = getSuffixesCount.toJsFn, getValue = getValue.toJsFn, hasErrorMessage = hasErrorMessage.toJsFn, isCustomInput = isCustomInput.toJsFn, isFocusedStyle = isFocusedStyle.toJsFn)
      __obj.asInstanceOf[InputWithLabelUniDriver]
    }
    
    extension [Self <: InputWithLabelUniDriver](x: Self) {
      
      inline def setClickInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickInput", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetErrorMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setGetMaxLength(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getMaxLength", value.toJsFn)
      
      inline def setGetSuffixesCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getSuffixesCount", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasErrorMessage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasErrorMessage", value.toJsFn)
      
      inline def setIsCustomInput(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCustomInput", value.toJsFn)
      
      inline def setIsFocusedStyle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocusedStyle", value.toJsFn)
    }
  }
}
