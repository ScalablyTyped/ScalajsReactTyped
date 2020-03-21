package typingsJapgolly.phaser.Phaser.Physics.Arcade

import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typingsJapgolly.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typingsJapgolly.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupDefaults
import typingsJapgolly.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Group object.
  * 
  * All Game Objects created by this Group will automatically be given dynamic Arcade Physics bodies.
  * 
  * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @JSGlobal("Phaser.Physics.Arcade.Group")
@js.native
class Group protected ()
  extends typingsJapgolly.phaser.Phaser.GameObjects.Group {
  /**
    * 
    * @param world The physics simulation.
    * @param scene The scene this group belongs to.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group.
    */
  def this(world: World, scene: Scene) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject]) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: PhysicsGroupConfig) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject], config: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: js.Array[GameObject], config: PhysicsGroupConfig) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: GroupCreateConfig, config: PhysicsGroupConfig) = this()
  def this(world: World, scene: Scene, children: PhysicsGroupConfig, config: GroupCreateConfig) = this()
  def this(world: World, scene: Scene, children: PhysicsGroupConfig, config: PhysicsGroupConfig) = this()
  /**
    * Default physics properties applied to Game Objects added to the Group or created by the Group. Derived from the `config` argument.
    */
  var defaults: PhysicsGroupDefaults = js.native
  /**
    * The physics type of the Group's members.
    */
  var physicsType: integer = js.native
  /**
    * The physics simulation.
    */
  var world: World = js.native
  /**
    * Enables a Game Object's Body and assigns `defaults`. Called when a Group member is added or created.
    * @param child The Game Object being added.
    */
  def createCallbackHandler(child: GameObject): Unit = js.native
  /**
    * Disables a Game Object's Body. Called when a Group member is removed.
    * @param child The Game Object being removed.
    */
  def removeCallbackHandler(child: GameObject): Unit = js.native
  /**
    * Sets the velocity of each Group member.
    * @param x The horizontal velocity.
    * @param y The vertical velocity.
    * @param step The velocity increment. When set, the first member receives velocity (x, y), the second (x + step, y + step), and so on. Default 0.
    */
  def setVelocity(x: Double, y: Double): Group = js.native
  def setVelocity(x: Double, y: Double, step: Double): Group = js.native
  /**
    * Sets the horizontal velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (x), the second (x + step), and so on. Default 0.
    */
  def setVelocityX(value: Double): Group = js.native
  def setVelocityX(value: Double, step: Double): Group = js.native
  /**
    * Sets the vertical velocity of each Group member.
    * @param value The velocity value.
    * @param step The velocity increment. When set, the first member receives velocity (y), the second (y + step), and so on. Default 0.
    */
  def setVelocityY(value: Double): Group = js.native
  def setVelocityY(value: Double, step: Double): Group = js.native
}

