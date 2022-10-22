package typingsJapgolly.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiLab.materialUiLabStrings.div
import typingsJapgolly.materialUiLab.paginationItemPaginationItemMod.PaginationItemTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab/PaginationItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[PaginationItemTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `paginationItemMod.foo` */
  override def _to: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = default
}
