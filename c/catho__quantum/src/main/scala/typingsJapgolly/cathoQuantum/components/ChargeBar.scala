package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeComponents
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.secondary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.chargeBarMod.ChargeBarProps
import typingsJapgolly.cathoQuantum.chargeBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChargeBar {
  
  @JSImport("@catho/quantum/ChargeBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def progressPercent(value: Double): this.type = set("progressPercent", value.asInstanceOf[js.Any])
    
    inline def skin(value: neutral | primary | secondary | success): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSizeComponents): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ChargeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChargeBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
