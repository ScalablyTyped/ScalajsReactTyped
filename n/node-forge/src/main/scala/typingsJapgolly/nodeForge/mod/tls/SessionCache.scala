package typingsJapgolly.nodeForge.mod.tls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCache extends js.Object {
  var cache: StringDictionary[Session]
  var capacity: Double
  var order: js.Array[Hex]
  def getSession(sessionId: Bytes): Session
  def setSession(sessionId: Bytes, session: Session): Unit
}

object SessionCache {
  @scala.inline
  def apply(
    cache: StringDictionary[Session],
    capacity: Double,
    getSession: Bytes => CallbackTo[Session],
    order: js.Array[Hex],
    setSession: (Bytes, Session) => Callback
  ): SessionCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("getSession")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.Bytes) => getSession(t0).runNow()))
    __obj.updateDynamic("setSession")(js.Any.fromFunction2((t0: typingsJapgolly.nodeForge.mod.Bytes, t1: typingsJapgolly.nodeForge.mod.tls.Session) => setSession(t0, t1).runNow()))
    __obj.asInstanceOf[SessionCache]
  }
}

