package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bakedVertexAnimationIndexMod {
  
  @JSImport("babylonjs/BakedVertexAnimation/index", "BakedVertexAnimationManager")
  @js.native
  /**
    * Creates a new BakedVertexAnimationManager
    * @param scene defines the current scene
    */
  open class BakedVertexAnimationManager ()
    extends typingsJapgolly.babylonjs.bakedVertexAnimationBakedVertexAnimationManagerMod.BakedVertexAnimationManager {
    def this(scene: Nullable[Scene]) = this()
  }
  
  @JSImport("babylonjs/BakedVertexAnimation/index", "VertexAnimationBaker")
  @js.native
  open class VertexAnimationBaker protected ()
    extends typingsJapgolly.babylonjs.bakedVertexAnimationVertexAnimationBakerMod.VertexAnimationBaker {
    /**
      * Create a new VertexAnimationBaker object which can help baking animations into a texture.
      * @param scene Defines the scene the VAT belongs to
      * @param mesh Defines the mesh the VAT belongs to
      */
    def this(scene: Scene, mesh: Mesh) = this()
  }
}
