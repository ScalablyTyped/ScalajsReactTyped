package typingsJapgolly.box2d.Box2D.Dynamics

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2FilterData extends StObject {
  
  /**
    * Creates a copy of the filter data.
    * @return Copy of this filter data.
    **/
  def Copy(): b2FilterData
  
  /**
    * The collision category bits. Normally you would just set one bit.
    **/
  var categoryBits: Double
  
  /**
    * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
    **/
  var groupIndex: Double
  
  /**
    * The collision mask bits. This states the categories that this shape would accept for collision.
    **/
  var maskBits: Double
}
object b2FilterData {
  
  inline def apply(Copy: CallbackTo[b2FilterData], categoryBits: Double, groupIndex: Double, maskBits: Double): b2FilterData = {
    val __obj = js.Dynamic.literal(Copy = Copy.toJsFn, categoryBits = categoryBits.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], maskBits = maskBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FilterData]
  }
  
  extension [Self <: b2FilterData](x: Self) {
    
    inline def setCategoryBits(value: Double): Self = StObject.set(x, "categoryBits", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: CallbackTo[b2FilterData]): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setMaskBits(value: Double): Self = StObject.set(x, "maskBits", value.asInstanceOf[js.Any])
  }
}
