package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.ICollisionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Query` module contains methods for performing collision queries.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Query
  */
@JSImport("matter", "Query")
@js.native
class Query ()
  extends typingsJapgolly.phaser.MatterJS.Query

/* static members */
@JSImport("matter", "Query")
@js.native
object Query extends js.Object {
  /**
    * Returns all bodies whose vertices contain the given point, from the given set of bodies.
    * @method point
    * @param {body[]} bodies
    * @param {vector} point
    * @return {body[]} The bodies matching the query
    */
  def point(bodies: js.Array[BodyType], point: typingsJapgolly.phaser.MatterJS.Vector): js.Array[BodyType] = js.native
  /**
    * Casts a ray segment against a set of bodies and returns all collisions, ray width is optional. Intersection points are not provided.
    * @method ray
    * @param {body[]} bodies
    * @param {vector} startPoint
    * @param {vector} endPoint
    * @param {number} [rayWidth]
    * @return {object[]} Collisions
    */
  def ray(
    bodies: js.Array[BodyType],
    startPoint: typingsJapgolly.phaser.MatterJS.Vector,
    endPoint: typingsJapgolly.phaser.MatterJS.Vector
  ): js.Array[ICollisionData] = js.native
  def ray(
    bodies: js.Array[BodyType],
    startPoint: typingsJapgolly.phaser.MatterJS.Vector,
    endPoint: typingsJapgolly.phaser.MatterJS.Vector,
    rayWidth: Double
  ): js.Array[ICollisionData] = js.native
  /**
    * Returns all bodies whose bounds are inside (or outside if set) the given set of bounds, from the given set of bodies.
    * @method region
    * @param {body[]} bodies
    * @param {bounds} bounds
    * @param {bool} [outside=false]
    * @return {body[]} The bodies matching the query
    */
  def region(bodies: js.Array[BodyType], bounds: typingsJapgolly.phaser.MatterJS.Bounds): js.Array[BodyType] = js.native
  def region(bodies: js.Array[BodyType], bounds: typingsJapgolly.phaser.MatterJS.Bounds, outside: Boolean): js.Array[BodyType] = js.native
}

