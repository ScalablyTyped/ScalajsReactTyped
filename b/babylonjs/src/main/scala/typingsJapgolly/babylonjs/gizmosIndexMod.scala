package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo
import typingsJapgolly.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typingsJapgolly.babylonjs.gizmosRotationGizmoMod.RotationGizmoOptions
import typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosIndexMod {
  
  @JSImport("babylonjs/Gizmos/index", "AxisDragGizmo")
  @js.native
  open class AxisDragGizmo protected ()
    extends typingsJapgolly.babylonjs.gizmosAxisDragGizmoMod.AxisDragGizmo {
    /**
      * Creates an AxisDragGizmo
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Unit,
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
      thickness: Double
    ) = this()
  }
  /* static members */
  object AxisDragGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "AxisDragGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Unit, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    
    /**
      * @internal
      */
    inline def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
  }
  
  @JSImport("babylonjs/Gizmos/index", "AxisScaleGizmo")
  @js.native
  open class AxisScaleGizmo protected ()
    extends typingsJapgolly.babylonjs.gizmosAxisScaleGizmoMod.AxisScaleGizmo {
    /**
      * Creates an AxisScaleGizmo
      * @param dragAxis The axis which the gizmo will be able to scale on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo]
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Unit,
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo],
      thickness: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Gizmos/index", "BoundingBoxGizmo")
  @js.native
  /**
    * Creates an BoundingBoxGizmo
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class BoundingBoxGizmo ()
    extends typingsJapgolly.babylonjs.gizmosBoundingBoxGizmoMod.BoundingBoxGizmo {
    def this(color: Color3) = this()
    def this(color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  object BoundingBoxGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "BoundingBoxGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
      * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
      * @returns the bounding box mesh with the passed in mesh as a child
      */
    inline def MakeNotPickableAndWrapInBoundingBox(mesh: Mesh): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeNotPickableAndWrapInBoundingBox")(mesh.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  }
  
  @JSImport("babylonjs/Gizmos/index", "CameraGizmo")
  @js.native
  /**
    * Creates a CameraGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class CameraGizmo ()
    extends typingsJapgolly.babylonjs.gizmosCameraGizmoMod.CameraGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  object CameraGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "CameraGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/index", "CameraGizmo._CreateCameraFrustum")
    @js.native
    def _CreateCameraFrustum: Any = js.native
    inline def _CreateCameraFrustum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraFrustum")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "CameraGizmo._CreateCameraMesh")
    @js.native
    def _CreateCameraMesh: Any = js.native
    inline def _CreateCameraMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "CameraGizmo._Scale")
    @js.native
    def _Scale: Any = js.native
    inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gizmos/index", "Gizmo")
  @js.native
  /**
    * Creates a gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class Gizmo ()
    extends typingsJapgolly.babylonjs.gizmosGizmoMod.Gizmo {
    def this(/** The utility layer the gizmo will be added to */
    gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  object Gizmo {
    
    @JSImport("babylonjs/Gizmos/index", "Gizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
      * @returns {Observer<PointerInfo>} pointerObserver
      */
    inline def GizmoAxisPointerObserver(gizmoLayer: UtilityLayerRenderer, gizmoAxisCache: Map[Mesh, GizmoAxisCache]): Observer[PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[Observer[PointerInfo]]
    
    /**
      * When enabled, any gizmo operation will perserve scaling sign. Default is off.
      * Only valid for TransformNode derived classes (Mesh, AbstractMesh, ...)
      */
    @JSImport("babylonjs/Gizmos/index", "Gizmo.PreserveScaling")
    @js.native
    def PreserveScaling: Boolean = js.native
    inline def PreserveScaling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreserveScaling")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gizmos/index", "GizmoManager")
  @js.native
  open class GizmoManager protected ()
    extends typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager {
    /**
      * Instantiates a gizmo manager
      * @param _scene the scene to overlay the gizmos on top of
      * @param thickness display gizmo axis thickness
      * @param utilityLayer the layer where gizmos are rendered
      * @param keepDepthUtilityLayer the layer where occluded gizmos are rendered
      */
    def this(_scene: Scene) = this()
    def this(_scene: Scene, thickness: Double) = this()
    def this(_scene: Scene, thickness: Double, utilityLayer: UtilityLayerRenderer) = this()
    def this(_scene: Scene, thickness: Unit, utilityLayer: UtilityLayerRenderer) = this()
    def this(_scene: Scene, thickness: Double, utilityLayer: Unit, keepDepthUtilityLayer: UtilityLayerRenderer) = this()
    def this(
      _scene: Scene,
      thickness: Double,
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
    def this(_scene: Scene, thickness: Unit, utilityLayer: Unit, keepDepthUtilityLayer: UtilityLayerRenderer) = this()
    def this(
      _scene: Scene,
      thickness: Unit,
      utilityLayer: UtilityLayerRenderer,
      keepDepthUtilityLayer: UtilityLayerRenderer
    ) = this()
  }
  
  @JSImport("babylonjs/Gizmos/index", "LightGizmo")
  @js.native
  /**
    * Creates a LightGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class LightGizmo ()
    extends typingsJapgolly.babylonjs.gizmosLightGizmoMod.LightGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
  }
  /* static members */
  object LightGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._CreateDirectionalLightMesh")
    @js.native
    def _CreateDirectionalLightMesh: Any = js.native
    inline def _CreateDirectionalLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDirectionalLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._CreateHemisphericLightMesh")
    @js.native
    def _CreateHemisphericLightMesh: Any = js.native
    inline def _CreateHemisphericLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateHemisphericLightMesh")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the lines for a light mesh
      * @param levels
      * @param scene
      */
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._CreateLightLines")
    @js.native
    def _CreateLightLines: Any = js.native
    inline def _CreateLightLines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateLightLines")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._CreatePointLightMesh")
    @js.native
    def _CreatePointLightMesh: Any = js.native
    inline def _CreatePointLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._CreateSpotLightMesh")
    @js.native
    def _CreateSpotLightMesh: Any = js.native
    inline def _CreateSpotLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateSpotLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "LightGizmo._Scale")
    @js.native
    def _Scale: Any = js.native
    inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gizmos/index", "PlaneDragGizmo")
  @js.native
  open class PlaneDragGizmo protected ()
    extends typingsJapgolly.babylonjs.gizmosPlaneDragGizmoMod.PlaneDragGizmo {
    /**
      * Creates a PlaneDragGizmo
      * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      */
    def this(dragPlaneNormal: Vector3) = this()
    def this(dragPlaneNormal: Vector3, color: Color3) = this()
    def this(dragPlaneNormal: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
    ) = this()
  }
  /* static members */
  object PlaneDragGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "PlaneDragGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreatePlane")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
  }
  
  @JSImport("babylonjs/Gizmos/index", "PlaneRotationGizmo")
  @js.native
  open class PlaneRotationGizmo protected ()
    extends typingsJapgolly.babylonjs.gizmosPlaneRotationGizmoMod.PlaneRotationGizmo {
    /**
      * Creates a PlaneRotationGizmo
      * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param parent
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      */
    def this(
      planeNormal: Vector3,
      color: js.UndefOr[Color3],
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      parent: js.UndefOr[Nullable[typingsJapgolly.babylonjs.gizmosRotationGizmoMod.RotationGizmo]],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object PlaneRotationGizmo {
    
    @JSImport("babylonjs/Gizmos/index", "PlaneRotationGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The maximum angle between the camera and the rotation allowed for interaction
      * If a rotation plane appears 'flat', a lower value allows interaction.
      */
    @JSImport("babylonjs/Gizmos/index", "PlaneRotationGizmo.MaxDragAngle")
    @js.native
    def MaxDragAngle: Double = js.native
    inline def MaxDragAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDragAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "PlaneRotationGizmo._RotationGizmoFragmentShader")
    @js.native
    def _RotationGizmoFragmentShader: String = js.native
    inline def _RotationGizmoFragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoFragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/index", "PlaneRotationGizmo._RotationGizmoVertexShader")
    @js.native
    def _RotationGizmoVertexShader: String = js.native
    inline def _RotationGizmoVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoVertexShader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gizmos/index", "PositionGizmo")
  @js.native
  /**
    * Creates a PositionGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    @param thickness display gizmo axis thickness
    * @param gizmoManager
    */
  open class PositionGizmo ()
    extends typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: Unit, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(
      gizmoLayer: Unit,
      thickness: Double,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      thickness: Unit,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Double,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Unit,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
  }
  
  @JSImport("babylonjs/Gizmos/index", "RotationGizmo")
  @js.native
  open class RotationGizmo protected ()
    extends typingsJapgolly.babylonjs.gizmosRotationGizmoMod.RotationGizmo {
    /**
      * Creates a RotationGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      * @param gizmoManager Gizmo manager
      * @param options More options
      */
    def this(
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double],
      gizmoManager: js.UndefOr[typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager],
      options: js.UndefOr[RotationGizmoOptions]
    ) = this()
  }
  
  @JSImport("babylonjs/Gizmos/index", "ScaleGizmo")
  @js.native
  /**
    * Creates a ScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param thickness display gizmo axis thickness
    * @param gizmoManager
    */
  open class ScaleGizmo ()
    extends typingsJapgolly.babylonjs.gizmosScaleGizmoMod.ScaleGizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: Unit, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(
      gizmoLayer: Unit,
      thickness: Double,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      thickness: Unit,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Double,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      thickness: Unit,
      gizmoManager: typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
    ) = this()
  }
}
