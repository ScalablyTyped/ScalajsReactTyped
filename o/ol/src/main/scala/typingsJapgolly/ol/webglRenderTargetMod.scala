package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.WebGLFramebuffer
import org.scalajs.dom.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglRenderTargetMod {
  
  @JSImport("ol/webgl/RenderTarget", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLRenderTarget {
    def this(helper: typingsJapgolly.ol.webglHelperMod.default) = this()
    def this(helper: typingsJapgolly.ol.webglHelperMod.default, opt_size: js.Array[Double]) = this()
    
    /**
      * This will cause following calls to #readAll or #readPixel to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      */
    /* CompleteClass */
    override def clearCachedData(): Unit = js.native
    
    /* CompleteClass */
    override def getFramebuffer(): WebGLFramebuffer = js.native
    
    /**
      * Returns the size of the render target texture
      */
    /* CompleteClass */
    override def getSize(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getTexture(): WebGLTexture = js.native
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      */
    /* CompleteClass */
    override def readAll(): js.typedarray.Uint8Array = js.native
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      */
    /* CompleteClass */
    override def readPixel(x: Double, y: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      */
    /* CompleteClass */
    override def setSize(size: js.Array[Double]): Unit = js.native
  }
  
  trait WebGLRenderTarget extends StObject {
    
    /**
      * This will cause following calls to #readAll or #readPixel to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      */
    def clearCachedData(): Unit
    
    def getFramebuffer(): WebGLFramebuffer
    
    /**
      * Returns the size of the render target texture
      */
    def getSize(): js.Array[Double]
    
    def getTexture(): WebGLTexture
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      */
    def readAll(): js.typedarray.Uint8Array
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      */
    def readPixel(x: Double, y: Double): js.typedarray.Uint8Array
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      */
    def setSize(size: js.Array[Double]): Unit
  }
  object WebGLRenderTarget {
    
    inline def apply(
      clearCachedData: Callback,
      getFramebuffer: CallbackTo[WebGLFramebuffer],
      getSize: CallbackTo[js.Array[Double]],
      getTexture: CallbackTo[WebGLTexture],
      readAll: CallbackTo[js.typedarray.Uint8Array],
      readPixel: (Double, Double) => js.typedarray.Uint8Array,
      setSize: js.Array[Double] => Callback
    ): WebGLRenderTarget = {
      val __obj = js.Dynamic.literal(clearCachedData = clearCachedData.toJsFn, getFramebuffer = getFramebuffer.toJsFn, getSize = getSize.toJsFn, getTexture = getTexture.toJsFn, readAll = readAll.toJsFn, readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1((t0: js.Array[Double]) => setSize(t0).runNow()))
      __obj.asInstanceOf[WebGLRenderTarget]
    }
    
    extension [Self <: WebGLRenderTarget](x: Self) {
      
      inline def setClearCachedData(value: Callback): Self = StObject.set(x, "clearCachedData", value.toJsFn)
      
      inline def setGetFramebuffer(value: CallbackTo[WebGLFramebuffer]): Self = StObject.set(x, "getFramebuffer", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTexture(value: CallbackTo[WebGLTexture]): Self = StObject.set(x, "getTexture", value.toJsFn)
      
      inline def setReadAll(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "readAll", value.toJsFn)
      
      inline def setReadPixel(value: (Double, Double) => js.typedarray.Uint8Array): Self = StObject.set(x, "readPixel", js.Any.fromFunction2(value))
      
      inline def setSetSize(value: js.Array[Double] => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    }
  }
}
