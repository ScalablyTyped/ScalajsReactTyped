package typingsJapgolly.reactThreeFiber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable10
import org.scalablytyped.runtime.Instantiable12
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable9
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactThreeFiber.anon.Dispose
import typingsJapgolly.reactThreeFiber.anon.FnCallXYZOrder
import typingsJapgolly.reactThreeFiber.anon.TypeofBoxGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofCircleGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofColor
import typingsJapgolly.reactThreeFiber.anon.TypeofConeGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofCylinderGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofDodecahedronGeometr
import typingsJapgolly.reactThreeFiber.anon.TypeofEuler
import typingsJapgolly.reactThreeFiber.anon.TypeofExtrudeGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofIcosahedronGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofLatheGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofObject3D
import typingsJapgolly.reactThreeFiber.anon.TypeofOctahedronGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofPlaneGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofPolyhedronGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofQuaternion
import typingsJapgolly.reactThreeFiber.anon.TypeofRingGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofShapeGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofSphereGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofTetrahedronGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofTexture
import typingsJapgolly.reactThreeFiber.anon.TypeofTorusGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofTorusKnotGeometry
import typingsJapgolly.reactThreeFiber.anon.TypeofTubeGeometry
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventHandlers
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.AttachType
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.BufferSource
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Partial
import typingsJapgolly.three.mod.AmbientLight
import typingsJapgolly.three.mod.AmbientLightProbe
import typingsJapgolly.three.mod.ArrayCamera
import typingsJapgolly.three.mod.ArrowHelper
import typingsJapgolly.three.mod.AudioListener
import typingsJapgolly.three.mod.AxesHelper
import typingsJapgolly.three.mod.Bone
import typingsJapgolly.three.mod.Box3Helper
import typingsJapgolly.three.mod.BoxGeometry
import typingsJapgolly.three.mod.BoxHelper
import typingsJapgolly.three.mod.BufferAttribute
import typingsJapgolly.three.mod.BufferGeometry
import typingsJapgolly.three.mod.CameraHelper
import typingsJapgolly.three.mod.CanvasTexture
import typingsJapgolly.three.mod.CircleGeometry
import typingsJapgolly.three.mod.CompressedTexture
import typingsJapgolly.three.mod.ConeGeometry
import typingsJapgolly.three.mod.CubeCamera
import typingsJapgolly.three.mod.CubeTexture
import typingsJapgolly.three.mod.CylinderGeometry
import typingsJapgolly.three.mod.DataTexture
import typingsJapgolly.three.mod.DataTexture3D
import typingsJapgolly.three.mod.DepthTexture
import typingsJapgolly.three.mod.DirectionalLightHelper
import typingsJapgolly.three.mod.DirectionalLightShadow
import typingsJapgolly.three.mod.DodecahedronGeometry
import typingsJapgolly.three.mod.EdgesGeometry
import typingsJapgolly.three.mod.ExtrudeGeometry
import typingsJapgolly.three.mod.Float16BufferAttribute
import typingsJapgolly.three.mod.Float32BufferAttribute
import typingsJapgolly.three.mod.Float64BufferAttribute
import typingsJapgolly.three.mod.Fog
import typingsJapgolly.three.mod.FogExp2
import typingsJapgolly.three.mod.GridHelper
import typingsJapgolly.three.mod.Group
import typingsJapgolly.three.mod.HemisphereLightHelper
import typingsJapgolly.three.mod.HemisphereLightProbe
import typingsJapgolly.three.mod.IcosahedronGeometry
import typingsJapgolly.three.mod.InstancedBufferAttribute
import typingsJapgolly.three.mod.InstancedBufferGeometry
import typingsJapgolly.three.mod.InstancedMesh
import typingsJapgolly.three.mod.Int16BufferAttribute
import typingsJapgolly.three.mod.Int32BufferAttribute
import typingsJapgolly.three.mod.Int8BufferAttribute
import typingsJapgolly.three.mod.LOD
import typingsJapgolly.three.mod.LatheGeometry
import typingsJapgolly.three.mod.Light
import typingsJapgolly.three.mod.LightProbe
import typingsJapgolly.three.mod.LightShadow
import typingsJapgolly.three.mod.LineBasicMaterial
import typingsJapgolly.three.mod.LineDashedMaterial
import typingsJapgolly.three.mod.LineLoop
import typingsJapgolly.three.mod.LineSegments
import typingsJapgolly.three.mod.Matrix3
import typingsJapgolly.three.mod.Mesh
import typingsJapgolly.three.mod.MeshBasicMaterial
import typingsJapgolly.three.mod.MeshDepthMaterial
import typingsJapgolly.three.mod.MeshDistanceMaterial
import typingsJapgolly.three.mod.MeshLambertMaterial
import typingsJapgolly.three.mod.MeshMatcapMaterial
import typingsJapgolly.three.mod.MeshNormalMaterial
import typingsJapgolly.three.mod.MeshPhongMaterial
import typingsJapgolly.three.mod.MeshPhysicalMaterial
import typingsJapgolly.three.mod.MeshStandardMaterial
import typingsJapgolly.three.mod.MeshToonMaterial
import typingsJapgolly.three.mod.OctahedronGeometry
import typingsJapgolly.three.mod.OrthographicCamera
import typingsJapgolly.three.mod.PerspectiveCamera
import typingsJapgolly.three.mod.PlaneGeometry
import typingsJapgolly.three.mod.PlaneHelper
import typingsJapgolly.three.mod.PointLightHelper
import typingsJapgolly.three.mod.Points
import typingsJapgolly.three.mod.PointsMaterial
import typingsJapgolly.three.mod.PolarGridHelper
import typingsJapgolly.three.mod.PolyhedronGeometry
import typingsJapgolly.three.mod.PositionalAudio
import typingsJapgolly.three.mod.RawShaderMaterial
import typingsJapgolly.three.mod.Raycaster
import typingsJapgolly.three.mod.RectAreaLight
import typingsJapgolly.three.mod.RingGeometry
import typingsJapgolly.three.mod.Scene
import typingsJapgolly.three.mod.ShaderMaterial
import typingsJapgolly.three.mod.ShadowMaterial
import typingsJapgolly.three.mod.Shape
import typingsJapgolly.three.mod.ShapeGeometry
import typingsJapgolly.three.mod.Skeleton
import typingsJapgolly.three.mod.SkeletonHelper
import typingsJapgolly.three.mod.SkinnedMesh
import typingsJapgolly.three.mod.SphereGeometry
import typingsJapgolly.three.mod.SpotLight
import typingsJapgolly.three.mod.SpotLightHelper
import typingsJapgolly.three.mod.SpotLightShadow
import typingsJapgolly.three.mod.Sprite
import typingsJapgolly.three.mod.SpriteMaterial
import typingsJapgolly.three.mod.TetrahedronGeometry
import typingsJapgolly.three.mod.Texture
import typingsJapgolly.three.mod.TorusGeometry
import typingsJapgolly.three.mod.TorusKnotGeometry
import typingsJapgolly.three.mod.TubeGeometry
import typingsJapgolly.three.mod.Uint16BufferAttribute
import typingsJapgolly.three.mod.Uint32BufferAttribute
import typingsJapgolly.three.mod.Uint8BufferAttribute
import typingsJapgolly.three.mod.VideoTexture
import typingsJapgolly.three.mod.WireframeGeometry
import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcConstantsMod.CompressedPixelFormat
import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.PixelFormat
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLightsDirectionalLightMod.DirectionalLight
import typingsJapgolly.three.srcLightsHemisphereLightMod.HemisphereLight
import typingsJapgolly.three.srcLightsPointLightMod.PointLight
import typingsJapgolly.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterialParameters
import typingsJapgolly.three.srcMaterialsLineDashedMaterialMod.LineDashedMaterialParameters
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMaterialsMaterialMod.MaterialParameters
import typingsJapgolly.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshDepthMaterialMod.MeshDepthMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshDistanceMaterialMod.MeshDistanceMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshLambertMaterialMod.MeshLambertMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshMatcapMaterialMod.MeshMatcapMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshNormalMaterialMod.MeshNormalMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshPhongMaterialMod.MeshPhongMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterialParameters
import typingsJapgolly.three.srcMaterialsMeshToonMaterialMod.MeshToonMaterialParameters
import typingsJapgolly.three.srcMaterialsPointsMaterialMod.PointsMaterialParameters
import typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.srcMaterialsSpriteMaterialMod.SpriteMaterialParameters
import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathPlaneMod.Plane
import typingsJapgolly.three.srcMathVector2Mod.Vector
import typingsJapgolly.three.srcRenderersWebGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcThreeTypesMod {
  
  type AmbientLightProbeProps = LightNode[AmbientLightProbe, Instantiable0[AmbientLightProbe]]
  
  type AmbientLightProps = LightNode[AmbientLight, Instantiable0[AmbientLight]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends new (args : any): any ? std.ConstructorParameters<T> : T
    }}}
    */
  @js.native
  trait Args[T] extends StObject
  
  type ArrayCameraProps = Object3DNode[ArrayCamera, Instantiable0[ArrayCamera]]
  
  type ArrowHelperProps = Object3DNode[
    ArrowHelper, 
    Instantiable6[
      /* dir */ js.UndefOr[typingsJapgolly.three.srcMathVector3Mod.Vector3], 
      /* origin */ js.UndefOr[typingsJapgolly.three.srcMathVector3Mod.Vector3], 
      /* length */ js.UndefOr[Double], 
      /* color */ js.UndefOr[ColorRepresentation], 
      /* headLength */ js.UndefOr[Double], 
      /* headWidth */ js.UndefOr[Double], 
      ArrowHelper
    ]
  ]
  
  type AttachCallback = String | (js.Function2[/* child */ Any, /* parentInstance */ Any, Unit])
  
  type AudioListenerProps = Object3DNode[AudioListener, Instantiable0[AudioListener]]
  
  type AxesHelperProps = Object3DNode[AxesHelper, Instantiable0[AxesHelper]]
  
  type BoneProps = Object3DNode[Bone, Instantiable0[Bone]]
  
  type Box3HelperProps = Object3DNode[Box3Helper, Instantiable1[/* box */ Box3, Box3Helper]]
  
  type BoxBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.BoxBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.BoxBufferGeometry */ Any
  ]
  
  type BoxGeometryProps = BufferGeometryNode[BoxGeometry, TypeofBoxGeometry]
  
  type BoxHelperProps = Object3DNode[BoxHelper, Instantiable1[/* object */ Object3D[Event], BoxHelper]]
  
  type BufferAttributeProps = Node[
    BufferAttribute, 
    Instantiable2[/* array */ ArrayLike[Double], /* itemSize */ Double, BufferAttribute]
  ]
  
  type BufferGeometryNode[T /* <: BufferGeometry */, P] = Node[T, P]
  
  type BufferGeometryProps = BufferGeometryNode[BufferGeometry, Instantiable0[BufferGeometry]]
  
  type CameraHelperProps = Object3DNode[CameraHelper, Instantiable1[/* camera */ Camera, CameraHelper]]
  
  type CameraProps = Object3DNode[typingsJapgolly.three.mod.Camera, Instantiable0[typingsJapgolly.three.mod.Camera]]
  
  type CanvasTextureProps = Node[
    CanvasTexture, 
    Instantiable9[
      /* canvas */ HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap, 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      CanvasTexture
    ]
  ]
  
  type CapsuleGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.CapsuleBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.CapsuleBufferGeometry */ Any
  ]
  
  type CircleBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.CircleBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.CircleBufferGeometry */ Any
  ]
  
  type CircleGeometryProps = BufferGeometryNode[CircleGeometry, TypeofCircleGeometry]
  
  type Color = ConstructorParameters[TypeofColor] | typingsJapgolly.three.mod.Color | Double | String
  
  type ColorArray = TypeofColor | (Parameters[
    js.Function1[/* color */ ColorRepresentation, typingsJapgolly.three.srcMathColorMod.Color]
  ])
  
  type ColorProps = Node[typingsJapgolly.three.mod.Color, ColorArray]
  
  type CompressedTextureProps = Node[
    CompressedTexture, 
    Instantiable12[
      /* mipmaps */ js.Array[ImageData], 
      /* width */ Double, 
      /* height */ Double, 
      /* format */ js.UndefOr[CompressedPixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      CompressedTexture
    ]
  ]
  
  type ConeBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.ConeBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.ConeBufferGeometry */ Any
  ]
  
  type ConeGeometryProps = BufferGeometryNode[ConeGeometry, TypeofConeGeometry]
  
  type CubeCameraProps = Object3DNode[
    CubeCamera, 
    Instantiable3[
      /* near */ Double, 
      /* far */ Double, 
      /* renderTarget */ WebGLCubeRenderTarget, 
      CubeCamera
    ]
  ]
  
  type CubeTextureProps = Node[
    CubeTexture, 
    Instantiable10[
      /* images */ js.UndefOr[js.Array[Any]], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      CubeTexture
    ]
  ]
  
  type CylinderBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.CylinderBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.CylinderBufferGeometry */ Any
  ]
  
  type CylinderGeometryProps = BufferGeometryNode[CylinderGeometry, TypeofCylinderGeometry]
  
  type DataTexture3DProps = Node[
    DataTexture3D, 
    Instantiable4[
      /* data */ BufferSource, 
      /* width */ Double, 
      /* height */ Double, 
      /* depth */ Double, 
      DataTexture3D
    ]
  ]
  
  type DataTextureProps = Node[
    DataTexture, 
    Instantiable12[
      /* data */ js.UndefOr[BufferSource | Null], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      DataTexture
    ]
  ]
  
  type DepthTextureProps = Node[
    DepthTexture, 
    Instantiable9[
      /* width */ Double, 
      /* height */ Double, 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      DepthTexture
    ]
  ]
  
  type DirectionalLightHelperProps = Object3DNode[
    DirectionalLightHelper, 
    Instantiable1[/* light */ DirectionalLight, DirectionalLightHelper]
  ]
  
  type DirectionalLightProps = LightNode[
    typingsJapgolly.three.mod.DirectionalLight, 
    Instantiable0[typingsJapgolly.three.mod.DirectionalLight]
  ]
  
  type DirectionalLightShadowProps = Node[DirectionalLightShadow, Instantiable1[/* camera */ Camera, DirectionalLightShadow]]
  
  type DodecahedronBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.DodecahedronBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.DodecahedronBufferGeometry */ Any
  ]
  
  type DodecahedronGeometryProps = BufferGeometryNode[DodecahedronGeometry, TypeofDodecahedronGeometr]
  
  type EdgesGeometryProps = BufferGeometryNode[
    EdgesGeometry[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry], 
    Instantiable0[EdgesGeometry[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry]]
  ]
  
  type Euler = typingsJapgolly.three.mod.Euler | Parameters[FnCallXYZOrder]
  
  type EulerProps = Node[typingsJapgolly.three.mod.Euler, TypeofEuler]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends three.three.Color | undefined? @react-three/fiber.@react-three/fiber/dist/declarations/src/three-types.Color : T[K]}
    }}}
    */
  @js.native
  trait ExtendedColors[T] extends StObject
  
  type ExtrudeBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.ExtrudeBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.ExtrudeBufferGeometry */ Any
  ]
  
  type ExtrudeGeometryProps = BufferGeometryNode[ExtrudeGeometry, TypeofExtrudeGeometry]
  
  type Float16BufferAttributeProps = Node[
    Float16BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Float16BufferAttribute]
  ]
  
  type Float32BufferAttributeProps = Node[
    Float32BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Float32BufferAttribute]
  ]
  
  type Float64BufferAttributeProps = Node[
    Float64BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Float64BufferAttribute]
  ]
  
  type FogExp2Props = Node[FogExp2, Instantiable1[/* hex */ Double, FogExp2]]
  
  type FogProps = Node[Fog, Instantiable1[/* color */ ColorRepresentation, Fog]]
  
  type GridHelperProps = Object3DNode[GridHelper, Instantiable0[GridHelper]]
  
  type GroupProps = Object3DNode[Group, Instantiable0[Group]]
  
  type HemisphereLightHelperProps = Object3DNode[
    HemisphereLightHelper, 
    Instantiable2[/* light */ HemisphereLight, /* size */ Double, HemisphereLightHelper]
  ]
  
  type HemisphereLightProbeProps = LightNode[HemisphereLightProbe, Instantiable0[HemisphereLightProbe]]
  
  type HemisphereLightProps = LightNode[
    typingsJapgolly.three.mod.HemisphereLight, 
    Instantiable0[typingsJapgolly.three.mod.HemisphereLight]
  ]
  
  type IcosahedronBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.IcosahedronBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.IcosahedronBufferGeometry */ Any
  ]
  
  type IcosahedronGeometryProps = BufferGeometryNode[IcosahedronGeometry, TypeofIcosahedronGeometry]
  
  type InstancedBufferAttributeProps = Node[
    InstancedBufferAttribute, 
    Instantiable2[/* array */ ArrayLike[Double], /* itemSize */ Double, InstancedBufferAttribute]
  ]
  
  type InstancedBufferGeometryProps = BufferGeometryNode[InstancedBufferGeometry, Instantiable0[InstancedBufferGeometry]]
  
  type InstancedMeshProps = Object3DNode[
    InstancedMesh[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable3[
      /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ /* geometry */ Any, 
      /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ /* material */ Any, 
      /* count */ Double, 
      InstancedMesh[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type Int16BufferAttributeProps = Node[
    Int16BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Int16BufferAttribute]
  ]
  
  type Int32BufferAttributeProps = Node[
    Int32BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Int32BufferAttribute]
  ]
  
  type Int8BufferAttributeProps = Node[
    Int8BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Int8BufferAttribute]
  ]
  
  type LODProps = Object3DNode[LOD, Instantiable0[LOD]]
  
  type LatheBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.LatheBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.LatheBufferGeometry */ Any
  ]
  
  type LatheGeometryProps = BufferGeometryNode[LatheGeometry, TypeofLatheGeometry]
  
  type Layers = typingsJapgolly.three.mod.Layers | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(channel : number): void>[0] */ js.Any)
  
  type LightNode[T /* <: Light */, P] = Object3DNode[T, P]
  
  type LightProbeProps = LightNode[LightProbe, Instantiable0[LightProbe]]
  
  type LightProps = LightNode[Light, Instantiable0[Light]]
  
  type LightShadowProps = Node[LightShadow, Instantiable1[/* camera */ Camera, LightShadow]]
  
  type LineBasicMaterialProps = MaterialNode[LineBasicMaterial, js.Array[LineBasicMaterialParameters]]
  
  type LineDashedMaterialProps = MaterialNode[LineDashedMaterial, js.Array[LineDashedMaterialParameters]]
  
  type LineLoopProps = Object3DNode[
    LineLoop[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      LineLoop[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type LineSegmentsProps = Object3DNode[
    LineSegments[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      LineSegments[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type MaterialNode[T /* <: typingsJapgolly.three.mod.Material */, P] = Node[T, P]
  
  type MaterialProps = MaterialNode[typingsJapgolly.three.mod.Material, js.Array[MaterialParameters]]
  
  type Matrix3Props = Node[Matrix3, Instantiable0[Matrix3]]
  
  type Matrix4 = typingsJapgolly.three.mod.Matrix4 | (Parameters[
    js.Function16[
      /* n11 */ Double, 
      /* n12 */ Double, 
      /* n13 */ Double, 
      /* n14 */ Double, 
      /* n21 */ Double, 
      /* n22 */ Double, 
      /* n23 */ Double, 
      /* n24 */ Double, 
      /* n31 */ Double, 
      /* n32 */ Double, 
      /* n33 */ Double, 
      /* n34 */ Double, 
      /* n41 */ Double, 
      /* n42 */ Double, 
      /* n43 */ Double, 
      /* n44 */ Double, 
      typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
    ]
  ]) | (js.Function16[
    /* n11 */ Double, 
    /* n12 */ Double, 
    /* n13 */ Double, 
    /* n14 */ Double, 
    /* n21 */ Double, 
    /* n22 */ Double, 
    /* n23 */ Double, 
    /* n24 */ Double, 
    /* n31 */ Double, 
    /* n32 */ Double, 
    /* n33 */ Double, 
    /* n34 */ Double, 
    /* n41 */ Double, 
    /* n42 */ Double, 
    /* n43 */ Double, 
    /* n44 */ Double, 
    typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
  ])
  
  type Matrix4Props = Node[
    typingsJapgolly.three.mod.Matrix4, 
    Instantiable0[typingsJapgolly.three.mod.Matrix4]
  ]
  
  type MeshBasicMaterialProps = MaterialNode[MeshBasicMaterial, js.Array[MeshBasicMaterialParameters]]
  
  type MeshDepthMaterialProps = MaterialNode[MeshDepthMaterial, js.Array[MeshDepthMaterialParameters]]
  
  type MeshDistanceMaterialProps = MaterialNode[MeshDistanceMaterial, js.Array[MeshDistanceMaterialParameters]]
  
  type MeshLambertMaterialProps = MaterialNode[MeshLambertMaterial, js.Array[MeshLambertMaterialParameters]]
  
  type MeshMatcapMaterialProps = MaterialNode[MeshMatcapMaterial, js.Array[MeshMatcapMaterialParameters]]
  
  type MeshNormalMaterialProps = MaterialNode[MeshNormalMaterial, js.Array[MeshNormalMaterialParameters]]
  
  type MeshPhongMaterialProps = MaterialNode[MeshPhongMaterial, js.Array[MeshPhongMaterialParameters]]
  
  type MeshPhysicalMaterialProps = MaterialNode[MeshPhysicalMaterial, js.Array[MeshPhysicalMaterialParameters]]
  
  type MeshProps = Object3DNode[
    Mesh[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      Mesh[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type MeshStandardMaterialProps = MaterialNode[MeshStandardMaterial, js.Array[MeshStandardMaterialParameters]]
  
  type MeshToonMaterialProps = MaterialNode[MeshToonMaterial, js.Array[MeshToonMaterialParameters]]
  
  type Node[T, P] = ExtendedColors[Overwrite[Partial[T], NodeProps[T, P]]]
  
  trait NodeProps[T, P] extends StObject {
    
    var args: js.UndefOr[Args[P]] = js.undefined
    
    var attach: js.UndefOr[AttachType] = js.undefined
    
    var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* self */ T, Unit]] = js.undefined
    
    var ref: js.UndefOr[Ref[T]] = js.undefined
  }
  object NodeProps {
    
    inline def apply[T, P](): NodeProps[T, P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeProps[T, P]]
    }
    
    extension [Self <: NodeProps[?, ?], T, P](x: Self & (NodeProps[T, P])) {
      
      inline def setArgs(value: Args[P]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setAttach(value: AttachType): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      inline def setAttachFunction2(value: (/* parent */ Instance, /* self */ Instance) => js.Function0[Unit]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
      
      inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnUpdate(value: /* self */ T => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* self */ T) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: T | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: T | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type NonFunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  type Object3DNode[T, P] = (Overwrite[Node[T, P], Dispose]) & EventHandlers
  
  type Object3DProps = Object3DNode[typingsJapgolly.three.mod.Object3D[Event], TypeofObject3D]
  
  type OctahedronBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.OctahedronBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.OctahedronBufferGeometry */ Any
  ]
  
  type OctahedronGeometryProps = BufferGeometryNode[OctahedronGeometry, TypeofOctahedronGeometry]
  
  type OrthographicCameraProps = Object3DNode[
    OrthographicCamera, 
    Instantiable6[
      /* left */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* top */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* near */ js.UndefOr[Double], 
      /* far */ js.UndefOr[Double], 
      OrthographicCamera
    ]
  ]
  
  type Overwrite[T, O] = (Omit[T, NonFunctionKeys[O]]) & O
  
  type PerspectiveCameraProps = Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]
  
  type PlaneBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.PlaneBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.PlaneBufferGeometry */ Any
  ]
  
  type PlaneGeometryProps = BufferGeometryNode[PlaneGeometry, TypeofPlaneGeometry]
  
  type PlaneHelperProps = Object3DNode[PlaneHelper, Instantiable1[/* plane */ Plane, PlaneHelper]]
  
  type PointLightHelperProps = Object3DNode[PointLightHelper, Instantiable1[/* light */ PointLight, PointLightHelper]]
  
  type PointLightProps = LightNode[
    typingsJapgolly.three.mod.PointLight, 
    Instantiable0[typingsJapgolly.three.mod.PointLight]
  ]
  
  type PointsMaterialProps = MaterialNode[PointsMaterial, js.Array[PointsMaterialParameters]]
  
  type PointsProps = Object3DNode[
    Points[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      Points[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type PolarGridHelperProps = Object3DNode[
    PolarGridHelper, 
    Instantiable6[
      /* radius */ js.UndefOr[Double], 
      /* radials */ js.UndefOr[Double], 
      /* circles */ js.UndefOr[Double], 
      /* divisions */ js.UndefOr[Double], 
      /* color1 */ js.UndefOr[ColorRepresentation], 
      /* color2 */ js.UndefOr[ColorRepresentation], 
      PolarGridHelper
    ]
  ]
  
  type PolyhedronBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.PolyhedronBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.PolyhedronBufferGeometry */ Any
  ]
  
  type PolyhedronGeometryProps = BufferGeometryNode[PolyhedronGeometry, TypeofPolyhedronGeometry]
  
  type PositionalAudioProps = Object3DNode[
    PositionalAudio, 
    Instantiable1[
      /* listener */ typingsJapgolly.three.srcAudioAudioListenerMod.AudioListener, 
      PositionalAudio
    ]
  ]
  
  trait PrimitiveProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `object`: Any
  }
  object PrimitiveProps {
    
    inline def apply(`object`: Any): PrimitiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimitiveProps]
    }
    
    extension [Self <: PrimitiveProps](x: Self) {
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  type Quaternion = typingsJapgolly.three.mod.Quaternion | (Parameters[
    js.Function4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typingsJapgolly.three.srcMathQuaternionMod.Quaternion
    ]
  ])
  
  type QuaternionProps = Node[typingsJapgolly.three.mod.Quaternion, TypeofQuaternion]
  
  type RawShaderMaterialProps = MaterialNode[RawShaderMaterial, js.Array[ShaderMaterialParameters]]
  
  type RaycasterProps = Node[Raycaster, Instantiable0[Raycaster]]
  
  type RectAreaLightProps = LightNode[RectAreaLight, Instantiable0[RectAreaLight]]
  
  type RingBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.RingBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.RingBufferGeometry */ Any
  ]
  
  type RingGeometryProps = BufferGeometryNode[RingGeometry, TypeofRingGeometry]
  
  type SceneProps = Object3DNode[Scene, Instantiable0[Scene]]
  
  type ShaderMaterialProps = MaterialNode[ShaderMaterial, js.Array[ShaderMaterialParameters]]
  
  type ShadowMaterialProps = MaterialNode[ShadowMaterial, js.Array[ShaderMaterialParameters]]
  
  type ShapeBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.ShapeBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.ShapeBufferGeometry */ Any
  ]
  
  type ShapeGeometryProps = BufferGeometryNode[ShapeGeometry, TypeofShapeGeometry]
  
  type ShapeProps = Node[Shape, Instantiable0[Shape]]
  
  type SkeletonHelperProps = Object3DNode[SkeletonHelper, Instantiable1[/* object */ Object3D[Event], SkeletonHelper]]
  
  type SkeletonProps = Object3DNode[
    Skeleton, 
    Instantiable1[/* bones */ js.Array[typingsJapgolly.three.srcObjectsBoneMod.Bone], Skeleton]
  ]
  
  type SkinnedMeshProps = Object3DNode[
    SkinnedMesh[
      typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      SkinnedMesh[
        typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type SphereBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.SphereBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.SphereBufferGeometry */ Any
  ]
  
  type SphereGeometryProps = BufferGeometryNode[SphereGeometry, TypeofSphereGeometry]
  
  type SpotLightHelperProps = Object3DNode[
    SpotLightHelper, 
    Instantiable1[/* light */ typingsJapgolly.three.srcLightsLightMod.Light, SpotLightHelper]
  ]
  
  type SpotLightProps = LightNode[
    SpotLight, 
    Instantiable6[
      /* color */ js.UndefOr[ColorRepresentation], 
      /* intensity */ js.UndefOr[Double], 
      /* distance */ js.UndefOr[Double], 
      /* angle */ js.UndefOr[Double], 
      /* penumbra */ js.UndefOr[Double], 
      /* decay */ js.UndefOr[Double], 
      SpotLight
    ]
  ]
  
  type SpotLightShadowProps = Node[SpotLightShadow, Instantiable1[/* camera */ Camera, SpotLightShadow]]
  
  type SpriteMaterialProps = MaterialNode[SpriteMaterial, js.Array[SpriteMaterialParameters]]
  
  type SpriteProps = Object3DNode[Sprite, Instantiable0[Sprite]]
  
  type TetrahedronBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.TetrahedronBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.TetrahedronBufferGeometry */ Any
  ]
  
  type TetrahedronGeometryProps = BufferGeometryNode[TetrahedronGeometry, TypeofTetrahedronGeometry]
  
  type TextureProps = Node[Texture, TypeofTexture]
  
  trait ThreeElements extends StObject {
    
    var ambientLight: AmbientLightProps
    
    var ambientLightProbe: AmbientLightProbeProps
    
    var arrayCamera: ArrayCameraProps
    
    var arrowHelper: ArrowHelperProps
    
    var audioListener: AudioListenerProps
    
    var axesHelper: AxesHelperProps
    
    var bone: BoneProps
    
    var box3Helper: Box3HelperProps
    
    var boxBufferGeometry: BoxBufferGeometryProps
    
    var boxGeometry: BoxGeometryProps
    
    var boxHelper: BoxHelperProps
    
    var bufferAttribute: BufferAttributeProps
    
    var bufferGeometry: BufferGeometryProps
    
    var camera: CameraProps
    
    var cameraHelper: CameraHelperProps
    
    var canvasTexture: CanvasTextureProps
    
    var capsuleGeometry: CapsuleGeometryProps
    
    var circleBufferGeometry: CircleBufferGeometryProps
    
    var circleGeometry: CircleGeometryProps
    
    var color: ColorProps
    
    var compressedTexture: CompressedTextureProps
    
    var coneBufferGeometry: ConeBufferGeometryProps
    
    var coneGeometry: ConeGeometryProps
    
    var cubeCamera: CubeCameraProps
    
    var cubeTexture: CubeTextureProps
    
    var cylinderBufferGeometry: CylinderBufferGeometryProps
    
    var cylinderGeometry: CylinderGeometryProps
    
    var dataTexture: DataTextureProps
    
    var dataTexture3D: DataTexture3DProps
    
    var depthTexture: DepthTextureProps
    
    var directionalLight: DirectionalLightProps
    
    var directionalLightHelper: DirectionalLightHelperProps
    
    var directionalLightShadow: DirectionalLightShadowProps
    
    var dodecahedronBufferGeometry: DodecahedronBufferGeometryProps
    
    var dodecahedronGeometry: DodecahedronGeometryProps
    
    var edgesGeometry: EdgesGeometryProps
    
    var euler: EulerProps
    
    var extrudeBufferGeometry: ExtrudeBufferGeometryProps
    
    var extrudeGeometry: ExtrudeGeometryProps
    
    var float16BufferAttribute: Float16BufferAttributeProps
    
    var float32BufferAttribute: Float32BufferAttributeProps
    
    var float64BufferAttribute: Float64BufferAttributeProps
    
    var fog: FogProps
    
    var fogExp2: FogExp2Props
    
    var gridHelper: GridHelperProps
    
    var group: GroupProps
    
    var hemisphereLight: HemisphereLightProps
    
    var hemisphereLightHelper: HemisphereLightHelperProps
    
    var hemisphereLightProbe: HemisphereLightProbeProps
    
    var icosahedronBufferGeometry: IcosahedronBufferGeometryProps
    
    var icosahedronGeometry: IcosahedronGeometryProps
    
    var instancedBufferAttribute: InstancedBufferAttributeProps
    
    var instancedBufferGeometry: InstancedBufferGeometryProps
    
    var instancedMesh: InstancedMeshProps
    
    var int16BufferAttribute: Int16BufferAttributeProps
    
    var int32BufferAttribute: Int32BufferAttributeProps
    
    var int8BufferAttribute: Int8BufferAttributeProps
    
    var lOD: LODProps
    
    var latheBufferGeometry: LatheBufferGeometryProps
    
    var latheGeometry: LatheGeometryProps
    
    var light: LightProps
    
    var lightProbe: LightProbeProps
    
    var lightShadow: LightShadowProps
    
    var lineBasicMaterial: LineBasicMaterialProps
    
    var lineDashedMaterial: LineDashedMaterialProps
    
    var lineLoop: LineLoopProps
    
    var lineSegments: LineSegmentsProps
    
    var material: MaterialProps
    
    var matrix3: Matrix3Props
    
    var matrix4: Matrix4Props
    
    var mesh: MeshProps
    
    var meshBasicMaterial: MeshBasicMaterialProps
    
    var meshDepthMaterial: MeshDepthMaterialProps
    
    var meshDistanceMaterial: MeshDistanceMaterialProps
    
    var meshLambertMaterial: MeshLambertMaterialProps
    
    var meshMatcapMaterial: MeshMatcapMaterialProps
    
    var meshNormalMaterial: MeshNormalMaterialProps
    
    var meshPhongMaterial: MeshPhongMaterialProps
    
    var meshPhysicalMaterial: MeshPhysicalMaterialProps
    
    var meshStandardMaterial: MeshStandardMaterialProps
    
    var meshToonMaterial: MeshToonMaterialProps
    
    var object3D: Object3DProps
    
    var octahedronBufferGeometry: OctahedronBufferGeometryProps
    
    var octahedronGeometry: OctahedronGeometryProps
    
    var orthographicCamera: OrthographicCameraProps
    
    var perspectiveCamera: PerspectiveCameraProps
    
    var planeBufferGeometry: PlaneBufferGeometryProps
    
    var planeGeometry: PlaneGeometryProps
    
    var planeHelper: PlaneHelperProps
    
    var pointLight: PointLightProps
    
    var pointLightHelper: PointLightHelperProps
    
    var points: PointsProps
    
    var pointsMaterial: PointsMaterialProps
    
    var polarGridHelper: PolarGridHelperProps
    
    var polyhedronBufferGeometry: PolyhedronBufferGeometryProps
    
    var polyhedronGeometry: PolyhedronGeometryProps
    
    var positionalAudio: PositionalAudioProps
    
    var primitive: PrimitiveProps
    
    var quaternion: QuaternionProps
    
    var rawShaderMaterial: RawShaderMaterialProps
    
    var raycaster: RaycasterProps
    
    var rectAreaLight: RectAreaLightProps
    
    var ringBufferGeometry: RingBufferGeometryProps
    
    var ringGeometry: RingGeometryProps
    
    var scene: SceneProps
    
    var shaderMaterial: ShaderMaterialProps
    
    var shadowMaterial: ShadowMaterialProps
    
    var shape: ShapeProps
    
    var shapeBufferGeometry: ShapeBufferGeometryProps
    
    var shapeGeometry: ShapeGeometryProps
    
    var skeleton: SkeletonProps
    
    var skeletonHelper: SkeletonHelperProps
    
    var skinnedMesh: SkinnedMeshProps
    
    var sphereBufferGeometry: SphereBufferGeometryProps
    
    var sphereGeometry: SphereGeometryProps
    
    var spotLight: SpotLightProps
    
    var spotLightHelper: SpotLightHelperProps
    
    var spotLightShadow: SpotLightShadowProps
    
    var sprite: SpriteProps
    
    var spriteMaterial: SpriteMaterialProps
    
    var tetrahedronBufferGeometry: TetrahedronBufferGeometryProps
    
    var tetrahedronGeometry: TetrahedronGeometryProps
    
    var texture: TextureProps
    
    var torusBufferGeometry: TorusBufferGeometryProps
    
    var torusGeometry: TorusGeometryProps
    
    var torusKnotBufferGeometry: TorusKnotBufferGeometryProps
    
    var torusKnotGeometry: TorusKnotGeometryProps
    
    var tubeBufferGeometry: TubeBufferGeometryProps
    
    var tubeGeometry: TubeGeometryProps
    
    var uint16BufferAttribute: Uint16BufferAttributeProps
    
    var uint32BufferAttribute: Uint32BufferAttributeProps
    
    var uint8BufferAttribute: Uint8BufferAttributeProps
    
    var vector2: Vector2Props
    
    var vector3: Vector3Props
    
    var vector4: Vector4Props
    
    var videoTexture: VideoTextureProps
    
    var wireframeGeometry: WireframeGeometryProps
  }
  object ThreeElements {
    
    extension [Self <: ThreeElements](x: Self) {
      
      inline def setAmbientLight(value: AmbientLightProps): Self = StObject.set(x, "ambientLight", value.asInstanceOf[js.Any])
      
      inline def setAmbientLightProbe(value: AmbientLightProbeProps): Self = StObject.set(x, "ambientLightProbe", value.asInstanceOf[js.Any])
      
      inline def setArrayCamera(value: ArrayCameraProps): Self = StObject.set(x, "arrayCamera", value.asInstanceOf[js.Any])
      
      inline def setArrowHelper(value: ArrowHelperProps): Self = StObject.set(x, "arrowHelper", value.asInstanceOf[js.Any])
      
      inline def setAudioListener(value: AudioListenerProps): Self = StObject.set(x, "audioListener", value.asInstanceOf[js.Any])
      
      inline def setAxesHelper(value: AxesHelperProps): Self = StObject.set(x, "axesHelper", value.asInstanceOf[js.Any])
      
      inline def setBone(value: BoneProps): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
      
      inline def setBox3Helper(value: Box3HelperProps): Self = StObject.set(x, "box3Helper", value.asInstanceOf[js.Any])
      
      inline def setBoxBufferGeometry(value: BoxBufferGeometryProps): Self = StObject.set(x, "boxBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setBoxGeometry(value: BoxGeometryProps): Self = StObject.set(x, "boxGeometry", value.asInstanceOf[js.Any])
      
      inline def setBoxHelper(value: BoxHelperProps): Self = StObject.set(x, "boxHelper", value.asInstanceOf[js.Any])
      
      inline def setBufferAttribute(value: BufferAttributeProps): Self = StObject.set(x, "bufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setBufferGeometry(value: BufferGeometryProps): Self = StObject.set(x, "bufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: CameraProps): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraHelper(value: CameraHelperProps): Self = StObject.set(x, "cameraHelper", value.asInstanceOf[js.Any])
      
      inline def setCanvasTexture(value: CanvasTextureProps): Self = StObject.set(x, "canvasTexture", value.asInstanceOf[js.Any])
      
      inline def setCapsuleGeometry(value: CapsuleGeometryProps): Self = StObject.set(x, "capsuleGeometry", value.asInstanceOf[js.Any])
      
      inline def setCircleBufferGeometry(value: CircleBufferGeometryProps): Self = StObject.set(x, "circleBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setCircleGeometry(value: CircleGeometryProps): Self = StObject.set(x, "circleGeometry", value.asInstanceOf[js.Any])
      
      inline def setColor(value: ColorProps): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCompressedTexture(value: CompressedTextureProps): Self = StObject.set(x, "compressedTexture", value.asInstanceOf[js.Any])
      
      inline def setConeBufferGeometry(value: ConeBufferGeometryProps): Self = StObject.set(x, "coneBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setConeGeometry(value: ConeGeometryProps): Self = StObject.set(x, "coneGeometry", value.asInstanceOf[js.Any])
      
      inline def setCubeCamera(value: CubeCameraProps): Self = StObject.set(x, "cubeCamera", value.asInstanceOf[js.Any])
      
      inline def setCubeTexture(value: CubeTextureProps): Self = StObject.set(x, "cubeTexture", value.asInstanceOf[js.Any])
      
      inline def setCylinderBufferGeometry(value: CylinderBufferGeometryProps): Self = StObject.set(x, "cylinderBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setCylinderGeometry(value: CylinderGeometryProps): Self = StObject.set(x, "cylinderGeometry", value.asInstanceOf[js.Any])
      
      inline def setDataTexture(value: DataTextureProps): Self = StObject.set(x, "dataTexture", value.asInstanceOf[js.Any])
      
      inline def setDataTexture3D(value: DataTexture3DProps): Self = StObject.set(x, "dataTexture3D", value.asInstanceOf[js.Any])
      
      inline def setDepthTexture(value: DepthTextureProps): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
      
      inline def setDirectionalLight(value: DirectionalLightProps): Self = StObject.set(x, "directionalLight", value.asInstanceOf[js.Any])
      
      inline def setDirectionalLightHelper(value: DirectionalLightHelperProps): Self = StObject.set(x, "directionalLightHelper", value.asInstanceOf[js.Any])
      
      inline def setDirectionalLightShadow(value: DirectionalLightShadowProps): Self = StObject.set(x, "directionalLightShadow", value.asInstanceOf[js.Any])
      
      inline def setDodecahedronBufferGeometry(value: DodecahedronBufferGeometryProps): Self = StObject.set(x, "dodecahedronBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setDodecahedronGeometry(value: DodecahedronGeometryProps): Self = StObject.set(x, "dodecahedronGeometry", value.asInstanceOf[js.Any])
      
      inline def setEdgesGeometry(value: EdgesGeometryProps): Self = StObject.set(x, "edgesGeometry", value.asInstanceOf[js.Any])
      
      inline def setEuler(value: EulerProps): Self = StObject.set(x, "euler", value.asInstanceOf[js.Any])
      
      inline def setExtrudeBufferGeometry(value: ExtrudeBufferGeometryProps): Self = StObject.set(x, "extrudeBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setExtrudeGeometry(value: ExtrudeGeometryProps): Self = StObject.set(x, "extrudeGeometry", value.asInstanceOf[js.Any])
      
      inline def setFloat16BufferAttribute(value: Float16BufferAttributeProps): Self = StObject.set(x, "float16BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setFloat32BufferAttribute(value: Float32BufferAttributeProps): Self = StObject.set(x, "float32BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setFloat64BufferAttribute(value: Float64BufferAttributeProps): Self = StObject.set(x, "float64BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setFog(value: FogProps): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogExp2(value: FogExp2Props): Self = StObject.set(x, "fogExp2", value.asInstanceOf[js.Any])
      
      inline def setGridHelper(value: GridHelperProps): Self = StObject.set(x, "gridHelper", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: GroupProps): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setHemisphereLight(value: HemisphereLightProps): Self = StObject.set(x, "hemisphereLight", value.asInstanceOf[js.Any])
      
      inline def setHemisphereLightHelper(value: HemisphereLightHelperProps): Self = StObject.set(x, "hemisphereLightHelper", value.asInstanceOf[js.Any])
      
      inline def setHemisphereLightProbe(value: HemisphereLightProbeProps): Self = StObject.set(x, "hemisphereLightProbe", value.asInstanceOf[js.Any])
      
      inline def setIcosahedronBufferGeometry(value: IcosahedronBufferGeometryProps): Self = StObject.set(x, "icosahedronBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setIcosahedronGeometry(value: IcosahedronGeometryProps): Self = StObject.set(x, "icosahedronGeometry", value.asInstanceOf[js.Any])
      
      inline def setInstancedBufferAttribute(value: InstancedBufferAttributeProps): Self = StObject.set(x, "instancedBufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setInstancedBufferGeometry(value: InstancedBufferGeometryProps): Self = StObject.set(x, "instancedBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setInstancedMesh(value: InstancedMeshProps): Self = StObject.set(x, "instancedMesh", value.asInstanceOf[js.Any])
      
      inline def setInt16BufferAttribute(value: Int16BufferAttributeProps): Self = StObject.set(x, "int16BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setInt32BufferAttribute(value: Int32BufferAttributeProps): Self = StObject.set(x, "int32BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setInt8BufferAttribute(value: Int8BufferAttributeProps): Self = StObject.set(x, "int8BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setLOD(value: LODProps): Self = StObject.set(x, "lOD", value.asInstanceOf[js.Any])
      
      inline def setLatheBufferGeometry(value: LatheBufferGeometryProps): Self = StObject.set(x, "latheBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setLatheGeometry(value: LatheGeometryProps): Self = StObject.set(x, "latheGeometry", value.asInstanceOf[js.Any])
      
      inline def setLight(value: LightProps): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightProbe(value: LightProbeProps): Self = StObject.set(x, "lightProbe", value.asInstanceOf[js.Any])
      
      inline def setLightShadow(value: LightShadowProps): Self = StObject.set(x, "lightShadow", value.asInstanceOf[js.Any])
      
      inline def setLineBasicMaterial(value: LineBasicMaterialProps): Self = StObject.set(x, "lineBasicMaterial", value.asInstanceOf[js.Any])
      
      inline def setLineDashedMaterial(value: LineDashedMaterialProps): Self = StObject.set(x, "lineDashedMaterial", value.asInstanceOf[js.Any])
      
      inline def setLineLoop(value: LineLoopProps): Self = StObject.set(x, "lineLoop", value.asInstanceOf[js.Any])
      
      inline def setLineSegments(value: LineSegmentsProps): Self = StObject.set(x, "lineSegments", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: MaterialProps): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMatrix3(value: Matrix3Props): Self = StObject.set(x, "matrix3", value.asInstanceOf[js.Any])
      
      inline def setMatrix4(value: Matrix4Props): Self = StObject.set(x, "matrix4", value.asInstanceOf[js.Any])
      
      inline def setMesh(value: MeshProps): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setMeshBasicMaterial(value: MeshBasicMaterialProps): Self = StObject.set(x, "meshBasicMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshDepthMaterial(value: MeshDepthMaterialProps): Self = StObject.set(x, "meshDepthMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshDistanceMaterial(value: MeshDistanceMaterialProps): Self = StObject.set(x, "meshDistanceMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshLambertMaterial(value: MeshLambertMaterialProps): Self = StObject.set(x, "meshLambertMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshMatcapMaterial(value: MeshMatcapMaterialProps): Self = StObject.set(x, "meshMatcapMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshNormalMaterial(value: MeshNormalMaterialProps): Self = StObject.set(x, "meshNormalMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshPhongMaterial(value: MeshPhongMaterialProps): Self = StObject.set(x, "meshPhongMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshPhysicalMaterial(value: MeshPhysicalMaterialProps): Self = StObject.set(x, "meshPhysicalMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshStandardMaterial(value: MeshStandardMaterialProps): Self = StObject.set(x, "meshStandardMaterial", value.asInstanceOf[js.Any])
      
      inline def setMeshToonMaterial(value: MeshToonMaterialProps): Self = StObject.set(x, "meshToonMaterial", value.asInstanceOf[js.Any])
      
      inline def setObject3D(value: Object3DProps): Self = StObject.set(x, "object3D", value.asInstanceOf[js.Any])
      
      inline def setOctahedronBufferGeometry(value: OctahedronBufferGeometryProps): Self = StObject.set(x, "octahedronBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setOctahedronGeometry(value: OctahedronGeometryProps): Self = StObject.set(x, "octahedronGeometry", value.asInstanceOf[js.Any])
      
      inline def setOrthographicCamera(value: OrthographicCameraProps): Self = StObject.set(x, "orthographicCamera", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveCamera(value: PerspectiveCameraProps): Self = StObject.set(x, "perspectiveCamera", value.asInstanceOf[js.Any])
      
      inline def setPlaneBufferGeometry(value: PlaneBufferGeometryProps): Self = StObject.set(x, "planeBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setPlaneGeometry(value: PlaneGeometryProps): Self = StObject.set(x, "planeGeometry", value.asInstanceOf[js.Any])
      
      inline def setPlaneHelper(value: PlaneHelperProps): Self = StObject.set(x, "planeHelper", value.asInstanceOf[js.Any])
      
      inline def setPointLight(value: PointLightProps): Self = StObject.set(x, "pointLight", value.asInstanceOf[js.Any])
      
      inline def setPointLightHelper(value: PointLightHelperProps): Self = StObject.set(x, "pointLightHelper", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: PointsProps): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsMaterial(value: PointsMaterialProps): Self = StObject.set(x, "pointsMaterial", value.asInstanceOf[js.Any])
      
      inline def setPolarGridHelper(value: PolarGridHelperProps): Self = StObject.set(x, "polarGridHelper", value.asInstanceOf[js.Any])
      
      inline def setPolyhedronBufferGeometry(value: PolyhedronBufferGeometryProps): Self = StObject.set(x, "polyhedronBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setPolyhedronGeometry(value: PolyhedronGeometryProps): Self = StObject.set(x, "polyhedronGeometry", value.asInstanceOf[js.Any])
      
      inline def setPositionalAudio(value: PositionalAudioProps): Self = StObject.set(x, "positionalAudio", value.asInstanceOf[js.Any])
      
      inline def setPrimitive(value: PrimitiveProps): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setQuaternion(value: QuaternionProps): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      inline def setRawShaderMaterial(value: RawShaderMaterialProps): Self = StObject.set(x, "rawShaderMaterial", value.asInstanceOf[js.Any])
      
      inline def setRaycaster(value: RaycasterProps): Self = StObject.set(x, "raycaster", value.asInstanceOf[js.Any])
      
      inline def setRectAreaLight(value: RectAreaLightProps): Self = StObject.set(x, "rectAreaLight", value.asInstanceOf[js.Any])
      
      inline def setRingBufferGeometry(value: RingBufferGeometryProps): Self = StObject.set(x, "ringBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setRingGeometry(value: RingGeometryProps): Self = StObject.set(x, "ringGeometry", value.asInstanceOf[js.Any])
      
      inline def setScene(value: SceneProps): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setShaderMaterial(value: ShaderMaterialProps): Self = StObject.set(x, "shaderMaterial", value.asInstanceOf[js.Any])
      
      inline def setShadowMaterial(value: ShadowMaterialProps): Self = StObject.set(x, "shadowMaterial", value.asInstanceOf[js.Any])
      
      inline def setShape(value: ShapeProps): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeBufferGeometry(value: ShapeBufferGeometryProps): Self = StObject.set(x, "shapeBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setShapeGeometry(value: ShapeGeometryProps): Self = StObject.set(x, "shapeGeometry", value.asInstanceOf[js.Any])
      
      inline def setSkeleton(value: SkeletonProps): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setSkeletonHelper(value: SkeletonHelperProps): Self = StObject.set(x, "skeletonHelper", value.asInstanceOf[js.Any])
      
      inline def setSkinnedMesh(value: SkinnedMeshProps): Self = StObject.set(x, "skinnedMesh", value.asInstanceOf[js.Any])
      
      inline def setSphereBufferGeometry(value: SphereBufferGeometryProps): Self = StObject.set(x, "sphereBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setSphereGeometry(value: SphereGeometryProps): Self = StObject.set(x, "sphereGeometry", value.asInstanceOf[js.Any])
      
      inline def setSpotLight(value: SpotLightProps): Self = StObject.set(x, "spotLight", value.asInstanceOf[js.Any])
      
      inline def setSpotLightHelper(value: SpotLightHelperProps): Self = StObject.set(x, "spotLightHelper", value.asInstanceOf[js.Any])
      
      inline def setSpotLightShadow(value: SpotLightShadowProps): Self = StObject.set(x, "spotLightShadow", value.asInstanceOf[js.Any])
      
      inline def setSprite(value: SpriteProps): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteMaterial(value: SpriteMaterialProps): Self = StObject.set(x, "spriteMaterial", value.asInstanceOf[js.Any])
      
      inline def setTetrahedronBufferGeometry(value: TetrahedronBufferGeometryProps): Self = StObject.set(x, "tetrahedronBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setTetrahedronGeometry(value: TetrahedronGeometryProps): Self = StObject.set(x, "tetrahedronGeometry", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: TextureProps): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTorusBufferGeometry(value: TorusBufferGeometryProps): Self = StObject.set(x, "torusBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setTorusGeometry(value: TorusGeometryProps): Self = StObject.set(x, "torusGeometry", value.asInstanceOf[js.Any])
      
      inline def setTorusKnotBufferGeometry(value: TorusKnotBufferGeometryProps): Self = StObject.set(x, "torusKnotBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setTorusKnotGeometry(value: TorusKnotGeometryProps): Self = StObject.set(x, "torusKnotGeometry", value.asInstanceOf[js.Any])
      
      inline def setTubeBufferGeometry(value: TubeBufferGeometryProps): Self = StObject.set(x, "tubeBufferGeometry", value.asInstanceOf[js.Any])
      
      inline def setTubeGeometry(value: TubeGeometryProps): Self = StObject.set(x, "tubeGeometry", value.asInstanceOf[js.Any])
      
      inline def setUint16BufferAttribute(value: Uint16BufferAttributeProps): Self = StObject.set(x, "uint16BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setUint32BufferAttribute(value: Uint32BufferAttributeProps): Self = StObject.set(x, "uint32BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setUint8BufferAttribute(value: Uint8BufferAttributeProps): Self = StObject.set(x, "uint8BufferAttribute", value.asInstanceOf[js.Any])
      
      inline def setVector2(value: Vector2Props): Self = StObject.set(x, "vector2", value.asInstanceOf[js.Any])
      
      inline def setVector3(value: Vector3Props): Self = StObject.set(x, "vector3", value.asInstanceOf[js.Any])
      
      inline def setVector4(value: Vector4Props): Self = StObject.set(x, "vector4", value.asInstanceOf[js.Any])
      
      inline def setVideoTexture(value: VideoTextureProps): Self = StObject.set(x, "videoTexture", value.asInstanceOf[js.Any])
      
      inline def setWireframeGeometry(value: WireframeGeometryProps): Self = StObject.set(x, "wireframeGeometry", value.asInstanceOf[js.Any])
    }
  }
  
  type TorusBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.TorusBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.TorusBufferGeometry */ Any
  ]
  
  type TorusGeometryProps = BufferGeometryNode[TorusGeometry, TypeofTorusGeometry]
  
  type TorusKnotBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.TorusKnotBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.TorusKnotBufferGeometry */ Any
  ]
  
  type TorusKnotGeometryProps = BufferGeometryNode[TorusKnotGeometry, TypeofTorusKnotGeometry]
  
  type TubeBufferGeometryProps = BufferGeometryNode[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify THREE.TubeBufferGeometry */ Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof THREE.TubeBufferGeometry */ Any
  ]
  
  type TubeGeometryProps = BufferGeometryNode[TubeGeometry, TypeofTubeGeometry]
  
  type Uint16BufferAttributeProps = Node[
    Uint16BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Uint16BufferAttribute]
  ]
  
  type Uint32BufferAttributeProps = Node[
    Uint32BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Uint32BufferAttribute]
  ]
  
  type Uint8BufferAttributeProps = Node[
    Uint8BufferAttribute, 
    Instantiable2[/* array */ js.Iterable[Double], /* itemSize */ Double, Uint8BufferAttribute]
  ]
  
  type Vector2 = VectorLike[typingsJapgolly.three.mod.Vector2]
  
  type Vector2Props = Node[
    typingsJapgolly.three.mod.Vector2, 
    Instantiable0[typingsJapgolly.three.mod.Vector2]
  ]
  
  type Vector3 = VectorLike[typingsJapgolly.three.mod.Vector3]
  
  type Vector3Props = Node[
    typingsJapgolly.three.mod.Vector3, 
    Instantiable0[typingsJapgolly.three.mod.Vector3]
  ]
  
  type Vector4 = VectorLike[typingsJapgolly.three.mod.Vector4]
  
  type Vector4Props = Node[
    typingsJapgolly.three.mod.Vector4, 
    Instantiable0[typingsJapgolly.three.mod.Vector4]
  ]
  
  type VectorLike[VectorClass /* <: Vector */] = VectorClass | (Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: VectorClass['set'] */ js.Any
  ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<VectorClass['setScalar']>[0] */ js.Any)
  
  type VideoTextureProps = Node[
    VideoTexture, 
    Instantiable9[
      /* video */ HTMLVideoElement, 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      VideoTexture
    ]
  ]
  
  type WireframeGeometryProps = BufferGeometryNode[
    WireframeGeometry[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry], 
    Instantiable0[WireframeGeometry[typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry]]
  ]
  
  object global {
    
    object JSX {
      
      type IntrinsicElements = ThreeElements
    }
  }
}
