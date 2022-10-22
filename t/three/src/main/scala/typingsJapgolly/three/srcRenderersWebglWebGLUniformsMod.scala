package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import typingsJapgolly.three.srcRenderersWebglWebGLTexturesMod.WebGLTextures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLUniformsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
  @js.native
  open class WebGLUniforms protected () extends StObject {
    def this(gl: WebGLRenderingContext, program: WebGLProgram) = this()
    
    def setOptional(gl: WebGLRenderingContext, `object`: Any, name: String): Unit = js.native
    
    def setValue(gl: WebGLRenderingContext, name: String, value: Any, textures: WebGLTextures): Unit = js.native
  }
  /* static members */
  object WebGLUniforms {
    
    @JSImport("three/src/renderers/webgl/WebGLUniforms", "WebGLUniforms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def seqWithValue(seq: Any, values: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqWithValue")(seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def upload(gl: WebGLRenderingContext, seq: Any, values: js.Array[Any], textures: WebGLTextures): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(gl.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], values.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
