package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a maintenance trigger. */
@JSGlobal("Windows.ApplicationModel.Background.MaintenanceTrigger")
@js.native
open class MaintenanceTrigger protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.MaintenanceTrigger {
  /**
    * Initializes a new instance of a maintenance trigger.
    * @param freshnessTime The number of minutes to wait before scheduling the background task. The system schedules the task within 15 minutes after freshnessTime elapses.
    * @param oneShot True if the maintenance trigger is used once; false if it is used each time the freshnessTime interval elapses.
    */
  def this(freshnessTime: Double, oneShot: Boolean) = this()
  
  /** Gets the interval of a maintenance trigger. */
  /* CompleteClass */
  var freshnessTime: Double = js.native
  
  /** Gets whether the maintenance trigger is used only once or each time the FreshnessTime interval elapses. */
  /* CompleteClass */
  var oneShot: Boolean = js.native
}
