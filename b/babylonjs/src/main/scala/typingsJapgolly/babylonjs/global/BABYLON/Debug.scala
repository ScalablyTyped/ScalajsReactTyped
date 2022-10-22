package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IBoneWeightShaderOptions
import typingsJapgolly.babylonjs.BABYLON.ISkeletonMapShaderOptions
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.anon.PartialISkeletonViewerOptComputeBonesUsingShaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Debug {
  
  @JSGlobal("BABYLON.Debug.AxesViewer")
  @js.native
  open class AxesViewer protected ()
    extends StObject
       with typingsJapgolly.babylonjs.BABYLON.Debug.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      * @param lineThickness The line thickness to use when creating the arrow. defaults to 1.
      */
    def this(
      scene: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene],
      scaleLines: js.UndefOr[Double],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.TransformNode],
      yAxis: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.TransformNode],
      zAxis: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.TransformNode],
      lineThickness: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object AxesViewer {
    
    @JSGlobal("BABYLON.Debug.AxesViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("BABYLON.Debug.AxesViewer._SetRenderingGroupId")
    @js.native
    def _SetRenderingGroupId: Any = js.native
    inline def _SetRenderingGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("BABYLON.Debug.BoneAxesViewer")
  @js.native
  open class BoneAxesViewer protected ()
    extends StObject
       with typingsJapgolly.babylonjs.BABYLON.Debug.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(
      scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      bone: typingsJapgolly.babylonjs.BABYLON.Bone,
      mesh: typingsJapgolly.babylonjs.BABYLON.Mesh
    ) = this()
    def this(
      scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      bone: typingsJapgolly.babylonjs.BABYLON.Bone,
      mesh: typingsJapgolly.babylonjs.BABYLON.Mesh,
      scaleLines: Double
    ) = this()
  }
  
  @JSGlobal("BABYLON.Debug.PhysicsViewer")
  @js.native
  /**
    * Creates a new PhysicsViewer
    * @param scene defines the hosting scene
    */
  open class PhysicsViewer ()
    extends StObject
       with typingsJapgolly.babylonjs.BABYLON.Debug.PhysicsViewer {
    def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  }
  
  @JSGlobal("BABYLON.Debug.SkeletonViewer")
  @js.native
  open class SkeletonViewer protected ()
    extends StObject
       with typingsJapgolly.babylonjs.BABYLON.Debug.SkeletonViewer {
    /**
      * Creates a new SkeletonViewer
      * @param skeleton defines the skeleton to render
      * @param mesh defines the mesh attached to the skeleton
      * @param scene defines the hosting scene
      * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
      * @param renderingGroupId defines the rendering group id to use with the viewer
      * @param options All of the extra constructor options for the SkeletonViewer
      */
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Unit,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
      /** The Scene scope*/
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Unit,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Unit,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOptComputeBonesUsingShaders
    ) = this()
  }
  /* static members */
  object SkeletonViewer {
    
    @JSGlobal("BABYLON.Debug.SkeletonViewer")
    @js.native
    val ^ : js.Any = js.native
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      * @see http://www.babylonjs-playground.com/#1BZJVJ#395
      */
    inline def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoneWeightShader")(options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ShaderMaterial]
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      */
    inline def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.ShaderMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSkeletonMapShader")(options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ShaderMaterial]
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
    @JSGlobal("BABYLON.Debug.SkeletonViewer.DISPLAY_LINES")
    @js.native
    val DISPLAY_LINES: /* 0 */ Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
    @JSGlobal("BABYLON.Debug.SkeletonViewer.DISPLAY_SPHERES")
    @js.native
    val DISPLAY_SPHERES: /* 1 */ Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
    @JSGlobal("BABYLON.Debug.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS")
    @js.native
    val DISPLAY_SPHERE_AND_SPURS: /* 2 */ Double = js.native
    
    /** private static method to create a BoneWeight Shader
      * @param size The size of the buffer to create (usually the bone count)
      * @param colorMap The gradient data to generate
      * @param scene The scene that the shader is scoped to
      * @returns an Array of floats from the color gradient values
      */
    @JSGlobal("BABYLON.Debug.SkeletonViewer._CreateBoneMapColorBuffer")
    @js.native
    def _CreateBoneMapColorBuffer: Any = js.native
    inline def _CreateBoneMapColorBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateBoneMapColorBuffer")(x.asInstanceOf[js.Any])
  }
}
