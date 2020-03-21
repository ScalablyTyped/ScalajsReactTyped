package typingsJapgolly.phaser.Phaser.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Scenes.Systems
import typingsJapgolly.phaser.Phaser.Structs.List
import typingsJapgolly.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Display List plugin.
  * 
  * Display Lists belong to a Scene and maintain the list of Game Objects to render every frame.
  * 
  * Some of these Game Objects may also be part of the Scene's [Update List]{@link Phaser.GameObjects.UpdateList}, for updating.
  */
@JSGlobal("Phaser.GameObjects.DisplayList")
@js.native
class DisplayList protected () extends List[GameObject] {
  /**
    * 
    * @param scene The Scene that this Display List belongs to.
    */
  def this(scene: Scene) = this()
  /**
    * The Scene that this Display List belongs to.
    */
  var scene: Scene = js.native
  /**
    * The flag the determines whether Game Objects should be sorted when `depthSort()` is called.
    */
  var sortChildrenFlag: Boolean = js.native
  /**
    * The Scene's Systems.
    */
  var systems: Systems = js.native
  /**
    * Immediately sorts the display list if the flag is set.
    */
  def depthSort(): Unit = js.native
  /**
    * Returns an array which contains all objects currently on the Display List.
    * This is a reference to the main list array, not a copy of it, so be careful not to modify it.
    */
  def getChildren(): js.Array[GameObject] = js.native
  /**
    * Force a sort of the display list on the next call to depthSort.
    */
  def queueDepthSort(): Unit = js.native
  /**
    * Compare the depth of two Game Objects.
    * @param childA The first Game Object.
    * @param childB The second Game Object.
    */
  def sortByDepth(childA: GameObject, childB: GameObject): integer = js.native
}

