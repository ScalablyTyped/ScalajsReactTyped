package typingsJapgolly.rcNotification.noticeMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notice
  extends Component[NoticeProps, js.Object, js.Any] {
  var closeTimer: Double = js.native
  def clearCloseTimer(): Unit = js.native
  def close(): Unit = js.native
  def close(e: ReactMouseEventFrom[HTMLAnchorElement]): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MNotice(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNotice(prevProps: NoticeProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNotice(): Unit = js.native
  def restartCloseTimer(): Unit = js.native
  def startCloseTimer(): Unit = js.native
}

