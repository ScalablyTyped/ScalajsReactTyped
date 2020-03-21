package typingsJapgolly.fundamentalReact.tableMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialTableProps
import typingsJapgolly.fundamentalReact.WeakValidationMapTablePro
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Table
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Table/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTableProps] = js.native
  var displayName: js.UndefOr[String | Table] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
  def apply(props: PropsWithChildren[TableProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TableProps], context: js.Any): Element | Null = js.native
}

