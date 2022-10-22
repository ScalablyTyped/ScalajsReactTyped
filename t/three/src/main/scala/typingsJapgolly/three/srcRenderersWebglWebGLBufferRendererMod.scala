package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typingsJapgolly.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLBufferRendererMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBufferRenderer", "WebGLBufferRenderer")
  @js.native
  open class WebGLBufferRenderer protected () extends StObject {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      info: WebGLInfo,
      capabilities: WebGLCapabilities
    ) = this()
    
    def render(start: Any, count: Double): Unit = js.native
    
    def renderInstances(start: Any, count: Double, primcount: Double): Unit = js.native
    
    def setMode(value: Any): Unit = js.native
  }
}
