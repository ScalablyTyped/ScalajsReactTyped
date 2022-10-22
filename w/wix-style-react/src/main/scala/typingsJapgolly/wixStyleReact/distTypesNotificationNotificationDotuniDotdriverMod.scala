package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesNotificationMod.NotificationTheme
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationNotificationDotuniDotdriverMod {
  
  trait NotificationUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnActionButton(): js.Promise[Unit]
    
    def clickOnCloseButton(): js.Promise[Unit]
    
    def getActionButtonText(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def getZIndex(): js.Promise[Double]
    
    def hasActionButton(): js.Promise[Boolean]
    
    def hasCloseButton(): js.Promise[Boolean]
    
    def hasTheme(theme: NotificationTheme): js.Promise[Boolean]
    
    def isAbsolutePositioned(): js.Promise[Boolean]
    
    def isErrorNotification(): js.Promise[Boolean]
    
    def isFixedPositioned(): js.Promise[Boolean]
    
    def isPremiumNotification(): js.Promise[Boolean]
    
    def isRelativelyPositioned(): js.Promise[Boolean]
    
    def isStandardNotification(): js.Promise[Boolean]
    
    def isSuccessNotification(): js.Promise[Boolean]
    
    def isWarningNotification(): js.Promise[Boolean]
    
    def visible(): js.Promise[Boolean]
  }
  object NotificationUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnActionButton: CallbackTo[js.Promise[Unit]],
      clickOnCloseButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getActionButtonText: CallbackTo[js.Promise[String]],
      getLabelText: CallbackTo[js.Promise[String]],
      getZIndex: CallbackTo[js.Promise[Double]],
      hasActionButton: CallbackTo[js.Promise[Boolean]],
      hasCloseButton: CallbackTo[js.Promise[Boolean]],
      hasTheme: NotificationTheme => js.Promise[Boolean],
      isAbsolutePositioned: CallbackTo[js.Promise[Boolean]],
      isErrorNotification: CallbackTo[js.Promise[Boolean]],
      isFixedPositioned: CallbackTo[js.Promise[Boolean]],
      isPremiumNotification: CallbackTo[js.Promise[Boolean]],
      isRelativelyPositioned: CallbackTo[js.Promise[Boolean]],
      isStandardNotification: CallbackTo[js.Promise[Boolean]],
      isSuccessNotification: CallbackTo[js.Promise[Boolean]],
      isWarningNotification: CallbackTo[js.Promise[Boolean]],
      visible: CallbackTo[js.Promise[Boolean]]
    ): NotificationUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnActionButton = clickOnActionButton.toJsFn, clickOnCloseButton = clickOnCloseButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getActionButtonText = getActionButtonText.toJsFn, getLabelText = getLabelText.toJsFn, getZIndex = getZIndex.toJsFn, hasActionButton = hasActionButton.toJsFn, hasCloseButton = hasCloseButton.toJsFn, hasTheme = js.Any.fromFunction1(hasTheme), isAbsolutePositioned = isAbsolutePositioned.toJsFn, isErrorNotification = isErrorNotification.toJsFn, isFixedPositioned = isFixedPositioned.toJsFn, isPremiumNotification = isPremiumNotification.toJsFn, isRelativelyPositioned = isRelativelyPositioned.toJsFn, isStandardNotification = isStandardNotification.toJsFn, isSuccessNotification = isSuccessNotification.toJsFn, isWarningNotification = isWarningNotification.toJsFn, visible = visible.toJsFn)
      __obj.asInstanceOf[NotificationUniDriver]
    }
    
    extension [Self <: NotificationUniDriver](x: Self) {
      
      inline def setClickOnActionButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnActionButton", value.toJsFn)
      
      inline def setClickOnCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnCloseButton", value.toJsFn)
      
      inline def setGetActionButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getActionButtonText", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setGetZIndex(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getZIndex", value.toJsFn)
      
      inline def setHasActionButton(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasActionButton", value.toJsFn)
      
      inline def setHasCloseButton(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasCloseButton", value.toJsFn)
      
      inline def setHasTheme(value: NotificationTheme => js.Promise[Boolean]): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setIsAbsolutePositioned(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isAbsolutePositioned", value.toJsFn)
      
      inline def setIsErrorNotification(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorNotification", value.toJsFn)
      
      inline def setIsFixedPositioned(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFixedPositioned", value.toJsFn)
      
      inline def setIsPremiumNotification(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPremiumNotification", value.toJsFn)
      
      inline def setIsRelativelyPositioned(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRelativelyPositioned", value.toJsFn)
      
      inline def setIsStandardNotification(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isStandardNotification", value.toJsFn)
      
      inline def setIsSuccessNotification(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessNotification", value.toJsFn)
      
      inline def setIsWarningNotification(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isWarningNotification", value.toJsFn)
      
      inline def setVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "visible", value.toJsFn)
    }
  }
}
