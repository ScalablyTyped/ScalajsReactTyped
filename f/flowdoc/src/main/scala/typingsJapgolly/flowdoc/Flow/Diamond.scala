package typingsJapgolly.flowdoc.Flow

import typingsJapgolly.flowdoc.Shape
import typingsJapgolly.flowdoc.flowdocStrings.DIAMOND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diamond
  extends StObject
     with Shape {
  
  @JSName("type")
  var type_Diamond: DIAMOND
}
object Diamond {
  
  inline def apply(id: String, name: String, position: Point, size: Size): Diamond = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DIAMOND")
    __obj.asInstanceOf[Diamond]
  }
  
  extension [Self <: Diamond](x: Self) {
    
    inline def setType(value: DIAMOND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
