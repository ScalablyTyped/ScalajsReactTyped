package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.babylonjs.XRInputSource
import typingsJapgolly.babylonjs.anon.IsBinary
import typingsJapgolly.babylonjs.anon.Layers
import typingsJapgolly.babylonjs.anon.Object
import typingsJapgolly.babylonjs.babylonjsStrings.XRProjectionLayer
import typingsJapgolly.babylonjs.babylonjsStrings.XRWebGLLayer
import typingsJapgolly.babylonjs.babylonjsStrings.cpu
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncCoroutine[T] = CoroutineBase[Unit | js.Promise[Unit], T]

type BabylonFileParser = js.Function4[
/* parsedData */ Any, 
/* scene */ Scene, 
/* container */ AssetContainer, 
/* rootUrl */ String, 
Unit]

type BaseError = js.Error

type CameraInputsMap[TCamera /* <: Camera */] = (/**
  * Accessor to the input by input type.
  */
org.scalablytyped.runtime.StringDictionary[ICameraInput[TCamera]]) & (/**
  * Accessor to the input by input index.
  */
NumberDictionary[ICameraInput[TCamera]])

type CameraStageAction = js.Function1[/* camera */ Camera, Unit]

type CameraStageFrameBufferAction = js.Function1[/* camera */ Camera, Boolean]

type ComputeBindingList = org.scalablytyped.runtime.StringDictionary[Object]

type ComputeBindingMapping = org.scalablytyped.runtime.StringDictionary[ComputeBindingLocation]

type Coroutine[T] = CoroutineBase[Unit, T]

type CoroutineScheduler[T] = js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit]

type CoroutineStep[T] = IteratorResult[Unit, T]

type DataArray = js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

/** @internal */
type DeepImmutableArray[T] = js.Array[DeepImmutable[T]]

type DeviceSourceType = Distribute[DeviceType]

type EvaluateSubMeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* subMesh */ SubMesh, Unit]

type FloatArray = js.Array[Double] | js.typedarray.Float32Array

type IComputePressureSource = cpu

type IMotionControllerLayoutMap = /**
  * Layouts with handedness type as a key
  */
org.scalablytyped.runtime.StringDictionary[IMotionControllerLayout]

type ISceneLoaderPluginExtensions = /**
  * Defines the list of supported extensions
  */
org.scalablytyped.runtime.StringDictionary[IsBinary]

type IndicesArray = js.Array[Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array

type IndividualBabylonFileParser = js.Function3[/* parsedData */ Any, /* scene */ Scene, /* rootUrl */ String, Any]

type KeepAssets = AbstractScene

type MaterialPluginCreated = js.Object

type MeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* hardwareInstancedRendering */ Boolean, Boolean]

type MotionControllerConstructor = js.Function2[/* xrInput */ XRInputSource, /* scene */ Scene, WebXRAbstractMotionController]

type NativeData = js.typedarray.Uint32Array

type NodeConstructor = js.Function3[
/* name */ String, 
/* scene */ Scene, 
/* options */ js.UndefOr[Any], 
js.Function0[Node]]

type Nullable[T] = T | Null

type ObserveCallback = js.Function2[/* functionName */ String, /* previousLength */ Double, Unit]

type OcclusionMaterial = ShaderMaterial

type OcclusionQuery = WebGLQuery | Double

type PerfStrategyInitialization = js.Function1[/* scene */ Scene, IPerfViewerCollectionStrategy]

type PluginMaterialFactory = js.Function1[/* material */ Material, Nullable[MaterialPluginBase]]

type PointerMoveStageAction = js.Function5[
/* unTranslatedPointerX */ Double, 
/* unTranslatedPointerY */ Double, 
/* pickResult */ Nullable[PickingInfo], 
/* isMeshPicked */ Boolean, 
/* element */ Nullable[HTMLElement], 
Nullable[PickingInfo]]

type PointerUpDownStageAction = js.Function5[
/* unTranslatedPointerX */ Double, 
/* unTranslatedPointerY */ Double, 
/* pickResult */ Nullable[PickingInfo], 
/* evt */ IPointerEvent, 
/* doubleClick */ Boolean, 
Nullable[PickingInfo]]

type PreActiveMeshStageAction = js.Function1[/* mesh */ AbstractMesh, Unit]

/**
  * Alias type for primitive types
  * @ignorenaming
  */
type Primitive = js.UndefOr[Null | Boolean | String | Double | js.Function | Element]

type RenderTargetStageAction = js.Function3[
/* renderTarget */ RenderTargetTexture, 
/* faceIndex */ js.UndefOr[Double], 
/* layer */ js.UndefOr[Double], 
Unit]

type RenderTargetTextureSize = TextureSize

type RenderTargetsStageAction = js.Function1[/* renderTargets */ SmartArrayNoDuplicate[RenderTargetTexture], Unit]

type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ Double, Unit]

type RenderingMeshStageAction = js.Function4[
/* mesh */ Mesh, 
/* subMesh */ SubMesh, 
/* batch */ Any, 
/* effect */ Nullable[Effect], 
Unit]

type SceneLoaderSuccessCallback = js.Function7[
/* meshes */ js.Array[AbstractMesh], 
/* particleSystems */ js.Array[IParticleSystem], 
/* skeletons */ js.Array[Skeleton], 
/* animationGroups */ js.Array[AnimationGroup], 
/* transformNodes */ js.Array[TransformNode], 
/* geometries */ js.Array[Geometry], 
/* lights */ js.Array[Light], 
Unit]

type ShaderCustomProcessingFunction = js.Function2[/* shaderType */ String, /* code */ String, String]

type SimpleStageAction = js.Function0[Unit]

type TextureSize = Double | Layers

type TrianglePickingPredicate = js.Function4[/* p0 */ Vector3, /* p1 */ Vector3, /* p2 */ Vector3, /* ray */ Ray, Boolean]

type WebGPUExternalTexture = ExternalTexture

type WebXRCompositionLayerType = XRProjectionLayer

type WebXRFeatureConstructor = js.Function2[
/* xrSessionManager */ WebXRSessionManager, 
/* options */ js.UndefOr[Any], 
js.Function0[IWebXRFeature]]

type WebXRLayerType = XRWebGLLayer | WebXRCompositionLayerType

type double = Double

type float = Double

type int = Double
