package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactTable.reactTableStrings.Footer
import typingsJapgolly.reactTable.reactTableStrings.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableColumnProps[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[ColumnInstance[D]] = js.native
  var depth: Double = js.native
  var id: IdType[D] = js.native
   // not documented
  var index: Double = js.native
  var isVisible: Boolean = js.native
  var parent: ColumnInstance[D] = js.native
   // not documented
  var placeholderOf: js.UndefOr[ColumnInstance[js.Object]] = js.native
  var totalLeft: Double = js.native
  var totalWidth: Double = js.native
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
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

