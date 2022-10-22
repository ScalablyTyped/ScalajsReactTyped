package typingsJapgolly.reactCollapse.components

import typingsJapgolly.reactCollapse.mod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  inline def apply(isOpened: Boolean): SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.Collapse] = {
    val __props = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    new SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.Collapse](js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
  
  @JSImport("react-collapse", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.Collapse] = new SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.Collapse](js.Array(this.component, p.asInstanceOf[js.Any]))
}
