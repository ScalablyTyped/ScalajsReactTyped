package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.GPU
import typingsJapgolly.electron.electronStrings.Unknown
import typingsJapgolly.electron.electronStrings.Utility
import typingsJapgolly.electron.electronStrings.Zygote
import typingsJapgolly.electron.electronStrings.`Pepper Plugin Broker`
import typingsJapgolly.electron.electronStrings.`Pepper Plugin`
import typingsJapgolly.electron.electronStrings.`Sandbox helper`
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

trait Details extends StObject {
  
  /**
    * The exit code for the process (e.g. status from waitpid if on posix, from
    * GetExitCodeProcess on Windows).
    */
  var exitCode: Double
  
  /**
    * The name of the process. Examples for utility: `Audio Service`, `Content
    * Decryption Module Service`, `Network Service`, `Video Capture`, etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The reason the child process is gone. Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
  
  /**
    * The non-localized name of the process.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Process type. One of the following values:
    */
  var `type`: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
}
object Details {
  
  inline def apply(
    exitCode: Double,
    reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`,
    `type`: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
  ): Details = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  extension [Self <: Details](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setType(
      value: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
