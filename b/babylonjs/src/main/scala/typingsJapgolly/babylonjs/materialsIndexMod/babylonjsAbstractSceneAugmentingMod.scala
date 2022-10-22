package typingsJapgolly.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[
        typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
      ]
  }
  object AbstractScene {
    
    inline def apply(
      proceduralTextures: js.Array[
          typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
        ]
    ): AbstractScene = {
      val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractScene]
    }
    
    extension [Self <: AbstractScene](x: Self) {
      
      inline def setProceduralTextures(
        value: js.Array[
              typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
            ]
      ): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      inline def setProceduralTexturesVarargs(
        value: typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture*
      ): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
    }
  }
}
