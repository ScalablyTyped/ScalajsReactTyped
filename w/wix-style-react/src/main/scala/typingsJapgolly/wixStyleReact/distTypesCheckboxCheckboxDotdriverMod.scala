package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxLabelSize
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckboxCheckboxDotdriverMod {
  
  trait CheckboxDriver
    extends StObject
       with BaseDriver {
    
    def blur(): Unit
    
    def click(): Unit
    
    def focus(): Unit
    
    def getLabel(): String
    
    def getLabelSize(): CheckboxLabelSize
    
    def getTooltipContent(): js.Promise[String]
    
    def hasError(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def isFocused(): Boolean
    
    def isIndeterminate(): Boolean
    
    def isTooltipEnabled(): js.Promise[Boolean]
  }
  object CheckboxDriver {
    
    inline def apply(
      blur: Callback,
      click: Callback,
      exists: CallbackTo[Boolean],
      focus: Callback,
      getLabel: CallbackTo[String],
      getLabelSize: CallbackTo[CheckboxLabelSize],
      getTooltipContent: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[Boolean],
      isChecked: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      isFocused: CallbackTo[Boolean],
      isIndeterminate: CallbackTo[Boolean],
      isTooltipEnabled: CallbackTo[js.Promise[Boolean]]
    ): CheckboxDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getLabel = getLabel.toJsFn, getLabelSize = getLabelSize.toJsFn, getTooltipContent = getTooltipContent.toJsFn, hasError = hasError.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isFocused = isFocused.toJsFn, isIndeterminate = isIndeterminate.toJsFn, isTooltipEnabled = isTooltipEnabled.toJsFn)
      __obj.asInstanceOf[CheckboxDriver]
    }
    
    extension [Self <: CheckboxDriver](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetLabelSize(value: CallbackTo[CheckboxLabelSize]): Self = StObject.set(x, "getLabelSize", value.toJsFn)
      
      inline def setGetTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipContent", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsIndeterminate(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIndeterminate", value.toJsFn)
      
      inline def setIsTooltipEnabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTooltipEnabled", value.toJsFn)
    }
  }
}
