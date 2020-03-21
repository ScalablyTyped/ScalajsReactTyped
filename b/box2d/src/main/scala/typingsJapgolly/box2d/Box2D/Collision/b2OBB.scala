package typingsJapgolly.box2d.Box2D.Collision

import typingsJapgolly.box2d.Box2D.Common.Math.b2Mat22
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2OBB")
@js.native
class b2OBB () extends js.Object {
  /**
  		* The rotation matrix.
  		**/
  var R: b2Mat22 = js.native
  /**
  		* The local centroid.
  		**/
  var center: b2Vec2 = js.native
  /**
  		* The half-widths.
  		**/
  var extents: b2Vec2 = js.native
}

