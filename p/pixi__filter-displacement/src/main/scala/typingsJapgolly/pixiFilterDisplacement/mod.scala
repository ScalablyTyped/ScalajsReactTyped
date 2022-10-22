package typingsJapgolly.pixiFilterDisplacement

import typingsJapgolly.pixiCore.mod.Filter
import typingsJapgolly.pixiCore.mod.ISpriteMaskTarget
import typingsJapgolly.pixiCore.mod.Resource
import typingsJapgolly.pixiCore.mod.Texture
import typingsJapgolly.pixiMath.mod.Matrix
import typingsJapgolly.pixiMath.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-displacement", "DisplacementFilter")
  @js.native
  open class DisplacementFilter protected () extends Filter {
    /**
      * @param {PIXI.Sprite} sprite - The sprite used for the displacement map. (make sure its added to the scene!)
      * @param scale - The scale of the displacement
      */
    def this(sprite: ISpriteMaskTarget) = this()
    def this(sprite: ISpriteMaskTarget, scale: Double) = this()
    
    /** The texture used for the displacement map. Must be power of 2 sized texture. */
    def map: Texture[Resource] = js.native
    def map_=(value: Texture[Resource]): Unit = js.native
    
    var maskMatrix: Matrix = js.native
    
    var maskSprite: ISpriteMaskTarget = js.native
    
    var scale: Point = js.native
  }
}
