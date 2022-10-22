package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotuniDotdriverMod.CircularProgressBarCoreUniDriver
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSize
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarDotuniDotdriverMod {
  
  trait CircularProgressBarUniDriver
    extends StObject
       with CircularProgressBarCoreUniDriver {
    
    def getSize(): js.Promise[CircularProgressBarSize]
    
    def getTooltipErrorMessage(): js.Promise[Any]
    
    def hasSkin(skinName: CircularProgressBarSkin): js.Promise[Boolean]
    
    def isErrorIconShown(): js.Promise[Boolean]
    
    def isSuccessIconShown(): js.Promise[Boolean]
  }
  object CircularProgressBarUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAttribute: String => js.Promise[String | Null],
      getLabelTextContent: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[CircularProgressBarSize]],
      getTooltipErrorMessage: CallbackTo[js.Promise[Any]],
      getValue: CallbackTo[js.Promise[String | Null]],
      hasError: CallbackTo[js.Promise[Boolean]],
      hasSkin: CircularProgressBarSkin => js.Promise[Boolean],
      isCompleted: CallbackTo[js.Promise[Boolean]],
      isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isErrorIconShown: CallbackTo[js.Promise[Boolean]],
      isLabelDisplayed: CallbackTo[js.Promise[Boolean]],
      isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconShown: CallbackTo[js.Promise[Boolean]]
    ): CircularProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = getLabelTextContent.toJsFn, getSize = getSize.toJsFn, getTooltipErrorMessage = getTooltipErrorMessage.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, hasSkin = js.Any.fromFunction1(hasSkin), isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isErrorIconShown = isErrorIconShown.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn, isSuccessIconShown = isSuccessIconShown.toJsFn)
      __obj.asInstanceOf[CircularProgressBarUniDriver]
    }
    
    extension [Self <: CircularProgressBarUniDriver](x: Self) {
      
      inline def setGetSize(value: CallbackTo[js.Promise[CircularProgressBarSize]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTooltipErrorMessage(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTooltipErrorMessage", value.toJsFn)
      
      inline def setHasSkin(value: CircularProgressBarSkin => js.Promise[Boolean]): Self = StObject.set(x, "hasSkin", js.Any.fromFunction1(value))
      
      inline def setIsErrorIconShown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconShown", value.toJsFn)
      
      inline def setIsSuccessIconShown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconShown", value.toJsFn)
    }
  }
}
