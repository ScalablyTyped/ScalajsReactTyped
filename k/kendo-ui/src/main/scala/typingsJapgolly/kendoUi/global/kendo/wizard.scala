package typingsJapgolly.kendoUi.global.kendo

import typingsJapgolly.kendoUi.kendo.wizard.WizardStepOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wizard {
  
  @JSGlobal("kendo.wizard.Step")
  @js.native
  open class Step ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.wizard.Step {
    
    /* CompleteClass */
    override def buttons(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var options: WizardStepOptions = js.native
    
    /* CompleteClass */
    override def resetButtons(): Unit = js.native
  }
}
