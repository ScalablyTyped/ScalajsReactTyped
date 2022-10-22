package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager")
@js.native
open class AbstractActionManager ()
  extends typingsJapgolly.babylonjs.indexMod.AbstractActionManager
/* static members */
object AbstractActionManager {
  
  @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Does exist one action manager that handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @returns a boolean indicating whether the trigger is handled by at least one action manager
    **/
  inline def HasSpecificTrigger(trigger: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasSpecificTrigger")(trigger.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Gets the list of active triggers */
  @JSImport("babylonjs/Legacy/legacy", "AbstractActionManager.Triggers")
  @js.native
  def Triggers: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  inline def Triggers_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
}
