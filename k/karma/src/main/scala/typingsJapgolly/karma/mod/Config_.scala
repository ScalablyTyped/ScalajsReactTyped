package typingsJapgolly.karma.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config_ extends StObject {
  
  var LOG_DEBUG: String
  
  var LOG_DISABLE: String
  
  var LOG_ERROR: String
  
  var LOG_INFO: String
  
  var LOG_WARN: String
  
  def set(config: ConfigOptions): Unit
}
object Config_ {
  
  inline def apply(
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_WARN: String,
    set: ConfigOptions => Callback
  ): Config_ = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: ConfigOptions) => set(t0).runNow()))
    __obj.asInstanceOf[Config_]
  }
  
  extension [Self <: Config_](x: Self) {
    
    inline def setLOG_DEBUG(value: String): Self = StObject.set(x, "LOG_DEBUG", value.asInstanceOf[js.Any])
    
    inline def setLOG_DISABLE(value: String): Self = StObject.set(x, "LOG_DISABLE", value.asInstanceOf[js.Any])
    
    inline def setLOG_ERROR(value: String): Self = StObject.set(x, "LOG_ERROR", value.asInstanceOf[js.Any])
    
    inline def setLOG_INFO(value: String): Self = StObject.set(x, "LOG_INFO", value.asInstanceOf[js.Any])
    
    inline def setLOG_WARN(value: String): Self = StObject.set(x, "LOG_WARN", value.asInstanceOf[js.Any])
    
    inline def setSet(value: ConfigOptions => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: ConfigOptions) => value(t0).runNow()))
  }
}
