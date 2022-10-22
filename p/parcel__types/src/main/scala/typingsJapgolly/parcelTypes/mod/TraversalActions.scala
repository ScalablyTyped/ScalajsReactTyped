package typingsJapgolly.parcelTypes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraversalActions extends StObject {
  
  /** Skip the current node's children and continue the traversal if there are other nodes in the queue. */
  def skipChildren(): Unit
  
  /** Stop the traversal */
  def stop(): Unit
}
object TraversalActions {
  
  inline def apply(skipChildren: Callback, stop: Callback): TraversalActions = {
    val __obj = js.Dynamic.literal(skipChildren = skipChildren.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[TraversalActions]
  }
  
  extension [Self <: TraversalActions](x: Self) {
    
    inline def setSkipChildren(value: Callback): Self = StObject.set(x, "skipChildren", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
