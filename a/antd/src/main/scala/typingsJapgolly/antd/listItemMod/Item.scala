package typingsJapgolly.antd.listItemMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item
  extends Component[ListItemProps, js.Any, js.Any] {
  def isFlexMode(): Boolean = js.native
  def isItemContainsTextNodeAndNotSingular(): js.UndefOr[scala.Nothing] = js.native
  def renderItem(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

