package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionStorage extends js.Object {
  var `new`: js.UndefOr[js.Function0[Session]] = js.undefined
  def forClient(session: Session): String | Null
  def fromClient(sid: String): Session | Null
}

object SessionStorage {
  @scala.inline
  def apply(
    forClient: Session => CallbackTo[String | Null],
    fromClient: String => CallbackTo[Session | Null],
    `new`: js.UndefOr[CallbackTo[Session]] = js.undefined
  ): SessionStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forClient")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Session) => forClient(t0).runNow()))
    __obj.updateDynamic("fromClient")(js.Any.fromFunction1((t0: java.lang.String) => fromClient(t0).runNow()))
    `new`.foreach(p => __obj.updateDynamic("new")(p.toJsFn))
    __obj.asInstanceOf[SessionStorage]
  }
}

