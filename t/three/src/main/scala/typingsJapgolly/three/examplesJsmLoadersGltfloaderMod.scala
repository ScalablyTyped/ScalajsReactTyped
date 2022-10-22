package typingsJapgolly.three

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.std.Map
import typingsJapgolly.three.anon.Copyright
import typingsJapgolly.three.anon.CrossOrigin
import typingsJapgolly.three.anon.Extensions
import typingsJapgolly.three.anon.InverseBindMatrices
import typingsJapgolly.three.examplesJsmLoadersDracoloaderMod.DRACOLoader
import typingsJapgolly.three.examplesJsmLoadersKtx2loaderMod.KTX2Loader
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterialParameters
import typingsJapgolly.three.srcThreeMod.AnimationClip
import typingsJapgolly.three.srcThreeMod.BufferAttribute
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.FileLoader
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.ImageBitmapLoader
import typingsJapgolly.three.srcThreeMod.InterleavedBufferAttribute
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.MeshStandardMaterial
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.SkinnedMesh
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.TextureLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersGltfloaderMod {
  
  @JSImport("three/examples/jsm/loaders/GLTFLoader", "GLTFLoader")
  @js.native
  open class GLTFLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var dracoLoader: DRACOLoader | Null = js.native
    
    def load(url: String, onLoad: js.Function1[/* gltf */ GLTF, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ GLTF, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ GLTF, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ GLTF, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: String, path: String, onLoad: js.Function1[/* gltf */ GLTF, Unit]): Unit = js.native
    def parse(
      data: String,
      path: String,
      onLoad: js.Function1[/* gltf */ GLTF, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(data: js.typedarray.ArrayBuffer, path: String, onLoad: js.Function1[/* gltf */ GLTF, Unit]): Unit = js.native
    def parse(
      data: js.typedarray.ArrayBuffer,
      path: String,
      onLoad: js.Function1[/* gltf */ GLTF, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parseAsync(data: String, path: String): js.Promise[GLTF] = js.native
    def parseAsync(data: js.typedarray.ArrayBuffer, path: String): js.Promise[GLTF] = js.native
    
    def register(callback: js.Function1[/* parser */ GLTFParser, GLTFLoaderPlugin]): GLTFLoader = js.native
    
    def setDRACOLoader(dracoLoader: DRACOLoader): GLTFLoader = js.native
    
    def setKTX2Loader(ktx2Loader: KTX2Loader): GLTFLoader = js.native
    
    def setMeshoptDecoder(meshoptDecoder: /* MeshoptDecoder */ Any): GLTFLoader = js.native
    
    def unregister(callback: js.Function1[/* parser */ GLTFParser, GLTFLoaderPlugin]): GLTFLoader = js.native
  }
  
  @JSImport("three/examples/jsm/loaders/GLTFLoader", "GLTFParser")
  @js.native
  open class GLTFParser () extends StObject {
    
    def assignFinalMaterial(`object`: Mesh[BufferGeometry, Material | js.Array[Material]]): Unit = js.native
    
    def assignTexture(materialParams: StringDictionary[Any], mapName: String, mapDef: Extensions): js.Promise[Unit] = js.native
    
    var associations: Map[
        Object3D[Event] | typingsJapgolly.three.srcThreeMod.Material | Texture, 
        GLTFReference
      ] = js.native
    
    def createNodeMesh(nodeIndex: Double): js.Promise[
        Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
      ] = js.native
    
    def createUniqueName(originalName: String): String = js.native
    
    var extensions: StringDictionary[Any] = js.native
    
    var fileLoader: FileLoader = js.native
    
    def getDependencies(`type`: String): js.Promise[js.Array[Any]] = js.native
    
    def getDependency(`type`: String, index: Double): js.Promise[Any] = js.native
    
    def getMaterialType(): Instantiable1[/* parameters */ js.UndefOr[MeshStandardMaterialParameters], MeshStandardMaterial] = js.native
    
    var json: Any = js.native
    
    def loadAccessor(accessorIndex: Double): js.Promise[BufferAttribute | InterleavedBufferAttribute] = js.native
    
    def loadAnimation(animationIndex: Double): js.Promise[AnimationClip] = js.native
    
    def loadBuffer(bufferIndex: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def loadBufferView(bufferViewIndex: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def loadCamera(cameraIndex: Double): js.Promise[Camera] = js.native
    
    def loadGeometries(
      /**
      * GLTF.Primitive[]
      * See: https://github.com/KhronosGroup/glTF/blob/master/specification/2.0/schema/mesh.primitive.schema.json
      */
    primitives: js.Array[StringDictionary[Any]]
    ): js.Promise[js.Array[typingsJapgolly.three.srcThreeMod.BufferGeometry]] = js.native
    
    def loadImageSource(sourceIndex: Double, loader: Loader): js.Promise[Texture] = js.native
    
    def loadMaterial(materialIndex: Double): js.Promise[typingsJapgolly.three.srcThreeMod.Material] = js.native
    
    def loadMesh(meshIndex: Double): js.Promise[
        Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
      ] = js.native
    
    def loadNode(nodeIndex: Double): js.Promise[Object3D[Event]] = js.native
    
    def loadScene(): js.Promise[Group] = js.native
    
    def loadSkin(skinIndex: Double): js.Promise[InverseBindMatrices] = js.native
    
    def loadTexture(textureIndex: Double): js.Promise[Texture] = js.native
    
    def loadTextureImage(textureIndex: Double, sourceIndex: Double, loader: Loader): js.Promise[Texture] = js.native
    
    var options: CrossOrigin = js.native
    
    def parse(onLoad: js.Function1[/* gltf */ GLTF, Unit]): Unit = js.native
    def parse(onLoad: js.Function1[/* gltf */ GLTF, Unit], onError: js.Function1[/* event */ ErrorEvent, Unit]): Unit = js.native
    
    var plugins: StringDictionary[GLTFLoaderPlugin] = js.native
    
    def setExtensions(extensions: StringDictionary[Any]): Unit = js.native
    
    def setPlugins(plugins: StringDictionary[GLTFLoaderPlugin]): Unit = js.native
    
    var textureLoader: TextureLoader | ImageBitmapLoader = js.native
  }
  
  trait GLTF extends StObject {
    
    var animations: js.Array[AnimationClip]
    
    var asset: Copyright
    
    var cameras: js.Array[Camera]
    
    var parser: GLTFParser
    
    var scene: Group
    
    var scenes: js.Array[Group]
    
    var userData: Any
  }
  object GLTF {
    
    inline def apply(
      animations: js.Array[AnimationClip],
      asset: Copyright,
      cameras: js.Array[Camera],
      parser: GLTFParser,
      scene: Group,
      scenes: js.Array[Group],
      userData: Any
    ): GLTF = {
      val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLTF]
    }
    
    extension [Self <: GLTF](x: Self) {
      
      inline def setAnimations(value: js.Array[AnimationClip]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: AnimationClip*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setAsset(value: Copyright): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setCameras(value: js.Array[Camera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      inline def setCamerasVarargs(value: Camera*): Self = StObject.set(x, "cameras", js.Array(value*))
      
      inline def setParser(value: GLTFParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setScene(value: Group): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setScenes(value: js.Array[Group]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      inline def setScenesVarargs(value: Group*): Self = StObject.set(x, "scenes", js.Array(value*))
      
      inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
  
  trait GLTFLoaderPlugin extends StObject {
    
    var afterRoot: js.UndefOr[js.Function1[/* result */ GLTF, js.Promise[Unit] | Null]] = js.undefined
    
    var beforeRoot: js.UndefOr[js.Function0[js.Promise[Unit] | Null]] = js.undefined
    
    var createNodeAttachment: js.UndefOr[js.Function1[/* nodeIndex */ Double, js.Promise[Object3D[Event]] | Null]] = js.undefined
    
    var createNodeMesh: js.UndefOr[
        js.Function1[
          /* nodeIndex */ Double, 
          (js.Promise[
            Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
          ]) | Null
        ]
      ] = js.undefined
    
    var extendMaterialParams: js.UndefOr[
        js.Function2[
          /* materialIndex */ Double, 
          /* materialParams */ StringDictionary[Any], 
          js.Promise[Any] | Null
        ]
      ] = js.undefined
    
    var getMaterialType: js.UndefOr[
        js.Function1[
          /* materialIndex */ Double, 
          Instantiable0[typingsJapgolly.three.srcThreeMod.Material] | Null
        ]
      ] = js.undefined
    
    var loadBufferView: js.UndefOr[
        js.Function1[/* bufferViewIndex */ Double, js.Promise[js.typedarray.ArrayBuffer] | Null]
      ] = js.undefined
    
    var loadMaterial: js.UndefOr[
        js.Function1[
          /* materialIndex */ Double, 
          js.Promise[typingsJapgolly.three.srcThreeMod.Material] | Null
        ]
      ] = js.undefined
    
    var loadMesh: js.UndefOr[
        js.Function1[
          /* meshIndex */ Double, 
          (js.Promise[
            Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
          ]) | Null
        ]
      ] = js.undefined
    
    var loadTexture: js.UndefOr[js.Function1[/* textureIndex */ Double, js.Promise[Texture] | Null]] = js.undefined
  }
  object GLTFLoaderPlugin {
    
    inline def apply(): GLTFLoaderPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLTFLoaderPlugin]
    }
    
    extension [Self <: GLTFLoaderPlugin](x: Self) {
      
      inline def setAfterRoot(value: /* result */ GLTF => js.Promise[Unit] | Null): Self = StObject.set(x, "afterRoot", js.Any.fromFunction1(value))
      
      inline def setAfterRootUndefined: Self = StObject.set(x, "afterRoot", js.undefined)
      
      inline def setBeforeRoot(value: CallbackTo[js.Promise[Unit] | Null]): Self = StObject.set(x, "beforeRoot", value.toJsFn)
      
      inline def setBeforeRootUndefined: Self = StObject.set(x, "beforeRoot", js.undefined)
      
      inline def setCreateNodeAttachment(value: /* nodeIndex */ Double => js.Promise[Object3D[Event]] | Null): Self = StObject.set(x, "createNodeAttachment", js.Any.fromFunction1(value))
      
      inline def setCreateNodeAttachmentUndefined: Self = StObject.set(x, "createNodeAttachment", js.undefined)
      
      inline def setCreateNodeMesh(
        value: /* nodeIndex */ Double => (js.Promise[
              Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
            ]) | Null
      ): Self = StObject.set(x, "createNodeMesh", js.Any.fromFunction1(value))
      
      inline def setCreateNodeMeshUndefined: Self = StObject.set(x, "createNodeMesh", js.undefined)
      
      inline def setExtendMaterialParams(
        value: (/* materialIndex */ Double, /* materialParams */ StringDictionary[Any]) => js.Promise[Any] | Null
      ): Self = StObject.set(x, "extendMaterialParams", js.Any.fromFunction2(value))
      
      inline def setExtendMaterialParamsUndefined: Self = StObject.set(x, "extendMaterialParams", js.undefined)
      
      inline def setGetMaterialType(
        value: /* materialIndex */ Double => Instantiable0[typingsJapgolly.three.srcThreeMod.Material] | Null
      ): Self = StObject.set(x, "getMaterialType", js.Any.fromFunction1(value))
      
      inline def setGetMaterialTypeUndefined: Self = StObject.set(x, "getMaterialType", js.undefined)
      
      inline def setLoadBufferView(value: /* bufferViewIndex */ Double => js.Promise[js.typedarray.ArrayBuffer] | Null): Self = StObject.set(x, "loadBufferView", js.Any.fromFunction1(value))
      
      inline def setLoadBufferViewUndefined: Self = StObject.set(x, "loadBufferView", js.undefined)
      
      inline def setLoadMaterial(value: /* materialIndex */ Double => js.Promise[typingsJapgolly.three.srcThreeMod.Material] | Null): Self = StObject.set(x, "loadMaterial", js.Any.fromFunction1(value))
      
      inline def setLoadMaterialUndefined: Self = StObject.set(x, "loadMaterial", js.undefined)
      
      inline def setLoadMesh(
        value: /* meshIndex */ Double => (js.Promise[
              Group | (Mesh[BufferGeometry, Material | js.Array[Material]]) | (SkinnedMesh[BufferGeometry, Material | js.Array[Material]])
            ]) | Null
      ): Self = StObject.set(x, "loadMesh", js.Any.fromFunction1(value))
      
      inline def setLoadMeshUndefined: Self = StObject.set(x, "loadMesh", js.undefined)
      
      inline def setLoadTexture(value: /* textureIndex */ Double => js.Promise[Texture] | Null): Self = StObject.set(x, "loadTexture", js.Any.fromFunction1(value))
      
      inline def setLoadTextureUndefined: Self = StObject.set(x, "loadTexture", js.undefined)
    }
  }
  
  trait GLTFReference extends StObject {
    
    var materials: js.UndefOr[Double] = js.undefined
    
    var meshes: js.UndefOr[Double] = js.undefined
    
    var nodes: js.UndefOr[Double] = js.undefined
    
    var textures: js.UndefOr[Double] = js.undefined
  }
  object GLTFReference {
    
    inline def apply(): GLTFReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLTFReference]
    }
    
    extension [Self <: GLTFReference](x: Self) {
      
      inline def setMaterials(value: Double): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
      
      inline def setMeshes(value: Double): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
      
      inline def setMeshesUndefined: Self = StObject.set(x, "meshes", js.undefined)
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setTextures(value: Double): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
      
      inline def setTexturesUndefined: Self = StObject.set(x, "textures", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.three.threeStrings.materials
    - typingsJapgolly.three.threeStrings.nodes
    - typingsJapgolly.three.threeStrings.textures
    - typingsJapgolly.three.threeStrings.meshes
  */
  trait GLTFReferenceType extends StObject
  object GLTFReferenceType {
    
    inline def materials: typingsJapgolly.three.threeStrings.materials = "materials".asInstanceOf[typingsJapgolly.three.threeStrings.materials]
    
    inline def meshes: typingsJapgolly.three.threeStrings.meshes = "meshes".asInstanceOf[typingsJapgolly.three.threeStrings.meshes]
    
    inline def nodes: typingsJapgolly.three.threeStrings.nodes = "nodes".asInstanceOf[typingsJapgolly.three.threeStrings.nodes]
    
    inline def textures: typingsJapgolly.three.threeStrings.textures = "textures".asInstanceOf[typingsJapgolly.three.threeStrings.textures]
  }
}
