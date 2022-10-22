package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.anon.PartialIComputeShaderOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ComputeShader")
@js.native
open class ComputeShader protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.ComputeShader {
  /**
    * Instantiates a new compute shader.
    * @param name Defines the name of the compute shader in the scene
    * @param engine Defines the engine the compute shader belongs to
    * @param shaderPath Defines  the route to the shader code in one of three ways:
    *  * object: { compute: "custom" }, used with ShaderStore.ShadersStoreWGSL["customComputeShader"]
    *  * object: { computeElement: "HTMLElementId" }, used with shader code in script tags
    *  * object: { computeSource: "compute shader code string" using with string containing the shader code
    *  * string: try first to find the code in ShaderStore.ShadersStoreWGSL[shaderPath + "ComputeShader"]. If not, assumes it is a file with name shaderPath.compute.fx in index.html folder.
    * @param options Define the options used to create the shader
    */
  def this(name: String, engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine, shaderPath: Any) = this()
  def this(
    name: String,
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    shaderPath: Any,
    options: PartialIComputeShaderOpti
  ) = this()
}
/* static members */
object ComputeShader {
  
  @JSImport("babylonjs", "ComputeShader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a compute shader from parsed compute shader data
    * @param source defines the JSON representation of the compute shader
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new compute shader
    */
  inline def Parse(source: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.computeComputeShaderMod.ComputeShader = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.computeComputeShaderMod.ComputeShader]
}
