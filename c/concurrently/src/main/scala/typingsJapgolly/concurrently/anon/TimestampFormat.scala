package typingsJapgolly.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampFormat extends StObject {
  
  var logger: js.UndefOr[typingsJapgolly.concurrently.distSrcLoggerMod.Logger] = js.undefined
  
  var timestampFormat: js.UndefOr[String] = js.undefined
}
object TimestampFormat {
  
  inline def apply(): TimestampFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampFormat]
  }
  
  extension [Self <: TimestampFormat](x: Self) {
    
    inline def setLogger(value: typingsJapgolly.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
  }
}
