package typingsJapgolly.fundamentalReact.tabMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialTabProps
import typingsJapgolly.fundamentalReact.WeakValidationMapTabProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Tab
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTabProps] = js.native
  var displayName: js.UndefOr[String | Tab] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  def apply(props: PropsWithChildren[TabProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TabProps], context: js.Any): Element | Null = js.native
}

