package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus & Double
  ] = js.native
  
  /* 1 */ val allowedWithWakeupCapability: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithWakeupCapability & Double = js.native
  
  /* 2 */ val allowedWithoutWakeupCapability: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithoutWakeupCapability & Double = js.native
  
  /* 3 */ val denied: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.denied & Double = js.native
  
  /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.unspecified & Double = js.native
}
