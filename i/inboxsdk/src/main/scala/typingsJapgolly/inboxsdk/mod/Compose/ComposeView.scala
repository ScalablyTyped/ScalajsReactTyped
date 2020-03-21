package typingsJapgolly.inboxsdk.mod.Compose

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.inboxsdk.AnonCancel
import typingsJapgolly.inboxsdk.AnonClosedByInboxSDK
import typingsJapgolly.inboxsdk.AnonContact
import typingsJapgolly.inboxsdk.AnonFullscreen
import typingsJapgolly.inboxsdk.AnonGetMessageID
import typingsJapgolly.inboxsdk.AnonIsForward
import typingsJapgolly.inboxsdk.inboxsdkStrings.bccContactAdded
import typingsJapgolly.inboxsdk.inboxsdkStrings.bccContactRemoved
import typingsJapgolly.inboxsdk.inboxsdkStrings.bodyChanged
import typingsJapgolly.inboxsdk.inboxsdkStrings.ccContactAdded
import typingsJapgolly.inboxsdk.inboxsdkStrings.ccContactRemoved
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.inboxsdkStrings.discard
import typingsJapgolly.inboxsdk.inboxsdkStrings.fromContactChanged
import typingsJapgolly.inboxsdk.inboxsdkStrings.fullscreenChanged
import typingsJapgolly.inboxsdk.inboxsdkStrings.minimized
import typingsJapgolly.inboxsdk.inboxsdkStrings.presending
import typingsJapgolly.inboxsdk.inboxsdkStrings.recipientsChanged
import typingsJapgolly.inboxsdk.inboxsdkStrings.responseTypeChanged
import typingsJapgolly.inboxsdk.inboxsdkStrings.restored
import typingsJapgolly.inboxsdk.inboxsdkStrings.sendCanceled
import typingsJapgolly.inboxsdk.inboxsdkStrings.sending
import typingsJapgolly.inboxsdk.inboxsdkStrings.sent
import typingsJapgolly.inboxsdk.inboxsdkStrings.toContactAdded
import typingsJapgolly.inboxsdk.inboxsdkStrings.toContactRemoved
import typingsJapgolly.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeView extends js.Object {
  var destroyed: Boolean = js.native
  def addButton(buttonDescriptor: ComposeButtonDescriptor): Unit = js.native
  def addComposeNotice(composeNoticeDescriptor: ComposeNoticeDescriptor): Unit = js.native
  def addStatusBar(statusBarDescriptor: StatusBarDescriptor): StatusBarView = js.native
  def attachFiles(files: js.Array[Blob]): js.Promise[Unit] = js.native
  def attachInlineFiles(Files: js.Array[Blob]): js.Promise[Unit] = js.native
  def close(): Unit = js.native
  def getBccRecipients(): js.Array[Contact] = js.native
  def getBodyElement(): HTMLElement = js.native
  def getCcRecipients(): js.Array[Contact] = js.native
  def getCurrentDraftID(): js.Promise[String | Null] = js.native
  def getDraftID(): js.Promise[String] = js.native
  def getFromContact(): Contact = js.native
  def getFromContactChoices(): js.Array[Contact] = js.native
  def getHTMLContent(): String = js.native
  def getInitialMessageID(): String = js.native
  def getMetadataFormElement(): HTMLElement = js.native
  def getSelectedBodyHTML(): String = js.native
  def getSelectedBodyText(): String = js.native
  def getSubject(): String = js.native
  def getTextContent(): String = js.native
  def getThreadID(): String = js.native
  def getToRecipients(): js.Array[Contact] = js.native
  def insertHTMLIntoBodyAtCursor(html: String): HTMLElement = js.native
  def insertHTMLIntoBodyAtCursor(html: typingsJapgolly.std.HTMLElement): HTMLElement = js.native
  def insertLinkChipIntoBodyAtCursor(text: String, url: String, iconUrl: String): HTMLElement = js.native
  def insertLinkIntoBodyAtCursor(text: String, url: String): HTMLElement = js.native
  def insertTextIntoBodyAtCursor(text: String): Unit = js.native
  def isForward(): Boolean = js.native
  def isFullscreen(): Boolean = js.native
  def isInlineReplyForm(): Boolean = js.native
  def isMinimized(): Boolean = js.native
  def isReply(): Boolean = js.native
  @JSName("on")
  def on_bccContactAdded(name: bccContactAdded, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_bccContactRemoved(name: bccContactRemoved, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_bodyChanged(name: bodyChanged, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_ccContactAdded(name: ccContactAdded, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_ccContactRemoved(name: ccContactRemoved, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function1[/* event */ AnonClosedByInboxSDK, Unit]): Unit = js.native
  @JSName("on")
  def on_discard(name: discard, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_fromContactChanged(name: fromContactChanged, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_fullscreenChanged(name: fullscreenChanged, cb: js.Function1[/* event */ AnonFullscreen, Unit]): Unit = js.native
  @JSName("on")
  def on_minimized(name: minimized, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_presending(name: presending, cb: js.Function1[/* event */ AnonCancel, Unit]): Unit = js.native
  @JSName("on")
  def on_recipientsChanged(name: recipientsChanged, cb: js.Function1[/* event */ RecipientsChangedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_responseTypeChanged(name: responseTypeChanged, cb: js.Function1[/* event */ AnonIsForward, Unit]): Unit = js.native
  @JSName("on")
  def on_restored(name: restored, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sendCanceled(name: sendCanceled, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sending(name: sending, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_sent(name: sent, cb: js.Function1[/* event */ AnonGetMessageID, Unit]): Unit = js.native
  @JSName("on")
  def on_toContactAdded(name: toContactAdded, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  @JSName("on")
  def on_toContactRemoved(name: toContactRemoved, cb: js.Function1[/* event */ AnonContact, Unit]): Unit = js.native
  def popOut(): js.Promise[ComposeView] = js.native
  def send(): Unit = js.native
  def send(options: SendOptions): Unit = js.native
  def setBccRecipients(emails: js.Array[String]): Unit = js.native
  def setBodyHTML(html: String): Unit = js.native
  def setBodyText(text: String): Unit = js.native
  def setCcRecipients(emails: js.Array[String]): Unit = js.native
  def setFromEmail(email: String): Unit = js.native
  def setFullscreen(minimized: Boolean): Unit = js.native
  def setMinimized(minimized: Boolean): Unit = js.native
  def setSubject(text: String): Unit = js.native
  def setTitleBarColor(color: String): js.Function0[Unit] = js.native
  def setToRecipients(emails: js.Array[String]): Unit = js.native
}

