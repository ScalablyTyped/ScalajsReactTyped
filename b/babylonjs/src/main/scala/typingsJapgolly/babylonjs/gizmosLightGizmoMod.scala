package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo
import typingsJapgolly.babylonjs.gizmosGizmoMod.Gizmo
import typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo
import typingsJapgolly.babylonjs.lightsLightMod.Light
import typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.nodeMod.Node
import typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosLightGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.babylonjs.sceneMod.IDisposable because Already inherited
  - typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typingsJapgolly.babylonjs.gizmosLightGizmoMod.ILightGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined onClickedObservable, light, material */ @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo")
  @js.native
  /**
    * Creates a LightGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class LightGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    /* protected */ var _attachedMeshParent: TransformNode = js.native
    
    /* protected */ var _cachedForward: Vector3 = js.native
    
    /* protected */ var _cachedPosition: Vector3 = js.native
    
    /* protected */ var _light: Nullable[Light] = js.native
    
    /* protected */ var _lightMesh: Mesh = js.native
    
    /* protected */ var _material: StandardMaterial = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /**
      * Override attachedNode because lightgizmo only support attached mesh
      * It will return the attached mesh (if any) and setting an attached node will log
      * a warning
      */
    @JSName("attachedNode")
    def attachedNode_MLightGizmo: Nullable[Node] = js.native
    
    def light: Nullable[Light] = js.native
    /**
      * The light that the gizmo is attached to
      */
    def light_=(light: Nullable[Light]): Unit = js.native
    /** The light that the gizmo is attached to */
    @JSName("light")
    var light_FLightGizmo: Nullable[Light] = js.native
    
    /**
      * Gets the material used to render the light gizmo
      */
    def material: StandardMaterial = js.native
    /** The material used to render the light gizmo */
    @JSName("material")
    val material_FLightGizmo: StandardMaterial = js.native
    
    /**
      * Event that fires each time the gizmo is clicked
      */
    var onClickedObservable: Observable[Light] = js.native
  }
  /* static members */
  object LightGizmo {
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateDirectionalLightMesh")
    @js.native
    def _CreateDirectionalLightMesh: Any = js.native
    inline def _CreateDirectionalLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDirectionalLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateHemisphericLightMesh")
    @js.native
    def _CreateHemisphericLightMesh: Any = js.native
    inline def _CreateHemisphericLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateHemisphericLightMesh")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the lines for a light mesh
      * @param levels
      * @param scene
      */
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateLightLines")
    @js.native
    def _CreateLightLines: Any = js.native
    inline def _CreateLightLines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateLightLines")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreatePointLightMesh")
    @js.native
    def _CreatePointLightMesh: Any = js.native
    inline def _CreatePointLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateSpotLightMesh")
    @js.native
    def _CreateSpotLightMesh: Any = js.native
    inline def _CreateSpotLightMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateSpotLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._Scale")
    @js.native
    def _Scale: Any = js.native
    inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
  
  trait ILightGizmo
    extends StObject
       with IGizmo {
    
    /** The light that the gizmo is attached to */
    var light: Nullable[Light]
    
    /** The material used to render the light gizmo */
    val material: StandardMaterial
    
    /** Event that fires each time the gizmo is clicked */
    var onClickedObservable: Observable[Light]
  }
  object ILightGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      dispose: Callback,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      material: StandardMaterial,
      onClickedObservable: Observable[Light],
      scaleRatio: Double,
      setCustomMesh: Mesh => Callback,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): ILightGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = dispose.toJsFn, gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], onClickedObservable = onClickedObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1((t0: Mesh) => setCustomMesh(t0).runNow()), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null, light = null)
      __obj.asInstanceOf[ILightGizmo]
    }
    
    extension [Self <: ILightGizmo](x: Self) {
      
      inline def setLight(value: Nullable[Light]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightNull: Self = StObject.set(x, "light", null)
      
      inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setOnClickedObservable(value: Observable[Light]): Self = StObject.set(x, "onClickedObservable", value.asInstanceOf[js.Any])
    }
  }
}
