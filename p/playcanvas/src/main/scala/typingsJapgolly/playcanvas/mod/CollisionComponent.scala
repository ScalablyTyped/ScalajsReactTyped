package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.CollisionComponent
  * @augments pc.Component
  * @classdesc A collision volume. Use this in conjunction with a {@link pc.RigidBodyComponent}
  * to make a collision volume that can be simulated using the physics engine.
  *
  * If the {@link pc.Entity} does not have a {@link pc.RigidBodyComponent} then this collision
  * volume will act as a trigger volume. When an entity with a dynamic or kinematic body enters
  * or leaves an entity with a trigger volume, both entities will receive trigger events.
  *
  * The following table shows all the events that can be fired between two Entities:
  *
  * |                                       | Rigid Body (Static)                                                   | Rigid Body (Dynamic or Kinematic)                                     | Trigger Volume                                      |
  * | ------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------- |
  * | **Rigid Body (Static)**               |                                                                       | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> |                                                     |
  * | **Rigid Body (Dynamic or Kinematic)** | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> | <ul><li>contact</li><li>collisionstart</li><li>collisionend</li></ul> | <ul><li>triggerenter</li><li>triggerleave</li></ul> |
  * | **Trigger Volume**                    |                                                                       | <ul><li>triggerenter</li><li>triggerleave</li></ul>                   |                                                     |
  *
  * @description Create a new CollisionComponent.
  * @param {pc.CollisionComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {string} type The type of the collision volume. Can be:
  *
  * * "box": A box-shaped collision volume.
  * * "capsule": A capsule-shaped collision volume.
  * * "compound": A compound shape. Any descendent entities with a collision component
  * of type box, capsule, cone, cylinder or sphere will be combined into a single, rigid
  * shape.
  * * "cone": A cone-shaped collision volume.
  * * "cylinder": A cylinder-shaped collision volume.
  * * "mesh": A collision volume that uses a model asset as its shape.
  * * "sphere": A sphere-shaped collision volume.
  *
  * Defaults to "box".
  * @property {pc.Vec3} halfExtents The half-extents of the box-shaped collision volume in the
  * x, y and z axes. Defaults to [0.5, 0.5, 0.5].
  * @property {number} radius The radius of the sphere, capsule, cylinder or cone-shaped collision
  * volumes. Defaults to 0.5.
  * @property {number} axis The local space axis with which the capsule, cylinder or cone-shaped
  * collision volume's length is aligned. 0 for X, 1 for Y and 2 for Z. Defaults to 1 (Y-axis).
  * @property {number} height The total height of the capsule, cylinder or cone-shaped collision
  * volume from tip to tip. Defaults to 2.
  * @property {pc.Asset} asset The asset for the model of the mesh collision volume - can also be
  * an asset id. Defaults to null.
  * @property {pc.Model} model The model that is added to the scene graph for the mesh collision
  * volume.
  */
@JSImport("playcanvas", "CollisionComponent")
@js.native
class CollisionComponent protected ()
  extends typingsJapgolly.playcanvas.pc.CollisionComponent {
  def this(
    system: typingsJapgolly.playcanvas.pc.CollisionComponentSystem,
    entity: typingsJapgolly.playcanvas.pc.Entity
  ) = this()
}

