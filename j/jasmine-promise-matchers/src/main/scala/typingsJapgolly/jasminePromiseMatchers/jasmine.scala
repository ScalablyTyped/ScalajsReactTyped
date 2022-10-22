package typingsJapgolly.jasminePromiseMatchers

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  trait Matchers[T] extends StObject {
    
    /**
      * Verifies that a value is a $q Promise.
      */
    def toBePromise(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) rejected.
      */
    def toBeRejected(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) rejected with the specified parameter.
      */
    def toBeRejectedWith(value: Any): Boolean
    
    /**
      * Verifies that a Promise is (or has been) resolved.
      */
    def toBeResolved(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) resolved with the specified parameter.
      */
    def toBeResolvedWith(value: Any): Boolean
  }
  object Matchers {
    
    inline def apply[T](
      toBePromise: CallbackTo[Boolean],
      toBeRejected: CallbackTo[Boolean],
      toBeRejectedWith: Any => Boolean,
      toBeResolved: CallbackTo[Boolean],
      toBeResolvedWith: Any => Boolean
    ): Matchers[T] = {
      val __obj = js.Dynamic.literal(toBePromise = toBePromise.toJsFn, toBeRejected = toBeRejected.toJsFn, toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = toBeResolved.toJsFn, toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
      __obj.asInstanceOf[Matchers[T]]
    }
    
    extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
      
      inline def setToBePromise(value: CallbackTo[Boolean]): Self = StObject.set(x, "toBePromise", value.toJsFn)
      
      inline def setToBeRejected(value: CallbackTo[Boolean]): Self = StObject.set(x, "toBeRejected", value.toJsFn)
      
      inline def setToBeRejectedWith(value: Any => Boolean): Self = StObject.set(x, "toBeRejectedWith", js.Any.fromFunction1(value))
      
      inline def setToBeResolved(value: CallbackTo[Boolean]): Self = StObject.set(x, "toBeResolved", value.toJsFn)
      
      inline def setToBeResolvedWith(value: Any => Boolean): Self = StObject.set(x, "toBeResolvedWith", js.Any.fromFunction1(value))
    }
  }
}
