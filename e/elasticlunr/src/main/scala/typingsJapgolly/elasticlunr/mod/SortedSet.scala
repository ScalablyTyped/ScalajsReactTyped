package typingsJapgolly.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "SortedSet")
@js.native
open class SortedSet[T] () extends StObject {
  
  def add(args: Any*): Unit = js.native
  
  def forEach(
    fn: js.Function3[/* element */ T, /* index */ Double, /* collection */ js.Array[T], Unit],
    ctx: js.Object
  ): Unit = js.native
  
  def indexOf(elem: js.Object): Double = js.native
  
  def intersect(otherSet: SortedSet[T]): SortedSet[T] = js.native
  
  def locationFor(elem: T): Double = js.native
  
  def map(fn: js.Function3[/* element */ T, /* index */ Double, /* collection */ js.Array[T], T]): js.Array[T] = js.native
  def map(
    fn: js.Function3[/* element */ T, /* index */ Double, /* collection */ js.Array[T], T],
    ctx: js.Object
  ): js.Array[T] = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def toJSON(): js.Array[T] = js.native
  
  def union(otherSet: SortedSet[T]): SortedSet[T] = js.native
}
object SortedSet {
  
  @JSImport("elasticlunr", "SortedSet")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def load[T](serialisedData: js.Array[T]): SortedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[SortedSet[T]]
}
