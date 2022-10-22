package typingsJapgolly.reactFocusLock.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InFocusGuard {
  
  @JSImport("react-focus-lock", "InFocusGuard")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InFocusGuard.type): Default[typingsJapgolly.reactFocusLock.mod.InFocusGuard] = new Default[typingsJapgolly.reactFocusLock.mod.InFocusGuard](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InFocusGuardProps): Default[typingsJapgolly.reactFocusLock.mod.InFocusGuard] = new Default[typingsJapgolly.reactFocusLock.mod.InFocusGuard](js.Array(this.component, p.asInstanceOf[js.Any]))
}
