package typingsJapgolly.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[
    /* error */ js.Error | typingsJapgolly.firebaseStorage.errorMod.FirebaseStorageError, 
    scala.Unit
  ]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[
      typingsJapgolly.firebaseStorage.observerMod.NextFn[T] | typingsJapgolly.firebaseStorage.observerMod.StorageObserver[T] | scala.Null
    ], 
    /* error */ js.UndefOr[typingsJapgolly.firebaseStorage.observerMod.ErrorFn | scala.Null], 
    /* complete */ js.UndefOr[typingsJapgolly.firebaseStorage.observerMod.CompleteFn | scala.Null], 
    typingsJapgolly.firebaseStorage.observerMod.Unsubscribe
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
