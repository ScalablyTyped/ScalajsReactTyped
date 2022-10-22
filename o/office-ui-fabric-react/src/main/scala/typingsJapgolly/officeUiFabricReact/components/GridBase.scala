package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libUtilitiesButtonGridButtonGridDottypesMod.IButtonGridProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridBase {
  
  inline def apply(columnCount: Double, items: js.Array[Any], onRenderItem: (Any, Double) => Element): SharedBuilder_IButtonGridProps_419355050 = {
    val __props = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    new SharedBuilder_IButtonGridProps_419355050(js.Array(this.component, __props.asInstanceOf[IButtonGridProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IButtonGridProps): SharedBuilder_IButtonGridProps_419355050 = new SharedBuilder_IButtonGridProps_419355050(js.Array(this.component, p.asInstanceOf[js.Any]))
}
