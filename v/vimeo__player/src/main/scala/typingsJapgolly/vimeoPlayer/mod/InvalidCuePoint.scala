package typingsJapgolly.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidCuePoint
  extends StObject
     with Error {
  
  @JSName("name")
  var name_InvalidCuePoint: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint
}
object InvalidCuePoint {
  
  inline def apply(message: String, method: String): InvalidCuePoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "InvalidCuePoint")
    __obj.asInstanceOf[InvalidCuePoint]
  }
  
  extension [Self <: InvalidCuePoint](x: Self) {
    
    inline def setName(value: typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
