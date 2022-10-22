package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLExtensionsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLExtensions", "WebGLExtensions")
  @js.native
  open class WebGLExtensions protected () extends StObject {
    def this(gl: WebGLRenderingContext) = this()
    
    def get(name: String): Any = js.native
    
    def has(name: String): Boolean = js.native
    
    def init(capabilities: WebGLCapabilities): Unit = js.native
  }
}
