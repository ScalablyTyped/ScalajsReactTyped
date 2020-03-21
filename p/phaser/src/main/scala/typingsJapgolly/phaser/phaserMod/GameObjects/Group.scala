package typingsJapgolly.phaser.phaserMod.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Group is a way for you to create, manipulate, or recycle similar Game Objects.
  * 
  * Group membership is non-exclusive. A Game Object can belong to several groups, one group, or none.
  * 
  * Groups themselves aren't displayable, and can't be positioned, rotated, scaled, or hidden.
  */
@JSImport("phaser", "GameObjects.Group")
@js.native
class Group protected ()
  extends typingsJapgolly.phaser.Phaser.GameObjects.Group {
  /**
    * 
    * @param scene The scene this group belongs to.
    * @param children Game Objects to add to this group; or the `config` argument.
    * @param config Settings for this group. If `key` is set, Phaser.GameObjects.Group#createMultiple is also called with these settings.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, children: js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject]) = this()
  def this(scene: Scene, children: GroupConfig) = this()
  def this(scene: Scene, children: GroupCreateConfig) = this()
  def this(
    scene: Scene,
    children: js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject],
    config: GroupConfig
  ) = this()
  def this(
    scene: Scene,
    children: js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject],
    config: GroupCreateConfig
  ) = this()
  def this(scene: Scene, children: GroupConfig, config: GroupConfig) = this()
  def this(scene: Scene, children: GroupConfig, config: GroupCreateConfig) = this()
  def this(scene: Scene, children: GroupCreateConfig, config: GroupConfig) = this()
  def this(scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig) = this()
}

