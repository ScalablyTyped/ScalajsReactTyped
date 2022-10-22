package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of the request to trigger a background task. The RequestAsync method returns a value of this enumeration type. */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerResult")
@js.native
object ApplicationTriggerResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult & Double
  ] = js.native
  
  /* 0 */ val allowed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.allowed & Double = js.native
  
  /* 1 */ val currentlyRunning: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.currentlyRunning & Double = js.native
  
  /* 2 */ val disabledByPolicy: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.disabledByPolicy & Double = js.native
  
  /* 3 */ val unknownError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.unknownError & Double = js.native
}
