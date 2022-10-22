package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowView extends StObject {
  
  // addButton(buttonDescriptor: Stream<ThreadRowButtonDescriptor>): void;
  def addActionButton(buttonDescriptor: ThreadRowActionButtonDescriptor): Unit
  
  // addActionButton(buttonDescriptor: Stream<ThreadRowActionButtonDescriptor>): void;
  def addAttachmentIcon(threadRowAttachmentIconDescriptor: ThreadRowAttachmentIconDescriptor): Unit
  
  // addImage(imageDescriptor: Stream<ImageDescriptor>): void;
  def addButton(buttonDescriptor: ThreadRowButtonDescriptor): Unit
  
  // addLabel(labelDescriptor: Stream<LabelDescriptor>): void;
  def addImage(imageDescriptor: ImageDescriptor): Unit
  
  def addLabel(labelDescriptor: LabelDescriptor): Unit
  
  var destroyed: Boolean
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(addActionButton = js.Any.fromFunction1((t0: ThreadRowActionButtonDescriptor) => addActionButton(t0).runNow()), addAttachmentIcon = js.Any.fromFunction1((t0: ThreadRowAttachmentIconDescriptor) => addAttachmentIcon(t0).runNow()), addButton = js.Any.fromFunction1((t0: ThreadRowButtonDescriptor) => addButton(t0).runNow()), addImage = js.Any.fromFunction1((t0: ImageDescriptor) => addImage(t0).runNow()), addLabel = js.Any.fromFunction1((t0: LabelDescriptor) => addLabel(t0).runNow()), destroyed = destroyed.asInstanceOf[js.Any], getContacts = getContacts.toJsFn, getDateString = getDateString.toJsFn, getDraftID = getDraftID.toJsFn, getSubject = getSubject.toJsFn, getThreadIDAsync = getThreadIDAsync.toJsFn, getThreadIDIfStableAsync = getThreadIDIfStableAsync.toJsFn, getVisibleDraftCount = getVisibleDraftCount.toJsFn, getVisibleMessageCount = getVisibleMessageCount.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), replaceDate = js.Any.fromFunction1((t0: ThreadRowDateDescriptor) => replaceDate(t0).runNow()), replaceDraftLabel = js.Any.fromFunction1((t0: ThreadRowDraftLabelDescriptor) => replaceDraftLabel(t0).runNow()))
    __obj.asInstanceOf[ThreadRowView]
  }
  
  extension [Self <: ThreadRowView](x: Self) {
    
    inline def setAddActionButton(value: ThreadRowActionButtonDescriptor => Callback): Self = StObject.set(x, "addActionButton", js.Any.fromFunction1((t0: ThreadRowActionButtonDescriptor) => value(t0).runNow()))
    
    inline def setAddAttachmentIcon(value: ThreadRowAttachmentIconDescriptor => Callback): Self = StObject.set(x, "addAttachmentIcon", js.Any.fromFunction1((t0: ThreadRowAttachmentIconDescriptor) => value(t0).runNow()))
    
    inline def setAddButton(value: ThreadRowButtonDescriptor => Callback): Self = StObject.set(x, "addButton", js.Any.fromFunction1((t0: ThreadRowButtonDescriptor) => value(t0).runNow()))
    
    inline def setAddImage(value: ImageDescriptor => Callback): Self = StObject.set(x, "addImage", js.Any.fromFunction1((t0: ImageDescriptor) => value(t0).runNow()))
    
    inline def setAddLabel(value: LabelDescriptor => Callback): Self = StObject.set(x, "addLabel", js.Any.fromFunction1((t0: LabelDescriptor) => value(t0).runNow()))
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetContacts(value: CallbackTo[js.Array[Contact]]): Self = StObject.set(x, "getContacts", value.toJsFn)
    
    inline def setGetDateString(value: CallbackTo[String]): Self = StObject.set(x, "getDateString", value.toJsFn)
    
    inline def setGetDraftID(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDraftID", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setGetThreadIDAsync(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getThreadIDAsync", value.toJsFn)
    
    inline def setGetThreadIDIfStableAsync(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getThreadIDIfStableAsync", value.toJsFn)
    
    inline def setGetVisibleDraftCount(value: CallbackTo[Double]): Self = StObject.set(x, "getVisibleDraftCount", value.toJsFn)
    
    inline def setGetVisibleMessageCount(value: CallbackTo[Double]): Self = StObject.set(x, "getVisibleMessageCount", value.toJsFn)
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setReplaceDate(value: ThreadRowDateDescriptor => Callback): Self = StObject.set(x, "replaceDate", js.Any.fromFunction1((t0: ThreadRowDateDescriptor) => value(t0).runNow()))
    
    inline def setReplaceDraftLabel(value: ThreadRowDraftLabelDescriptor => Callback): Self = StObject.set(x, "replaceDraftLabel", js.Any.fromFunction1((t0: ThreadRowDraftLabelDescriptor) => value(t0).runNow()))
  }
}
