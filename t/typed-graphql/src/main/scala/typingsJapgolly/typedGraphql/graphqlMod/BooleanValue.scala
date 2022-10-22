package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanValue
  extends StObject
     with Node
     with Value {
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var value: Boolean
}
object BooleanValue {
  
  inline def apply(kind: String, value: Boolean): BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanValue]
  }
  
  extension [Self <: BooleanValue](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
