package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.idle.IdleState
import typingsJapgolly.chrome.chrome.idle.IdleStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
object idle {
  
  @JSGlobal("chrome.idle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoLockDelay")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.idle.onStateChanged")
  @js.native
  def onStateChanged: IdleStateChangedEvent = js.native
  inline def onStateChanged_=(x: IdleStateChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(x.asInstanceOf[js.Any])
  
  inline def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("queryState")(detectionIntervalInSeconds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDetectionInterval(intervalInSeconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDetectionInterval")(intervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
