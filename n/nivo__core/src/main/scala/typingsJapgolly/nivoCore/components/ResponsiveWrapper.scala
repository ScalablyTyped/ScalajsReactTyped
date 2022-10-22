package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCore.anon.Children
import typingsJapgolly.nivoCore.anon.Height
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveWrapper {
  
  inline def apply(children: Height => Element): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ Children]))
  }
  
  @JSImport("@nivo/core", "ResponsiveWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
