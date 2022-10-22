package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.DocumentReference.Observer
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.DocumentReference.ObserverOnError
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.DocumentReference.ObserverOnNext
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.SnapshotError
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.GetOptions
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.SetOptions
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.UpdateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference extends StObject {
  
  def collection(collectionPath: String): CollectionReference = js.native
  
  def delete(): js.Promise[Unit] = js.native
  
  val firestore: Firestore = js.native
  
  def get(): js.Promise[DocumentSnapshot] = js.native
  def get(options: GetOptions): js.Promise[DocumentSnapshot] = js.native
  
  val id: String = js.native
  
  def isEqual(otherDocumentReference: DocumentReference): Boolean = js.native
  
  def onSnapshot(metadataChanges: MetadataChanges, observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  def onSnapshot(observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  
  val parent: CollectionReference = js.native
  
  val path: String = js.native
  
  def set(data: js.Object): js.Promise[Unit] = js.native
  def set(data: js.Object, writeOptions: SetOptions): js.Promise[Unit] = js.native
  
  def update(key1: UpdateKey, val1: Any): js.Promise[Unit] = js.native
  def update(key1: UpdateKey, val1: Any, key2: UpdateKey, val2: Any): js.Promise[Unit] = js.native
  def update(key1: UpdateKey, val1: Any, key2: UpdateKey, val2: Any, key3: UpdateKey, val3: Any): js.Promise[Unit] = js.native
  def update(
    key1: UpdateKey,
    val1: Any,
    key2: UpdateKey,
    val2: Any,
    key3: UpdateKey,
    val3: Any,
    key4: UpdateKey,
    val4: Any
  ): js.Promise[Unit] = js.native
  def update(
    key1: UpdateKey,
    val1: Any,
    key2: UpdateKey,
    val2: Any,
    key3: UpdateKey,
    val3: Any,
    key4: UpdateKey,
    val4: Any,
    key5: UpdateKey,
    val5: Any
  ): js.Promise[Unit] = js.native
  def update(obj: js.Object): js.Promise[Unit] = js.native
}
object DocumentReference {
  
  trait Observer extends StObject {
    
    var error: js.UndefOr[ObserverOnError] = js.undefined
    
    var next: ObserverOnNext
  }
  object Observer {
    
    inline def apply(next: /* documentSnapshot */ DocumentSnapshot => Callback): Observer = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1((t0: /* documentSnapshot */ DocumentSnapshot) => next(t0).runNow()))
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setError(value: /* err */ SnapshotError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* err */ SnapshotError) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* documentSnapshot */ DocumentSnapshot => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* documentSnapshot */ DocumentSnapshot) => value(t0).runNow()))
    }
  }
  
  type ObserverOnError = js.Function1[/* err */ SnapshotError, Unit]
  
  type ObserverOnNext = js.Function1[/* documentSnapshot */ DocumentSnapshot, Unit]
}
