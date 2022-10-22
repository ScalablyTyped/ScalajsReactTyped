package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.AlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layout {
  
  inline def apply(
    alignItems: Any,
    children: Any,
    className: Any,
    cols: Any,
    dataHook: Any,
    gap: Any,
    justifyItems: Any,
    rowHeight: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], justifyItems = justifyItems.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AlignItems]))
  }
  
  @JSImport("wix-style-react/dist/types/Layout/Layout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AlignItems): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
