package typingsJapgolly.glFbo

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLFramebuffer
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.glFbo.anon.FnCall
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double]): FrameBuffer = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[FrameBuffer]
  inline def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double], options: FrameBufferOptions): FrameBuffer = (^.asInstanceOf[js.Dynamic].apply(gl.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FrameBuffer]
  
  @JSImport("gl-fbo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FrameBuffer extends StObject {
    
    def bind(): Unit
    
    var color: js.Array[Texture]
    
    var depth: Texture | Null
    
    def dispose(): Unit
    
    var gl: WebGLRenderingContext
    
    var handle: WebGLFramebuffer
    
    var shape: js.Tuple2[Double, Double]
  }
  object FrameBuffer {
    
    inline def apply(
      bind: Callback,
      color: js.Array[Texture],
      dispose: Callback,
      gl: WebGLRenderingContext,
      handle: WebGLFramebuffer,
      shape: js.Tuple2[Double, Double]
    ): FrameBuffer = {
      val __obj = js.Dynamic.literal(bind = bind.toJsFn, color = color.asInstanceOf[js.Any], dispose = dispose.toJsFn, gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], depth = null)
      __obj.asInstanceOf[FrameBuffer]
    }
    
    extension [Self <: FrameBuffer](x: Self) {
      
      inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
      
      inline def setColor(value: js.Array[Texture]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorVarargs(value: Texture*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setDepth(value: Texture): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: WebGLFramebuffer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameBufferOptions extends StObject {
    
    var color: js.UndefOr[Double] = js.undefined
    
    var depth: js.UndefOr[Boolean] = js.undefined
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    var preferFloat: js.UndefOr[Boolean] = js.undefined
    
    var stencil: js.UndefOr[Boolean] = js.undefined
  }
  object FrameBufferOptions {
    
    inline def apply(): FrameBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameBufferOptions]
    }
    
    extension [Self <: FrameBufferOptions](x: Self) {
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setPreferFloat(value: Boolean): Self = StObject.set(x, "preferFloat", value.asInstanceOf[js.Any])
      
      inline def setPreferFloatUndefined: Self = StObject.set(x, "preferFloat", js.undefined)
      
      inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
  
  type Texture = ReturnType[FnCall]
}
