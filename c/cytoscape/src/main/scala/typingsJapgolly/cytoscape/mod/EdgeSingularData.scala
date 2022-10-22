package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/data
  */
trait EdgeSingularData extends StObject {
  
  /**
    * Get whether the edge is a loop (i.e. source same as target).
    * http://js.cytoscape.org/#edge.isLoop
    */
  def isLoop(): Boolean
  
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): Boolean
}
object EdgeSingularData {
  
  inline def apply(isLoop: CallbackTo[Boolean], isSimple: CallbackTo[Boolean]): EdgeSingularData = {
    val __obj = js.Dynamic.literal(isLoop = isLoop.toJsFn, isSimple = isSimple.toJsFn)
    __obj.asInstanceOf[EdgeSingularData]
  }
  
  extension [Self <: EdgeSingularData](x: Self) {
    
    inline def setIsLoop(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoop", value.toJsFn)
    
    inline def setIsSimple(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSimple", value.toJsFn)
  }
}
