package typingsJapgolly.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeModel extends StObject {
  
  var typeKind: TypeKind
}
object TypeModel {
  
  inline def apply(typeKind: TypeKind): TypeModel = {
    val __obj = js.Dynamic.literal(typeKind = typeKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeModel]
  }
  
  extension [Self <: TypeModel](x: Self) {
    
    inline def setTypeKind(value: TypeKind): Self = StObject.set(x, "typeKind", value.asInstanceOf[js.Any])
  }
}
