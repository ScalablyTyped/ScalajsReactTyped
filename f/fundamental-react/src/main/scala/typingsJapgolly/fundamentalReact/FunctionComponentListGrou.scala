package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListGroupDotItem
import typingsJapgolly.fundamentalReact.listGroupMod.ListGroupItemProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ListGroup/ListGroup.ListGroupItemProps> & {  displayName  :'ListGroup.Item'} */
@js.native
trait FunctionComponentListGrou extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupItemProps] = js.native
  var displayName: js.UndefOr[String with ListGroupDotItem] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrouClassName] = js.native
  def apply(props: PropsWithChildren[ListGroupItemProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ListGroupItemProps], context: js.Any): Element | Null = js.native
}

