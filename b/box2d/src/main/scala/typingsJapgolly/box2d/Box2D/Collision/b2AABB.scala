package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2AABB extends StObject {
  
  /**
    * Combines two AABBs into one with max values for upper bound and min values for lower bound.  The result is stored in this AABB.
    * @param aabb1 First AABB to combine.
    * @param aabb2 Second AABB to combine.
    **/
  def Combine(aabb1: b2AABB, aabb2: b2AABB): Unit
  
  /**
    * Determines if an AABB is contained within this one.
    * @param aabb AABB to see if it is contained.
    * @return True if aabb is contained, otherwise false.
    **/
  def Contains(aabb: b2AABB): Boolean
  
  /**
    * Gets the center of the AABB.
    * @return Center of this AABB.
    **/
  def GetCenter(): b2Vec2
  
  /**
    * Gets the extents of the AABB (half-widths).
    * @return Extents of this AABB.
    **/
  def GetExtents(): b2Vec2
  
  /**
    * Verify that the bounds are sorted.
    * @return True if the bounds are sorted, otherwise false.
    **/
  def IsValid(): Boolean
  
  /**
    * Perform a precise raycast against this AABB.
    * @param output Ray cast output values.
    * @param input Ray cast input values.
    * @return True if the ray cast hits this AABB, otherwise false.
    **/
  def RayCast(output: b2RayCastOutput, input: b2RayCastInput): Boolean
  
  /**
    * Tests if another AABB overlaps this AABB.
    * @param other Other AABB to test for overlap.
    * @return True if other overlaps this AABB, otherwise false.
    **/
  def TestOverlap(other: b2AABB): Boolean
  
  /**
    * Lower bound.
    **/
  var lowerBound: b2Vec2
  
  /**
    * Upper bound.
    **/
  var upperBound: b2Vec2
}
object b2AABB {
  
  inline def apply(
    Combine: (b2AABB, b2AABB) => Callback,
    Contains: b2AABB => Boolean,
    GetCenter: CallbackTo[b2Vec2],
    GetExtents: CallbackTo[b2Vec2],
    IsValid: CallbackTo[Boolean],
    RayCast: (b2RayCastOutput, b2RayCastInput) => Boolean,
    TestOverlap: b2AABB => Boolean,
    lowerBound: b2Vec2,
    upperBound: b2Vec2
  ): b2AABB = {
    val __obj = js.Dynamic.literal(Combine = js.Any.fromFunction2((t0: b2AABB, t1: b2AABB) => (Combine(t0, t1)).runNow()), Contains = js.Any.fromFunction1(Contains), GetCenter = GetCenter.toJsFn, GetExtents = GetExtents.toJsFn, IsValid = IsValid.toJsFn, RayCast = js.Any.fromFunction2(RayCast), TestOverlap = js.Any.fromFunction1(TestOverlap), lowerBound = lowerBound.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2AABB]
  }
  
  extension [Self <: b2AABB](x: Self) {
    
    inline def setCombine(value: (b2AABB, b2AABB) => Callback): Self = StObject.set(x, "Combine", js.Any.fromFunction2((t0: b2AABB, t1: b2AABB) => (value(t0, t1)).runNow()))
    
    inline def setContains(value: b2AABB => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetCenter", value.toJsFn)
    
    inline def setGetExtents(value: CallbackTo[b2Vec2]): Self = StObject.set(x, "GetExtents", value.toJsFn)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsValid", value.toJsFn)
    
    inline def setLowerBound(value: b2Vec2): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setRayCast(value: (b2RayCastOutput, b2RayCastInput) => Boolean): Self = StObject.set(x, "RayCast", js.Any.fromFunction2(value))
    
    inline def setTestOverlap(value: b2AABB => Boolean): Self = StObject.set(x, "TestOverlap", js.Any.fromFunction1(value))
    
    inline def setUpperBound(value: b2Vec2): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
  }
}
