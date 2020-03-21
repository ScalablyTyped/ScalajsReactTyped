package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowView extends js.Object {
  var destroyed: Boolean
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit
  def addLabel(labelDescriptor: LabelDescriptor): Unit
  def getContacts(): js.Array[Contact]
  def getDateString(): String
  def getDraftID(): js.Promise[String]
  // replaceDraftLabel(draftLabelDescriptor: Stream<ThreadRowDraftLabelDescriptor>): void;
  def getSubject(): String
  def getThreadIDAsync(): js.Promise[String]
  def getThreadIDIfStableAsync(): js.Promise[String | Null]
  def getVisibleDraftCount(): Double
  def getVisibleMessageCount(): Double
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  // addAttachmentIcon(threadRowAttachmentIconDescriptor: stream<ThreadRowAttachmentIconDescriptor>): void
  def replaceDate(threadRowDateDescriptor: ThreadRowDateDescriptor): Unit
  // replaceDate(threadRowDateDescriptor: Stream<ThreadRowDateDescriptor>): void;
  def replaceDraftLabel(draftLabelDescriptor: ThreadRowDraftLabelDescriptor): Unit
}

object ThreadRowView {
  @scala.inline
  def apply(
    addActionButton: ThreadRowActionButtonDescriptor => Callback,
    addAttachmentIcon: ThreadRowAttachmentIconDescriptor => Callback,
    addButton: ThreadRowButtonDescriptor => Callback,
    addImage: ImageDescriptor => Callback,
    addLabel: LabelDescriptor => Callback,
    destroyed: Boolean,
    getContacts: CallbackTo[js.Array[Contact]],
    getDateString: CallbackTo[String],
    getDraftID: CallbackTo[js.Promise[String]],
    getSubject: CallbackTo[String],
    getThreadIDAsync: CallbackTo[js.Promise[String]],
    getThreadIDIfStableAsync: CallbackTo[js.Promise[String | Null]],
    getVisibleDraftCount: CallbackTo[Double],
    getVisibleMessageCount: CallbackTo[Double],
    on: (destroy, js.Function0[Unit]) => Callback,
    replaceDate: ThreadRowDateDescriptor => Callback,
    replaceDraftLabel: ThreadRowDraftLabelDescriptor => Callback
  ): ThreadRowView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("addActionButton")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowActionButtonDescriptor) => addActionButton(t0).runNow()))
    __obj.updateDynamic("addAttachmentIcon")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowAttachmentIconDescriptor) => addAttachmentIcon(t0).runNow()))
    __obj.updateDynamic("addButton")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowButtonDescriptor) => addButton(t0).runNow()))
    __obj.updateDynamic("addImage")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ImageDescriptor) => addImage(t0).runNow()))
    __obj.updateDynamic("addLabel")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptor) => addLabel(t0).runNow()))
    __obj.updateDynamic("getContacts")(getContacts.toJsFn)
    __obj.updateDynamic("getDateString")(getDateString.toJsFn)
    __obj.updateDynamic("getDraftID")(getDraftID.toJsFn)
    __obj.updateDynamic("getSubject")(getSubject.toJsFn)
    __obj.updateDynamic("getThreadIDAsync")(getThreadIDAsync.toJsFn)
    __obj.updateDynamic("getThreadIDIfStableAsync")(getThreadIDIfStableAsync.toJsFn)
    __obj.updateDynamic("getVisibleDraftCount")(getVisibleDraftCount.toJsFn)
    __obj.updateDynamic("getVisibleMessageCount")(getVisibleMessageCount.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("replaceDate")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowDateDescriptor) => replaceDate(t0).runNow()))
    __obj.updateDynamic("replaceDraftLabel")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowDraftLabelDescriptor) => replaceDraftLabel(t0).runNow()))
    __obj.asInstanceOf[ThreadRowView]
  }
}

