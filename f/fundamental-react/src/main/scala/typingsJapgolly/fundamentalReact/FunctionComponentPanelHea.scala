package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.PanelDotHead
import typingsJapgolly.fundamentalReact.panelMod.PanelHeadProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeadProps> & {  displayName  :'Panel.Head'} */
@js.native
trait FunctionComponentPanelHea extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelHeadProps] = js.native
  var displayName: js.UndefOr[String with PanelDotHead] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelHea] = js.native
  def apply(props: PropsWithChildren[PanelHeadProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelHeadProps], context: js.Any): Element | Null = js.native
}

