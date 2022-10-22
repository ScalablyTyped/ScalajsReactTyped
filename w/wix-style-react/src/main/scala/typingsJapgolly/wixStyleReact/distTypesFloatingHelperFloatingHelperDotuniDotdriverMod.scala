package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperClosablePopoverClosablePopoverDotuniDotdriverMod.ClosablePopoverUniDriver
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotuniDotdriverMod.FloatingHelperContentUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperDotuniDotdriverMod {
  
  trait FloatingHelperUniDriver
    extends StObject
       with ClosablePopoverUniDriver {
    
    def clickCloseButton(): js.Promise[Unit]
    
    def getHelperContentDriver(): js.Promise[FloatingHelperContentUniDriver]
    
    def getWidth(): js.Promise[String]
    
    def hasCloseButton(): js.Promise[Boolean]
  }
  object FloatingHelperUniDriver {
    
    inline def apply(
      clickCloseButton: CallbackTo[js.Promise[Unit]],
      getHelperContentDriver: CallbackTo[js.Promise[FloatingHelperContentUniDriver]],
      getWidth: CallbackTo[js.Promise[String]],
      hasCloseButton: CallbackTo[js.Promise[Boolean]],
      isOpened: CallbackTo[js.Promise[Boolean]]
    ): FloatingHelperUniDriver = {
      val __obj = js.Dynamic.literal(clickCloseButton = clickCloseButton.toJsFn, getHelperContentDriver = getHelperContentDriver.toJsFn, getWidth = getWidth.toJsFn, hasCloseButton = hasCloseButton.toJsFn, isOpened = isOpened.toJsFn)
      __obj.asInstanceOf[FloatingHelperUniDriver]
    }
    
    extension [Self <: FloatingHelperUniDriver](x: Self) {
      
      inline def setClickCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
      
      inline def setGetHelperContentDriver(value: CallbackTo[js.Promise[FloatingHelperContentUniDriver]]): Self = StObject.set(x, "getHelperContentDriver", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHasCloseButton(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasCloseButton", value.toJsFn)
    }
  }
}
