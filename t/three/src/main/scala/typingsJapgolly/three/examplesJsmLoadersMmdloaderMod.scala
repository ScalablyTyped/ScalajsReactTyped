package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.AnimationClip
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.FileLoader
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersMmdloaderMod {
  
  @JSImport("three/examples/jsm/loaders/MMDLoader", "MMDLoader")
  @js.native
  open class MMDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var animationBuilder: js.Object = js.native
    
    var animationPath: String = js.native
    
    def load(
      url: String,
      onLoad: js.Function1[/* mesh */ SkinnedMesh[BufferGeometry, Material | js.Array[Material]], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* mesh */ SkinnedMesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* mesh */ SkinnedMesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* mesh */ SkinnedMesh[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAnimation(
      url: String,
      `object`: Camera,
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: Camera,
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: Camera,
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: Camera,
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadAnimation(
      url: String,
      `object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      onLoad: js.Function1[
          /* object */ (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | AnimationClip, 
          Unit
        ],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadPMD(url: String, onLoad: js.Function1[/* object */ js.Object, Unit]): Unit = js.native
    def loadPMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadPMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadPMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadPMX(url: String, onLoad: js.Function1[/* object */ js.Object, Unit]): Unit = js.native
    def loadPMX(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadPMX(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadPMX(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadVMD(url: String, onLoad: js.Function1[/* object */ js.Object, Unit]): Unit = js.native
    def loadVMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadVMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadVMD(
      url: String,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadVPD(url: String, isUnicode: Boolean, onLoad: js.Function1[/* object */ js.Object, Unit]): Unit = js.native
    def loadVPD(
      url: String,
      isUnicode: Boolean,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadVPD(
      url: String,
      isUnicode: Boolean,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadVPD(
      url: String,
      isUnicode: Boolean,
      onLoad: js.Function1[/* object */ js.Object, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadWithAnimation(url: String, vmdUrl: String, onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit]): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: String,
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: String,
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: String,
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: js.Array[String],
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: js.Array[String],
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: js.Array[String],
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def loadWithAnimation(
      url: String,
      vmdUrl: js.Array[String],
      onLoad: js.Function1[/* object */ MMDLoaderAnimationObject, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    var loader: FileLoader = js.native
    
    var meshBuilder: js.Object = js.native
    
    var parser: js.Object | Null = js.native
    
    def setAnimationPath(animationPath: String): this.type = js.native
  }
  
  trait MMDLoaderAnimationObject extends StObject {
    
    var animation: AnimationClip
    
    var mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]
  }
  object MMDLoaderAnimationObject {
    
    inline def apply(animation: AnimationClip, mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): MMDLoaderAnimationObject = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMDLoaderAnimationObject]
    }
    
    extension [Self <: MMDLoaderAnimationObject](x: Self) {
      
      inline def setAnimation(value: AnimationClip): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setMesh(value: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    }
  }
}
