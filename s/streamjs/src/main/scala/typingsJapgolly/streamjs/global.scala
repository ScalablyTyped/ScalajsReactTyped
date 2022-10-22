package typingsJapgolly.streamjs

import typingsJapgolly.streamjs.Stream.Supplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Stream")
  @js.native
  open class Stream[T] ()
    extends StObject
       with typingsJapgolly.streamjs.Stream[T]
  object Stream {
    
    @JSGlobal("Stream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Stream.Optional")
    @js.native
    open class Optional[T] ()
      extends StObject
         with typingsJapgolly.streamjs.Stream.Optional[T] {
      
      /* CompleteClass */
      override def filter(predicate: js.Function1[T, Boolean]): typingsJapgolly.streamjs.Stream.Optional[T] = js.native
      
      /* CompleteClass */
      override def flatMap[U](mapper: js.Function1[T, typingsJapgolly.streamjs.Stream.Optional[U]]): typingsJapgolly.streamjs.Stream.Optional[U] = js.native
      
      /* CompleteClass */
      override def get(): T = js.native
      
      /* CompleteClass */
      override def ifPresent(consumer: js.Function1[T, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def isPresent(): Boolean = js.native
      
      /* CompleteClass */
      override def map[U](mapper: js.Function1[T, U]): typingsJapgolly.streamjs.Stream.Optional[U] = js.native
      
      /* CompleteClass */
      override def orElse(other: T): T = js.native
      
      /* CompleteClass */
      override def orElseGet(supplier: Supplier[T]): T = js.native
      
      /* CompleteClass */
      override def orElseThrow(error: Any): T = js.native
    }
    /* static members */
    object Optional {
      
      @JSGlobal("Stream.Optional")
      @js.native
      val ^ : js.Any = js.native
      
      inline def of[T](elem: T): typingsJapgolly.streamjs.Stream.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.streamjs.Stream.Optional[T]]
      
      inline def ofNullable[T](elem: T): typingsJapgolly.streamjs.Stream.Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.streamjs.Stream.Optional[T]]
    }
    
    /* static member */
    inline def from(str: String): typingsJapgolly.streamjs.Stream[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.streamjs.Stream[String]]
    /* static member */
    inline def from[T](elems: js.Array[T]): typingsJapgolly.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(elems.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.streamjs.Stream[T]]
    
    /* static member */
    inline def generate[T](supplier: Supplier[T]): typingsJapgolly.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(supplier.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.streamjs.Stream[T]]
    
    /* static member */
    inline def iterate[T](seed: T, fn: js.Function): typingsJapgolly.streamjs.Stream[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(seed.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.streamjs.Stream[T]]
    
    /* static member */
    inline def of[T](elems: T*): typingsJapgolly.streamjs.Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(elems.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.streamjs.Stream[T]]
    
    /* static member */
    inline def range(startInclusive: Double, endExclusive: Double): typingsJapgolly.streamjs.Stream[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(startInclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.streamjs.Stream[Double]]
    
    /* static member */
    inline def rangeClosed(startInclusive: Double, endInclusive: Double): typingsJapgolly.streamjs.Stream[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeClosed")(startInclusive.asInstanceOf[js.Any], endInclusive.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.streamjs.Stream[Double]]
  }
}
