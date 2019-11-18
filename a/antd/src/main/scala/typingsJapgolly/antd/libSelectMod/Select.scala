package typingsJapgolly.antd.libSelectMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[T]
  extends Component[SelectProps[T], js.Object, js.Any] {
  var rcSelect: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getNotFoundContent(renderEmpty: RenderEmptyHandler): js.UndefOr[js.Object | Null] = js.native
  def isCombobox(): Boolean = js.native
  def renderSelect(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
  def renderSuffixIcon(prefixCls: String): js.Object = js.native
  def saveSelect(node: js.Any): Unit = js.native
}

