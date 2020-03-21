package typingsJapgolly.firebaseFirestore.localSimpleDbMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.IDBDatabase
import org.scalajs.dom.raw.IDBTransaction
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleDbSchemaConverter extends js.Object {
  def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit]
}

object SimpleDbSchemaConverter {
  @scala.inline
  def apply(
    createOrUpgrade: (IDBDatabase, IDBTransaction, Double, Double) => CallbackTo[PersistencePromise[Unit]]
  ): SimpleDbSchemaConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOrUpgrade")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.IDBDatabase, t1: org.scalajs.dom.raw.IDBTransaction, t2: scala.Double, t3: scala.Double) => createOrUpgrade(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[SimpleDbSchemaConverter]
  }
}

