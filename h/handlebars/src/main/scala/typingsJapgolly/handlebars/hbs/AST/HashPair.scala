package typingsJapgolly.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashPair
  extends StObject
     with Node {
  
  var key: String
  
  @JSName("type")
  var type_HashPair: typingsJapgolly.handlebars.handlebarsStrings.HashPair
  
  var value: Expression
}
object HashPair {
  
  inline def apply(key: String, loc: SourceLocation, value: Expression): HashPair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HashPair")
    __obj.asInstanceOf[HashPair]
  }
  
  extension [Self <: HashPair](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.handlebars.handlebarsStrings.HashPair): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
