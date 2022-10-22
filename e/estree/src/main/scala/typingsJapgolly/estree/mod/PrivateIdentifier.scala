package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateIdentifier
  extends StObject
     with BaseNode {
  
  var name: String
  
  @JSName("type")
  var type_PrivateIdentifier: typingsJapgolly.estree.estreeStrings.PrivateIdentifier
}
object PrivateIdentifier {
  
  inline def apply(name: String): PrivateIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateIdentifier")
    __obj.asInstanceOf[PrivateIdentifier]
  }
  
  extension [Self <: PrivateIdentifier](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.PrivateIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
