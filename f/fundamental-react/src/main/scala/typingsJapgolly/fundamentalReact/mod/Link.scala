package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialLinkProps
import typingsJapgolly.fundamentalReact.WeakValidationMapLinkProp
import typingsJapgolly.fundamentalReact.linkMod.LinkProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Link")
@js.native
object Link extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLinkProps] = js.native
  var displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Link | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
  def apply(props: PropsWithChildren[LinkProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[LinkProps], context: js.Any): Element | Null = js.native
}

