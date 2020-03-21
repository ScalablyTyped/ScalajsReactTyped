package typingsJapgolly.fundamentalReact.panelMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentPanelAct
import typingsJapgolly.fundamentalReact.FunctionComponentPanelBod
import typingsJapgolly.fundamentalReact.FunctionComponentPanelFil
import typingsJapgolly.fundamentalReact.FunctionComponentPanelFoo
import typingsJapgolly.fundamentalReact.FunctionComponentPanelHea
import typingsJapgolly.fundamentalReact.FunctionComponentPanelHeaCall
import typingsJapgolly.fundamentalReact.PartialPanelProps
import typingsJapgolly.fundamentalReact.WeakValidationMapPanelPro
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Panel
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Panel/Panel", JSImport.Default)
@js.native
object default extends js.Object {
  var Actions: FunctionComponentPanelAct = js.native
  var Body: FunctionComponentPanelBod = js.native
  var Filters: FunctionComponentPanelFil = js.native
  var Footer: FunctionComponentPanelFoo = js.native
  var Head: FunctionComponentPanelHea = js.native
  var Header: FunctionComponentPanelHeaCall = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelProps] = js.native
  var displayName: js.UndefOr[Panel | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelPro] = js.native
  def apply(props: PropsWithChildren[PanelProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[PanelProps], context: js.Any): Element | Null = js.native
}

