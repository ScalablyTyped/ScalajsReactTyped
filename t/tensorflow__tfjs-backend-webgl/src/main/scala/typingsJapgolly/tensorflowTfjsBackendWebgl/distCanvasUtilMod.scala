package typingsJapgolly.tensorflowTfjsBackendWebgl

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.offscreencanvas.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvasUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearWebGLContext(webGLVersion: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWebGLContext")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLContext")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[WebGLRenderingContext]
  inline def getWebGLContext(webGLVersion: Double, customCanvas: HTMLCanvasElement): WebGLRenderingContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLContext")(webGLVersion.asInstanceOf[js.Any], customCanvas.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext]
  inline def getWebGLContext(webGLVersion: Double, customCanvas: OffscreenCanvas): WebGLRenderingContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLContext")(webGLVersion.asInstanceOf[js.Any], customCanvas.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext]
  
  inline def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebGLContext")(webGLVersion.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
