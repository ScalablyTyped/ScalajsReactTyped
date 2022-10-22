package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAutoCompleteWithLabelAutoCompleteWithLabelDotuniDotdriverMod {
  
  trait AutoCompleteWithLabelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def clickAtOption(optionIndex: Double): js.Promise[Unit]
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit]
    
    def clickMenuArrow(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getLabelText(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def hasError(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object AutoCompleteWithLabelUniDriver {
    
    inline def apply(
      blur: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      clickAtOption: Double => js.Promise[Unit],
      clickAtOptionWithValue: String => js.Promise[Unit],
      clickMenuArrow: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabelText: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): AutoCompleteWithLabelUniDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, clickAtOption = js.Any.fromFunction1(clickAtOption), clickAtOptionWithValue = js.Any.fromFunction1(clickAtOptionWithValue), clickMenuArrow = clickMenuArrow.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getLabelText = getLabelText.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[AutoCompleteWithLabelUniDriver]
    }
    
    extension [Self <: AutoCompleteWithLabelUniDriver](x: Self) {
      
      inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setClickAtOptionWithValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtOptionWithValue", js.Any.fromFunction1(value))
      
      inline def setClickMenuArrow(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickMenuArrow", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
