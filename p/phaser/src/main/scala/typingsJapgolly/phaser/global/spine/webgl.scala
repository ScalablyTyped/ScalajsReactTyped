package typingsJapgolly.phaser.global.spine

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.WebGLProgram
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLUniformLocation
import typingsJapgolly.phaser.spine.ArrayLike
import typingsJapgolly.phaser.spine.Restorable
import typingsJapgolly.phaser.spine.webgl.VertexAttributeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgl {
  
  @JSGlobal("spine.webgl.AssetManager")
  @js.native
  open class AssetManager protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.AssetManager {
    def this(context: WebGLRenderingContext) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext, pathPrefix: String) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext, pathPrefix: String) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.Color2Attribute")
  @js.native
  open class Color2Attribute ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.ColorAttribute")
  @js.native
  open class ColorAttribute ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.GLTexture")
  @js.native
  open class GLTexture protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.GLTexture {
    def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
    def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
    def this(
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      image: HTMLImageElement,
      useMipMaps: Boolean
    ) = this()
    
    /* protected */ /* CompleteClass */
    var _image: HTMLImageElement = js.native
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getImage(): HTMLImageElement = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setFilters(
      minFilter: typingsJapgolly.phaser.spine.TextureFilter,
      magFilter: typingsJapgolly.phaser.spine.TextureFilter
    ): Unit = js.native
    
    /* CompleteClass */
    override def setWraps(uWrap: typingsJapgolly.phaser.spine.TextureWrap, vWrap: typingsJapgolly.phaser.spine.TextureWrap): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.M00")
  @js.native
  val M00: /* 0 */ Double = js.native
  
  @JSGlobal("spine.webgl.M01")
  @js.native
  val M01: /* 4 */ Double = js.native
  
  @JSGlobal("spine.webgl.M02")
  @js.native
  val M02: /* 8 */ Double = js.native
  
  @JSGlobal("spine.webgl.M03")
  @js.native
  val M03: /* 12 */ Double = js.native
  
  @JSGlobal("spine.webgl.M10")
  @js.native
  val M10: /* 1 */ Double = js.native
  
  @JSGlobal("spine.webgl.M11")
  @js.native
  val M11: /* 5 */ Double = js.native
  
  @JSGlobal("spine.webgl.M12")
  @js.native
  val M12: /* 9 */ Double = js.native
  
  @JSGlobal("spine.webgl.M13")
  @js.native
  val M13: /* 13 */ Double = js.native
  
  @JSGlobal("spine.webgl.M20")
  @js.native
  val M20: /* 2 */ Double = js.native
  
  @JSGlobal("spine.webgl.M21")
  @js.native
  val M21: /* 6 */ Double = js.native
  
  @JSGlobal("spine.webgl.M22")
  @js.native
  val M22: /* 10 */ Double = js.native
  
  @JSGlobal("spine.webgl.M23")
  @js.native
  val M23: /* 14 */ Double = js.native
  
  @JSGlobal("spine.webgl.M30")
  @js.native
  val M30: /* 3 */ Double = js.native
  
  @JSGlobal("spine.webgl.M31")
  @js.native
  val M31: /* 7 */ Double = js.native
  
  @JSGlobal("spine.webgl.M32")
  @js.native
  val M32: /* 11 */ Double = js.native
  
  @JSGlobal("spine.webgl.M33")
  @js.native
  val M33: /* 15 */ Double = js.native
  
  @JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
  @js.native
  open class ManagedWebGLRenderingContext protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext {
    def this(canvasOrContext: HTMLCanvasElement) = this()
    def this(canvasOrContext: WebGLRenderingContext) = this()
    def this(canvasOrContext: HTMLCanvasElement, contextConfig: Any) = this()
    def this(canvasOrContext: WebGLRenderingContext, contextConfig: Any) = this()
    
    /* CompleteClass */
    override def addRestorable(restorable: Restorable): Unit = js.native
    
    /* CompleteClass */
    var canvas: HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OffscreenCanvas */ Any) = js.native
    
    /* CompleteClass */
    var gl: WebGLRenderingContext = js.native
    
    /* CompleteClass */
    override def removeRestorable(restorable: Restorable): Unit = js.native
    
    /* private */ /* CompleteClass */
    var restorables: Any = js.native
  }
  
  @JSGlobal("spine.webgl.Matrix4")
  @js.native
  open class Matrix4 ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.Matrix4 {
    
    /* CompleteClass */
    override def copy(): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def determinant(): Double = js.native
    
    /* CompleteClass */
    override def identity(): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def invert(): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def lookAt(
      position: typingsJapgolly.phaser.spine.webgl.Vector3,
      direction: typingsJapgolly.phaser.spine.webgl.Vector3,
      up: typingsJapgolly.phaser.spine.webgl.Vector3
    ): this.type = js.native
    
    /* CompleteClass */
    override def multiply(matrix: typingsJapgolly.phaser.spine.webgl.Matrix4): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def multiplyLeft(matrix: typingsJapgolly.phaser.spine.webgl.Matrix4): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def ortho2d(x: Double, y: Double, width: Double, height: Double): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def set(values: ArrayLike[Double]): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var temp: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override def translate(x: Double, y: Double, z: Double): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def transpose(): typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var values: js.typedarray.Float32Array = js.native
  }
  object Matrix4 {
    
    @JSGlobal("spine.webgl.Matrix4")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def initTemps(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initTemps")().asInstanceOf[Unit]
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.tmpMatrix")
    @js.native
    def tmpMatrix: Any = js.native
    inline def tmpMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tmpMatrix")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.xAxis")
    @js.native
    def xAxis: Any = js.native
    inline def xAxis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.yAxis")
    @js.native
    def yAxis: Any = js.native
    inline def yAxis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Matrix4.zAxis")
    @js.native
    def zAxis: Any = js.native
    inline def zAxis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zAxis")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.Mesh")
  @js.native
  open class Mesh protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.Mesh {
    def this(
      context: WebGLRenderingContext,
      attributes: js.Array[typingsJapgolly.phaser.spine.webgl.VertexAttribute],
      maxVertices: Double,
      maxIndices: Double
    ) = this()
    def this(
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      attributes: js.Array[typingsJapgolly.phaser.spine.webgl.VertexAttribute],
      maxVertices: Double,
      maxIndices: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var attributes: Any = js.native
    
    /* CompleteClass */
    override def bind(shader: typingsJapgolly.phaser.spine.webgl.Shader): Unit = js.native
    
    /* private */ /* CompleteClass */
    var context: Any = js.native
    
    /* private */ /* CompleteClass */
    var dirtyIndices: Any = js.native
    
    /* private */ /* CompleteClass */
    var dirtyVertices: Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def draw(shader: typingsJapgolly.phaser.spine.webgl.Shader, primitiveType: Double): Unit = js.native
    
    /* CompleteClass */
    override def drawWithOffset(
      shader: typingsJapgolly.phaser.spine.webgl.Shader,
      primitiveType: Double,
      offset: Double,
      count: Double
    ): Unit = js.native
    
    /* private */ /* CompleteClass */
    var elementsPerVertex: Any = js.native
    
    /* CompleteClass */
    override def getAttributes(): js.Array[typingsJapgolly.phaser.spine.webgl.VertexAttribute] = js.native
    
    /* CompleteClass */
    override def getIndices(): js.typedarray.Uint16Array = js.native
    
    /* CompleteClass */
    override def getVertexSizeInFloats(): Double = js.native
    
    /* CompleteClass */
    override def getVertices(): js.typedarray.Float32Array = js.native
    
    /* private */ /* CompleteClass */
    var indices: Any = js.native
    
    /* private */ /* CompleteClass */
    var indicesBuffer: Any = js.native
    
    /* private */ /* CompleteClass */
    var indicesLength: Any = js.native
    
    /* CompleteClass */
    override def maxIndices(): Double = js.native
    
    /* CompleteClass */
    override def maxVertices(): Double = js.native
    
    /* CompleteClass */
    override def numIndices(): Double = js.native
    
    /* CompleteClass */
    override def numVertices(): Double = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setIndices(indices: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setIndicesLength(length: Double): Unit = js.native
    
    /* CompleteClass */
    override def setVertices(vertices: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setVerticesLength(length: Double): Unit = js.native
    
    /* CompleteClass */
    override def unbind(shader: typingsJapgolly.phaser.spine.webgl.Shader): Unit = js.native
    
    /* private */ /* CompleteClass */
    var update: Any = js.native
    
    /* private */ /* CompleteClass */
    var vertices: Any = js.native
    
    /* private */ /* CompleteClass */
    var verticesBuffer: Any = js.native
    
    /* private */ /* CompleteClass */
    var verticesLength: Any = js.native
  }
  
  @JSGlobal("spine.webgl.OrthoCamera")
  @js.native
  open class OrthoCamera protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.OrthoCamera {
    def this(viewportWidth: Double, viewportHeight: Double) = this()
    
    /* CompleteClass */
    var direction: typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var far: Double = js.native
    
    /* CompleteClass */
    var inverseProjectionView: typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var near: Double = js.native
    
    /* CompleteClass */
    var position: typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var projection: typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var projectionView: typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    override def screenToWorld(
      screenCoords: typingsJapgolly.phaser.spine.webgl.Vector3,
      screenWidth: Double,
      screenHeight: Double
    ): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tmp: Any = js.native
    
    /* CompleteClass */
    var up: typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    var view: typingsJapgolly.phaser.spine.webgl.Matrix4 = js.native
    
    /* CompleteClass */
    var viewportHeight: Double = js.native
    
    /* CompleteClass */
    var viewportWidth: Double = js.native
    
    /* CompleteClass */
    var zoom: Double = js.native
  }
  
  @JSGlobal("spine.webgl.PolygonBatcher")
  @js.native
  open class PolygonBatcher protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.PolygonBatcher {
    def this(context: WebGLRenderingContext) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Boolean, maxVertices: Double) = this()
    def this(context: WebGLRenderingContext, twoColorTint: Unit, maxVertices: Double) = this()
    def this(
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean,
      maxVertices: Double
    ) = this()
    def this(
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Unit,
      maxVertices: Double
    ) = this()
    
    /* CompleteClass */
    override def begin(shader: typingsJapgolly.phaser.spine.webgl.Shader): Unit = js.native
    
    /* private */ /* CompleteClass */
    var context: Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def draw(
      texture: typingsJapgolly.phaser.spine.webgl.GLTexture,
      vertices: ArrayLike[Double],
      indices: js.Array[Double]
    ): Unit = js.native
    
    /* private */ /* CompleteClass */
    var drawCalls: Any = js.native
    
    /* private */ /* CompleteClass */
    var dstBlend: Any = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var flush: Any = js.native
    
    /* CompleteClass */
    override def getDrawCalls(): Double = js.native
    
    /* private */ /* CompleteClass */
    var indicesLength: Any = js.native
    
    /* private */ /* CompleteClass */
    var isDrawing: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastTexture: Any = js.native
    
    /* private */ /* CompleteClass */
    var mesh: Any = js.native
    
    /* CompleteClass */
    override def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var shader: Any = js.native
    
    /* private */ /* CompleteClass */
    var srcBlend: Any = js.native
    
    /* private */ /* CompleteClass */
    var verticesLength: Any = js.native
  }
  
  @JSGlobal("spine.webgl.Position2Attribute")
  @js.native
  open class Position2Attribute ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.Position3Attribute")
  @js.native
  open class Position3Attribute ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.phaser.spine.webgl.ResizeMode & Double] = js.native
    
    /* 1 */ val Expand: typingsJapgolly.phaser.spine.webgl.ResizeMode.Expand & Double = js.native
    
    /* 2 */ val Fit: typingsJapgolly.phaser.spine.webgl.ResizeMode.Fit & Double = js.native
    
    /* 0 */ val Stretch: typingsJapgolly.phaser.spine.webgl.ResizeMode.Stretch & Double = js.native
  }
  
  @JSGlobal("spine.webgl.SceneRenderer")
  @js.native
  open class SceneRenderer protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.SceneRenderer {
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext) = this()
    def this(
      canvas: HTMLCanvasElement,
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext
    ) = this()
    def this(canvas: HTMLCanvasElement, context: WebGLRenderingContext, twoColorTint: Boolean) = this()
    def this(
      canvas: HTMLCanvasElement,
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      twoColorTint: Boolean
    ) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.Shader")
  @js.native
  open class Shader protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.Shader {
    def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
    def this(
      context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext,
      vertexShader: String,
      fragmentShader: String
    ) = this()
    
    /* CompleteClass */
    override def bind(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var compile: Any = js.native
    
    /* private */ /* CompleteClass */
    var compileProgram: Any = js.native
    
    /* private */ /* CompleteClass */
    var compileShader: Any = js.native
    
    /* private */ /* CompleteClass */
    var context: Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var fragmentShader: Any = js.native
    
    /* private */ /* CompleteClass */
    var fs: Any = js.native
    
    /* private */ /* CompleteClass */
    var fsSource: Any = js.native
    
    /* CompleteClass */
    override def getAttributeLocation(attribute: String): Double = js.native
    
    /* CompleteClass */
    override def getFragmentShader(): String = js.native
    
    /* CompleteClass */
    override def getFragmentSource(): String = js.native
    
    /* CompleteClass */
    override def getProgram(): WebGLProgram = js.native
    
    /* CompleteClass */
    override def getUniformLocation(uniform: String): WebGLUniformLocation = js.native
    
    /* CompleteClass */
    override def getVertexShader(): String = js.native
    
    /* CompleteClass */
    override def getVertexShaderSource(): String = js.native
    
    /* private */ /* CompleteClass */
    var program: Any = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
    
    /* CompleteClass */
    override def setUniform2f(uniform: String, value: Double, value2: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform2x2f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniform3f(uniform: String, value: Double, value2: Double, value3: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform3x3f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniform4f(uniform: String, value: Double, value2: Double, value3: Double, value4: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniform4x4f(uniform: String, value: ArrayLike[Double]): Unit = js.native
    
    /* CompleteClass */
    override def setUniformf(uniform: String, value: Double): Unit = js.native
    
    /* CompleteClass */
    override def setUniformi(uniform: String, value: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tmp2x2: Any = js.native
    
    /* private */ /* CompleteClass */
    var tmp3x3: Any = js.native
    
    /* private */ /* CompleteClass */
    var tmp4x4: Any = js.native
    
    /* CompleteClass */
    override def unbind(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var vertexShader: Any = js.native
    
    /* private */ /* CompleteClass */
    var vs: Any = js.native
    
    /* private */ /* CompleteClass */
    var vsSource: Any = js.native
  }
  object Shader {
    
    @JSGlobal("spine.webgl.Shader")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.COLOR")
    @js.native
    def COLOR: String = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.COLOR2")
    @js.native
    def COLOR2: String = js.native
    inline def COLOR2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR2")(x.asInstanceOf[js.Any])
    
    inline def COLOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.MVP_MATRIX")
    @js.native
    def MVP_MATRIX: String = js.native
    inline def MVP_MATRIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MVP_MATRIX")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.POSITION")
    @js.native
    def POSITION: String = js.native
    inline def POSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.SAMPLER")
    @js.native
    def SAMPLER: String = js.native
    inline def SAMPLER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAMPLER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.Shader.TEXCOORDS")
    @js.native
    def TEXCOORDS: String = js.native
    inline def TEXCOORDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXCOORDS")(x.asInstanceOf[js.Any])
    
    inline def newColored(context: WebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColored")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
    /* static member */
    inline def newColored(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColored")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
    
    inline def newColoredTextured(context: WebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
    /* static member */
    inline def newColoredTextured(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
    
    inline def newTwoColoredTextured(context: WebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newTwoColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
    /* static member */
    inline def newTwoColoredTextured(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext): typingsJapgolly.phaser.spine.webgl.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("newTwoColoredTextured")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.webgl.Shader]
  }
  
  @JSGlobal("spine.webgl.ShapeRenderer")
  @js.native
  open class ShapeRenderer protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.ShapeRenderer {
    def this(context: WebGLRenderingContext) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: WebGLRenderingContext, maxVertices: Double) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext, maxVertices: Double) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.webgl.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.phaser.spine.webgl.ShapeType & Double] = js.native
    
    /* 4 */ val Filled: typingsJapgolly.phaser.spine.webgl.ShapeType.Filled & Double = js.native
    
    /* 1 */ val Line: typingsJapgolly.phaser.spine.webgl.ShapeType.Line & Double = js.native
    
    /* 0 */ val Point: typingsJapgolly.phaser.spine.webgl.ShapeType.Point & Double = js.native
  }
  
  @JSGlobal("spine.webgl.SkeletonDebugRenderer")
  @js.native
  open class SkeletonDebugRenderer protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.SkeletonDebugRenderer {
    def this(context: WebGLRenderingContext) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  object SkeletonDebugRenderer {
    
    @JSGlobal("spine.webgl.SkeletonDebugRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonDebugRenderer.GREEN")
    @js.native
    def GREEN: Any = js.native
    inline def GREEN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonDebugRenderer.LIGHT_GRAY")
    @js.native
    def LIGHT_GRAY: Any = js.native
    inline def LIGHT_GRAY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.SkeletonRenderer")
  @js.native
  open class SkeletonRenderer protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.SkeletonRenderer {
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
    def this(context: typingsJapgolly.phaser.spine.webgl.ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
  }
  object SkeletonRenderer {
    
    @JSGlobal("spine.webgl.SkeletonRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.SkeletonRenderer.QUAD_TRIANGLES")
    @js.native
    def QUAD_TRIANGLES: js.Array[Double] = js.native
    inline def QUAD_TRIANGLES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUAD_TRIANGLES")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("spine.webgl.TexCoordAttribute")
  @js.native
  open class TexCoordAttribute ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    def this(unit: Double) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.Vector3")
  @js.native
  open class Vector3 ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.Vector3 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    
    /* CompleteClass */
    override def add(v: typingsJapgolly.phaser.spine.webgl.Vector3): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def cross(v: typingsJapgolly.phaser.spine.webgl.Vector3): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def distance(v: typingsJapgolly.phaser.spine.webgl.Vector3): Double = js.native
    
    /* CompleteClass */
    override def dot(v: typingsJapgolly.phaser.spine.webgl.Vector3): Double = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def multiply(matrix: typingsJapgolly.phaser.spine.webgl.Matrix4): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def normalize(): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def project(matrix: typingsJapgolly.phaser.spine.webgl.Matrix4): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def scale(s: Double): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def set(x: Double, y: Double, z: Double): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def setFrom(v: typingsJapgolly.phaser.spine.webgl.Vector3): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    override def sub(v: typingsJapgolly.phaser.spine.webgl.Vector3): typingsJapgolly.phaser.spine.webgl.Vector3 = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var z: Double = js.native
  }
  
  @JSGlobal("spine.webgl.VertexAttribute")
  @js.native
  open class VertexAttribute protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.VertexAttribute {
    def this(name: String, `type`: VertexAttributeType, numElements: Double) = this()
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var numElements: Double = js.native
    
    /* CompleteClass */
    var `type`: VertexAttributeType = js.native
  }
  
  @JSGlobal("spine.webgl.VertexAttributeType")
  @js.native
  object VertexAttributeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.phaser.spine.webgl.VertexAttributeType & Double] = js.native
    
    /* 0 */ val Float: typingsJapgolly.phaser.spine.webgl.VertexAttributeType.Float & Double = js.native
  }
  
  @JSGlobal("spine.webgl.WebGLBlendModeConverter")
  @js.native
  open class WebGLBlendModeConverter ()
    extends StObject
       with typingsJapgolly.phaser.spine.webgl.WebGLBlendModeConverter
  object WebGLBlendModeConverter {
    
    @JSGlobal("spine.webgl.WebGLBlendModeConverter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.DST_ALPHA")
    @js.native
    def DST_ALPHA: Double = js.native
    inline def DST_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DST_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.DST_COLOR")
    @js.native
    def DST_COLOR: Double = js.native
    inline def DST_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DST_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE")
    @js.native
    def ONE: Double = js.native
    inline def ONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_DST_ALPHA")
    @js.native
    def ONE_MINUS_DST_ALPHA: Double = js.native
    inline def ONE_MINUS_DST_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_DST_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_SRC_ALPHA")
    @js.native
    def ONE_MINUS_SRC_ALPHA: Double = js.native
    inline def ONE_MINUS_SRC_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_SRC_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ONE_MINUS_SRC_COLOR")
    @js.native
    def ONE_MINUS_SRC_COLOR: Double = js.native
    inline def ONE_MINUS_SRC_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE_MINUS_SRC_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.SRC_ALPHA")
    @js.native
    def SRC_ALPHA: Double = js.native
    inline def SRC_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRC_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.SRC_COLOR")
    @js.native
    def SRC_COLOR: Double = js.native
    inline def SRC_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRC_COLOR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.webgl.WebGLBlendModeConverter.ZERO")
    @js.native
    def ZERO: Double = js.native
    inline def ZERO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDestGLBlendMode(blendMode: typingsJapgolly.phaser.spine.BlendMode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDestGLBlendMode")(blendMode.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def getSourceGLBlendMode(blendMode: typingsJapgolly.phaser.spine.BlendMode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceGLBlendMode")(blendMode.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getSourceGLBlendMode(blendMode: typingsJapgolly.phaser.spine.BlendMode, premultipliedAlpha: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceGLBlendMode")(blendMode.asInstanceOf[js.Any], premultipliedAlpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
