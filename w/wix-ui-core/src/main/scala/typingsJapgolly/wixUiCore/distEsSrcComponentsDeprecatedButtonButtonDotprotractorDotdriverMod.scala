package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedButtonButtonDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/button/Button.protractor.driver", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  trait ButtonDriver
    extends StObject
       with BaseDriver {
    
    /** click the button */
    def click(): js.Promise[Unit]
    
    /** returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** returns the Button's text content */
    def getButtonTextContent(): js.Promise[String]
    
    /** checks wether the button is disabled */
    def isButtonDisabled(): js.Promise[Boolean]
  }
  object ButtonDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonTextContent: CallbackTo[js.Promise[String]],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]]
    ): ButtonDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, isButtonDisabled = isButtonDisabled.toJsFn)
      __obj.asInstanceOf[ButtonDriver]
    }
    
    extension [Self <: ButtonDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setGetButtonTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonTextContent", value.toJsFn)
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
    }
  }
}
