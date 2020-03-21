package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardView extends js.Object {
  var destroyed: Boolean
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit
  def getAttachmentType(): String
  /**
    * @deprecated. Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[String]
  def getMessageView(): MessageView | Null
  def getTitle(): String
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object AttachmentCardView {
  @scala.inline
  def apply(
    addButton: CustomButtonDescriptor => Callback,
    destroyed: Boolean,
    getAttachmentType: CallbackTo[String],
    getDownloadURL: CallbackTo[js.Promise[String]],
    getMessageView: CallbackTo[MessageView | Null],
    getTitle: CallbackTo[String],
    on: (destroy, js.Function0[Unit]) => Callback
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("addButton")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Conversations.CustomButtonDescriptor) => addButton(t0).runNow()))
    __obj.updateDynamic("getAttachmentType")(getAttachmentType.toJsFn)
    __obj.updateDynamic("getDownloadURL")(getDownloadURL.toJsFn)
    __obj.updateDynamic("getMessageView")(getMessageView.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[AttachmentCardView]
  }
}

