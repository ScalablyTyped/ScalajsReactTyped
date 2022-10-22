package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "WebglFilterBackend")
@js.native
open class WebglFilterBackend ()
  extends StObject
     with FilterBackend_
     with WebglFilterBackendOptions {
  def this(options: WebglFilterBackendOptions) = this()
  
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): Any = js.native
  
  def captureGPUInfo(): GPUInfo = js.native
  
  def chooseFastestCopyGLTo2DMethod(width: Double, height: Double): Unit = js.native
  
  def copyGLTo2D(gl: WebGLRenderingContext, pipelineState: Any): Unit = js.native
  
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double, textureImageSource: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double, textureImageSource: HTMLImageElement): WebGLTexture = js.native
  
  def createWebGLCanvas(width: Double, height: Double): Unit = js.native
  
  def getCachedTexture(uniqueId: String, textureImageSource: HTMLCanvasElement): WebGLTexture = js.native
  def getCachedTexture(uniqueId: String, textureImageSource: HTMLImageElement): WebGLTexture = js.native
  
  def glErrorToString(context: Any, errorCode: Any): String = js.native
  
  def setupGLContext(width: Double, height: Double): Unit = js.native
  
  /* CompleteClass */
  var tileSize: Double = js.native
}
