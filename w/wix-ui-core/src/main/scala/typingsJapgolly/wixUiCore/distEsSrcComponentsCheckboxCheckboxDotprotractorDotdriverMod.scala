package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCheckboxCheckboxDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/checkbox/Checkbox.protractor.driver", "checkboxDriverFactory")
  @js.native
  val checkboxDriverFactory: DriverFactory[CheckboxDriver] = js.native
  
  trait CheckboxDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object CheckboxDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): CheckboxDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[CheckboxDriver]
    }
    
    extension [Self <: CheckboxDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
