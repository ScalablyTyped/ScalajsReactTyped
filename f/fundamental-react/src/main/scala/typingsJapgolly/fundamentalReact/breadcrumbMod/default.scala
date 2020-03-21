package typingsJapgolly.fundamentalReact.breadcrumbMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentBreadcru
import typingsJapgolly.fundamentalReact.PartialBreadcrumbProps
import typingsJapgolly.fundamentalReact.WeakValidationMapBreadcru
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Breadcrumb
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Breadcrumb/Breadcrumb", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: FunctionComponentBreadcru = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialBreadcrumbProps] = js.native
  var displayName: js.UndefOr[Breadcrumb | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapBreadcru] = js.native
  def apply(props: PropsWithChildren[BreadcrumbProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[BreadcrumbProps], context: js.Any): Element | Null = js.native
}

