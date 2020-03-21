package typingsJapgolly.baseui

import typingsJapgolly.baseui.tableMod.SortableHeadCellProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.styletronReact.mod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/table-grid", JSImport.Namespace)
@js.native
object tableGridMod extends js.Object {
  val SortableHeadCell: FC[SortableHeadCellProps] = js.native
  val StyledBodyCell: StyletronComponent[js.Any] = js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
  @js.native
  object SORT_DIRECTION extends js.Object {
    /* "ASC" */ val ASC: typingsJapgolly.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    /* "DESC" */ val DESC: typingsJapgolly.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.baseui.tableMod.SORT_DIRECTION with String] = js.native
  }
  
}

