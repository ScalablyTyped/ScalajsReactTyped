package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerAPIBackend extends StObject {
  
  def read(endpoint: Any, callback: js.Function0[Unit]): Unit
  
  def send(endpoint: Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
}
object DPlayerAPIBackend {
  
  inline def apply(
    read: (Any, js.Function0[Unit]) => Callback,
    send: (Any, DPlayerDanmakuItem, js.Function0[Unit]) => Callback
  ): DPlayerAPIBackend = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (read(t0, t1)).runNow()), send = js.Any.fromFunction3((t0: Any, t1: DPlayerDanmakuItem, t2: js.Function0[Unit]) => (send(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DPlayerAPIBackend]
  }
  
  extension [Self <: DPlayerAPIBackend](x: Self) {
    
    inline def setRead(value: (Any, js.Function0[Unit]) => Callback): Self = StObject.set(x, "read", js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSend(value: (Any, DPlayerDanmakuItem, js.Function0[Unit]) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction3((t0: Any, t1: DPlayerDanmakuItem, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
