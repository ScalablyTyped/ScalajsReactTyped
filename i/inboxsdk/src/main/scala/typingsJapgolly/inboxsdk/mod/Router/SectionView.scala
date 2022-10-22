package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionView extends StObject {
  
  var destroyed: Boolean
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  
  def remove(): Unit
}
object SectionView {
  
  inline def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Callback, remove: Callback): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), remove = remove.toJsFn)
    __obj.asInstanceOf[SectionView]
  }
  
  extension [Self <: SectionView](x: Self) {
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
