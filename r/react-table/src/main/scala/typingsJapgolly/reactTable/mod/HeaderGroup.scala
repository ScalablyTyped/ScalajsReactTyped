package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactTable.AnonData
import typingsJapgolly.reactTable.reactTableStrings.Footer
import typingsJapgolly.reactTable.reactTableStrings.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-table.react-table.Column<D>, 'id' | 'columns'> */
/* Inlined parent react-table.react-table.UseTableColumnProps<D> */
/* Inlined parent react-table.react-table.UseTableHeaderGroupProps<D> */
@js.native
trait HeaderGroup[D /* <: js.Object */] extends js.Object {
  var Cell: js.UndefOr[Renderer[CellProps[D]]] = js.native
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.native
  var accessor: js.UndefOr[
    IdType[D] | (js.Function3[/* originalRow */ D, /* index */ Double, /* sub */ AnonData[D], CellValue])
  ] = js.native
  var columns: js.Array[ColumnInstance[D]] = js.native
  var depth: Double = js.native
  var headers: js.Array[ColumnInstance[D]] = js.native
  var id: IdType[D] = js.native
   // not documented
  var index: Double = js.native
  var isVisible: Boolean = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var parent: ColumnInstance[D] = js.native
   // not documented
  var placeholderOf: js.UndefOr[ColumnInstance[js.Object]] = js.native
  var show: js.UndefOr[Boolean | (js.Function1[/* instance */ TableInstance[D], Boolean])] = js.native
  var totalHeaderCount: Double = js.native
  var totalLeft: Double = js.native
  var totalWidth: Double = js.native
  var width: js.UndefOr[Double | String] = js.native
  def getFooterGroupProps(): TableFooterProps = js.native
  def getFooterGroupProps(propGetter: FooterGroupPropGetter[D]): TableFooterProps = js.native
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
  def getHeaderGroupProps(): TableHeaderProps = js.native
  def getHeaderGroupProps(propGetter: HeaderGroupPropGetter[D]): TableHeaderProps = js.native
  def getHeaderProps(): TableHeaderProps = js.native
  def getHeaderProps(propGetter: HeaderPropGetter[D]): TableHeaderProps = js.native
   // not documented
  def getToggleHiddenProps(): js.Any = js.native
  def getToggleHiddenProps(userProps: js.Any): js.Any = js.native
  def render(`type`: String): Node = js.native
  def render(`type`: String, props: js.Object): Node = js.native
  @JSName("render")
  def render_Footer(`type`: Footer): Node = js.native
  @JSName("render")
  def render_Footer(`type`: Footer, props: js.Object): Node = js.native
  @JSName("render")
  def render_Header(`type`: Header): Node = js.native
  @JSName("render")
  def render_Header(`type`: Header, props: js.Object): Node = js.native
  def toggleHidden(): Unit = js.native
  def toggleHidden(value: Boolean): Unit = js.native
}

