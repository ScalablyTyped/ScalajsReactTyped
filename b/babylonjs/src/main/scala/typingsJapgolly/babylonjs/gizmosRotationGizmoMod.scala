package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo
import typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager
import typingsJapgolly.babylonjs.gizmosGizmoMod.Gizmo
import typingsJapgolly.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo
import typingsJapgolly.babylonjs.gizmosPlaneRotationGizmoMod.IPlaneRotationGizmo
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.nodeMod.Node
import typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosRotationGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.babylonjs.sceneMod.IDisposable because Already inherited
  - typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typingsJapgolly.babylonjs.gizmosRotationGizmoMod.IRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, onDragStartObservable, onDragEndObservable, snapDistance, addToAxisCache */ @JSImport("babylonjs/Gizmos/rotationGizmo", "RotationGizmo")
  @js.native
  open class RotationGizmo protected () extends Gizmo {
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
      gizmoManager: js.UndefOr[GizmoManager],
      options: js.UndefOr[RotationGizmoOptions]
    ) = this()
    
    /* protected */ def _checkBillboardTransform(): Unit = js.native
    
    /** Node Caching for quick lookup */
    /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
    
    /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _nodeAttached: Nullable[Node] = js.native
    
    /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
    
    @JSName("attachedMesh")
    def attachedMesh_MRotationGizmo: Nullable[AbstractMesh] = js.native
    
    @JSName("attachedNode")
    def attachedNode_MRotationGizmo: Nullable[Node] = js.native
    
    /**
      * True when the mouse pointer is hovering a gizmo mesh
      */
    @JSName("isHovered")
    def isHovered_MRotationGizmo: Boolean = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any] = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MRotationGizmo: Double = js.native
    
    /**
      * CustomMeshes are not supported by this gizmo
      */
    def setCustomMesh(): Unit = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    @JSName("snapDistance")
    var snapDistance_FRotationGizmo: Double = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: IPlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: IPlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: IPlaneRotationGizmo = js.native
  }
  
  trait IRotationGizmo
    extends StObject
       with IGizmo {
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any]
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any]
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
    
    /** Internal gizmo used for interactions on the x axis */
    var xGizmo: IPlaneRotationGizmo
    
    /** Internal gizmo used for interactions on the y axis */
    var yGizmo: IPlaneRotationGizmo
    
    /** Internal gizmo used for interactions on the z axis */
    var zGizmo: IPlaneRotationGizmo
  }
  object IRotationGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      addToAxisCache: (Mesh, GizmoAxisCache) => Callback,
      dispose: Callback,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      onDragEndObservable: Observable[Any],
      onDragStartObservable: Observable[Any],
      scaleRatio: Double,
      setCustomMesh: Mesh => Callback,
      snapDistance: Double,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean,
      xGizmo: IPlaneRotationGizmo,
      yGizmo: IPlaneRotationGizmo,
      zGizmo: IPlaneRotationGizmo
    ): IRotationGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2((t0: Mesh, t1: GizmoAxisCache) => (addToAxisCache(t0, t1)).runNow()), dispose = dispose.toJsFn, gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1((t0: Mesh) => setCustomMesh(t0).runNow()), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IRotationGizmo]
    }
    
    extension [Self <: IRotationGizmo](x: Self) {
      
      inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Callback): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2((t0: Mesh, t1: GizmoAxisCache) => (value(t0, t1)).runNow()))
      
      inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
      
      inline def setXGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
      
      inline def setYGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
      
      inline def setZGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaneRotationGizmoOptions extends StObject {
    
    /**
      * Color to use for the plane rotation gizmo
      */
    var color: js.UndefOr[Color3] = js.undefined
  }
  object PlaneRotationGizmoOptions {
    
    inline def apply(): PlaneRotationGizmoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneRotationGizmoOptions]
    }
    
    extension [Self <: PlaneRotationGizmoOptions](x: Self) {
      
      inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait RotationGizmoOptions extends StObject {
    
    /**
      * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
      */
    var updateScale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specific options for xGizmo
      */
    var xOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
    
    /**
      * Specific options for yGizmo
      */
    var yOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
    
    /**
      * Specific options for zGizmo
      */
    var zOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
  }
  object RotationGizmoOptions {
    
    inline def apply(): RotationGizmoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotationGizmoOptions]
    }
    
    extension [Self <: RotationGizmoOptions](x: Self) {
      
      inline def setUpdateScale(value: Boolean): Self = StObject.set(x, "updateScale", value.asInstanceOf[js.Any])
      
      inline def setUpdateScaleUndefined: Self = StObject.set(x, "updateScale", js.undefined)
      
      inline def setXOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "xOptions", value.asInstanceOf[js.Any])
      
      inline def setXOptionsUndefined: Self = StObject.set(x, "xOptions", js.undefined)
      
      inline def setYOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "yOptions", value.asInstanceOf[js.Any])
      
      inline def setYOptionsUndefined: Self = StObject.set(x, "yOptions", js.undefined)
      
      inline def setZOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "zOptions", value.asInstanceOf[js.Any])
      
      inline def setZOptionsUndefined: Self = StObject.set(x, "zOptions", js.undefined)
    }
  }
}
