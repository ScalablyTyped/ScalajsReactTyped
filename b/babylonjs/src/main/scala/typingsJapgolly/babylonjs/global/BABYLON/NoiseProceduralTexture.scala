package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NoiseProceduralTexture")
@js.native
open class NoiseProceduralTexture protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NoiseProceduralTexture {
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
  def this(name: String, size: Double, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, size: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]) = this()
  def this(
    name: String,
    size: Double,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture
  ) = this()
  def this(name: String, size: Unit, scene: Unit, fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture
  ) = this()
  def this(name: String, size: Double, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Double,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(name: String, size: Unit, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Unit,
    scene: Unit,
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    fallbackTexture: typingsJapgolly.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object NoiseProceduralTexture {
  
  @JSGlobal("BABYLON.NoiseProceduralTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @returns a parsed NoiseProceduralTexture
    */
  inline def Parse(parsedTexture: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.NoiseProceduralTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.NoiseProceduralTexture]
}
