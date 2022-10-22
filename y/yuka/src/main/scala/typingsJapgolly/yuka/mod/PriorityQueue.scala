package typingsJapgolly.yuka.mod

import typingsJapgolly.yuka.srcGraphExtraPriorityQueueMod.CompareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "PriorityQueue")
@js.native
/**
  * Constructs a new priority queue.
  *
  * @param [compare] - The compare function used for sorting.
  */
open class PriorityQueue[T] ()
  extends typingsJapgolly.yuka.srcYukaMod.PriorityQueue[T] {
  def this(compare: CompareFunction[T]) = this()
}
