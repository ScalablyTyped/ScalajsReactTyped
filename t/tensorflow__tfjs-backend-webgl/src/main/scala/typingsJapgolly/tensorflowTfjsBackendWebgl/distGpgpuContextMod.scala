package typingsJapgolly.tensorflowTfjsBackendWebgl

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ImageData
import org.scalajs.dom.WebGLBuffer
import org.scalajs.dom.WebGLFramebuffer
import org.scalajs.dom.WebGLProgram
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLShader
import org.scalajs.dom.WebGLTexture
import org.scalajs.dom.WebGLUniformLocation
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.std.WebGLQuery
import typingsJapgolly.std.WebGLSync
import typingsJapgolly.tensorflowTfjsBackendWebgl.distTexUtilMod.Texture
import typingsJapgolly.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureConfig
import typingsJapgolly.tensorflowTfjsBackendWebgl.distWebglTypesMod.WebGL1DisjointQueryTimerExtension
import typingsJapgolly.tensorflowTfjsBackendWebgl.distWebglTypesMod.WebGL2DisjointQueryTimerExtension
import typingsJapgolly.tensorflowTfjsBackendWebgl.distWebglTypesMod.WebGLParallelCompilationExtension
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.PixelData
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGpgpuContextMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", "GPGPUContext")
  @js.native
  open class GPGPUContext () extends StObject {
    def this(gl: WebGLRenderingContext) = this()
    
    /* private */ var addItemToPoll: Any = js.native
    
    def beginQuery(): WebGLQuery = js.native
    
    /* private */ var bindTextureToFrameBuffer: Any = js.native
    
    def blockUntilAllProgramsCompleted(): Unit = js.native
    
    def createAndWaitForFence(): js.Promise[Unit] = js.native
    
    def createBufferFromTexture(texture: WebGLTexture, rows: Double, columns: Double): WebGLBuffer = js.native
    
    /* private */ var createFence: Any = js.native
    
    def createFloat16MatrixTexture(rows: Double, columns: Double): Texture = js.native
    
    def createFloat16PackedMatrixTexture(rows: Double, columns: Double): Texture = js.native
    
    def createFloat32MatrixTexture(rows: Double, columns: Double): Texture = js.native
    
    def createPackedMatrixTexture(rows: Double, columns: Double): Texture = js.native
    
    def createProgram(fragmentShader: WebGLShader): WebGLProgram = js.native
    
    def createUnsignedBytesMatrixTexture(rows: Double, columns: Double): Texture = js.native
    
    /* private */ def debug: Any = js.native
    
    def debugValidate(): Unit = js.native
    
    def deleteMatrixTexture(texture: WebGLTexture): Unit = js.native
    
    def deleteProgram(program: WebGLProgram): Unit = js.native
    
    /* private */ var disjoint: Any = js.native
    
    var disjointQueryTimerExtension: WebGL2DisjointQueryTimerExtension | WebGL1DisjointQueryTimerExtension = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var disposed: Any = js.native
    
    def downloadByteEncodedFloatMatrixFromOutputTexture(texture: WebGLTexture, rows: Double, columns: Double): js.typedarray.Float32Array = js.native
    
    def downloadFloat32MatrixFromBuffer(buffer: WebGLBuffer, size: Double): js.typedarray.Float32Array = js.native
    
    /* private */ var downloadMatrixDriver: Any = js.native
    
    def downloadMatrixFromPackedTexture(texture: WebGLTexture, physicalRows: Double, physicalCols: Double): js.typedarray.Float32Array = js.native
    
    def downloadPackedMatrixFromBuffer(
      buffer: WebGLBuffer,
      batch: Double,
      rows: Double,
      columns: Double,
      physicalRows: Double,
      physicalCols: Double
    ): js.typedarray.Float32Array = js.native
    
    def endQuery(): Unit = js.native
    
    def executeProgram(): Unit = js.native
    
    var framebuffer: WebGLFramebuffer = js.native
    
    def getAttributeLocation(program: WebGLProgram, attribute: String): Double = js.native
    
    /* private */ var getQueryTime: Any = js.native
    
    /* private */ var getQueryTimerExtension: Any = js.native
    
    /* private */ var getQueryTimerExtensionWebGL1: Any = js.native
    
    /* private */ var getQueryTimerExtensionWebGL2: Any = js.native
    
    def getUniformLocation(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    def getUniformLocation(program: WebGLProgram, uniformName: String, shouldThrow: Boolean): WebGLUniformLocation = js.native
    
    def getUniformLocationNoThrow(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    
    var gl: WebGLRenderingContext = js.native
    
    var indexBuffer: WebGLBuffer = js.native
    
    /* private */ var isQueryAvailable: Any = js.native
    
    /* private */ var itemsToPoll: Any = js.native
    
    var outputTexture: WebGLTexture | Null = js.native
    
    var parallelCompilationExtension: WebGLParallelCompilationExtension = js.native
    
    def pollFence(fenceContext: FenceContext): js.Promise[Unit] = js.native
    
    def pollItems(): Unit = js.native
    
    var program: WebGLProgram | Null = js.native
    
    def setInputMatrixTexture(inputMatrixTexture: WebGLTexture, uniformLocation: WebGLUniformLocation, textureUnit: Double): Unit = js.native
    
    def setOutputMatrixTexture(outputMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    /* private */ var setOutputMatrixTextureDriver: Any = js.native
    
    def setOutputMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    /* private */ var setOutputMatrixWriteRegionDriver: Any = js.native
    
    def setOutputPackedMatrixTexture(outputPackedMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    def setOutputPackedMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    def setProgram(): Unit = js.native
    def setProgram(program: WebGLProgram): Unit = js.native
    
    var textureConfig: TextureConfig = js.native
    
    /* private */ var throwIfDisposed: Any = js.native
    
    /* private */ var throwIfNoProgram: Any = js.native
    
    /* private */ var unbindTextureToFrameBuffer: Any = js.native
    
    def uploadDenseMatrixToTexture(texture: WebGLTexture, width: Double, height: Double, data: TypedArray): Unit = js.native
    
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: ImageData): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: ImageBitmap): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: PixelData): Unit = js.native
    
    /* private */ var vertexAttrsAreBound: Any = js.native
    
    var vertexBuffer: WebGLBuffer = js.native
    
    /* private */ var vertexShader: Any = js.native
    
    def waitForQueryAndGetTime(query: WebGLQuery): js.Promise[Double] = js.native
  }
  
  inline def linearSearchLastTrue(arr: js.Array[js.Function0[Boolean]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linearSearchLastTrue")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait FenceContext extends StObject {
    
    def isFencePassed(): Boolean
    
    var query: WebGLQuery | WebGLSync
  }
  object FenceContext {
    
    inline def apply(isFencePassed: CallbackTo[Boolean], query: WebGLQuery | WebGLSync): FenceContext = {
      val __obj = js.Dynamic.literal(isFencePassed = isFencePassed.toJsFn, query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FenceContext]
    }
    
    extension [Self <: FenceContext](x: Self) {
      
      inline def setIsFencePassed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFencePassed", value.toJsFn)
      
      inline def setQuery(value: WebGLQuery | WebGLSync): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
