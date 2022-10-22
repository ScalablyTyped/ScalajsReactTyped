package typingsJapgolly.physijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "VehicleTuning")
@js.native
open class VehicleTuning protected () extends StObject {
  def this(
    suspension_stiffness: js.UndefOr[Double],
    suspension_compression: js.UndefOr[Double],
    suspension_damping: js.UndefOr[Double],
    max_suspension_travel: js.UndefOr[Double],
    friction_slip: js.UndefOr[Double],
    max_suspension_force: js.UndefOr[Double]
  ) = this()
  
  var friction_slip: Double = js.native
  
  var max_suspension_force: Double = js.native
  
  var max_suspension_travel: Double = js.native
  
  var suspension_compression: Double = js.native
  
  var suspension_damping: Double = js.native
  
  var suspension_stiffness: Double = js.native
}
