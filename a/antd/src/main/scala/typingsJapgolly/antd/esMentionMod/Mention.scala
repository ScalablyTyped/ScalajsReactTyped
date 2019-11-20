package typingsJapgolly.antd.esMentionMod

import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mention
  extends Component[MentionProps, MentionState, js.Any] {
  var mentionEle: js.Any = js.native
  def defaultSearchChange(value: String): Unit = js.native
  def focus(): Unit = js.native
  def mentionRef(ele: js.Any): Unit = js.native
  def onBlur(ev: ReactFocusEventFrom[HTMLElement]): Unit = js.native
  def onChange(editorState: js.Any): Unit = js.native
  def onFocus(ev: ReactFocusEventFrom[HTMLElement]): Unit = js.native
  def onSearchChange(value: String, prefix: String): js.Any = js.native
  def renderMention(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

