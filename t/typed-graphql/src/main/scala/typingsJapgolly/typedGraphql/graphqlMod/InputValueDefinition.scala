package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValueDefinition
  extends StObject
     with Node {
  
  var defaultValue: js.UndefOr[Value] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
  
  var `type`: Type
}
object InputValueDefinition {
  
  inline def apply(kind: String, name: Name, `type`: Type): InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValueDefinition]
  }
  
  extension [Self <: InputValueDefinition](x: Self) {
    
    inline def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
