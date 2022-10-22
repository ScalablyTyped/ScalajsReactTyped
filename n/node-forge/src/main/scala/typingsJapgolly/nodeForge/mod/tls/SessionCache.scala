package typingsJapgolly.nodeForge.mod.tls

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.Hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionCache extends StObject {
  
  var cache: StringDictionary[Session]
  
  var capacity: Double
  
  def getSession(sessionId: Bytes): Session
  
  var order: js.Array[Hex]
  
  def setSession(sessionId: Bytes, session: Session): Unit
}
object SessionCache {
  
  inline def apply(
    cache: StringDictionary[Session],
    capacity: Double,
    getSession: Bytes => Session,
    order: js.Array[Hex],
    setSession: (Bytes, Session) => Callback
  ): SessionCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], getSession = js.Any.fromFunction1(getSession), order = order.asInstanceOf[js.Any], setSession = js.Any.fromFunction2((t0: Bytes, t1: Session) => (setSession(t0, t1)).runNow()))
    __obj.asInstanceOf[SessionCache]
  }
  
  extension [Self <: SessionCache](x: Self) {
    
    inline def setCache(value: StringDictionary[Session]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setGetSession(value: Bytes => Session): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
    
    inline def setOrder(value: js.Array[Hex]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: Hex*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setSetSession(value: (Bytes, Session) => Callback): Self = StObject.set(x, "setSession", js.Any.fromFunction2((t0: Bytes, t1: Session) => (value(t0, t1)).runNow()))
  }
}
