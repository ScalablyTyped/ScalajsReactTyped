package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesSegmentedToggleToggleIconToggleIconMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from scala.Any because couldn't resolve ClassTree. */
object ToggleIcon {
  
  def apply(p: Any): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ToggleIcon.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
}
