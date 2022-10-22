package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PivotTools")
@js.native
open class PivotTools ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PivotTools
/* static members */
object PivotTools {
  
  @JSGlobal("BABYLON.PivotTools")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PivotTools._OldPivotPoint")
  @js.native
  def _OldPivotPoint: Any = js.native
  inline def _OldPivotPoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OldPivotPoint")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotCached")
  @js.native
  def _PivotCached: Any = js.native
  inline def _PivotCached_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotCached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotPostMultiplyPivotMatrix")
  @js.native
  def _PivotPostMultiplyPivotMatrix: Any = js.native
  inline def _PivotPostMultiplyPivotMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotPostMultiplyPivotMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotTmpVector")
  @js.native
  def _PivotTmpVector: Any = js.native
  inline def _PivotTmpVector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTmpVector")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PivotTools._PivotTranslation")
  @js.native
  def _PivotTranslation: Any = js.native
  inline def _PivotTranslation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PivotTranslation")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _RemoveAndStorePivotPoint(mesh: typingsJapgolly.babylonjs.BABYLON.TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RemoveAndStorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _RestorePivotPoint(mesh: typingsJapgolly.babylonjs.BABYLON.TransformNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RestorePivotPoint")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
