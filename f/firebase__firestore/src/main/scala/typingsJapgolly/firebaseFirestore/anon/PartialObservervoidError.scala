package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilMiscMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/lite/firestore/src/core/event_manager.Observer<void>> */
trait PartialObservervoidError extends StObject {
  
  var error: js.UndefOr[EventHandler[FirestoreError]] = js.undefined
  
  var next: js.UndefOr[EventHandler[Unit]] = js.undefined
}
object PartialObservervoidError {
  
  inline def apply(): PartialObservervoidError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObservervoidError]
  }
  
  extension [Self <: PartialObservervoidError](x: Self) {
    
    inline def setError(value: FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: FirestoreError) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: Unit => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: Unit) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
