package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.PanelDotFilters
import typingsJapgolly.fundamentalReact.panelMod.PanelFiltersProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelFiltersProps> & {  displayName  :'Panel.Filters'} */
@js.native
trait FunctionComponentPanelFil extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelFiltersProps] = js.native
  var displayName: js.UndefOr[String with PanelDotFilters] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelFil] = js.native
  def apply(props: PropsWithChildren[PanelFiltersProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelFiltersProps], context: js.Any): Element | Null = js.native
}

