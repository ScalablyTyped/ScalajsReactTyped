package typingsJapgolly.three

import typingsJapgolly.three.anon.Ambient
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLLightsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLLights", "WebGLLights")
  @js.native
  open class WebGLLights protected () extends StObject {
    def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def get(light: Any): Any = js.native
    
    def setup(lights: Any): Unit = js.native
    
    def setupView(lights: Any, camera: Any): Unit = js.native
    
    var state: Ambient = js.native
  }
}
