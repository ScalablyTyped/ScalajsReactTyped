package typingsJapgolly.frecency

import japgolly.scalajs.react.Callback
import typingsJapgolly.frecency.anon.ExactQueryMatchWeight
import typingsJapgolly.frecency.anon.FrecencyScore
import typingsJapgolly.frecency.anon.KeepScores
import typingsJapgolly.frecency.anon.Results
import typingsJapgolly.frecency.anon.SearchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frecency", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Frecency[T] {
    def this(constructOpts: ExactQueryMatchWeight) = this()
    
    /* CompleteClass */
    override def save(arg: SearchQuery[T]): Unit = js.native
    
    /* CompleteClass */
    var sort: js.Function1[
        (/* arg */ KeepScores[T]) | (/* arg */ Results[T]), 
        js.Array[(T & FrecencyScore) | T]
      ] = js.native
  }
  
  trait Frecency[T] extends StObject {
    
    def save(arg: SearchQuery[T]): Unit
    
    var sort: js.Function1[
        (/* arg */ KeepScores[T]) | (/* arg */ Results[T]), 
        js.Array[(T & FrecencyScore) | T]
      ]
  }
  object Frecency {
    
    inline def apply[T](
      save: SearchQuery[T] => Callback,
      sort: (/* arg */ KeepScores[T]) | (/* arg */ Results[T]) => js.Array[(T & FrecencyScore) | T]
    ): Frecency[T] = {
      val __obj = js.Dynamic.literal(save = js.Any.fromFunction1((t0: SearchQuery[T]) => save(t0).runNow()), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Frecency[T]]
    }
    
    extension [Self <: Frecency[?], T](x: Self & Frecency[T]) {
      
      inline def setSave(value: SearchQuery[T] => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: SearchQuery[T]) => value(t0).runNow()))
      
      inline def setSort(value: (/* arg */ KeepScores[T]) | (/* arg */ Results[T]) => js.Array[(T & FrecencyScore) | T]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  type idAttrFn = js.Function1[/* result */ String, String]
}
