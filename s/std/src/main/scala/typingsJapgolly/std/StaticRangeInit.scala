package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRangeInit extends StObject {
  
  /* standard dom */
  var endContainer: org.scalajs.dom.Node
  
  /* standard dom */
  var endOffset: Double
  
  /* standard dom */
  var startContainer: org.scalajs.dom.Node
  
  /* standard dom */
  var startOffset: Double
}
object StaticRangeInit {
  
  inline def apply(
    endContainer: org.scalajs.dom.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.Node,
    startOffset: Double
  ): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
  
  extension [Self <: StaticRangeInit](x: Self) {
    
    inline def setEndContainer(value: org.scalajs.dom.Node): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartContainer(value: org.scalajs.dom.Node): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
