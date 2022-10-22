package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.activate
import typingsJapgolly.inboxsdk.inboxsdkStrings.deactivate
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentPanelView extends StObject {
  
  /**
    * Undocumented method, no guarantee it will always work.
    */
  def close(): Unit
  
  var destroyed: Boolean
  
  def isActive(): Boolean
  
  def on(name: destroy | activate | deactivate, cb: js.Function0[Unit]): Unit
  
  def open(): Unit
  
  def remove(): Unit
}
object ContentPanelView {
  
  inline def apply(
    close: Callback,
    destroyed: Boolean,
    isActive: CallbackTo[Boolean],
    on: (destroy | activate | deactivate, js.Function0[Unit]) => Callback,
    open: Callback,
    remove: Callback
  ): ContentPanelView = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroyed = destroyed.asInstanceOf[js.Any], isActive = isActive.toJsFn, on = js.Any.fromFunction2((t0: destroy | activate | deactivate, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), open = open.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ContentPanelView]
  }
  
  extension [Self <: ContentPanelView](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setOn(value: (destroy | activate | deactivate, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy | activate | deactivate, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
