package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLinearProgressBarLinearProgressBarDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/linear-progress-bar/LinearProgressBar.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linearProgressBarUniDriverFactory(base: UniDriver[Any]): LinearProgressBarUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("linearProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LinearProgressBarUniDriver]
  
  trait LinearProgressBarUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Returns aria-label prop */
    def getAriaLabel(): js.Promise[String]
    
    /** Returns aria-valuemax prop */
    def getAriaValueMax(): js.Promise[Double]
    
    /** Returns aria-valuemin prop */
    def getAriaValueMin(): js.Promise[Double]
    
    /** Returns aria-valuenow prop */
    def getAriaValueNow(): js.Promise[Double]
    
    /** Returns aria-valuetext prop */
    def getAriaValueText(): js.Promise[String]
    
    /** Returns max value prop */
    def getMaxValue(): js.Promise[Double]
    
    /** Returns min value prop */
    def getMinValue(): js.Promise[Double]
    
    /** Get the progress numeric value */
    def getNumericValue(): js.Promise[Double]
    
    /** Returns role html attribute */
    def getRoleAttribute(): js.Promise[String]
    
    /** Get the suffix indication's text */
    def getSuffixIndicationText(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String]
    
    /** Get the width of the foreground bar (the progress) */
    def getWidth(): js.Promise[String]
    
    /** Returns true if has error */
    def hasError(): js.Promise[Boolean]
    
    /** Get the prefix indication aria-hidden value */
    def hasPrefixAriaHidden(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the prefix indication exists */
    def hasPrefixIndication(): js.Promise[Boolean]
    
    /** Get the progress indication aria-hidden value */
    def hasProgressIndicatorAriaHidden(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the custom suffix indication exists */
    def hasSuffixIndication(): js.Promise[Boolean]
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the error icon exists */
    def isErrorIconDisplayed(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): js.Promise[Boolean]
    
    /** Returns Promise<boolean> that indicates if the success icon exists */
    def isSuccessIconDisplayed(): js.Promise[Boolean]
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
      getValue: CallbackTo[js.Promise[String]],
      getWidth: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      hasPrefixAriaHidden: CallbackTo[js.Promise[Boolean]],
      hasPrefixIndication: CallbackTo[js.Promise[Boolean]],
      hasProgressIndicatorAriaHidden: CallbackTo[js.Promise[Boolean]],
      hasSuffixIndication: CallbackTo[js.Promise[Boolean]],
      isCompleted: CallbackTo[js.Promise[Boolean]],
      isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]]
    ): LinearProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getAriaValueMax = getAriaValueMax.toJsFn, getAriaValueMin = getAriaValueMin.toJsFn, getAriaValueNow = getAriaValueNow.toJsFn, getAriaValueText = getAriaValueText.toJsFn, getMaxValue = getMaxValue.toJsFn, getMinValue = getMinValue.toJsFn, getNumericValue = getNumericValue.toJsFn, getRoleAttribute = getRoleAttribute.toJsFn, getSuffixIndicationText = getSuffixIndicationText.toJsFn, getValue = getValue.toJsFn, getWidth = getWidth.toJsFn, hasError = hasError.toJsFn, hasPrefixAriaHidden = hasPrefixAriaHidden.toJsFn, hasPrefixIndication = hasPrefixIndication.toJsFn, hasProgressIndicatorAriaHidden = hasProgressIndicatorAriaHidden.toJsFn, hasSuffixIndication = hasSuffixIndication.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
      __obj.asInstanceOf[LinearProgressBarUniDriver]
    }
    
    extension [Self <: LinearProgressBarUniDriver](x: Self) {
      
      inline def setGetAriaLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAriaLabel", value.toJsFn)
      
      inline def setGetAriaValueMax(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getAriaValueMax", value.toJsFn)
      
      inline def setGetAriaValueMin(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getAriaValueMin", value.toJsFn)
      
      inline def setGetAriaValueNow(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getAriaValueNow", value.toJsFn)
      
      inline def setGetAriaValueText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAriaValueText", value.toJsFn)
      
      inline def setGetMaxValue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
      
      inline def setGetMinValue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getMinValue", value.toJsFn)
      
      inline def setGetNumericValue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumericValue", value.toJsFn)
      
      inline def setGetRoleAttribute(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRoleAttribute", value.toJsFn)
      
      inline def setGetSuffixIndicationText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSuffixIndicationText", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setHasPrefixAriaHidden(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasPrefixAriaHidden", value.toJsFn)
      
      inline def setHasPrefixIndication(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasPrefixIndication", value.toJsFn)
      
      inline def setHasProgressIndicatorAriaHidden(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasProgressIndicatorAriaHidden", value.toJsFn)
      
      inline def setHasSuffixIndication(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasSuffixIndication", value.toJsFn)
      
      inline def setIsCompleted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCompleted", value.toJsFn)
      
      inline def setIsErrorIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
      
      inline def setIsPercentagesProgressDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
      
      inline def setIsSuccessIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
    }
  }
}
