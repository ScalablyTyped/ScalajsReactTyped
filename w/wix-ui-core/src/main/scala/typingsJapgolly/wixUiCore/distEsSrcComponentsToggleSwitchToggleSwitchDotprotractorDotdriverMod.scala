package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsToggleSwitchToggleSwitchDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch.protractor.driver", "toggleSwitchDriverFactory")
  @js.native
  val toggleSwitchDriverFactory: DriverFactory[ToggleSwitchDriver] = js.native
  
  trait ToggleSwitchDriver
    extends StObject
       with BaseDriver {
    
    def checked(): js.Promise[Boolean]
    
    def click(): js.Promise[Unit]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object ToggleSwitchDriver {
    
    inline def apply(
      checked: CallbackTo[js.Promise[Boolean]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): ToggleSwitchDriver = {
      val __obj = js.Dynamic.literal(checked = checked.toJsFn, click = click.toJsFn, element = element.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[ToggleSwitchDriver]
    }
    
    extension [Self <: ToggleSwitchDriver](x: Self) {
      
      inline def setChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "checked", value.toJsFn)
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
