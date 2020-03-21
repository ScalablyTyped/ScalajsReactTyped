package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.breadcrumbMod.BreadcrumbItemProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.BreadcrumbDotItem
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Breadcrumb/Breadcrumb.BreadcrumbItemProps> & {  displayName  :'Breadcrumb.Item'} */
@js.native
trait FunctionComponentBreadcru extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialBreadcrumbItemProp] = js.native
  var displayName: js.UndefOr[String with BreadcrumbDotItem] = js.native
  var propTypes: js.UndefOr[WeakValidationMapBreadcruAbout] = js.native
  def apply(props: PropsWithChildren[BreadcrumbItemProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[BreadcrumbItemProps], context: js.Any): Element | Null = js.native
}

