package typingsJapgolly.swcCore.typesMod

import typingsJapgolly.swcCore.swcCoreStrings.importDotmeta
import typingsJapgolly.swcCore.swcCoreStrings.newDottarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.ThisExpression
  - typingsJapgolly.swcCore.typesMod.ArrayExpression
  - typingsJapgolly.swcCore.typesMod.ObjectExpression
  - typingsJapgolly.swcCore.typesMod.FunctionExpression
  - typingsJapgolly.swcCore.typesMod.UnaryExpression
  - typingsJapgolly.swcCore.typesMod.UpdateExpression
  - typingsJapgolly.swcCore.typesMod.BinaryExpression
  - typingsJapgolly.swcCore.typesMod.AssignmentExpression
  - typingsJapgolly.swcCore.typesMod.MemberExpression
  - typingsJapgolly.swcCore.typesMod.SuperPropExpression
  - typingsJapgolly.swcCore.typesMod.ConditionalExpression
  - typingsJapgolly.swcCore.typesMod.CallExpression
  - typingsJapgolly.swcCore.typesMod.NewExpression
  - typingsJapgolly.swcCore.typesMod.SequenceExpression
  - typingsJapgolly.swcCore.typesMod.Identifier
  - typingsJapgolly.swcCore.typesMod.Literal
  - typingsJapgolly.swcCore.typesMod.TemplateLiteral
  - typingsJapgolly.swcCore.typesMod.TaggedTemplateExpression
  - typingsJapgolly.swcCore.typesMod.ArrowFunctionExpression
  - typingsJapgolly.swcCore.typesMod.ClassExpression
  - typingsJapgolly.swcCore.typesMod.YieldExpression
  - typingsJapgolly.swcCore.typesMod.MetaProperty
  - typingsJapgolly.swcCore.typesMod.AwaitExpression
  - typingsJapgolly.swcCore.typesMod.ParenthesisExpression
  - typingsJapgolly.swcCore.typesMod.JSXMemberExpression
  - typingsJapgolly.swcCore.typesMod.JSXNamespacedName
  - typingsJapgolly.swcCore.typesMod.JSXEmptyExpression
  - typingsJapgolly.swcCore.typesMod.JSXElement
  - typingsJapgolly.swcCore.typesMod.JSXFragment
  - typingsJapgolly.swcCore.typesMod.TsTypeAssertion
  - typingsJapgolly.swcCore.typesMod.TsConstAssertion
  - typingsJapgolly.swcCore.typesMod.TsNonNullExpression
  - typingsJapgolly.swcCore.typesMod.TsAsExpression
  - typingsJapgolly.swcCore.typesMod.TsInstantiation
  - typingsJapgolly.swcCore.typesMod.PrivateName
  - typingsJapgolly.swcCore.typesMod.OptionalChainingExpression
  - typingsJapgolly.swcCore.typesMod.Invalid
*/
trait Expression
  extends StObject
     with JSXExpression
     with Pattern
object Expression {
  
  inline def ArrayExpression(elements: js.Array[js.UndefOr[ExprOrSpread]], span: Span): typingsJapgolly.swcCore.typesMod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ArrayExpression]
  }
  
  inline def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Pattern],
    span: Span
  ): typingsJapgolly.swcCore.typesMod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(left: Expression | Pattern, operator: AssignmentOperator, right: Expression, span: Span): typingsJapgolly.swcCore.typesMod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.AssignmentExpression]
  }
  
  inline def AwaitExpression(argument: Expression, span: Span): typingsJapgolly.swcCore.typesMod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.AwaitExpression]
  }
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcCore.typesMod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BigIntLiteral]
  }
  
  inline def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression, span: Span): typingsJapgolly.swcCore.typesMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BinaryExpression]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typingsJapgolly.swcCore.typesMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Argument], callee: Super | Import | Expression, span: Span): typingsJapgolly.swcCore.typesMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.CallExpression]
  }
  
  inline def ClassExpression(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ClassExpression]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, span: Span, test: Expression): typingsJapgolly.swcCore.typesMod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ConditionalExpression]
  }
  
  inline def FunctionExpression(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): typingsJapgolly.swcCore.typesMod.FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.FunctionExpression]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Identifier]
  }
  
  inline def Invalid(span: Span): typingsJapgolly.swcCore.typesMod.Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Invalid]
  }
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typingsJapgolly.swcCore.typesMod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXElement]
  }
  
  inline def JSXEmptyExpression(span: Span): typingsJapgolly.swcCore.typesMod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXEmptyExpression]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXFragment]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typingsJapgolly.swcCore.typesMod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typingsJapgolly.swcCore.typesMod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXNamespacedName]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcCore.typesMod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.JSXText]
  }
  
  inline def MemberExpression(`object`: Expression, property: Identifier | PrivateName | ComputedPropName, span: Span): typingsJapgolly.swcCore.typesMod.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.MemberExpression]
  }
  
  inline def MetaProperty(kind: newDottarget | importDotmeta, span: Span): typingsJapgolly.swcCore.typesMod.MetaProperty = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.MetaProperty]
  }
  
  inline def NewExpression(callee: Expression, span: Span): typingsJapgolly.swcCore.typesMod.NewExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NewExpression]
  }
  
  inline def NullLiteral(span: Span): typingsJapgolly.swcCore.typesMod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NumericLiteral]
  }
  
  inline def ObjectExpression(properties: js.Array[SpreadElement | Property], span: Span): typingsJapgolly.swcCore.typesMod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ObjectExpression]
  }
  
  inline def OptionalChainingExpression(base: MemberExpression | OptionalChainingCall, questionDotToken: Span, span: Span): typingsJapgolly.swcCore.typesMod.OptionalChainingExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], questionDotToken = questionDotToken.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalChainingExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.OptionalChainingExpression]
  }
  
  inline def ParenthesisExpression(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ParenthesisExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesisExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ParenthesisExpression]
  }
  
  inline def PrivateName(id: Identifier, span: Span): typingsJapgolly.swcCore.typesMod.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.PrivateName]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typingsJapgolly.swcCore.typesMod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.RegExpLiteral]
  }
  
  inline def SequenceExpression(expressions: js.Array[Expression], span: Span): typingsJapgolly.swcCore.typesMod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.SequenceExpression]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.StringLiteral]
  }
  
  inline def SuperPropExpression(obj: Super, property: Identifier | ComputedPropName, span: Span): typingsJapgolly.swcCore.typesMod.SuperPropExpression = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SuperPropExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.SuperPropExpression]
  }
  
  inline def TaggedTemplateExpression(span: Span, tag: Expression, template: TemplateLiteral): typingsJapgolly.swcCore.typesMod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TaggedTemplateExpression]
  }
  
  inline def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement], span: Span): typingsJapgolly.swcCore.typesMod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TemplateLiteral]
  }
  
  inline def ThisExpression(span: Span): typingsJapgolly.swcCore.typesMod.ThisExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ThisExpression]
  }
  
  inline def TsAsExpression(expression: Expression, span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsAsExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsAsExpression]
  }
  
  inline def TsConstAssertion(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsConstAssertion]
  }
  
  inline def TsInstantiation(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): typingsJapgolly.swcCore.typesMod.TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsInstantiation]
  }
  
  inline def TsNonNullExpression(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.TsNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsNonNullExpression]
  }
  
  inline def TsTypeAssertion(expression: Expression, span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeAssertion]
  }
  
  inline def UnaryExpression(argument: Expression, operator: UnaryOperator, span: Span): typingsJapgolly.swcCore.typesMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean, span: Span): typingsJapgolly.swcCore.typesMod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.UpdateExpression]
  }
  
  inline def YieldExpression(delegate: Boolean, span: Span): typingsJapgolly.swcCore.typesMod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.YieldExpression]
  }
}
