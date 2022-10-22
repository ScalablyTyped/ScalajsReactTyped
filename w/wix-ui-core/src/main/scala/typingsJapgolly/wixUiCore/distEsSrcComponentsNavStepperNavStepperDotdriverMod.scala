package typingsJapgolly.wixUiCore

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsNavStepperNavStepperDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper.driver", "NavStepperDriver")
  @js.native
  open class NavStepperDriver protected ()
    extends StObject
       with BaseDriver {
    def this(element: Element) = this()
    
    /** returns the active step element */
    def activeStep(): HTMLLIElement = js.native
    
    def clickOnStep(index: Double): Unit = js.native
    
    /* private */ val element: Any = js.native
    
    /* CompleteClass */
    override def exists(): Boolean = js.native
    
    /* private */ val hasStyleState: Any = js.native
    
    /** checks if a step is active */
    def isStepActive(index: Double): Boolean = js.native
    
    /** checks if a step is disabled */
    def isStepDisabled(index: Double): Boolean = js.native
    
    /** checks if a step is visited */
    def isStepVisited(index: Double): Boolean = js.native
    
    /**  returns the root element */
    def root(): Element = js.native
    
    /* private */ val stepAt: Any = js.native
    
    /** returns text content of a step */
    def stepContentAt(index: Double): String = js.native
    
    /* private */ val styleUtil: Any = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper.driver", "navStepperDriverFactory")
  @js.native
  val navStepperDriverFactory: DriverFactory[NavStepperDriver] = js.native
}
