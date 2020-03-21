package typingsJapgolly.box2d.Box2D.Collision

import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2AABB")
@js.native
class b2AABB () extends js.Object {
  /**
  		* Lower bound.
  		**/
  var lowerBound: b2Vec2 = js.native
  /**
  		* Upper bound.
  		**/
  var upperBound: b2Vec2 = js.native
  /**
  		* Combines two AABBs into one with max values for upper bound and min values for lower bound.  The result is stored in this AABB.
  		* @param aabb1 First AABB to combine.
  		* @param aabb2 Second AABB to combine.
  		**/
  def Combine(aabb1: b2AABB, aabb2: b2AABB): Unit = js.native
  /**
  		* Determines if an AABB is contained within this one.
  		* @param aabb AABB to see if it is contained.
  		* @return True if aabb is contained, otherwise false.
  		**/
  def Contains(aabb: b2AABB): Boolean = js.native
  /**
  		* Gets the center of the AABB.
  		* @return Center of this AABB.
  		**/
  def GetCenter(): b2Vec2 = js.native
  /**
  		* Gets the extents of the AABB (half-widths).
  		* @return Extents of this AABB.
  		**/
  def GetExtents(): b2Vec2 = js.native
  /**
  		* Verify that the bounds are sorted.
  		* @return True if the bounds are sorted, otherwise false.
  		**/
  def IsValid(): Boolean = js.native
  /**
  		* Perform a precise raycast against this AABB.
  		* @param output Ray cast output values.
  		* @param input Ray cast input values.
  		* @return True if the ray cast hits this AABB, otherwise false.
  		**/
  def RayCast(output: b2RayCastOutput, input: b2RayCastInput): Boolean = js.native
  /**
  		* Tests if another AABB overlaps this AABB.
  		* @param other Other AABB to test for overlap.
  		* @return True if other overlaps this AABB, otherwise false.
  		**/
  def TestOverlap(other: b2AABB): Boolean = js.native
}

/* static members */
@JSGlobal("Box2D.Collision.b2AABB")
@js.native
object b2AABB extends js.Object {
  /**
  		* Combines two AABBs into one with max values for upper bound and min values for lower bound.
  		* @param aabb1 First AABB to combine.
  		* @param aabb2 Second AABB to combine.
  		* @return New AABB with max values from aabb1 and aabb2.
  		**/
  def Combine(aabb1: b2AABB, aabb2: b2AABB): b2AABB = js.native
}

