package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "WebglFilterBackend")
@js.native
class WebglFilterBackend ()
  extends FilterBackend_
     with WebglFilterBackendOptions {
  def this(options: WebglFilterBackendOptions) = this()
  /* CompleteClass */
  override var tileSize: Double = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  def captureGPUInfo(): GPUInfo = js.native
  def chooseFastestCopyGLTo2DMethod(width: Double, height: Double): Unit = js.native
  def copyGLTo2D(gl: WebGLRenderingContext, pipelineState: js.Any): Unit = js.native
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double, textureImageSource: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, width: Double, height: Double, textureImageSource: HTMLImageElement): WebGLTexture = js.native
  def createWebGLCanvas(width: Double, height: Double): Unit = js.native
  def getCachedTexture(uniqueId: String, textureImageSource: HTMLCanvasElement): WebGLTexture = js.native
  def getCachedTexture(uniqueId: String, textureImageSource: HTMLImageElement): WebGLTexture = js.native
  def glErrorToString(context: js.Any, errorCode: js.Any): String = js.native
  def setupGLContext(width: Double, height: Double): Unit = js.native
}

