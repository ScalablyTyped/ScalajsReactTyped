package typingsJapgolly.swcWasm.mod

import typingsJapgolly.swcWasm.swcWasmStrings.importDotmeta
import typingsJapgolly.swcWasm.swcWasmStrings.newDottarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.ThisExpression
  - typingsJapgolly.swcWasm.mod.ArrayExpression
  - typingsJapgolly.swcWasm.mod.ObjectExpression
  - typingsJapgolly.swcWasm.mod.FunctionExpression
  - typingsJapgolly.swcWasm.mod.UnaryExpression
  - typingsJapgolly.swcWasm.mod.UpdateExpression
  - typingsJapgolly.swcWasm.mod.BinaryExpression
  - typingsJapgolly.swcWasm.mod.AssignmentExpression
  - typingsJapgolly.swcWasm.mod.MemberExpression
  - typingsJapgolly.swcWasm.mod.SuperPropExpression
  - typingsJapgolly.swcWasm.mod.ConditionalExpression
  - typingsJapgolly.swcWasm.mod.CallExpression
  - typingsJapgolly.swcWasm.mod.NewExpression
  - typingsJapgolly.swcWasm.mod.SequenceExpression
  - typingsJapgolly.swcWasm.mod.Identifier
  - typingsJapgolly.swcWasm.mod.Literal
  - typingsJapgolly.swcWasm.mod.TemplateLiteral
  - typingsJapgolly.swcWasm.mod.TaggedTemplateExpression
  - typingsJapgolly.swcWasm.mod.ArrowFunctionExpression
  - typingsJapgolly.swcWasm.mod.ClassExpression
  - typingsJapgolly.swcWasm.mod.YieldExpression
  - typingsJapgolly.swcWasm.mod.MetaProperty
  - typingsJapgolly.swcWasm.mod.AwaitExpression
  - typingsJapgolly.swcWasm.mod.ParenthesisExpression
  - typingsJapgolly.swcWasm.mod.JSXMemberExpression
  - typingsJapgolly.swcWasm.mod.JSXNamespacedName
  - typingsJapgolly.swcWasm.mod.JSXEmptyExpression
  - typingsJapgolly.swcWasm.mod.JSXElement
  - typingsJapgolly.swcWasm.mod.JSXFragment
  - typingsJapgolly.swcWasm.mod.TsTypeAssertion
  - typingsJapgolly.swcWasm.mod.TsConstAssertion
  - typingsJapgolly.swcWasm.mod.TsNonNullExpression
  - typingsJapgolly.swcWasm.mod.TsAsExpression
  - typingsJapgolly.swcWasm.mod.TsInstantiation
  - typingsJapgolly.swcWasm.mod.PrivateName
  - typingsJapgolly.swcWasm.mod.OptionalChainingExpression
  - typingsJapgolly.swcWasm.mod.Invalid
*/
trait Expression
  extends StObject
     with JSXExpression
     with Pattern
object Expression {
  
  inline def ArrayExpression(elements: js.Array[js.UndefOr[ExprOrSpread]], span: Span): typingsJapgolly.swcWasm.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ArrayExpression]
  }
  
  inline def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Pattern],
    span: Span
  ): typingsJapgolly.swcWasm.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(left: Expression | Pattern, operator: AssignmentOperator, right: Expression, span: Span): typingsJapgolly.swcWasm.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.AssignmentExpression]
  }
  
  inline def AwaitExpression(argument: Expression, span: Span): typingsJapgolly.swcWasm.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.AwaitExpression]
  }
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typingsJapgolly.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BigIntLiteral]
  }
  
  inline def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression, span: Span): typingsJapgolly.swcWasm.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BinaryExpression]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typingsJapgolly.swcWasm.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Argument], callee: Super | Import | Expression, span: Span): typingsJapgolly.swcWasm.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.CallExpression]
  }
  
  inline def ClassExpression(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ClassExpression]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, span: Span, test: Expression): typingsJapgolly.swcWasm.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ConditionalExpression]
  }
  
  inline def FunctionExpression(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): typingsJapgolly.swcWasm.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.FunctionExpression]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def Invalid(span: Span): typingsJapgolly.swcWasm.mod.Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Invalid]
  }
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typingsJapgolly.swcWasm.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXElement]
  }
  
  inline def JSXEmptyExpression(span: Span): typingsJapgolly.swcWasm.mod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXEmptyExpression]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typingsJapgolly.swcWasm.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXFragment]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typingsJapgolly.swcWasm.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typingsJapgolly.swcWasm.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXNamespacedName]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typingsJapgolly.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.JSXText]
  }
  
  inline def MemberExpression(`object`: Expression, property: Identifier | PrivateName | ComputedPropName, span: Span): typingsJapgolly.swcWasm.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.MemberExpression]
  }
  
  inline def MetaProperty(kind: newDottarget | importDotmeta, span: Span): typingsJapgolly.swcWasm.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.MetaProperty]
  }
  
  inline def NewExpression(callee: Expression, span: Span): typingsJapgolly.swcWasm.mod.NewExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NewExpression]
  }
  
  inline def NullLiteral(span: Span): typingsJapgolly.swcWasm.mod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typingsJapgolly.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NumericLiteral]
  }
  
  inline def ObjectExpression(properties: js.Array[SpreadElement | Property], span: Span): typingsJapgolly.swcWasm.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ObjectExpression]
  }
  
  inline def OptionalChainingExpression(base: MemberExpression | OptionalChainingCall, questionDotToken: Span, span: Span): typingsJapgolly.swcWasm.mod.OptionalChainingExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], questionDotToken = questionDotToken.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalChainingExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.OptionalChainingExpression]
  }
  
  inline def ParenthesisExpression(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.ParenthesisExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesisExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ParenthesisExpression]
  }
  
  inline def PrivateName(id: Identifier, span: Span): typingsJapgolly.swcWasm.mod.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.PrivateName]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typingsJapgolly.swcWasm.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.RegExpLiteral]
  }
  
  inline def SequenceExpression(expressions: js.Array[Expression], span: Span): typingsJapgolly.swcWasm.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.SequenceExpression]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.StringLiteral]
  }
  
  inline def SuperPropExpression(obj: Super, property: Identifier | ComputedPropName, span: Span): typingsJapgolly.swcWasm.mod.SuperPropExpression = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SuperPropExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.SuperPropExpression]
  }
  
  inline def TaggedTemplateExpression(span: Span, tag: Expression, template: TemplateLiteral): typingsJapgolly.swcWasm.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TaggedTemplateExpression]
  }
  
  inline def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement], span: Span): typingsJapgolly.swcWasm.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TemplateLiteral]
  }
  
  inline def ThisExpression(span: Span): typingsJapgolly.swcWasm.mod.ThisExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ThisExpression]
  }
  
  inline def TsAsExpression(expression: Expression, span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsAsExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsAsExpression]
  }
  
  inline def TsConstAssertion(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsConstAssertion]
  }
  
  inline def TsInstantiation(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): typingsJapgolly.swcWasm.mod.TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsInstantiation]
  }
  
  inline def TsNonNullExpression(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.TsNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsNonNullExpression]
  }
  
  inline def TsTypeAssertion(expression: Expression, span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeAssertion]
  }
  
  inline def UnaryExpression(argument: Expression, operator: UnaryOperator, span: Span): typingsJapgolly.swcWasm.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean, span: Span): typingsJapgolly.swcWasm.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.UpdateExpression]
  }
  
  inline def YieldExpression(delegate: Boolean, span: Span): typingsJapgolly.swcWasm.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.YieldExpression]
  }
}
