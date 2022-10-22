package typingsJapgolly.p2.anon

import typingsJapgolly.p2.p2Strings.removeBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyType extends StObject {
  
  var body: typingsJapgolly.p2.mod.Body
  
  var `type`: removeBody
}
object BodyType {
  
  inline def apply(body: typingsJapgolly.p2.mod.Body): BodyType = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("removeBody")
    __obj.asInstanceOf[BodyType]
  }
  
  extension [Self <: BodyType](x: Self) {
    
    inline def setBody(value: typingsJapgolly.p2.mod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: removeBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
