package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class Gizmo ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer) = this()
}
/* static members */
object Gizmo {
  
  @JSImport("babylonjs", "Gizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  inline def GizmoAxisPointerObserver(
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    gizmoAxisCache: Map[Mesh, GizmoAxisCache]
  ): typingsJapgolly.babylonjs.miscObservableMod.Observer[typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.miscObservableMod.Observer[typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo]]
  
  /**
    * When enabled, any gizmo operation will perserve scaling sign. Default is off.
    * Only valid for TransformNode derived classes (Mesh, AbstractMesh, ...)
    */
  @JSImport("babylonjs", "Gizmo.PreserveScaling")
  @js.native
  def PreserveScaling: Boolean = js.native
  inline def PreserveScaling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreserveScaling")(x.asInstanceOf[js.Any])
}
