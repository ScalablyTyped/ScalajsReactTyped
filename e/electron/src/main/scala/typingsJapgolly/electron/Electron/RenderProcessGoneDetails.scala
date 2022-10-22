package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`abnormal-exit`
import typingsJapgolly.electron.electronStrings.`clean-exit`
import typingsJapgolly.electron.electronStrings.`integrity-failure`
import typingsJapgolly.electron.electronStrings.`launch-failed`
import typingsJapgolly.electron.electronStrings.crashed
import typingsJapgolly.electron.electronStrings.killed
import typingsJapgolly.electron.electronStrings.oom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProcessGoneDetails extends StObject {
  
  /**
    * The exit code of the process, unless `reason` is `launch-failed`, in which case
    * `exitCode` will be a platform-specific launch failure error code.
    */
  var exitCode: Double
  
  /**
    * The reason the render process is gone.  Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
}
object RenderProcessGoneDetails {
  
  inline def apply(
    exitCode: Double,
    reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
  ): RenderProcessGoneDetails = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProcessGoneDetails]
  }
  
  extension [Self <: RenderProcessGoneDetails](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
