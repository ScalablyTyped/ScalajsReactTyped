package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentReference {
  type ObserverOnError = js.Function1[
    /* err */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.SnapshotError, 
    scala.Unit
  ]
  type ObserverOnNext = js.Function1[
    /* documentSnapshot */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.DocumentSnapshot, 
    scala.Unit
  ]
}
