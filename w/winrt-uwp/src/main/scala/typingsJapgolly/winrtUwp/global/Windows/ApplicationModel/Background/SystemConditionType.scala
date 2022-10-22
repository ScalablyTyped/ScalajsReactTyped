package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a system condition that must be in effect for a background task to run. If a background task with a system condition is triggered, the task will not run until the condition is met. */
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType & Double
  ] = js.native
  
  /* 8 */ val backgroundWorkCostNotHigh: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.backgroundWorkCostNotHigh & Double = js.native
  
  /* 7 */ val freeNetworkAvailable: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.freeNetworkAvailable & Double = js.native
  
  /* 3 */ val internetAvailable: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable & Double = js.native
  
  /* 4 */ val internetNotAvailable: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable & Double = js.native
  
  /* 0 */ val invalid: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.invalid & Double = js.native
  
  /* 5 */ val sessionConnected: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected & Double = js.native
  
  /* 6 */ val sessionDisconnected: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected & Double = js.native
  
  /* 2 */ val userNotPresent: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent & Double = js.native
  
  /* 1 */ val userPresent: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.userPresent & Double = js.native
}
