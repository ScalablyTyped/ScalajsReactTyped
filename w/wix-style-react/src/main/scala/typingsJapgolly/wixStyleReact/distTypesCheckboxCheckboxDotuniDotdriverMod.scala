package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxLabelSize
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckboxCheckboxDotuniDotdriverMod {
  
  trait CheckboxUniDriver
    extends StObject
       with BaseUniDriver {
    
    def blur(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getLabel(): js.Promise[String]
    
    def getLabelSize(): js.Promise[CheckboxLabelSize]
    
    def getTooltipContent(): js.Promise[String]
    
    def hasError(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isIndeterminate(): js.Promise[Boolean]
    
    def isTooltipEnabled(): js.Promise[Boolean]
  }
  object CheckboxUniDriver {
    
    inline def apply(
      blur: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      focus: CallbackTo[js.Promise[Unit]],
      getLabel: CallbackTo[js.Promise[String]],
      getLabelSize: CallbackTo[js.Promise[CheckboxLabelSize]],
      getTooltipContent: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isIndeterminate: CallbackTo[js.Promise[Boolean]],
      isTooltipEnabled: CallbackTo[js.Promise[Boolean]]
    ): CheckboxUniDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getLabel = getLabel.toJsFn, getLabelSize = getLabelSize.toJsFn, getTooltipContent = getTooltipContent.toJsFn, hasError = hasError.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isFocused = isFocused.toJsFn, isIndeterminate = isIndeterminate.toJsFn, isTooltipEnabled = isTooltipEnabled.toJsFn)
      __obj.asInstanceOf[CheckboxUniDriver]
    }
    
    extension [Self <: CheckboxUniDriver](x: Self) {
      
      inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetLabelSize(value: CallbackTo[js.Promise[CheckboxLabelSize]]): Self = StObject.set(x, "getLabelSize", value.toJsFn)
      
      inline def setGetTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsIndeterminate(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isIndeterminate", value.toJsFn)
      
      inline def setIsTooltipEnabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTooltipEnabled", value.toJsFn)
    }
  }
}
