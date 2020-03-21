package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListGroupDotItemCheckbox
import typingsJapgolly.fundamentalReact.listGroupMod.ListGroupItemCheckboxProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemCheckboxProps> & {  displayName  :'ListGroup.ItemCheckbox'} */
@js.native
trait FunctionComponentListGrouContextTypes extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupItemCheck] = js.native
  var displayName: js.UndefOr[String with ListGroupDotItemCheckbox] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrouInputProps] = js.native
  def apply(props: PropsWithChildren[ListGroupItemCheckboxProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ListGroupItemCheckboxProps], context: js.Any): Element | Null = js.native
}

