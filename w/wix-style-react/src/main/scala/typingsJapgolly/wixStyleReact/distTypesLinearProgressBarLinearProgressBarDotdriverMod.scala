package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotdriverMod.LinearProgressBarCoreDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarDotdriverMod {
  
  trait LinearProgressBarDriver
    extends StObject
       with LinearProgressBarCoreDriver {
    
    def getTooltipErrorMessage(): String
    
    def isErrorIconShown(): Boolean
    
    def isSuccessIconShown(): Boolean
  }
  object LinearProgressBarDriver {
    
    inline def apply(
      click: Callback,
      exists: CallbackTo[Boolean],
      getAriaLabel: CallbackTo[String],
      getAriaValueMax: CallbackTo[Double],
      getAriaValueMin: CallbackTo[Double],
      getAriaValueNow: CallbackTo[Double],
      getAriaValueText: CallbackTo[String],
      getMaxValue: CallbackTo[Double],
      getMinValue: CallbackTo[Double],
      getNumericValue: CallbackTo[Double],
      getRoleAttribute: CallbackTo[String],
      getSuffixIndicationText: CallbackTo[String],
      getTooltipErrorMessage: CallbackTo[String],
      getValue: CallbackTo[String],
      getWidth: CallbackTo[String],
      hasError: CallbackTo[Boolean],
      hasPrefixAriaHidden: CallbackTo[Boolean],
      hasPrefixIndication: CallbackTo[Boolean],
      hasProgressIndicatorAriaHidden: CallbackTo[Boolean],
      hasSuffixIndication: CallbackTo[Boolean],
      isCompleted: CallbackTo[Boolean],
      isErrorIconDisplayed: CallbackTo[Boolean],
      isErrorIconShown: CallbackTo[Boolean],
      isPercentagesProgressDisplayed: CallbackTo[Boolean],
      isSuccessIconDisplayed: CallbackTo[Boolean],
      isSuccessIconShown: CallbackTo[Boolean]
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getAriaValueMax = getAriaValueMax.toJsFn, getAriaValueMin = getAriaValueMin.toJsFn, getAriaValueNow = getAriaValueNow.toJsFn, getAriaValueText = getAriaValueText.toJsFn, getMaxValue = getMaxValue.toJsFn, getMinValue = getMinValue.toJsFn, getNumericValue = getNumericValue.toJsFn, getRoleAttribute = getRoleAttribute.toJsFn, getSuffixIndicationText = getSuffixIndicationText.toJsFn, getTooltipErrorMessage = getTooltipErrorMessage.toJsFn, getValue = getValue.toJsFn, getWidth = getWidth.toJsFn, hasError = hasError.toJsFn, hasPrefixAriaHidden = hasPrefixAriaHidden.toJsFn, hasPrefixIndication = hasPrefixIndication.toJsFn, hasProgressIndicatorAriaHidden = hasProgressIndicatorAriaHidden.toJsFn, hasSuffixIndication = hasSuffixIndication.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isErrorIconShown = isErrorIconShown.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn, isSuccessIconShown = isSuccessIconShown.toJsFn)
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    extension [Self <: LinearProgressBarDriver](x: Self) {
      
      inline def setGetTooltipErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getTooltipErrorMessage", value.toJsFn)
      
      inline def setIsErrorIconShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorIconShown", value.toJsFn)
      
      inline def setIsSuccessIconShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessIconShown", value.toJsFn)
    }
  }
}
