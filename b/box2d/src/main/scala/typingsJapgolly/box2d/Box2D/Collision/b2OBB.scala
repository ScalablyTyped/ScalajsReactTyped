package typingsJapgolly.box2d.Box2D.Collision

import typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2OBB extends StObject {
  
  /**
    * The rotation matrix.
    **/
  var R: b2Mat22
  
  /**
    * The local centroid.
    **/
  var center: b2Vec2
  
  /**
    * The half-widths.
    **/
  var extents: b2Vec2
}
object b2OBB {
  
  inline def apply(R: b2Mat22, center: b2Vec2, extents: b2Vec2): b2OBB = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2OBB]
  }
  
  extension [Self <: b2OBB](x: Self) {
    
    inline def setCenter(value: b2Vec2): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setExtents(value: b2Vec2): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
    
    inline def setR(value: b2Mat22): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
  }
}
