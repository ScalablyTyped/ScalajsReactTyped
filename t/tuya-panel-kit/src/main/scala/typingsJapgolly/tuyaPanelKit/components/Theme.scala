package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.tuyaPanelKit.mod.ThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Theme {
  
  @JSImport("tuya-panel-kit", "Theme")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Theme.type): Default[typingsJapgolly.tuyaPanelKit.mod.Theme] = new Default[typingsJapgolly.tuyaPanelKit.mod.Theme](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThemeProps): Default[typingsJapgolly.tuyaPanelKit.mod.Theme] = new Default[typingsJapgolly.tuyaPanelKit.mod.Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
}
