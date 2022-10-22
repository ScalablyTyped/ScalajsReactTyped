package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRWalkingLocomotionMod.IWebXRWalkingLocomotionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRWalkingLocomotion")
@js.native
open class WebXRWalkingLocomotion protected ()
  extends typingsJapgolly.babylonjs.xRIndexMod.WebXRWalkingLocomotion {
  /**
    * Construct a new Walking Locomotion feature.
    * @param sessionManager manager for the current XR session
    * @param options creation options, prominently including the vector target for locomotion
    */
  def this(
    sessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    options: IWebXRWalkingLocomotionOptions
  ) = this()
}
