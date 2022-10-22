package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreInstancedBufferGeometryMod.InstancedBufferGeometry
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersObjectLoaderMod {
  
  @JSImport("three/src/loaders/ObjectLoader", "ObjectLoader")
  @js.native
  open class ObjectLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: js.Function1[/* object */ Object3D[Event], Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      // tslint:disable-next-line:no-unnecessary-generics
    onLoad: Unit,
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    def parse[T /* <: Object3D[Event] */](json: Any): T = js.native
    def parse[T /* <: Object3D[Event] */](json: Any, onLoad: js.Function1[/* object */ Object3D[Event], Unit]): T = js.native
    
    // Array of Classes that inherits from Matrial.
    def parseAnimations(json: Any): js.Array[AnimationClip] = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    def parseAsync[T /* <: Object3D[Event] */](json: Any): js.Promise[T] = js.native
    
    def parseGeometries(json: Any): StringDictionary[InstancedBufferGeometry | BufferGeometry] = js.native
    
    def parseImages(json: Any, onLoad: js.Function0[Unit]): StringDictionary[HTMLImageElement] = js.native
    
    def parseImagesAsync(json: Any): js.Promise[StringDictionary[HTMLImageElement]] = js.native
    
    // Array of BufferGeometry or Geometry or Geometry2.
    def parseMaterials(json: Any, textures: js.Array[Texture]): js.Array[Material] = js.native
    
    def parseObject[T /* <: Object3D[Event] */](
      data: Any,
      geometries: js.Array[Any],
      materials: js.Array[Material],
      animations: js.Array[AnimationClip]
    ): // tslint:disable-next-line:no-unnecessary-generics
    T = js.native
    
    def parseTextures(json: Any, images: Any): js.Array[Texture] = js.native
  }
}
