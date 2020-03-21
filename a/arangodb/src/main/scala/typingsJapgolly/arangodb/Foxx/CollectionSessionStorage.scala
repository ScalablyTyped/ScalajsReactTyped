package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSessionStorage extends SessionStorage {
  def clear(session: Session): Boolean
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  def prune(): js.Array[String]
  def save(session: Session): Session
}

object CollectionSessionStorage {
  @scala.inline
  def apply(
    clear: Session => CallbackTo[Boolean],
    forClient: Session => CallbackTo[String | Null],
    fromClient: String => CallbackTo[Session | Null],
    `new`: CallbackTo[Session],
    prune: CallbackTo[js.Array[String]],
    save: Session => CallbackTo[Session]
  ): CollectionSessionStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Session) => clear(t0).runNow()))
    __obj.updateDynamic("forClient")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Session) => forClient(t0).runNow()))
    __obj.updateDynamic("fromClient")(js.Any.fromFunction1((t0: java.lang.String) => fromClient(t0).runNow()))
    __obj.updateDynamic("new")(`new`.toJsFn)
    __obj.updateDynamic("prune")(prune.toJsFn)
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Session) => save(t0).runNow()))
    __obj.asInstanceOf[CollectionSessionStorage]
  }
}

