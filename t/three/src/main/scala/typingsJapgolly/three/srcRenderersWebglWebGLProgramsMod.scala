package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcRenderersWebglWebGLBindingStatesMod.WebGLBindingStates
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLClippingMod.WebGLClipping
import typingsJapgolly.three.srcRenderersWebglWebGLCubeMapsMod.WebGLCubeMaps
import typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import typingsJapgolly.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLProgramsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLPrograms", "WebGLPrograms")
  @js.native
  open class WebGLPrograms protected () extends StObject {
    def this(
      renderer: WebGLRenderer,
      cubemaps: WebGLCubeMaps,
      extensions: WebGLExtensions,
      capabilities: WebGLCapabilities,
      bindingStates: WebGLBindingStates,
      clipping: WebGLClipping
    ) = this()
    
    def acquireProgram(parameters: Any, cacheKey: String): WebGLProgram = js.native
    
    def getParameters(material: Material, lights: Any, shadows: js.Array[js.Object], scene: Scene, `object`: Any): Any = js.native
    
    def getProgramCacheKey(parameters: Any): String = js.native
    
    def getUniforms(material: Material): js.Object = js.native
    
    var programs: js.Array[WebGLProgram] = js.native
    
    def releaseProgram(program: WebGLProgram): Unit = js.native
  }
}
