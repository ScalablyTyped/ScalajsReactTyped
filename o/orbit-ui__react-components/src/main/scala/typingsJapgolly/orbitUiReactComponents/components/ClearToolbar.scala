package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ClearToolbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearToolbar {
  
  @JSImport("@orbit-ui/react-components", "ClearToolbar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClearToolbar.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClearToolbarProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
