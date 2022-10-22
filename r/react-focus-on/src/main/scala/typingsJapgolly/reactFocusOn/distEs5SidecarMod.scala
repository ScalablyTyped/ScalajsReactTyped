package typingsJapgolly.reactFocusOn

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactFocusOn.distEs5TypesMod.EffectProps
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5SidecarMod extends Shortcut {
  
  @JSImport("react-focus-on/dist/es5/sidecar", JSImport.Default)
  @js.native
  val default: SideCarComponent[EffectProps] = js.native
  
  type _To = SideCarComponent[EffectProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEs5SidecarMod.foo` */
  override def _to: SideCarComponent[EffectProps] = default
}
