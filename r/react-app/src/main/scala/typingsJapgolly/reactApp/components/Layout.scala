package typingsJapgolly.reactApp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactApp.mod.LayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layout {
  
  inline def apply(className: String): Default[typingsJapgolly.reactApp.mod.Layout] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactApp.mod.Layout](js.Array(this.component, __props.asInstanceOf[LayoutProps]))
  }
  
  @JSImport("react-app", "Layout")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LayoutProps): Default[typingsJapgolly.reactApp.mod.Layout] = new Default[typingsJapgolly.reactApp.mod.Layout](js.Array(this.component, p.asInstanceOf[js.Any]))
}
