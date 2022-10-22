package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDropdownOptionDropdownOptionDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/dropdown-option/DropdownOption.protractor.driver", "dropdownOptionDriverFactory")
  @js.native
  val dropdownOptionDriverFactory: DriverFactory[DropdownOptionDriver] = js.native
  
  trait DropdownOptionDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
  }
  object DropdownOptionDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      getText: CallbackTo[js.Promise[String]]
    ): DropdownOptionDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, getText = getText.toJsFn)
      __obj.asInstanceOf[DropdownOptionDriver]
    }
    
    extension [Self <: DropdownOptionDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
    }
  }
}
