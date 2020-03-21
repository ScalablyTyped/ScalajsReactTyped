package typingsJapgolly.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpleDbMod {
  type IterateCallback[KeyType, ValueType] = js.Function3[
    /* key */ KeyType, 
    /* value */ ValueType, 
    /* control */ typingsJapgolly.firebaseFirestore.simpleDbMod.IterationController, 
    scala.Unit | typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise[scala.Unit]
  ]
}
