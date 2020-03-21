package typingsJapgolly.antd.dropdownDropdownMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.antdStrings.bottomCenter
import typingsJapgolly.antd.antdStrings.bottomLeft
import typingsJapgolly.antd.antdStrings.bottomRight
import typingsJapgolly.antd.antdStrings.topCenter
import typingsJapgolly.antd.antdStrings.topLeft
import typingsJapgolly.antd.antdStrings.topRight
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getPlacement(): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getPlacement(direction: String): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String): Element = js.native
}

