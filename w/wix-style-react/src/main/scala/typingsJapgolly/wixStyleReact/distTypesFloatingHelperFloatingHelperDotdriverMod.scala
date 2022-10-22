package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperClosablePopoverClosablePopoverDotdriverMod.ClosablePopoverDriver
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotdriverMod.FloatingHelperContentDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperDotdriverMod {
  
  trait FloatingHelperDriver
    extends StObject
       with ClosablePopoverDriver {
    
    def clickCloseButton(): Unit
    
    def getHelperContentDriver(): FloatingHelperContentDriver
    
    def getWidth(): String
    
    def hasCloseButton(): Boolean
  }
  object FloatingHelperDriver {
    
    inline def apply(
      clickCloseButton: Callback,
      getHelperContentDriver: CallbackTo[FloatingHelperContentDriver],
      getWidth: CallbackTo[String],
      hasCloseButton: CallbackTo[Boolean],
      isOpened: CallbackTo[Boolean]
    ): FloatingHelperDriver = {
      val __obj = js.Dynamic.literal(clickCloseButton = clickCloseButton.toJsFn, getHelperContentDriver = getHelperContentDriver.toJsFn, getWidth = getWidth.toJsFn, hasCloseButton = hasCloseButton.toJsFn, isOpened = isOpened.toJsFn)
      __obj.asInstanceOf[FloatingHelperDriver]
    }
    
    extension [Self <: FloatingHelperDriver](x: Self) {
      
      inline def setClickCloseButton(value: Callback): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
      
      inline def setGetHelperContentDriver(value: CallbackTo[FloatingHelperContentDriver]): Self = StObject.set(x, "getHelperContentDriver", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[String]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHasCloseButton(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasCloseButton", value.toJsFn)
    }
  }
}
