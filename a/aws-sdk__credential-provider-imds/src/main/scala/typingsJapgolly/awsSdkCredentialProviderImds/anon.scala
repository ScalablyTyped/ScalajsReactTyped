package typingsJapgolly.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLogger(value: typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
