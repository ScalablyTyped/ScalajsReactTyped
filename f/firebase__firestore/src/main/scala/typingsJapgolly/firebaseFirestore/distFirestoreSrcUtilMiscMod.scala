package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcUtilMiscMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/misc", "AutoId")
  @js.native
  open class AutoId () extends StObject
  /* static members */
  object AutoId {
    
    @JSImport("@firebase/firestore/dist/firestore/src/util/misc", "AutoId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def newId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newId")().asInstanceOf[String]
  }
  
  inline def arrayEquals[T](left: js.Array[T], right: js.Array[T], comparator: js.Function2[/* l */ T, /* r */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def immediateSuccessor(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("immediateSuccessor")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def primitiveComparator[T](left: T, right: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("primitiveComparator")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Equatable[T] extends StObject {
    
    def isEqual(other: T): Boolean
  }
  object Equatable {
    
    inline def apply[T](isEqual: T => Boolean): Equatable[T] = {
      val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
      __obj.asInstanceOf[Equatable[T]]
    }
    
    extension [Self <: Equatable[?], T](x: Self & Equatable[T]) {
      
      inline def setIsEqual(value: T => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    }
  }
  
  type EventHandler[E] = js.Function1[/* value */ E, Unit]
  
  type Indexable = StringDictionary[Any]
  
  trait Iterable[V] extends StObject {
    
    def forEach(cb: js.Function1[/* v */ V, Unit]): Unit
  }
  object Iterable {
    
    inline def apply[V](forEach: js.Function1[/* v */ V, Unit] => Callback): Iterable[V] = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function1[/* v */ V, Unit]) => forEach(t0).runNow()))
      __obj.asInstanceOf[Iterable[V]]
    }
    
    extension [Self <: Iterable[?], V](x: Self & Iterable[V]) {
      
      inline def setForEach(value: js.Function1[/* v */ V, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* v */ V, Unit]) => value(t0).runNow()))
    }
  }
}
