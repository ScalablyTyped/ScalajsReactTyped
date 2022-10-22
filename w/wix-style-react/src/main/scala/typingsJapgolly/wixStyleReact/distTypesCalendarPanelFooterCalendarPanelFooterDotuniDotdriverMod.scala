package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelFooterCalendarPanelFooterDotuniDotdriverMod {
  
  trait CalendarPanelFooterUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryButton(): js.Promise[Unit]
    
    def clickOnSecondaryButton(): js.Promise[Unit]
    
    def getPrimaryActionButtonLabel(): js.Promise[String]
    
    def getSecondaryActionButtonLabel(): js.Promise[String]
    
    def getSelectedDaysText(): js.Promise[String]
    
    def isPrimaryButtonDisabled(): js.Promise[Boolean]
  }
  object CalendarPanelFooterUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnPrimaryButton: CallbackTo[js.Promise[Unit]],
      clickOnSecondaryButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getPrimaryActionButtonLabel: CallbackTo[js.Promise[String]],
      getSecondaryActionButtonLabel: CallbackTo[js.Promise[String]],
      getSelectedDaysText: CallbackTo[js.Promise[String]],
      isPrimaryButtonDisabled: CallbackTo[js.Promise[Boolean]]
    ): CalendarPanelFooterUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnPrimaryButton = clickOnPrimaryButton.toJsFn, clickOnSecondaryButton = clickOnSecondaryButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getPrimaryActionButtonLabel = getPrimaryActionButtonLabel.toJsFn, getSecondaryActionButtonLabel = getSecondaryActionButtonLabel.toJsFn, getSelectedDaysText = getSelectedDaysText.toJsFn, isPrimaryButtonDisabled = isPrimaryButtonDisabled.toJsFn)
      __obj.asInstanceOf[CalendarPanelFooterUniDriver]
    }
    
    extension [Self <: CalendarPanelFooterUniDriver](x: Self) {
      
      inline def setClickOnPrimaryButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnPrimaryButton", value.toJsFn)
      
      inline def setClickOnSecondaryButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnSecondaryButton", value.toJsFn)
      
      inline def setGetPrimaryActionButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPrimaryActionButtonLabel", value.toJsFn)
      
      inline def setGetSecondaryActionButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSecondaryActionButtonLabel", value.toJsFn)
      
      inline def setGetSelectedDaysText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSelectedDaysText", value.toJsFn)
      
      inline def setIsPrimaryButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrimaryButtonDisabled", value.toJsFn)
    }
  }
}
