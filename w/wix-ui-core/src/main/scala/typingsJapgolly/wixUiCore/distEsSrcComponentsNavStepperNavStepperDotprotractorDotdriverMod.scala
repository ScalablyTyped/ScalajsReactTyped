package typingsJapgolly.wixUiCore

import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsNavStepperNavStepperDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper.protractor.driver", "NavStepperDriver")
  @js.native
  open class NavStepperDriver protected ()
    extends StObject
       with BaseDriver {
    def this(component: ElementFinder) = this()
    
    /* private */ val component: Any = js.native
    
    /** Get root element of the component */
    /* CompleteClass */
    override def element(): ElementFinder = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper.protractor.driver", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[NavStepperDriver] = js.native
}
