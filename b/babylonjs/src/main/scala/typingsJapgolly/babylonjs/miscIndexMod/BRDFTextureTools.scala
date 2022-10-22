package typingsJapgolly.babylonjs.miscIndexMod

import typingsJapgolly.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BRDFTextureTools {
  
  @JSImport("babylonjs/Misc/index", "BRDFTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  inline def GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvironmentBRDFTexture")(scene.asInstanceOf[js.Any]).asInstanceOf[BaseTexture]
}
