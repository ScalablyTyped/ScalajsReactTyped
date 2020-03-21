package typingsJapgolly.antd.searchMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEvent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  var onMouseDown: MouseEventHandler[HTMLElement] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def onSearch(e: KeyboardEvent[typingsJapgolly.std.HTMLInputElement]): Unit = js.native
  def onSearch(e: typingsJapgolly.react.mod.MouseEvent[typingsJapgolly.std.HTMLElement, MouseEvent]): Unit = js.native
  def renderAddonAfter(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderLoading(prefixCls: String): Element = js.native
  def renderSearch(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typingsJapgolly.antd.inputInputMod.default): Unit = js.native
}

