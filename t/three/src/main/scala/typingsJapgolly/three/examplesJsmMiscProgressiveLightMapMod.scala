package typingsJapgolly.three

import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.MeshBasicMaterial
import typingsJapgolly.three.srcThreeMod.MeshPhongMaterial
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.PlaneGeometry
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.Vector3
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscProgressiveLightMapMod {
  
  @JSImport("three/examples/jsm/misc/ProgressiveLightMap", "ProgressiveLightMap")
  @js.native
  open class ProgressiveLightMap protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, res: Double) = this()
    
    /* private */ def _initializeBlurPlane(res: Double): Unit = js.native
    /* private */ def _initializeBlurPlane(res: Double, lightMap: Texture): Unit = js.native
    
    def addObjectsToLightMap(objects: js.Array[Object3D[Event]]): Unit = js.native
    
    var blurringPlane: Mesh[PlaneGeometry, MeshBasicMaterial] = js.native
    
    var buffer1Active: Boolean = js.native
    
    var compiled: Boolean = js.native
    
    var firstUpdate: Boolean = js.native
    
    var labelMaterial: MeshBasicMaterial = js.native
    
    var labelMesh: Mesh[PlaneGeometry, MeshBasicMaterial] = js.native
    
    var labelPlane: PlaneGeometry = js.native
    
    var lightMapContainers: js.Array[LightMapContainers] = js.native
    
    var progressiveLightMap1: WebGLRenderTarget = js.native
    
    var progressiveLightMap2: WebGLRenderTarget = js.native
    
    var renderer: WebGLRenderer = js.native
    
    var res: Double = js.native
    
    var scene: Scene = js.native
    
    def showDebugLightmap(visible: Boolean): Unit = js.native
    def showDebugLightmap(visible: Boolean, position: Vector3): Unit = js.native
    
    var tinyTarget: WebGLRenderTarget = js.native
    
    def update(camera: Camera): Unit = js.native
    def update(camera: Camera, blendWindow: Double): Unit = js.native
    def update(camera: Camera, blendWindow: Double, blurEdges: Boolean): Unit = js.native
    def update(camera: Camera, blendWindow: Unit, blurEdges: Boolean): Unit = js.native
    
    var uvMat: MeshPhongMaterial = js.native
    
    var uv_boxes: js.Array[UVBoxes] = js.native
    
    var warned: Boolean = js.native
  }
  
  trait LightMapContainers extends StObject {
    
    var basicMat: Material | js.Array[Material]
    
    var `object`: Object3D[Event]
  }
  object LightMapContainers {
    
    inline def apply(basicMat: Material | js.Array[Material], `object`: Object3D[Event]): LightMapContainers = {
      val __obj = js.Dynamic.literal(basicMat = basicMat.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LightMapContainers]
    }
    
    extension [Self <: LightMapContainers](x: Self) {
      
      inline def setBasicMat(value: Material | js.Array[Material]): Self = StObject.set(x, "basicMat", value.asInstanceOf[js.Any])
      
      inline def setBasicMatVarargs(value: Material*): Self = StObject.set(x, "basicMat", js.Array(value*))
      
      inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait UVBoxes extends StObject {
    
    var h: Double
    
    var index: Double
    
    var w: Double
  }
  object UVBoxes {
    
    inline def apply(h: Double, index: Double, w: Double): UVBoxes = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[UVBoxes]
    }
    
    extension [Self <: UVBoxes](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
