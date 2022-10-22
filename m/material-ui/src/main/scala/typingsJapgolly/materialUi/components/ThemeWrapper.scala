package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialUi.MaterialUI.ThemeWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeWrapper {
  
  inline def apply(theme: MuiTheme): Default[typingsJapgolly.materialUi.global.MaterialUI.ThemeWrapper] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[typingsJapgolly.materialUi.global.MaterialUI.ThemeWrapper](js.Array(this.component, __props.asInstanceOf[ThemeWrapperProps]))
  }
  
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeWrapperProps): Default[typingsJapgolly.materialUi.global.MaterialUI.ThemeWrapper] = new Default[typingsJapgolly.materialUi.global.MaterialUI.ThemeWrapper](js.Array(this.component, p.asInstanceOf[js.Any]))
}
