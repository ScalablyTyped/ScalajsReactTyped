package typingsJapgolly.antd.libFormFormItemMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.antdStrings.Empty
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.validating
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends Component[FormItemProps, js.Any, js.Any] {
  var helpShow: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): Unit = js.native
  def getChildProp(prop: String): js.Any = js.native
  def getControls(children: Node, recursively: Boolean): js.Array[Element] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.UndefOr[js.Object | Null] = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): Element | Null = js.native
  def getValidateStatus(): error | Empty | success | validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: String, helpShow: Boolean): Unit = js.native
  def onLabelClick(): Unit = js.native
  def renderChildren(prefixCls: String): js.Array[Element] = js.native
  def renderExtra(prefixCls: String): Element | Null = js.native
  def renderFormItem(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderHelp(prefixCls: String): Element = js.native
  def renderLabel(prefixCls: String): Element = js.native
  def renderValidateWrapper(prefixCls: String, c1: Node, c2: Node, c3: Node): Element = js.native
  def renderWrapper(prefixCls: String, children: Node): Element = js.native
}

