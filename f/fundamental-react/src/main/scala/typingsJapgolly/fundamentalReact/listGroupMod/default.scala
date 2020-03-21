package typingsJapgolly.fundamentalReact.listGroupMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentListGrou
import typingsJapgolly.fundamentalReact.FunctionComponentListGrouCall
import typingsJapgolly.fundamentalReact.FunctionComponentListGrouContextTypes
import typingsJapgolly.fundamentalReact.PartialListGroupProps
import typingsJapgolly.fundamentalReact.WeakValidationMapListGrou
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListGroup
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ListGroup/ListGroup", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: FunctionComponentListGrou = js.native
  var ItemActions: FunctionComponentListGrouCall = js.native
  var ItemCheckbox: FunctionComponentListGrouContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupProps] = js.native
  var displayName: js.UndefOr[ListGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrou] = js.native
  def apply(props: PropsWithChildren[ListGroupProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ListGroupProps], context: js.Any): Element | Null = js.native
}

