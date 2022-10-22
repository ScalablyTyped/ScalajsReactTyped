package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractRange extends StObject {
  
  /** Returns true if range is collapsed, and false otherwise. */
  /* standard dom */
  val collapsed: scala.Boolean
  
  /** Returns range's end node. */
  /* standard dom */
  val endContainer: org.scalajs.dom.Node
  
  /** Returns range's end offset. */
  /* standard dom */
  val endOffset: Double
  
  /** Returns range's start node. */
  /* standard dom */
  val startContainer: org.scalajs.dom.Node
  
  /** Returns range's start offset. */
  /* standard dom */
  val startOffset: Double
}
object AbstractRange {
  
  inline def apply(
    collapsed: scala.Boolean,
    endContainer: org.scalajs.dom.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.Node,
    startOffset: Double
  ): AbstractRange = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractRange]
  }
  
  extension [Self <: AbstractRange](x: Self) {
    
    inline def setCollapsed(value: scala.Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setEndContainer(value: org.scalajs.dom.Node): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartContainer(value: org.scalajs.dom.Node): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
