package typingsJapgolly.phaser.global.spine

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvas {
  
  @JSGlobal("spine.canvas.AssetManager")
  @js.native
  open class AssetManager ()
    extends StObject
       with typingsJapgolly.phaser.spine.AssetManager {
    def this(pathPrefix: String) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("spine.canvas.CanvasTexture")
  @js.native
  open class CanvasTexture protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
    
    /* protected */ /* CompleteClass */
    var _image: HTMLImageElement = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def getImage(): HTMLImageElement = js.native
    
    /* CompleteClass */
    override def setFilters(
      minFilter: typingsJapgolly.phaser.spine.TextureFilter,
      magFilter: typingsJapgolly.phaser.spine.TextureFilter
    ): Unit = js.native
    
    /* CompleteClass */
    override def setWraps(uWrap: typingsJapgolly.phaser.spine.TextureWrap, vWrap: typingsJapgolly.phaser.spine.TextureWrap): Unit = js.native
  }
  
  @JSGlobal("spine.canvas.SkeletonRenderer")
  @js.native
  open class SkeletonRenderer protected ()
    extends StObject
       with typingsJapgolly.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
    
    /* private */ /* CompleteClass */
    var computeMeshVertices: Any = js.native
    
    /* private */ /* CompleteClass */
    var computeRegionVertices: Any = js.native
    
    /* private */ /* CompleteClass */
    var ctx: Any = js.native
    
    /* CompleteClass */
    var debugRendering: Boolean = js.native
    
    /* CompleteClass */
    override def draw(skeleton: typingsJapgolly.phaser.spine.Skeleton): Unit = js.native
    
    /* private */ /* CompleteClass */
    var drawImages: Any = js.native
    
    /* private */ /* CompleteClass */
    var drawTriangle: Any = js.native
    
    /* private */ /* CompleteClass */
    var drawTriangles: Any = js.native
    
    /* private */ /* CompleteClass */
    var tempColor: Any = js.native
    
    /* CompleteClass */
    var triangleRendering: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var vertices: Any = js.native
  }
  object SkeletonRenderer {
    
    @JSGlobal("spine.canvas.SkeletonRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.QUAD_TRIANGLES")
    @js.native
    def QUAD_TRIANGLES: js.Array[Double] = js.native
    inline def QUAD_TRIANGLES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUAD_TRIANGLES")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.VERTEX_SIZE")
    @js.native
    def VERTEX_SIZE: Double = js.native
    inline def VERTEX_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_SIZE")(x.asInstanceOf[js.Any])
  }
}
