package typingsJapgolly.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var self: String
}
object Self {
  
  inline def apply(self: String): Self = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Self]
  }
  
  extension [Self_ <: Self](x: Self_) {
    
    inline def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
