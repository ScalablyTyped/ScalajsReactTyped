package typingsJapgolly.mongodb.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.mongodb.mod.AutoEncryptionLoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /** An optional hook to catch logging messages from the underlying encryption engine */
  var logger: js.UndefOr[js.Function2[/* level */ AutoEncryptionLoggerLevel, /* message */ String, Unit]] = js.undefined
}
object Logger {
  
  inline def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogger(value: (/* level */ AutoEncryptionLoggerLevel, /* message */ String) => Callback): Self = StObject.set(x, "logger", js.Any.fromFunction2((t0: /* level */ AutoEncryptionLoggerLevel, t1: /* message */ String) => (value(t0, t1)).runNow()))
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
