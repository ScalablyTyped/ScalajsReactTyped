package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.collapsed_
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.inboxsdkStrings.expanded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleSectionView
  extends StObject
     with SectionView {
  
  def on(name: destroy | expanded_ | collapsed_, cb: js.Function0[Unit]): Unit
  
  def setCollapsed(value: Boolean): Unit
}
object CollapsibleSectionView {
  
  inline def apply(
    destroyed: Boolean,
    on: (destroy | expanded_ | collapsed_, js.Function0[Unit]) => Callback,
    remove: Callback,
    setCollapsed: Boolean => Callback
  ): CollapsibleSectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: destroy | expanded_ | collapsed_, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), remove = remove.toJsFn, setCollapsed = js.Any.fromFunction1((t0: Boolean) => setCollapsed(t0).runNow()))
    __obj.asInstanceOf[CollapsibleSectionView]
  }
  
  extension [Self <: CollapsibleSectionView](x: Self) {
    
    inline def setOn(value: (destroy | expanded_ | collapsed_, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: destroy | expanded_ | collapsed_, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSetCollapsed(value: Boolean => Callback): Self = StObject.set(x, "setCollapsed", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
