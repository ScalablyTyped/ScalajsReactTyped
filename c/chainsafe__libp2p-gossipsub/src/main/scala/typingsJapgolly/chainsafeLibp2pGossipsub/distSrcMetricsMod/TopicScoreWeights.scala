package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicScoreWeights[T] extends StObject {
  
  var p1w: T
  
  var p2w: T
  
  var p3bw: T
  
  var p3w: T
  
  var p4w: T
}
object TopicScoreWeights {
  
  inline def apply[T](p1w: T, p2w: T, p3bw: T, p3w: T, p4w: T): TopicScoreWeights[T] = {
    val __obj = js.Dynamic.literal(p1w = p1w.asInstanceOf[js.Any], p2w = p2w.asInstanceOf[js.Any], p3bw = p3bw.asInstanceOf[js.Any], p3w = p3w.asInstanceOf[js.Any], p4w = p4w.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicScoreWeights[T]]
  }
  
  extension [Self <: TopicScoreWeights[?], T](x: Self & TopicScoreWeights[T]) {
    
    inline def setP1w(value: T): Self = StObject.set(x, "p1w", value.asInstanceOf[js.Any])
    
    inline def setP2w(value: T): Self = StObject.set(x, "p2w", value.asInstanceOf[js.Any])
    
    inline def setP3bw(value: T): Self = StObject.set(x, "p3bw", value.asInstanceOf[js.Any])
    
    inline def setP3w(value: T): Self = StObject.set(x, "p3w", value.asInstanceOf[js.Any])
    
    inline def setP4w(value: T): Self = StObject.set(x, "p4w", value.asInstanceOf[js.Any])
  }
}
