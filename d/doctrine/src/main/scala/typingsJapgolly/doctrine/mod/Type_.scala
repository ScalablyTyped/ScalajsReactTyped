package typingsJapgolly.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.doctrine.mod.`type`.AllLiteral
  - typingsJapgolly.doctrine.mod.`type`.ArrayType
  - typingsJapgolly.doctrine.mod.`type`.FieldType
  - typingsJapgolly.doctrine.mod.`type`.FunctionType
  - typingsJapgolly.doctrine.mod.`type`.NameExpression
  - typingsJapgolly.doctrine.mod.`type`.NonNullableType
  - typingsJapgolly.doctrine.mod.`type`.NullableLiteral
  - typingsJapgolly.doctrine.mod.`type`.NullableType
  - typingsJapgolly.doctrine.mod.`type`.NullLiteral
  - typingsJapgolly.doctrine.mod.`type`.OptionalType
  - typingsJapgolly.doctrine.mod.`type`.ParameterType
  - typingsJapgolly.doctrine.mod.`type`.RecordType
  - typingsJapgolly.doctrine.mod.`type`.RestType
  - typingsJapgolly.doctrine.mod.`type`.TypeApplication
  - typingsJapgolly.doctrine.mod.`type`.UndefinedLiteral
  - typingsJapgolly.doctrine.mod.`type`.UnionType
  - typingsJapgolly.doctrine.mod.`type`.VoidLiteral
*/
trait Type_ extends StObject
object Type_ {
  
  inline def AllLiteral(): typingsJapgolly.doctrine.mod.`type`.AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AllLiteral")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.AllLiteral]
  }
  
  inline def ArrayType(elements: js.Array[Type_]): typingsJapgolly.doctrine.mod.`type`.ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.ArrayType]
  }
  
  inline def FieldType(key: String): typingsJapgolly.doctrine.mod.`type`.FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FieldType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.FieldType]
  }
  
  inline def FunctionType(`new`: Type_, params: js.Array[Type_], result: Type_, `this`: Type_): typingsJapgolly.doctrine.mod.`type`.FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.FunctionType]
  }
  
  inline def NameExpression(name: String): typingsJapgolly.doctrine.mod.`type`.NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NameExpression")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.NameExpression]
  }
  
  inline def NonNullableType(expression: Type_, prefix: Boolean): typingsJapgolly.doctrine.mod.`type`.NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NonNullableType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.NonNullableType]
  }
  
  inline def NullLiteral(): typingsJapgolly.doctrine.mod.`type`.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.NullLiteral]
  }
  
  inline def NullableLiteral(): typingsJapgolly.doctrine.mod.`type`.NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableLiteral")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.NullableLiteral]
  }
  
  inline def NullableType(expression: Type_, prefix: Boolean): typingsJapgolly.doctrine.mod.`type`.NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.NullableType]
  }
  
  inline def OptionalType(expression: Type_): typingsJapgolly.doctrine.mod.`type`.OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.OptionalType]
  }
  
  inline def ParameterType(expression: Type_, name: String): typingsJapgolly.doctrine.mod.`type`.ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.ParameterType]
  }
  
  inline def RecordType(fields: js.Array[Type_]): typingsJapgolly.doctrine.mod.`type`.RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RecordType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.RecordType]
  }
  
  inline def RestType(): typingsJapgolly.doctrine.mod.`type`.RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.RestType]
  }
  
  inline def TypeApplication(applications: js.Array[Type_], expression: Type_): typingsJapgolly.doctrine.mod.`type`.TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeApplication")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.TypeApplication]
  }
  
  inline def UndefinedLiteral(): typingsJapgolly.doctrine.mod.`type`.UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.UndefinedLiteral]
  }
  
  inline def UnionType(elements: js.Array[Type_]): typingsJapgolly.doctrine.mod.`type`.UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionType")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.UnionType]
  }
  
  inline def VoidLiteral(): typingsJapgolly.doctrine.mod.`type`.VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidLiteral")
    __obj.asInstanceOf[typingsJapgolly.doctrine.mod.`type`.VoidLiteral]
  }
}
