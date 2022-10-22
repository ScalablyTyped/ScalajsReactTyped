package typingsJapgolly.pulumiPulumi.automationStackMod

import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.always
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.auto
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.never
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalOpts extends StObject {
  
  /** Colorize output. */
  var color: js.UndefOr[always | never | raw | auto] = js.undefined
  
  /** Print detailed debugging output during resource operations */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** Flow log settings to child processes (like plugins) */
  var logFlow: js.UndefOr[Boolean] = js.undefined
  
  /** Log to stderr instead of to files */
  var logToStdErr: js.UndefOr[Boolean] = js.undefined
  
  /** Enable verbose logging (e.g., v=3); anything >3 is very verbose */
  var logVerbosity: js.UndefOr[Double] = js.undefined
  
  /** Emit tracing to the specified endpoint. Use the file: scheme to write tracing data to a local file */
  var tracing: js.UndefOr[String] = js.undefined
}
object GlobalOpts {
  
  inline def apply(): GlobalOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOpts]
  }
  
  extension [Self <: GlobalOpts](x: Self) {
    
    inline def setColor(value: always | never | raw | auto): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setLogFlow(value: Boolean): Self = StObject.set(x, "logFlow", value.asInstanceOf[js.Any])
    
    inline def setLogFlowUndefined: Self = StObject.set(x, "logFlow", js.undefined)
    
    inline def setLogToStdErr(value: Boolean): Self = StObject.set(x, "logToStdErr", value.asInstanceOf[js.Any])
    
    inline def setLogToStdErrUndefined: Self = StObject.set(x, "logToStdErr", js.undefined)
    
    inline def setLogVerbosity(value: Double): Self = StObject.set(x, "logVerbosity", value.asInstanceOf[js.Any])
    
    inline def setLogVerbosityUndefined: Self = StObject.set(x, "logVerbosity", js.undefined)
    
    inline def setTracing(value: String): Self = StObject.set(x, "tracing", value.asInstanceOf[js.Any])
    
    inline def setTracingUndefined: Self = StObject.set(x, "tracing", js.undefined)
  }
}
