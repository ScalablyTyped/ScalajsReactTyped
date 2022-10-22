package typingsJapgolly.inboxsdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLElement
import typingsJapgolly.inboxsdk.anon.Added
import typingsJapgolly.inboxsdk.anon.Cancel
import typingsJapgolly.inboxsdk.anon.ClosedByInboxSDK
import typingsJapgolly.inboxsdk.anon.Fullscreen
import typingsJapgolly.inboxsdk.anon.GetMessageID
import typingsJapgolly.inboxsdk.anon.IsForward
import typingsJapgolly.inboxsdk.inboxsdkStrings.MODIFIER
import typingsJapgolly.inboxsdk.inboxsdkStrings.SEND_ACTION
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
import typingsJapgolly.inboxsdk.mod.Common.DropdownView
import typingsJapgolly.inboxsdk.mod.Common.SimpleElementView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compose {
  
  trait ComposeButtonClickEvent extends StObject {
    
    var composeView: ComposeView
    
    var dropdown: DropdownView
  }
  object ComposeButtonClickEvent {
    
    inline def apply(composeView: ComposeView, dropdown: DropdownView): ComposeButtonClickEvent = {
      val __obj = js.Dynamic.literal(composeView = composeView.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeButtonClickEvent]
    }
    
    extension [Self <: ComposeButtonClickEvent](x: Self) {
      
      inline def setComposeView(value: ComposeView): Self = StObject.set(x, "composeView", value.asInstanceOf[js.Any])
      
      inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComposeButtonDescriptor extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var hasDropdown: js.UndefOr[Boolean] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    def onClick(event: ComposeButtonClickEvent): Unit
    
    var orderHint: js.UndefOr[Double] = js.undefined
    
    var title: String
    
    var `type`: js.UndefOr[MODIFIER | SEND_ACTION] = js.undefined
  }
  object ComposeButtonDescriptor {
    
    inline def apply(onClick: ComposeButtonClickEvent => Callback, title: String): ComposeButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ComposeButtonClickEvent) => onClick(t0).runNow()), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeButtonDescriptor]
    }
    
    extension [Self <: ComposeButtonDescriptor](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
      
      inline def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setOnClick(value: ComposeButtonClickEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ComposeButtonClickEvent) => value(t0).runNow()))
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: MODIFIER | SEND_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ComposeInstance extends StObject {
    
    def openNewComposeView(): js.Promise[ComposeView]
    
    def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, Unit]): js.Function0[Unit]
  }
  object ComposeInstance {
    
    inline def apply(
      openNewComposeView: CallbackTo[js.Promise[ComposeView]],
      registerComposeViewHandler: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]
    ): ComposeInstance = {
      val __obj = js.Dynamic.literal(openNewComposeView = openNewComposeView.toJsFn, registerComposeViewHandler = js.Any.fromFunction1(registerComposeViewHandler))
      __obj.asInstanceOf[ComposeInstance]
    }
    
    extension [Self <: ComposeInstance](x: Self) {
      
      inline def setOpenNewComposeView(value: CallbackTo[js.Promise[ComposeView]]): Self = StObject.set(x, "openNewComposeView", value.toJsFn)
      
      inline def setRegisterComposeViewHandler(value: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerComposeViewHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait ComposeNoticeDescriptor extends StObject {
    
    var orderHint: js.UndefOr[Double] = js.undefined
  }
  object ComposeNoticeDescriptor {
    
    inline def apply(): ComposeNoticeDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeNoticeDescriptor]
    }
    
    extension [Self <: ComposeNoticeDescriptor](x: Self) {
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    }
  }
  
  @js.native
  trait ComposeView extends StObject {
    
    def addButton(buttonDescriptor: ComposeButtonDescriptor): Unit = js.native
    
    def addComposeNotice(composeNoticeDescriptor: ComposeNoticeDescriptor): SimpleElementView = js.native
    
    def addStatusBar(statusBarDescriptor: StatusBarDescriptor): StatusBarView = js.native
    
    def attachFiles(files: js.Array[Blob]): js.Promise[Unit] = js.native
    
    def attachInlineFiles(Files: js.Array[Blob]): js.Promise[Unit] = js.native
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
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
    def insertHTMLIntoBodyAtCursor(html: HTMLElement): HTMLElement = js.native
    
    def insertLinkChipIntoBodyAtCursor(text: String, url: String, iconUrl: String): HTMLElement = js.native
    
    def insertLinkIntoBodyAtCursor(text: String, url: String): HTMLElement = js.native
    
    def insertTextIntoBodyAtCursor(text: String): Unit = js.native
    
    def isForward(): Boolean = js.native
    
    def isFullscreen(): Boolean = js.native
    
    def isInlineReplyForm(): Boolean = js.native
    
    def isMinimized(): Boolean = js.native
    
    def isReply(): Boolean = js.native
    
    def on(
      name: discard | sendCanceled | sending | bodyChanged | minimized | restored,
      cb: js.Function0[Unit]
    ): Unit = js.native
    def on(
      name: fromContactChanged | toContactAdded | toContactRemoved | ccContactAdded | ccContactRemoved | bccContactAdded | bccContactRemoved,
      cb: js.Function1[/* event */ typingsJapgolly.inboxsdk.anon.Contact, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function1[/* event */ ClosedByInboxSDK, Unit]): Unit = js.native
    @JSName("on")
    def on_fullscreenChanged(name: fullscreenChanged, cb: js.Function1[/* event */ Fullscreen, Unit]): Unit = js.native
    @JSName("on")
    def on_presending(name: presending, cb: js.Function1[/* event */ Cancel, Unit]): Unit = js.native
    @JSName("on")
    def on_recipientsChanged(name: recipientsChanged, cb: js.Function1[/* event */ RecipientsChangedEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_responseTypeChanged(name: responseTypeChanged, cb: js.Function1[/* event */ IsForward, Unit]): Unit = js.native
    @JSName("on")
    def on_sent(name: sent, cb: js.Function1[/* event */ GetMessageID, Unit]): Unit = js.native
    
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
  
  trait RecipientsChangedEvent extends StObject {
    
    var bcc: Added
    
    var cc: Added
    
    var to: Added
  }
  object RecipientsChangedEvent {
    
    inline def apply(bcc: Added, cc: Added, to: Added): RecipientsChangedEvent = {
      val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientsChangedEvent]
    }
    
    extension [Self <: RecipientsChangedEvent](x: Self) {
      
      inline def setBcc(value: Added): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setCc(value: Added): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Added): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendOptions extends StObject {
    
    var sendAndArchive: js.UndefOr[Boolean] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setSendAndArchive(value: Boolean): Self = StObject.set(x, "sendAndArchive", value.asInstanceOf[js.Any])
      
      inline def setSendAndArchiveUndefined: Self = StObject.set(x, "sendAndArchive", js.undefined)
    }
  }
  
  trait StatusBarDescriptor extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var orderHint: js.UndefOr[Double] = js.undefined
  }
  object StatusBarDescriptor {
    
    inline def apply(): StatusBarDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusBarDescriptor]
    }
    
    extension [Self <: StatusBarDescriptor](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    }
  }
  
  trait StatusBarView
    extends StObject
       with SimpleElementView {
    
    def setHeight(height: Double): Unit
  }
  object StatusBarView {
    
    inline def apply(
      destroy: Callback,
      destroyed: Boolean,
      el: HTMLElement,
      on: (destroy, js.Function0[Unit]) => Callback,
      setHeight: Double => Callback
    ): StatusBarView = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()))
      __obj.asInstanceOf[StatusBarView]
    }
    
    extension [Self <: StatusBarView](x: Self) {
      
      inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
