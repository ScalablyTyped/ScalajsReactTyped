package typingsJapgolly.antd.popoverMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popover
  extends Component[PopoverProps, js.Object, js.Any] {
  var tooltip: js.Any = js.native
  def getOverlay(prefixCls: String): Element = js.native
  def getPopupDomNode(): js.Any = js.native
  def renderPopover(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveTooltip(node: js.Any): Unit = js.native
}

