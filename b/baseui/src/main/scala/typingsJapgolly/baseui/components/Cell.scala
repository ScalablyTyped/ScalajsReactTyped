package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.layoutGridTypesMod.CellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("baseui/layout-grid", "Cell")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Cell.type): SharedBuilder_CellProps422136509 = new SharedBuilder_CellProps422136509(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* hasAlignChildrenGridColumnsGridGapsGridGuttersGridUnitOrderSkipSpanOverrides */ CellProps): SharedBuilder_CellProps422136509 = new SharedBuilder_CellProps422136509(js.Array(this.component, p.asInstanceOf[js.Any]))
}
