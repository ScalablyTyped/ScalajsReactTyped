package typingsJapgolly.reactCollapse.components

import typingsJapgolly.reactCollapse.mod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnmountClosed {
  
  inline def apply(isOpened: Boolean): SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.UnmountClosed] = {
    val __props = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    new SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.UnmountClosed](js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
  
  @JSImport("react-collapse", "UnmountClosed")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.UnmountClosed] = new SharedBuilder_CollapseProps_1736943355[typingsJapgolly.reactCollapse.mod.UnmountClosed](js.Array(this.component, p.asInstanceOf[js.Any]))
}
