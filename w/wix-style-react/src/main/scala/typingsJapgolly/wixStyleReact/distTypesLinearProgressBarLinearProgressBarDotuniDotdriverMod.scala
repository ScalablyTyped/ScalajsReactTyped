package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotuniDotdriverMod.LinearProgressBarCoreUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarDotuniDotdriverMod {
  
  trait LinearProgressBarUniDriver
    extends StObject
       with LinearProgressBarCoreUniDriver {
    
    def getTooltipErrorMessage(): js.Promise[String]
    
    def isErrorIconShown(): js.Promise[Boolean]
    
    def isSuccessIconShown(): js.Promise[Boolean]
  }
  object LinearProgressBarUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAriaLabel: CallbackTo[js.Promise[String]],
      getAriaValueMax: CallbackTo[js.Promise[Double]],
      getAriaValueMin: CallbackTo[js.Promise[Double]],
      getAriaValueNow: CallbackTo[js.Promise[Double]],
      getAriaValueText: CallbackTo[js.Promise[String]],
      getMaxValue: CallbackTo[js.Promise[Double]],
      getMinValue: CallbackTo[js.Promise[Double]],
      getNumericValue: CallbackTo[js.Promise[Double]],
      getRoleAttribute: CallbackTo[js.Promise[String]],
      getSuffixIndicationText: CallbackTo[js.Promise[String]],
      getTooltipErrorMessage: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String | Null]],
      getWidth: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      hasPrefixAriaHidden: CallbackTo[js.Promise[Boolean]],
      hasPrefixIndication: CallbackTo[js.Promise[Boolean]],
      hasProgressIndicatorAriaHidden: CallbackTo[js.Promise[Boolean]],
      hasSuffixIndication: CallbackTo[js.Promise[Boolean]],
      isCompleted: CallbackTo[js.Promise[Boolean]],
      isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isErrorIconShown: CallbackTo[js.Promise[Boolean]],
      isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconShown: CallbackTo[js.Promise[Boolean]]
    ): LinearProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getAriaValueMax = getAriaValueMax.toJsFn, getAriaValueMin = getAriaValueMin.toJsFn, getAriaValueNow = getAriaValueNow.toJsFn, getAriaValueText = getAriaValueText.toJsFn, getMaxValue = getMaxValue.toJsFn, getMinValue = getMinValue.toJsFn, getNumericValue = getNumericValue.toJsFn, getRoleAttribute = getRoleAttribute.toJsFn, getSuffixIndicationText = getSuffixIndicationText.toJsFn, getTooltipErrorMessage = getTooltipErrorMessage.toJsFn, getValue = getValue.toJsFn, getWidth = getWidth.toJsFn, hasError = hasError.toJsFn, hasPrefixAriaHidden = hasPrefixAriaHidden.toJsFn, hasPrefixIndication = hasPrefixIndication.toJsFn, hasProgressIndicatorAriaHidden = hasProgressIndicatorAriaHidden.toJsFn, hasSuffixIndication = hasSuffixIndication.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isErrorIconShown = isErrorIconShown.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn, isSuccessIconShown = isSuccessIconShown.toJsFn)
      __obj.asInstanceOf[LinearProgressBarUniDriver]
    }
    
    extension [Self <: LinearProgressBarUniDriver](x: Self) {
      
      inline def setGetTooltipErrorMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipErrorMessage", value.toJsFn)
      
      inline def setIsErrorIconShown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconShown", value.toJsFn)
      
      inline def setIsSuccessIconShown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconShown", value.toJsFn)
    }
  }
}
