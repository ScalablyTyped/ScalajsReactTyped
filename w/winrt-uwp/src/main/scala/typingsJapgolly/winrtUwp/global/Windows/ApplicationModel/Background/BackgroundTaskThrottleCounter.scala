package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the type of throttle count to check for in a GetThrottleCount request. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter")
@js.native
object BackgroundTaskThrottleCounter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter & Double
  ] = js.native
  
  /* 0 */ val all: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.all & Double = js.native
  
  /* 1 */ val cpu: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.cpu & Double = js.native
  
  /* 2 */ val network: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskThrottleCounter.network & Double = js.native
}
