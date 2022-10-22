package typingsJapgolly.primereact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.primereact.rippleRippleMod.RippleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ripple {
  
  @JSImport("primereact", "Ripple")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ripple.type): Default[typingsJapgolly.primereact.mod.Ripple] = new Default[typingsJapgolly.primereact.mod.Ripple](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RippleProps): Default[typingsJapgolly.primereact.mod.Ripple] = new Default[typingsJapgolly.primereact.mod.Ripple](js.Array(this.component, p.asInstanceOf[js.Any]))
}
