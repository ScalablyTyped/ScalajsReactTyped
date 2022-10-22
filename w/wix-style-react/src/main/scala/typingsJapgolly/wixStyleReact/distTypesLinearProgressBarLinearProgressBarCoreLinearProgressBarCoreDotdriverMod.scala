package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBarCore/LinearProgressBarCore.driver", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarCoreDriver] = js.native
  
  trait LinearProgressBarCoreDriver
    extends StObject
       with BaseDriver {
    
    /** Clicks the component */
    def click(): Unit
    
    /** Returns aria-label prop */
    def getAriaLabel(): String
    
    /** Returns aria-valuemax prop */
    def getAriaValueMax(): Double
    
    /** Returns aria-valuemin prop */
    def getAriaValueMin(): Double
    
    /** Returns aria-valuenow prop */
    def getAriaValueNow(): Double
    
    /** Returns aria-valuetext prop */
    def getAriaValueText(): String
    
    /** Returns max value prop */
    def getMaxValue(): Double
    
    /** Returns min value prop */
    def getMinValue(): Double
    
    /** Get the progress numeric value */
    def getNumericValue(): Double
    
    /** Returns role html attribute */
    def getRoleAttribute(): String
    
    /** Get the suffix indication's text */
    def getSuffixIndicationText(): String
    
    /** Get the progress percentages value */
    def getValue(): String
    
    /** Get the width of the foreground bar (the progress) */
    def getWidth(): String
    
    /** Returns true if has error */
    def hasError(): Boolean
    
    /** Get the prefix indication aria-hidden value */
    def hasPrefixAriaHidden(): Boolean
    
    /** Returns boolean that indicates if the prefix indication exists */
    def hasPrefixIndication(): Boolean
    
    /** Get the progress indication aria-hidden value */
    def hasProgressIndicatorAriaHidden(): Boolean
    
    /** Returns boolean that indicates if the custom suffix indication exists */
    def hasSuffixIndication(): Boolean
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): Boolean
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): Boolean
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): Boolean
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): Boolean
  }
  object LinearProgressBarCoreDriver {
    
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
      getValue: CallbackTo[String],
      getWidth: CallbackTo[String],
      hasError: CallbackTo[Boolean],
      hasPrefixAriaHidden: CallbackTo[Boolean],
      hasPrefixIndication: CallbackTo[Boolean],
      hasProgressIndicatorAriaHidden: CallbackTo[Boolean],
      hasSuffixIndication: CallbackTo[Boolean],
      isCompleted: CallbackTo[Boolean],
      isErrorIconDisplayed: CallbackTo[Boolean],
      isPercentagesProgressDisplayed: CallbackTo[Boolean],
      isSuccessIconDisplayed: CallbackTo[Boolean]
    ): LinearProgressBarCoreDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getAriaValueMax = getAriaValueMax.toJsFn, getAriaValueMin = getAriaValueMin.toJsFn, getAriaValueNow = getAriaValueNow.toJsFn, getAriaValueText = getAriaValueText.toJsFn, getMaxValue = getMaxValue.toJsFn, getMinValue = getMinValue.toJsFn, getNumericValue = getNumericValue.toJsFn, getRoleAttribute = getRoleAttribute.toJsFn, getSuffixIndicationText = getSuffixIndicationText.toJsFn, getValue = getValue.toJsFn, getWidth = getWidth.toJsFn, hasError = hasError.toJsFn, hasPrefixAriaHidden = hasPrefixAriaHidden.toJsFn, hasPrefixIndication = hasPrefixIndication.toJsFn, hasProgressIndicatorAriaHidden = hasProgressIndicatorAriaHidden.toJsFn, hasSuffixIndication = hasSuffixIndication.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
      __obj.asInstanceOf[LinearProgressBarCoreDriver]
    }
    
    extension [Self <: LinearProgressBarCoreDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetAriaLabel(value: CallbackTo[String]): Self = StObject.set(x, "getAriaLabel", value.toJsFn)
      
      inline def setGetAriaValueMax(value: CallbackTo[Double]): Self = StObject.set(x, "getAriaValueMax", value.toJsFn)
      
      inline def setGetAriaValueMin(value: CallbackTo[Double]): Self = StObject.set(x, "getAriaValueMin", value.toJsFn)
      
      inline def setGetAriaValueNow(value: CallbackTo[Double]): Self = StObject.set(x, "getAriaValueNow", value.toJsFn)
      
      inline def setGetAriaValueText(value: CallbackTo[String]): Self = StObject.set(x, "getAriaValueText", value.toJsFn)
      
      inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
      
      inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMinValue", value.toJsFn)
      
      inline def setGetNumericValue(value: CallbackTo[Double]): Self = StObject.set(x, "getNumericValue", value.toJsFn)
      
      inline def setGetRoleAttribute(value: CallbackTo[String]): Self = StObject.set(x, "getRoleAttribute", value.toJsFn)
      
      inline def setGetSuffixIndicationText(value: CallbackTo[String]): Self = StObject.set(x, "getSuffixIndicationText", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[String]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setHasPrefixAriaHidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasPrefixAriaHidden", value.toJsFn)
      
      inline def setHasPrefixIndication(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasPrefixIndication", value.toJsFn)
      
      inline def setHasProgressIndicatorAriaHidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasProgressIndicatorAriaHidden", value.toJsFn)
      
      inline def setHasSuffixIndication(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSuffixIndication", value.toJsFn)
      
      inline def setIsCompleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCompleted", value.toJsFn)
      
      inline def setIsErrorIconDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
      
      inline def setIsPercentagesProgressDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
      
      inline def setIsSuccessIconDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
    }
  }
}
