package typingsJapgolly.firebaseDatabase.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityIndex
  extends StObject
     with Index
object PriorityIndex {
  
  inline def apply(
    compare: (NamedNode, NamedNode) => Double,
    getCompare: CallbackTo[Comparator[NamedNode]],
    indexedValueChanged: (Node2, Node2) => Boolean,
    isDefinedOn: Node2 => Boolean,
    makePost: (Any, String) => NamedNode,
    maxPost: CallbackTo[NamedNode],
    minPost: CallbackTo[NamedNode]
  ): PriorityIndex = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), getCompare = getCompare.toJsFn, indexedValueChanged = js.Any.fromFunction2(indexedValueChanged), isDefinedOn = js.Any.fromFunction1(isDefinedOn), makePost = js.Any.fromFunction2(makePost), maxPost = maxPost.toJsFn, minPost = minPost.toJsFn)
    __obj.asInstanceOf[PriorityIndex]
  }
}
