package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.miscInterfacesIClipPlanesHolderMod.IClipPlanesHolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ThinMaterialHelper")
@js.native
open class ThinMaterialHelper ()
  extends typingsJapgolly.babylonjs.indexMod.ThinMaterialHelper
/* static members */
object ThinMaterialHelper {
  
  @JSImport("babylonjs/Legacy/legacy", "ThinMaterialHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Binds the clip plane information from the holder to the effect.
    * @param effect The effect we are binding the data to
    * @param holder The entity containing the clip plane information
    */
  inline def BindClipPlane(effect: typingsJapgolly.babylonjs.materialsEffectMod.Effect, holder: IClipPlanesHolder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindClipPlane")(effect.asInstanceOf[js.Any], holder.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
