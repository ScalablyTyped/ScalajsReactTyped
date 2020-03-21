package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/menus", JSImport.Namespace)
@js.native
object menusMod extends js.Object {
  @js.native
  class CopyCellsMenuItem ()
    extends typingsJapgolly.blueprintjsTable.copyCellsMenuItemMod.CopyCellsMenuItem
  
  @js.native
  class MenuContext protected ()
    extends typingsJapgolly.blueprintjsTable.menuContextMod.MenuContext {
    def this(target: IRegion, selectedRegions: js.Array[IRegion], numRows: Double, numCols: Double) = this()
  }
  
}

