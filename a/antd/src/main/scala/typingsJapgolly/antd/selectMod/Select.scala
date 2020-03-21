package typingsJapgolly.antd.selectMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typingsJapgolly.antd.antdStrings.combobox
import typingsJapgolly.antd.antdStrings.multiple
import typingsJapgolly.antd.antdStrings.tags
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[ValueType /* <: SelectValue */]
  extends Component[SelectProps[ValueType], js.Object, js.Any] {
  var selectRef: RefHandle[typingsJapgolly.rcSelect.mod.default] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getMode(): js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE | combobox] = js.native
  def renderSelect(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): Element = js.native
}

