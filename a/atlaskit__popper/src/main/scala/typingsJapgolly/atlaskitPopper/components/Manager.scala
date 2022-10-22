package typingsJapgolly.atlaskitPopper.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactPopper.mod.ManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Manager {
  
  @JSImport("@atlaskit/popper", "Manager")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Manager.type): Default[typingsJapgolly.atlaskitPopper.mod.Manager] = new Default[typingsJapgolly.atlaskitPopper.mod.Manager](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ManagerProps): Default[typingsJapgolly.atlaskitPopper.mod.Manager] = new Default[typingsJapgolly.atlaskitPopper.mod.Manager](js.Array(this.component, p.asInstanceOf[js.Any]))
}
