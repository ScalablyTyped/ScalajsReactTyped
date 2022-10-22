package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40`[T] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
}
object `40` {
  
  inline def apply[T](): `40`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`[T]]
  }
  
  extension [Self <: `40`[?], T](x: Self & `40`[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ FirestoreError) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: /* snapshot */ QuerySnapshot[T] => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* snapshot */ QuerySnapshot[T]) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
