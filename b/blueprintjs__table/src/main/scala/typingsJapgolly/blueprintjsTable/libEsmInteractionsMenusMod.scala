package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusCopyCellsMenuItemMod.ICopyCellsMenuItemProps
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsMenusMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "CopyCellsMenuItem")
  @js.native
  open class CopyCellsMenuItem protected ()
    extends typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusCopyCellsMenuItemMod.CopyCellsMenuItem {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: Any) = this()
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus", "MenuContext")
  @js.native
  open class MenuContext protected ()
    extends typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.MenuContext {
    def this(target: Region, selectedRegions: js.Array[Region], numRows: Double, numCols: Double) = this()
  }
}
