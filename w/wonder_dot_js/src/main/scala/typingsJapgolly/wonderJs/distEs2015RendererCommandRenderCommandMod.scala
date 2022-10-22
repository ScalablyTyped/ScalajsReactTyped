package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer
import typingsJapgolly.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer
import typingsJapgolly.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode
import typingsJapgolly.wonderJs.distEs2015RendererStateWebGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererCommandRenderCommandMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/command/RenderCommand", "RenderCommand")
  @js.native
  open class RenderCommand () extends StObject {
    
    def dispose(): Unit = js.native
    
    /* protected */ def drawArray(vertexBuffer: ArrayBuffer): Unit = js.native
    
    /* protected */ def drawElements(indexBuffer: ElementBuffer): Unit = js.native
    
    var drawMode: EDrawMode = js.native
    
    def execute(): Unit = js.native
    
    def init(): Unit = js.native
    
    var webglState: WebGLState = js.native
  }
}
