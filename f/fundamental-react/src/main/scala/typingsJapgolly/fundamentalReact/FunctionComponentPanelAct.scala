package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.PanelDotActions
import typingsJapgolly.fundamentalReact.panelMod.PanelActionsProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelActionsProps> & {  displayName  :'Panel.Actions'} */
@js.native
trait FunctionComponentPanelAct extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelActionsProps] = js.native
  var displayName: js.UndefOr[String with PanelDotActions] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelAct] = js.native
  def apply(props: PropsWithChildren[PanelActionsProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelActionsProps], context: js.Any): Element | Null = js.native
}

