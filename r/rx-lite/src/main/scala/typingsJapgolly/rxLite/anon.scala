package typingsJapgolly.rxLite

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.rxCore.Rx.IDisposable
import typingsJapgolly.rxCore.Rx.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    var length: Double
  }
  object Dictindex {
    
    inline def apply[T](length: Double): Dictindex[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex[T]]
    }
    
    extension [Self <: Dictindex[?], T](x: Self & Dictindex[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDisposable extends StObject {
    
    def getDisposable(): IDisposable
  }
  object GetDisposable {
    
    inline def apply(getDisposable: CallbackTo[IDisposable]): GetDisposable = {
      val __obj = js.Dynamic.literal(getDisposable = getDisposable.toJsFn)
      __obj.asInstanceOf[GetDisposable]
    }
    
    extension [Self <: GetDisposable](x: Self) {
      
      inline def setGetDisposable(value: CallbackTo[IDisposable]): Self = StObject.set(x, "getDisposable", value.toJsFn)
    }
  }
  
  @js.native
  trait Instantiable[T, TPromise /* <: IPromise[T] */]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ Any, Unit], 
            Unit
          ], 
          TPromise
        ]
  
  @js.native
  trait InstantiableIPromise[T]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ Any, Unit], 
            Unit
          ], 
          IPromise[T]
        ]
}
