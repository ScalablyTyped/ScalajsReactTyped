package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.Identifier
  - typingsJapgolly.estree.mod.ObjectPattern
  - typingsJapgolly.estree.mod.ArrayPattern
  - typingsJapgolly.estree.mod.RestElement
  - typingsJapgolly.estree.mod.AssignmentPattern
  - typingsJapgolly.estree.mod.MemberExpression
*/
trait Pattern extends StObject
object Pattern {
  
  inline def ArrayPattern(elements: js.Array[Pattern | Null]): typingsJapgolly.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ArrayPattern]
  }
  
  inline def AssignmentPattern(left: Pattern, right: Expression): typingsJapgolly.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.AssignmentPattern]
  }
  
  inline def Identifier(name: String): typingsJapgolly.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.Identifier]
  }
  
  inline def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression | PrivateIdentifier
  ): typingsJapgolly.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.MemberExpression]
  }
  
  inline def ObjectPattern(properties: js.Array[AssignmentProperty | RestElement]): typingsJapgolly.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ObjectPattern]
  }
  
  inline def RestElement(argument: Pattern): typingsJapgolly.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.RestElement]
  }
}
