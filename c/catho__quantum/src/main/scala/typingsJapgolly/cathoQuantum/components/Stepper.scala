package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.NextWord
import typingsJapgolly.cathoQuantum.anon.`21`
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.secondary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.stepperMod.StepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  @JSImport("@catho/quantum/Stepper", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def currentStepText(value: String): this.type = set("currentStepText", value.asInstanceOf[js.Any])
    
    inline def i18n(value: NextWord): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def nextStepText(value: String): this.type = set("nextStepText", value.asInstanceOf[js.Any])
    
    inline def skin(value: primary | secondary | success): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: `21`): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stepper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
