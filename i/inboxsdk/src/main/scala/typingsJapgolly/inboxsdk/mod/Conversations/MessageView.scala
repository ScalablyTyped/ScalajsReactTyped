package typingsJapgolly.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.inboxsdk.AnonMessageView
import typingsJapgolly.inboxsdk.inboxsdkStrings.contactHover
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.inboxsdkStrings.load
import typingsJapgolly.inboxsdk.inboxsdkStrings.viewStateChange
import typingsJapgolly.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageView extends js.Object {
  var destroyed: Boolean = js.native
  def addAttachmentCardView(cardOptions: AttachmentCardNoPreviewOptions): AttachmentCardView = js.native
  def addAttachmentCardView(cardOptions: AttachmentCardOptions): AttachmentCardView = js.native
  def addAttachmentIcon(iconDescriptor: MessageAttachmentIconDescriptor): Unit = js.native
  def addAttachmentsToolbarButton(buttonOptions: AttachmentsToolbarButtonDescriptor): Unit = js.native
  def addToolbarButton(options: MessageViewToolbarButtonDescriptor): Unit = js.native
  def getBodyElement(): HTMLElement = js.native
  def getDateString(): String = js.native
  def getFileAttachmentCardViews(): js.Array[AttachmentCardView] = js.native
  def getLinksInBody(): js.Array[MessageViewLinkDescriptor] = js.native
  def getMessageIDAsync(): js.Promise[String] = js.native
  def getRecipientEmailAddresses(): js.Array[String] = js.native
  def getRecipientsFull(): js.Promise[js.Array[Contact]] = js.native
  def getSender(): Contact = js.native
  def getThreadView(): ThreadView = js.native
  // addAttachmentIcon(iconDescriptor: Stream<MessageAttachmentIconDescriptor>): void;
  def getViewState(): MessageViewViewStates = js.native
  def isElementInQuotedArea(): Boolean = js.native
  def isLoaded(): Boolean = js.native
  @JSName("on")
  def on_contactHover(name: contactHover, cb: js.Function1[/* event */ ContactHoverEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_load(name: load, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_viewStateChange(name: viewStateChange, cb: js.Function1[/* event */ AnonMessageView, Unit]): Unit = js.native
}

