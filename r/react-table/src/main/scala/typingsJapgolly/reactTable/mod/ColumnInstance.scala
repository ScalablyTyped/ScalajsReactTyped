package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactTable.reactTableStrings.Footer
import typingsJapgolly.reactTable.reactTableStrings.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-table.react-table.ColumnInterface<D>, 'id'> */
/* Inlined parent react-table.react-table.ColumnInterfaceBasedOnValue<D, any> */
/* Inlined parent react-table.react-table.UseTableColumnProps<D> */
@js.native
trait ColumnInstance[D /* <: js.Object */] extends StObject {
  
  var Cell: js.UndefOr[Renderer[CellProps[D, Any]]] = js.native
  
  var Footer: js.UndefOr[Renderer[FooterProps[D]]] = js.native
  
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnInstance[D]]] = js.native
  
  var depth: Double = js.native
  
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
  
  def getHeaderProps(): TableHeaderProps = js.native
  def getHeaderProps(propGetter: HeaderPropGetter[D]): TableHeaderProps = js.native
  
  // not documented
  def getToggleHiddenProps(): Any = js.native
  def getToggleHiddenProps(userProps: Any): Any = js.native
  
  var id: IdType[D] = js.native
  
  var isVisible: Boolean = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var parent: js.UndefOr[ColumnInstance[D]] = js.native
  
  // not documented
  var placeholderOf: js.UndefOr[ColumnInstance[js.Object]] = js.native
  
  def render(`type`: Header | Footer): Node = js.native
  def render(`type`: Header | Footer, props: js.Object): Node = js.native
  def render(`type`: String): Node = js.native
  def render(`type`: String, props: js.Object): Node = js.native
  
  def toggleHidden(): Unit = js.native
  def toggleHidden(value: Boolean): Unit = js.native
  
  var totalLeft: Double = js.native
  
  var totalWidth: Double = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
