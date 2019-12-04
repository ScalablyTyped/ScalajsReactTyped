package typingsJapgolly.antd

import typingsJapgolly.antd.libTableFilterDropdownMod.FilterMenu
import typingsJapgolly.antd.libTableInterfaceMod.ColumnFilterItem
import typingsJapgolly.antd.libTableInterfaceMod.ColumnProps
import typingsJapgolly.antd.libTableInterfaceMod.FilterMenuProps
import typingsJapgolly.antd.libTableInterfaceMod.FilterMenuState
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/filterDropdown", JSImport.Namespace)
@js.native
object libTableFilterDropdownMod extends js.Object {
  @js.native
  trait FilterMenu[T]
    extends Component[FilterMenuProps[T], FilterMenuState[T], js.Any] {
    var neverShown: Boolean = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFilterMenu(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFilterMenu(): Unit = js.native
    def confirmFilter(): Unit = js.native
    def getDropdownVisible(): js.UndefOr[Boolean] = js.native
    def handleClearFilters(): Unit = js.native
    def handleConfirm(): Unit = js.native
    def handleMenuItemClick(info: Anon_Key): Unit = js.native
    def hasSubMenu(): Boolean = js.native
    def onVisibleChange(visible: Boolean): Unit = js.native
    def renderFilterIcon(): Element = js.native
    def renderMenuItem(item: ColumnFilterItem): Element = js.native
    def renderMenus(items: js.Array[ColumnFilterItem]): js.Array[japgolly.scalajs.react.raw.React.Element] = js.native
    def setNeverShown(column: ColumnProps[T]): Unit = js.native
    def setSelectedKeys(hasSelectedKeys: Anon_SelectedKeys): Unit = js.native
    def setVisible(visible: Boolean): Unit = js.native
  }
  
  @js.native
  class default[T] protected () extends FilterMenu[T] {
    def this(props: FilterMenuProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_Column = js.native
    def getDerivedStateFromProps[T](nextProps: FilterMenuProps[T], prevState: FilterMenuState[T]): PartialFilterMenuStateT[T] = js.native
  }
  
}

