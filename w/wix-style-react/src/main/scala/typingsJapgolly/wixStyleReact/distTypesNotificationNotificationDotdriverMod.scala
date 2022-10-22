package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesNotificationMod.NotificationTheme
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationNotificationDotdriverMod {
  
  trait NotificationDriver
    extends StObject
       with BaseDriver {
    
    def clickOnActionButton(): Unit
    
    def clickOnCloseButton(): Unit
    
    def getActionButtonText(): String
    
    def getLabelText(): String
    
    def getZIndex(): Double
    
    def hasActionButton(): Boolean
    
    def hasCloseButton(): Boolean
    
    def hasTheme(theme: NotificationTheme): Boolean
    
    def isAbsolutePositioned(): Boolean
    
    def isErrorNotification(): Boolean
    
    def isFixedPositioned(): Boolean
    
    def isPremiumNotification(): Boolean
    
    def isRelativelyPositioned(): Boolean
    
    def isStandardNotification(): Boolean
    
    def isSuccessNotification(): Boolean
    
    def isWarningNotification(): Boolean
    
    def visible(): Boolean
  }
  object NotificationDriver {
    
    inline def apply(
      clickOnActionButton: Callback,
      clickOnCloseButton: Callback,
      exists: CallbackTo[Boolean],
      getActionButtonText: CallbackTo[String],
      getLabelText: CallbackTo[String],
      getZIndex: CallbackTo[Double],
      hasActionButton: CallbackTo[Boolean],
      hasCloseButton: CallbackTo[Boolean],
      hasTheme: NotificationTheme => Boolean,
      isAbsolutePositioned: CallbackTo[Boolean],
      isErrorNotification: CallbackTo[Boolean],
      isFixedPositioned: CallbackTo[Boolean],
      isPremiumNotification: CallbackTo[Boolean],
      isRelativelyPositioned: CallbackTo[Boolean],
      isStandardNotification: CallbackTo[Boolean],
      isSuccessNotification: CallbackTo[Boolean],
      isWarningNotification: CallbackTo[Boolean],
      visible: CallbackTo[Boolean]
    ): NotificationDriver = {
      val __obj = js.Dynamic.literal(clickOnActionButton = clickOnActionButton.toJsFn, clickOnCloseButton = clickOnCloseButton.toJsFn, exists = exists.toJsFn, getActionButtonText = getActionButtonText.toJsFn, getLabelText = getLabelText.toJsFn, getZIndex = getZIndex.toJsFn, hasActionButton = hasActionButton.toJsFn, hasCloseButton = hasCloseButton.toJsFn, hasTheme = js.Any.fromFunction1(hasTheme), isAbsolutePositioned = isAbsolutePositioned.toJsFn, isErrorNotification = isErrorNotification.toJsFn, isFixedPositioned = isFixedPositioned.toJsFn, isPremiumNotification = isPremiumNotification.toJsFn, isRelativelyPositioned = isRelativelyPositioned.toJsFn, isStandardNotification = isStandardNotification.toJsFn, isSuccessNotification = isSuccessNotification.toJsFn, isWarningNotification = isWarningNotification.toJsFn, visible = visible.toJsFn)
      __obj.asInstanceOf[NotificationDriver]
    }
    
    extension [Self <: NotificationDriver](x: Self) {
      
      inline def setClickOnActionButton(value: Callback): Self = StObject.set(x, "clickOnActionButton", value.toJsFn)
      
      inline def setClickOnCloseButton(value: Callback): Self = StObject.set(x, "clickOnCloseButton", value.toJsFn)
      
      inline def setGetActionButtonText(value: CallbackTo[String]): Self = StObject.set(x, "getActionButtonText", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[String]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setGetZIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getZIndex", value.toJsFn)
      
      inline def setHasActionButton(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasActionButton", value.toJsFn)
      
      inline def setHasCloseButton(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasCloseButton", value.toJsFn)
      
      inline def setHasTheme(value: NotificationTheme => Boolean): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setIsAbsolutePositioned(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAbsolutePositioned", value.toJsFn)
      
      inline def setIsErrorNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorNotification", value.toJsFn)
      
      inline def setIsFixedPositioned(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFixedPositioned", value.toJsFn)
      
      inline def setIsPremiumNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPremiumNotification", value.toJsFn)
      
      inline def setIsRelativelyPositioned(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRelativelyPositioned", value.toJsFn)
      
      inline def setIsStandardNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStandardNotification", value.toJsFn)
      
      inline def setIsSuccessNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessNotification", value.toJsFn)
      
      inline def setIsWarningNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWarningNotification", value.toJsFn)
      
      inline def setVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "visible", value.toJsFn)
    }
  }
}
