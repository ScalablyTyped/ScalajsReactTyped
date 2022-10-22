package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLoggingStatus extends StObject {
  
  var LoggingEnabled: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.LoggingEnabled] = js.undefined
}
object BucketLoggingStatus {
  
  inline def apply(): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLoggingStatus]
  }
  
  extension [Self <: BucketLoggingStatus](x: Self) {
    
    inline def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
  }
}
