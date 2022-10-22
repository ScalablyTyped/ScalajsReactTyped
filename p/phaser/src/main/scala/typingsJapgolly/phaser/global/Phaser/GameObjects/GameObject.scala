package typingsJapgolly.phaser.global.Phaser.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class that all Game Objects extend.
  * You don't create GameObjects directly and they cannot be added to the display list.
  * Instead, use them as the base for your own custom classes.
  */
@JSGlobal("Phaser.GameObjects.GameObject")
@js.native
open class GameObject protected ()
  extends StObject
     with typingsJapgolly.phaser.Phaser.GameObjects.GameObject {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs.
    * @param type A textual representation of the type of Game Object, i.e. `sprite`.
    */
  def this(scene: Scene, `type`: String) = this()
}
object GameObject {
  
  /**
    * The bitmask that `GameObject.renderFlags` is compared against to determine if the Game Object will render or not.
    */
  /* static member */
  @JSGlobal("Phaser.GameObjects.GameObject.RENDER_MASK")
  @js.native
  val RENDER_MASK: Double = js.native
}
