package typingsJapgolly.gl

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLContextAttributes
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.gl.glStrings.STACKGL_destroy_context
import typingsJapgolly.gl.glStrings.STACKGL_resize_drawingbuffer
import typingsJapgolly.std.GLint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(width: Double, height: Double): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  inline def apply(width: Double, height: Double, options: WebGLContextAttributes): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  
  @JSImport("gl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait STACKGLDestroyContext extends StObject {
    
    def destroy(): Unit
  }
  object STACKGLDestroyContext {
    
    inline def apply(destroy: Callback): STACKGLDestroyContext = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
      __obj.asInstanceOf[STACKGLDestroyContext]
    }
    
    extension [Self <: STACKGLDestroyContext](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
  
  trait STACKGLResizeDrawingbuffer extends StObject {
    
    def resize(width: GLint, height: GLint): Unit
  }
  object STACKGLResizeDrawingbuffer {
    
    inline def apply(resize: (GLint, GLint) => Callback): STACKGLResizeDrawingbuffer = {
      val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2((t0: GLint, t1: GLint) => (resize(t0, t1)).runNow()))
      __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
    }
    
    extension [Self <: STACKGLResizeDrawingbuffer](x: Self) {
      
      inline def setResize(value: (GLint, GLint) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: GLint, t1: GLint) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait StackGLExtension extends StObject {
    
    @JSName("getExtension")
    def getExtension_STACKGLdestroycontext(extensionName: STACKGL_destroy_context): STACKGLDestroyContext | Null = js.native
    @JSName("getExtension")
    def getExtension_STACKGLresizedrawingbuffer(extensionName: STACKGL_resize_drawingbuffer): STACKGLResizeDrawingbuffer | Null = js.native
  }
}
