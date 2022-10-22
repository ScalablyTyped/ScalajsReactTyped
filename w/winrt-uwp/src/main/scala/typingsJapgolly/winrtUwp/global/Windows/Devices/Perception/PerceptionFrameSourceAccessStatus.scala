package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the access status an app is allowed for a particular type of frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourceAccessStatus")
@js.native
object PerceptionFrameSourceAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus & Double
  ] = js.native
  
  /* 1 */ val allowed: typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.allowed & Double = js.native
  
  /* 3 */ val deniedBySystem: typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.deniedBySystem & Double = js.native
  
  /* 2 */ val deniedByUser: typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.deniedByUser & Double = js.native
  
  /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.unspecified & Double = js.native
}
