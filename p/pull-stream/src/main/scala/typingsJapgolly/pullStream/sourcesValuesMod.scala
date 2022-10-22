package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.EndOrError
import typingsJapgolly.pullStream.mod.Source
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesValuesMod {
  
  /**
    * Create a SourceStream that reads the values from an array or object and then stops.
    */
  inline def apply[T](): Source[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Unit, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Record[Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Record[Any, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
