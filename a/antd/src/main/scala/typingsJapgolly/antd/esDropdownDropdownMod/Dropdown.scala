package typingsJapgolly.antd.esDropdownDropdownMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

