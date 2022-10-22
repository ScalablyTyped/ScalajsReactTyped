package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotdriverMod.CircularProgressBarCoreDriver
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSize
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarDotdriverMod {
  
  trait CircularProgressBarDriver
    extends StObject
       with CircularProgressBarCoreDriver {
    
    def getSize(): CircularProgressBarSize
    
    def getTooltipErrorMessage(): String
    
    def hasSkin(skinName: CircularProgressBarSkin): Boolean
    
    def isErrorIconShown(): Boolean
    
    def isSuccessIconShown(): Boolean
  }
  object CircularProgressBarDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getLabelTextContent: CallbackTo[js.UndefOr[String | Null]],
      getSize: CallbackTo[CircularProgressBarSize],
      getTooltipErrorMessage: CallbackTo[String],
      getValue: CallbackTo[js.UndefOr[String | Null]],
      hasError: CallbackTo[Boolean],
      hasSkin: CircularProgressBarSkin => Boolean,
      isCompleted: CallbackTo[Boolean],
      isErrorIconDisplayed: CallbackTo[Boolean],
      isErrorIconShown: CallbackTo[Boolean],
      isLabelDisplayed: CallbackTo[Boolean],
      isPercentagesProgressDisplayed: CallbackTo[Boolean],
      isSuccessIconDisplayed: CallbackTo[Boolean],
      isSuccessIconShown: CallbackTo[Boolean]
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getLabelTextContent = getLabelTextContent.toJsFn, getSize = getSize.toJsFn, getTooltipErrorMessage = getTooltipErrorMessage.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, hasSkin = js.Any.fromFunction1(hasSkin), isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isErrorIconShown = isErrorIconShown.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn, isSuccessIconShown = isSuccessIconShown.toJsFn)
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    extension [Self <: CircularProgressBarDriver](x: Self) {
      
      inline def setGetSize(value: CallbackTo[CircularProgressBarSize]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTooltipErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getTooltipErrorMessage", value.toJsFn)
      
      inline def setHasSkin(value: CircularProgressBarSkin => Boolean): Self = StObject.set(x, "hasSkin", js.Any.fromFunction1(value))
      
      inline def setIsErrorIconShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorIconShown", value.toJsFn)
      
      inline def setIsSuccessIconShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessIconShown", value.toJsFn)
    }
  }
}
