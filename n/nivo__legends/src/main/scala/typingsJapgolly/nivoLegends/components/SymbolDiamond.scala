package typingsJapgolly.nivoLegends.components

import typingsJapgolly.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SymbolDiamond {
  
  inline def apply(fill: String, id: String | Double, size: Double, x: Double, y: Double): SharedBuilder_SymbolProps_1623108683 = {
    val __props = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new SharedBuilder_SymbolProps_1623108683(js.Array(this.component, __props.asInstanceOf[SymbolProps]))
  }
  
  @JSImport("@nivo/legends", "SymbolDiamond")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SymbolProps): SharedBuilder_SymbolProps_1623108683 = new SharedBuilder_SymbolProps_1623108683(js.Array(this.component, p.asInstanceOf[js.Any]))
}
