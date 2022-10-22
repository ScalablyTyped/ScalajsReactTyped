package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "OutlineRenderer")
@js.native
open class OutlineRenderer protected ()
  extends typingsJapgolly.babylonjs.indexMod.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object OutlineRenderer {
  
  @JSImport("babylonjs/Legacy/legacy", "OutlineRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  @JSImport("babylonjs/Legacy/legacy", "OutlineRenderer._StencilReference")
  @js.native
  def _StencilReference: Any = js.native
  inline def _StencilReference_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StencilReference")(x.asInstanceOf[js.Any])
}
