package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.Identifier_
  - typingsJapgolly.babelTypes.mod.MemberExpression_
  - typingsJapgolly.babelTypes.mod.RestElement_
  - typingsJapgolly.babelTypes.mod.AssignmentPattern_
  - typingsJapgolly.babelTypes.mod.ArrayPattern_
  - typingsJapgolly.babelTypes.mod.ObjectPattern_
  - typingsJapgolly.babelTypes.mod.TSParameterProperty
*/
trait LVal extends StObject
object LVal {
  
  inline def ArrayPattern_(elements: js.Array[Expression], end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(end: Double, left: Identifier_, loc: SourceLocation, right: Expression, start: Double): typingsJapgolly.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AssignmentPattern_]
  }
  
  inline def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double): typingsJapgolly.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Identifier_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double
  ): typingsJapgolly.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MemberExpression_]
  }
  
  inline def ObjectPattern_(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double
  ): typingsJapgolly.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.RestElement_]
  }
  
  inline def TSParameterProperty(end: Double, loc: SourceLocation, parameter: Identifier_ | AssignmentPattern_, start: Double): typingsJapgolly.babelTypes.mod.TSParameterProperty = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], accessibility = null, readonly = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSParameterProperty]
  }
}
