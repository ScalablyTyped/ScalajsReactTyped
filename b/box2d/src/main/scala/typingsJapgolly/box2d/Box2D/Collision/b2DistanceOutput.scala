package typingsJapgolly.box2d.Box2D.Collision

import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceOutput")
@js.native
class b2DistanceOutput () extends js.Object {
  /**
  		*  Calculated distance.
  		**/
  var distance: Double = js.native
  /**
  		* Number of gjk iterations used in calculation.
  		**/
  var iterations: Double = js.native
  /**
  		* Closest point on shape A.
  		**/
  var pointA: b2Vec2 = js.native
  /**
  		* Closest point on shape B.
  		**/
  var pointB: b2Vec2 = js.native
}

