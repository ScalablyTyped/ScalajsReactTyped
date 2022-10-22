package typingsJapgolly.baiduApp.swan

import typingsJapgolly.baiduApp.anon.Swanid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwanIdTask extends StObject {
  
  var data: Swanid
  
  var errno: String
}
object SwanIdTask {
  
  inline def apply(data: Swanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwanIdTask]
  }
  
  extension [Self <: SwanIdTask](x: Self) {
    
    inline def setData(value: Swanid): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrno(value: String): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
  }
}
