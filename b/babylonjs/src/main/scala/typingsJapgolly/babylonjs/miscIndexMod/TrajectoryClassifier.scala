package typingsJapgolly.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "TrajectoryClassifier")
@js.native
/* private */ open class TrajectoryClassifier ()
  extends typingsJapgolly.babylonjs.miscTrajectoryClassifierMod.TrajectoryClassifier
/* static members */
object TrajectoryClassifier {
  
  @JSImport("babylonjs/Misc/index", "TrajectoryClassifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Deserialize from JSON.
    * @param json JSON serialization
    * @returns deserialized TrajectorySet
    */
  inline def Deserialize(json: String): typingsJapgolly.babylonjs.miscTrajectoryClassifierMod.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Deserialize")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.miscTrajectoryClassifierMod.TrajectoryClassifier]
  
  /**
    * Initialize a new empty TrajectorySet with auto-generated Alphabets.
    * VERY naive, need to be generating these things from known
    * sets. Better version later, probably eliminating this one.
    * @returns auto-generated TrajectorySet
    */
  inline def Generate(): typingsJapgolly.babylonjs.miscTrajectoryClassifierMod.TrajectoryClassifier = ^.asInstanceOf[js.Dynamic].applyDynamic("Generate")().asInstanceOf[typingsJapgolly.babylonjs.miscTrajectoryClassifierMod.TrajectoryClassifier]
}
