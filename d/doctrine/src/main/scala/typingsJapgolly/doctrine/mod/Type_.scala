package typingsJapgolly.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Type_ extends js.Object

object Type_ {
  @scala.inline
  def TypeApplication(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typingsJapgolly.doctrine.doctrineStrings.TypeApplication
  ): Type_ = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UndefinedLiteral(`type`: typingsJapgolly.doctrine.doctrineStrings.UndefinedLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def OptionalType(expression: Type_, `type`: typingsJapgolly.doctrine.doctrineStrings.OptionalType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NonNullableType(
    expression: Type_,
    prefix: Boolean,
    `type`: typingsJapgolly.doctrine.doctrineStrings.NonNullableType
  ): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableLiteral(`type`: typingsJapgolly.doctrine.doctrineStrings.NullableLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ArrayType(elements: js.Array[Type_], `type`: typingsJapgolly.doctrine.doctrineStrings.ArrayType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NameExpression(name: String, `type`: typingsJapgolly.doctrine.doctrineStrings.NameExpression): Type_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def AllLiteral(`type`: typingsJapgolly.doctrine.doctrineStrings.AllLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RecordType(fields: js.Array[Type_], `type`: typingsJapgolly.doctrine.doctrineStrings.RecordType): Type_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FunctionType(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typingsJapgolly.doctrine.doctrineStrings.FunctionType
  ): Type_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def ParameterType(expression: Type_, name: String, `type`: typingsJapgolly.doctrine.doctrineStrings.ParameterType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def RestType(`type`: typingsJapgolly.doctrine.doctrineStrings.RestType, expression: Type_ = null): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullLiteral(`type`: typingsJapgolly.doctrine.doctrineStrings.NullLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def NullableType(expression: Type_, prefix: Boolean, `type`: typingsJapgolly.doctrine.doctrineStrings.NullableType): Type_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def VoidLiteral(`type`: typingsJapgolly.doctrine.doctrineStrings.VoidLiteral): Type_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def UnionType(elements: js.Array[Type_], `type`: typingsJapgolly.doctrine.doctrineStrings.UnionType): Type_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
  @scala.inline
  def FieldType(key: String, `type`: typingsJapgolly.doctrine.doctrineStrings.FieldType, value: Type_ = null): Type_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type_]
  }
}

