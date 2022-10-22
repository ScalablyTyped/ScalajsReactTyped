package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.grammarkdown.mod.OneOfList
import typingsJapgolly.grammarkdown.mod.RightHandSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Production extends StObject {
  
  var production: typingsJapgolly.grammarkdown.mod.Production
  
  var rhses: js.Array[RightHandSide | OneOfList]
}
object Production {
  
  inline def apply(
    production: typingsJapgolly.grammarkdown.mod.Production,
    rhses: js.Array[RightHandSide | OneOfList]
  ): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  
  extension [Self <: Production](x: Self) {
    
    inline def setProduction(value: typingsJapgolly.grammarkdown.mod.Production): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setRhses(value: js.Array[RightHandSide | OneOfList]): Self = StObject.set(x, "rhses", value.asInstanceOf[js.Any])
    
    inline def setRhsesVarargs(value: (RightHandSide | OneOfList)*): Self = StObject.set(x, "rhses", js.Array(value*))
  }
}
