package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLShaderMod {
  
  @JSImport("three/src/renderers/webgl/WebGLShader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WebGLShader(gl: WebGLRenderingContext, `type`: String, string: String): org.scalajs.dom.WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("WebGLShader")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.WebGLShader]
}
