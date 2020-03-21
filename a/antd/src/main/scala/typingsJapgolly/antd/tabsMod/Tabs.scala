package typingsJapgolly.antd.tabsMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabs
  extends Component[TabsProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  def createNewTab(targetKey: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def handleChange(activeKey: String): Unit = js.native
  def removeTab(targetKey: String, e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderTabs(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

