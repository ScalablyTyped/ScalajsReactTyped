package typingsJapgolly.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringMessageTag extends StObject {
  
  var message: String
  
  var tag: Double
}
object StringMessageTag {
  
  inline def apply(message: String, tag: Double): StringMessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringMessageTag]
  }
  
  extension [Self <: StringMessageTag](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
