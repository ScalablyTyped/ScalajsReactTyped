package typingsJapgolly.phantomjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phantomjs.anon.Architecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait System extends StObject {
  
  var args: js.Array[String]
  
  var env: StringDictionary[String]
  
  var os: Architecture
  
  var pid: Double
  
  var platform: String
}
object System {
  
  inline def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: Architecture,
    pid: Double,
    platform: String
  ): System = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  
  extension [Self <: System](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Architecture): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
