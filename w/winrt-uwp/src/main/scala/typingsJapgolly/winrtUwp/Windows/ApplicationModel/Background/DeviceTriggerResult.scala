package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceTriggerResult extends js.Object

/** Indicates whether the device background task operation was allowed or denied, and if it was denied specifies the reason. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceTriggerResult")
@js.native
object DeviceTriggerResult extends js.Object {
  /** The device background task was triggered. */
  @js.native
  sealed trait allowed extends DeviceTriggerResult
  
  /** The device background task was denied due to system policy. */
  @js.native
  sealed trait deniedBySystem extends DeviceTriggerResult
  
  /** The device background task was denied by the user. */
  @js.native
  sealed trait deniedByUser extends DeviceTriggerResult
  
  /** The device background task cannot run because the battery is low. */
  @js.native
  sealed trait lowBattery extends DeviceTriggerResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceTriggerResult with Double] = js.native
  /* 0 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 2 */ @js.native
  object deniedBySystem extends TopLevel[deniedBySystem with Double]
  
  /* 1 */ @js.native
  object deniedByUser extends TopLevel[deniedByUser with Double]
  
  /* 3 */ @js.native
  object lowBattery extends TopLevel[lowBattery with Double]
  
}

