package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var `object`: Expression
  
  var property: Identifier | PrivateName | ComputedPropName
  
  @JSName("type")
  var type_MemberExpression: typingsJapgolly.swcCore.swcCoreStrings.MemberExpression
}
object MemberExpression {
  
  inline def apply(`object`: Expression, property: Identifier | PrivateName | ComputedPropName, span: Span): MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression]
  }
  
  extension [Self <: MemberExpression](x: Self) {
    
    inline def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Identifier | PrivateName | ComputedPropName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
