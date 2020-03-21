package typingsJapgolly.antd.clearableLabeledInputMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearableLabeledInput
  extends Component[ClearableInputProps, js.Object, js.Any] {
  def renderClearIcon(prefixCls: String): Element | Null = js.native
  def renderClearableLabeledInput(): Element = js.native
  def renderInputWithLabel(prefixCls: String, labeledElement: Element): Element = js.native
  def renderLabeledIcon(prefixCls: String, element: Element): Element = js.native
  def renderSuffix(prefixCls: String): Element | Null = js.native
  def renderTextAreaWithClearIcon(prefixCls: String, element: Element): Element = js.native
}

