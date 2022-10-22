package typingsJapgolly.kendoUi.global.kendo

import typingsJapgolly.kendoUi.kendo.stepper.StepOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepper {
  
  @JSGlobal("kendo.stepper.Step")
  @js.native
  open class Step ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.stepper.Step {
    def this(options: StepOptions) = this()
    
    /* CompleteClass */
    override def deselect(): Unit = js.native
    
    /* CompleteClass */
    override def enable(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def getEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def getIndex(): Double = js.native
    
    /* CompleteClass */
    override def getSelectable(): Boolean = js.native
    
    /* CompleteClass */
    override def getSelected(): Boolean = js.native
    
    /* CompleteClass */
    var options: StepOptions = js.native
    
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /* CompleteClass */
    override def setPrevious(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setValid(value: Boolean): Unit = js.native
  }
}
