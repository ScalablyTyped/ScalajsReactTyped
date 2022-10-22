package typingsJapgolly.firebaseFirestoreTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreError
import typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot
import typingsJapgolly.firebaseUtil.mod.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complete[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
  }
  object Complete {
    
    inline def apply[T](): Complete[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete[T]]
    }
    
    extension [Self <: Complete[?], T](x: Self & Complete[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ FirestoreError) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ DocumentSnapshot[T] => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* snapshot */ DocumentSnapshot[T]) => value(t0).runNow()))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit]
  }
  object Delete {
    
    inline def apply(delete: CallbackTo[js.Promise[Unit]]): Delete = {
      val __obj = js.Dynamic.literal(delete = delete.toJsFn)
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setDelete(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "delete", value.toJsFn)
    }
  }
  
  trait Error extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ FirestoreError) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* value */ Unit => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ Unit) => value(t0).runNow()))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    extension [Self <: MockUserToken](x: Self) {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  trait Next[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
  }
  object Next {
    
    inline def apply[T](): Next[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next[T]]
    }
    
    extension [Self <: Next[?], T](x: Self & Next[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ FirestoreError) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ QuerySnapshot[T] => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* snapshot */ QuerySnapshot[T]) => value(t0).runNow()))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
