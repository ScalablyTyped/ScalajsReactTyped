package typingsJapgolly.fundamentalReact.layoutGridMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialLayoutGridProps
import typingsJapgolly.fundamentalReact.WeakValidationMapLayoutGr
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  var displayName: js.UndefOr[
    typingsJapgolly.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String
  ] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  def apply(props: PropsWithChildren[LayoutGridProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[LayoutGridProps], context: js.Any): Element | Null = js.native
}

