package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the result of a call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTriggerResult")
@js.native
object MediaProcessingTriggerResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult & Double
  ] = js.native
  
  /* 0 */ val allowed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.allowed & Double = js.native
  
  /* 1 */ val currentlyRunning: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.currentlyRunning & Double = js.native
  
  /* 2 */ val disabledByPolicy: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.disabledByPolicy & Double = js.native
  
  /* 3 */ val unknownError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.unknownError & Double = js.native
}
