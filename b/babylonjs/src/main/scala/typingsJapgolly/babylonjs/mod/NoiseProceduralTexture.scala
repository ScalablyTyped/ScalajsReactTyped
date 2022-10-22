package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "NoiseProceduralTexture")
@js.native
open class NoiseProceduralTexture protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.NoiseProceduralTexture {
  /**
    * Creates a new NoiseProceduralTexture
    * @param name defines the name fo the texture
    * @param size defines the size of the texture (default is 256)
    * @param scene defines the hosting scene
    * @param fallbackTexture defines the texture to use if the NoiseProceduralTexture can't be created
    * @param generateMipMaps defines if mipmaps must be generated (true by default)
    */
  def this(name: String) = this()
  def this(name: String, size: Double) = this()
  def this(name: String, size: Double, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]) = this()
  def this(name: String, size: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]) = this()
  def this(
    name: String,
    size: Double,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture
  ) = this()
  def this(name: String, size: Double, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Double,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(name: String, size: Unit, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Unit,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.materialsTexturesTextureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
}
/* static members */
object NoiseProceduralTexture {
  
  @JSImport("babylonjs", "NoiseProceduralTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @returns a parsed NoiseProceduralTexture
    */
  inline def Parse(parsedTexture: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.materialsTexturesProceduralsNoiseProceduralTextureMod.NoiseProceduralTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.materialsTexturesProceduralsNoiseProceduralTextureMod.NoiseProceduralTexture]
}
