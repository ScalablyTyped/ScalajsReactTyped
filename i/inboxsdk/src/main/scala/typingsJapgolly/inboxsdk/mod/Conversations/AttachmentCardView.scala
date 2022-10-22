package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCardView extends StObject {
  
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit
  
  var destroyed: Boolean
  
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
  
  inline def apply(
    addButton: CustomButtonDescriptor => Callback,
    destroyed: Boolean,
    getAttachmentType: CallbackTo[String],
    getDownloadURL: CallbackTo[js.Promise[String]],
    getMessageView: CallbackTo[MessageView | Null],
    getTitle: CallbackTo[String],
    on: (destroy, js.Function0[Unit]) => Callback
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1((t0: CustomButtonDescriptor) => addButton(t0).runNow()), destroyed = destroyed.asInstanceOf[js.Any], getAttachmentType = getAttachmentType.toJsFn, getDownloadURL = getDownloadURL.toJsFn, getMessageView = getMessageView.toJsFn, getTitle = getTitle.toJsFn, on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[AttachmentCardView]
  }
  
  extension [Self <: AttachmentCardView](x: Self) {
    
    inline def setAddButton(value: CustomButtonDescriptor => Callback): Self = StObject.set(x, "addButton", js.Any.fromFunction1((t0: CustomButtonDescriptor) => value(t0).runNow()))
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetAttachmentType(value: CallbackTo[String]): Self = StObject.set(x, "getAttachmentType", value.toJsFn)
    
    inline def setGetDownloadURL(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDownloadURL", value.toJsFn)
    
    inline def setGetMessageView(value: CallbackTo[MessageView | Null]): Self = StObject.set(x, "getMessageView", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
