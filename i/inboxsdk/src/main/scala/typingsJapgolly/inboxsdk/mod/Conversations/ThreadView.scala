package typingsJapgolly.inboxsdk.mod.Conversations

import typingsJapgolly.inboxsdk.inboxsdkStrings.contactHover
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.SimpleElementView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadView extends js.Object {
  var destroyed: Boolean = js.native
  def addLabel(): SimpleElementView = js.native
  def addNoticeBar(): SimpleElementView = js.native
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): ContentPanelView = js.native
  def getMessageViews(): js.Array[MessageView] = js.native
  def getMessageViewsAll(): js.Array[MessageView] = js.native
  def getSubject(): String = js.native
  def getThreadIDAsync(): js.Promise[String] = js.native
  @JSName("on")
  def on_contactHover(name: contactHover, cb: js.Function1[/* event */ ContactHoverEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}

