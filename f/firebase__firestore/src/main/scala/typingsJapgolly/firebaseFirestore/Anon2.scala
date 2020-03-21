package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  def forEach(cb: js.Function1[/* el */ PersistencePromise[_], Unit]): Unit
}

object Anon2 {
  @scala.inline
  def apply(forEach: js.Function1[/* el */ PersistencePromise[js.Any], Unit] => Callback): Anon2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[
  /* el */ typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise[js.Any], 
  scala.Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[Anon2]
  }
}

