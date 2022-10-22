package typingsJapgolly.babelTypes.anon

import typingsJapgolly.babelTypes.libMod.Expression
import typingsJapgolly.babelTypes.libMod.Identifier_
import typingsJapgolly.babelTypes.libMod.PrivateName_
import typingsJapgolly.babelTypes.libMod.Super_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@babel/types.@babel/types/lib.MemberExpression, 'object' | 'property'> */
trait PickMemberExpressionobjecObject extends StObject {
  
  var `object`: Expression | Super_
  
  var property: Expression | Identifier_ | PrivateName_
}
object PickMemberExpressionobjecObject {
  
  inline def apply(`object`: Expression | Super_, property: Expression | Identifier_ | PrivateName_): PickMemberExpressionobjecObject = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjecObject]
  }
  
  extension [Self <: PickMemberExpressionobjecObject](x: Self) {
    
    inline def setObject(value: Expression | Super_): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
