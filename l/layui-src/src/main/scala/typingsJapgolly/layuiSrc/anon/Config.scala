package typingsJapgolly.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.Object
  
  var time: Double
}
object Config {
  
  inline def apply(config: js.Object, time: Double): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
