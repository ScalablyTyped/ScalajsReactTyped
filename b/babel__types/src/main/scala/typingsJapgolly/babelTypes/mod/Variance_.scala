package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Variance
import typingsJapgolly.babelTypes.babelTypesStrings.minus
import typingsJapgolly.babelTypes.babelTypesStrings.plus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait Variance_
  extends StObject
     with BaseNode
     with Flow {
  
  var kind: minus | plus
  
  @JSName("type")
  var type_Variance_ : Variance
}
object Variance_ {
  
  inline def apply(kind: minus | plus): Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[Variance_]
  }
  
  extension [Self <: Variance_](x: Self) {
    
    inline def setKind(value: minus | plus): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
