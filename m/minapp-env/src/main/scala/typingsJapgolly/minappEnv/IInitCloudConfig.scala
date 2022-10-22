package typingsJapgolly.minappEnv

import typingsJapgolly.minappEnv.anon.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitCloudConfig extends StObject {
  
  var env: js.UndefOr[java.lang.String | Database] = js.undefined
  
  var traceUser: js.UndefOr[scala.Boolean] = js.undefined
}
object IInitCloudConfig {
  
  inline def apply(): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitCloudConfig]
  }
  
  extension [Self <: IInitCloudConfig](x: Self) {
    
    inline def setEnv(value: java.lang.String | Database): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setTraceUser(value: scala.Boolean): Self = StObject.set(x, "traceUser", value.asInstanceOf[js.Any])
    
    inline def setTraceUserUndefined: Self = StObject.set(x, "traceUser", js.undefined)
  }
}
