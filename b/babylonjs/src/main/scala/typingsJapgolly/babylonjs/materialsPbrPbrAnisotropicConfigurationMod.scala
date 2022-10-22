package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.anon.Default
import typingsJapgolly.babylonjs.materialsEffectFallbacksMod.EffectFallbacks
import typingsJapgolly.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase
import typingsJapgolly.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial
import typingsJapgolly.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typingsJapgolly.babylonjs.materialsUniformBufferMod.UniformBuffer
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector2
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrPbrAnisotropicConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "MaterialAnisotropicDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialAnisotropicDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var ANISOTROPIC: Boolean = js.native
    
    var ANISOTROPIC_TEXTURE: Boolean = js.native
    
    var ANISOTROPIC_TEXTUREDIRECTUV: Double = js.native
    
    var MAINUV1: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "PBRAnisotropicConfiguration")
  @js.native
  open class PBRAnisotropicConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /** @internal */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @internal */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _texture: Any = js.native
    
    def addFallbacks(defines: MaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene): Unit = js.native
    
    /**
      * Defines if the effect is along the tangents, bitangents or in between.
      * By default, the effect is "stretching" the highlights along the tangents.
      */
    var direction: Vector2 = js.native
    
    /**
      * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the anisotropy is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: MaterialAnisotropicDefines, scene: Scene): Boolean = js.native
    
    def prepareDefinesBeforeAttributes(defines: MaterialAnisotropicDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
    
    /**
      * Stores the anisotropy values in a texture.
      * rg is direction (like normal from -1 to 1)
      * b is a intensity
      */
    var texture: Nullable[BaseTexture] = js.native
  }
}
