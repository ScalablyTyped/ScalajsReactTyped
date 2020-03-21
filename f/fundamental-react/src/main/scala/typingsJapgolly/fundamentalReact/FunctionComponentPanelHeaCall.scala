package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.PanelDotHeader
import typingsJapgolly.fundamentalReact.panelMod.PanelHeaderProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeaderProps> & {  displayName  :'Panel.Header'} */
@js.native
trait FunctionComponentPanelHeaCall extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelHeaderProps] = js.native
  var displayName: js.UndefOr[String with PanelDotHeader] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelHeaClassName] = js.native
  def apply(props: PropsWithChildren[PanelHeaderProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelHeaderProps], context: js.Any): Element | Null = js.native
}

