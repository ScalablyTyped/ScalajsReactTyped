package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.nightwatchStrings.ALL
import typingsJapgolly.nightwatch.nightwatchStrings.DEBUG
import typingsJapgolly.nightwatch.nightwatchStrings.FINE
import typingsJapgolly.nightwatch.nightwatchStrings.FINER
import typingsJapgolly.nightwatch.nightwatchStrings.FINEST
import typingsJapgolly.nightwatch.nightwatchStrings.INFO
import typingsJapgolly.nightwatch.nightwatchStrings.OFF
import typingsJapgolly.nightwatch.nightwatchStrings.SEVERE
import typingsJapgolly.nightwatch.nightwatchStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchLogEntry extends StObject {
  
  /**
    * Severity level
    */
  var level: ALL | DEBUG | FINE | FINER | FINEST | INFO | OFF | SEVERE | WARNING | Level | Double
  
  /**
    * The log entry message.
    */
  var message: String
  
  /**
    * The time stamp of log entry in seconds.
    */
  var opt_timestamp: Double
  
  /**
    * The log type, if known.
    */
  var opt_type: js.UndefOr[String] = js.undefined
}
object NightwatchLogEntry {
  
  inline def apply(
    level: ALL | DEBUG | FINE | FINER | FINEST | INFO | OFF | SEVERE | WARNING | Level | Double,
    message: String,
    opt_timestamp: Double
  ): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], opt_timestamp = opt_timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLogEntry]
  }
  
  extension [Self <: NightwatchLogEntry](x: Self) {
    
    inline def setLevel(value: ALL | DEBUG | FINE | FINER | FINEST | INFO | OFF | SEVERE | WARNING | Level | Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpt_timestamp(value: Double): Self = StObject.set(x, "opt_timestamp", value.asInstanceOf[js.Any])
    
    inline def setOpt_type(value: String): Self = StObject.set(x, "opt_type", value.asInstanceOf[js.Any])
    
    inline def setOpt_typeUndefined: Self = StObject.set(x, "opt_type", js.undefined)
  }
}
