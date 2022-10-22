package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputInputDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/input/Input.protractor.driver", "inputDriverFactory")
  @js.native
  val inputDriverFactory: DriverFactory[InputDriver] = js.native
  
  trait InputDriver
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
    
    def pressKey(key: String): js.Promise[Unit]
  }
  object InputDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      enterText: String => js.Promise[Unit],
      focus: CallbackTo[js.Promise[Unit]],
      getText: CallbackTo[js.Promise[String]],
      pressKey: String => js.Promise[Unit]
    ): InputDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), focus = focus.toJsFn, getText = getText.toJsFn, pressKey = js.Any.fromFunction1(pressKey))
      __obj.asInstanceOf[InputDriver]
    }
    
    extension [Self <: InputDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setPressKey(value: String => js.Promise[Unit]): Self = StObject.set(x, "pressKey", js.Any.fromFunction1(value))
    }
  }
}
