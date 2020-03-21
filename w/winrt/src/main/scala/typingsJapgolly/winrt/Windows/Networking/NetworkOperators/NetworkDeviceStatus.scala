package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  @js.native
  sealed trait accountNotActivated extends NetworkDeviceStatus
  
  @js.native
  sealed trait badSim extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceBlocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceHardwareFailure extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceLocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceNotReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait simNotInserted extends NetworkDeviceStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkDeviceStatus with Double] = js.native
  /* 5 */ @js.native
  object accountNotActivated extends TopLevel[accountNotActivated with Double]
  
  /* 3 */ @js.native
  object badSim extends TopLevel[badSim with Double]
  
  /* 7 */ @js.native
  object deviceBlocked extends TopLevel[deviceBlocked with Double]
  
  /* 4 */ @js.native
  object deviceHardwareFailure extends TopLevel[deviceHardwareFailure with Double]
  
  /* 6 */ @js.native
  object deviceLocked extends TopLevel[deviceLocked with Double]
  
  /* 0 */ @js.native
  object deviceNotReady extends TopLevel[deviceNotReady with Double]
  
  /* 1 */ @js.native
  object deviceReady extends TopLevel[deviceReady with Double]
  
  /* 2 */ @js.native
  object simNotInserted extends TopLevel[simNotInserted with Double]
  
}

