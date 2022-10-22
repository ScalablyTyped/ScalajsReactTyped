package typingsJapgolly.babylonjs.materialsIndexMod

import typingsJapgolly.babylonjs.anon.PartialIShaderMaterialOpt
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "ShaderMaterial")
@js.native
open class ShaderMaterial protected ()
  extends typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial {
  /**
    * Instantiate a new shader material.
    * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
    * This returned material effects how the mesh will look based on the code in the shaders.
    * @see https://doc.babylonjs.com/how_to/shader_material
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belongs to
    * @param shaderPath Defines  the route to the shader code in one of three ways:
    *  * object: { vertex: "custom", fragment: "custom" }, used with Effect.ShadersStore["customVertexShader"] and Effect.ShadersStore["customFragmentShader"]
    *  * object: { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in script tags
    *  * object: { vertexSource: "vertex shader code string", fragmentSource: "fragment shader code string" } using with strings containing the shaders code
    *  * string: "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
    * @param options Define the options used to create the shader
    * @param storeEffectOnSubMeshes true to store effect on submeshes, false to store the effect directly in the material class.
    */
  def this(name: String, scene: Scene, shaderPath: Any) = this()
  def this(name: String, scene: Scene, shaderPath: Any, options: PartialIShaderMaterialOpt) = this()
  def this(name: String, scene: Scene, shaderPath: Any, options: Unit, storeEffectOnSubMeshes: Boolean) = this()
  def this(
    name: String,
    scene: Scene,
    shaderPath: Any,
    options: PartialIShaderMaterialOpt,
    storeEffectOnSubMeshes: Boolean
  ) = this()
}
/* static members */
object ShaderMaterial {
  
  @JSImport("babylonjs/Materials/index", "ShaderMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ShaderMaterial from a snippet saved by the Inspector
    * @deprecated Please use ParseFromSnippetAsync instead
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new ShaderMaterial
    */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShaderMaterial.ParseFromSnippetAsync */ Any = js.native
  inline def CreateFromSnippetAsync_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShaderMaterial.ParseFromSnippetAsync */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateFromSnippetAsync")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a shader material from parsed shader material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new material
    */
  inline def Parse(source: Any, scene: Scene, rootUrl: String): typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial]
  
  /**
    * Creates a new ShaderMaterial from a snippet saved in a remote file
    * @param name defines the name of the ShaderMaterial to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new ShaderMaterial
    */
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial]]
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, rootUrl: String): js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial]]
  
  /**
    * Creates a ShaderMaterial from a snippet saved by the Inspector
    * @param snippetId defines the snippet to load
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new ShaderMaterial
    */
  inline def ParseFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial]]
  
  /** Define the Url to load snippets */
  @JSImport("babylonjs/Materials/index", "ShaderMaterial.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
}
