package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.PanelDotBody
import typingsJapgolly.fundamentalReact.panelMod.PanelBodyProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelBodyProps> & {  displayName  :'Panel.Body'} */
@js.native
trait FunctionComponentPanelBod extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelBodyProps] = js.native
  var displayName: js.UndefOr[String with PanelDotBody] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelBod] = js.native
  def apply(props: PropsWithChildren[PanelBodyProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelBodyProps], context: js.Any): Element | Null = js.native
}

