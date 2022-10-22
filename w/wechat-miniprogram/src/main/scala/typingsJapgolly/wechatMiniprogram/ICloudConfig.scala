package typingsJapgolly.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudConfig extends StObject {
  
  var env: js.UndefOr[String] = js.undefined
  
  var traceUser: js.UndefOr[Boolean] = js.undefined
}
object ICloudConfig {
  
  inline def apply(): ICloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICloudConfig]
  }
  
  extension [Self <: ICloudConfig](x: Self) {
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setTraceUser(value: Boolean): Self = StObject.set(x, "traceUser", value.asInstanceOf[js.Any])
    
    inline def setTraceUserUndefined: Self = StObject.set(x, "traceUser", js.undefined)
  }
}
