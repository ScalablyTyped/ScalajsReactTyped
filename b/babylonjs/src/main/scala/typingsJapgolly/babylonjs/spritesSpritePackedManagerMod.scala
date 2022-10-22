package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.spritesSpriteManagerMod.SpriteManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spritesSpritePackedManagerMod {
  
  @JSImport("babylonjs/Sprites/spritePackedManager", "SpritePackedManager")
  @js.native
  open class SpritePackedManager protected () extends SpriteManager {
    /**
      * Creates a new sprite manager from a packed sprite sheet
      * @param name defines the manager's name
      * @param imgUrl defines the sprite sheet url
      * @param capacity defines the maximum allowed number of sprites
      * @param scene defines the hosting scene
      * @param spriteJSON null otherwise a JSON object defining sprite sheet data
      * @param epsilon defines the epsilon value to align texture (0.01 by default)
      * @param samplingMode defines the sampling mode to use with spritesheet
      * @param fromPacked set to true; do not alter
      */
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
  }
}
