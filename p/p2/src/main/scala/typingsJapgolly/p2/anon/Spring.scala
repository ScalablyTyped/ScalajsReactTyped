package typingsJapgolly.p2.anon

import typingsJapgolly.p2.p2Strings.addSpring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spring extends StObject {
  
  var spring: typingsJapgolly.p2.mod.Spring
  
  var `type`: addSpring
}
object Spring {
  
  inline def apply(spring: typingsJapgolly.p2.mod.Spring): Spring = {
    val __obj = js.Dynamic.literal(spring = spring.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("addSpring")
    __obj.asInstanceOf[Spring]
  }
  
  extension [Self <: Spring](x: Self) {
    
    inline def setSpring(value: typingsJapgolly.p2.mod.Spring): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
    
    inline def setType(value: addSpring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
