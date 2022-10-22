package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Ampersand
import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsJapgolly.babelTypes.babelTypesStrings.Asterisk
import typingsJapgolly.babelTypes.babelTypesStrings.AsteriskAsterisk
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.Exclamationmark
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.Greaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Lessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignLessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Percentsign
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.PlussignPlussign
import typingsJapgolly.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.babelTypes.babelTypesStrings.Slash
import typingsJapgolly.babelTypes.babelTypesStrings.Tilde
import typingsJapgolly.babelTypes.babelTypesStrings.Verticalline
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineVerticalline
import typingsJapgolly.babelTypes.babelTypesStrings.`--`
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.`throw`
import typingsJapgolly.babelTypes.babelTypesStrings.delete
import typingsJapgolly.babelTypes.babelTypesStrings.in
import typingsJapgolly.babelTypes.babelTypesStrings.instanceof
import typingsJapgolly.babelTypes.babelTypesStrings.typeof
import typingsJapgolly.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ArrayExpression_
  - typingsJapgolly.babelTypes.mod.AssignmentExpression_
  - typingsJapgolly.babelTypes.mod.BinaryExpression_
  - typingsJapgolly.babelTypes.mod.CallExpression_
  - typingsJapgolly.babelTypes.mod.ConditionalExpression_
  - typingsJapgolly.babelTypes.mod.FunctionExpression_
  - typingsJapgolly.babelTypes.mod.Identifier_
  - typingsJapgolly.babelTypes.mod.StringLiteral_
  - typingsJapgolly.babelTypes.mod.NumericLiteral_
  - typingsJapgolly.babelTypes.mod.NullLiteral_
  - typingsJapgolly.babelTypes.mod.BooleanLiteral_
  - typingsJapgolly.babelTypes.mod.RegExpLiteral_
  - typingsJapgolly.babelTypes.mod.LogicalExpression_
  - typingsJapgolly.babelTypes.mod.MemberExpression_
  - typingsJapgolly.babelTypes.mod.NewExpression_
  - typingsJapgolly.babelTypes.mod.ObjectExpression_
  - typingsJapgolly.babelTypes.mod.SequenceExpression_
  - typingsJapgolly.babelTypes.mod.ParenthesizedExpression_
  - typingsJapgolly.babelTypes.mod.ThisExpression_
  - typingsJapgolly.babelTypes.mod.UnaryExpression_
  - typingsJapgolly.babelTypes.mod.UpdateExpression_
  - typingsJapgolly.babelTypes.mod.ArrowFunctionExpression_
  - typingsJapgolly.babelTypes.mod.ClassExpression_
  - typingsJapgolly.babelTypes.mod.MetaProperty_
  - typingsJapgolly.babelTypes.mod.Super_
  - typingsJapgolly.babelTypes.mod.TaggedTemplateExpression_
  - typingsJapgolly.babelTypes.mod.TemplateLiteral_
  - typingsJapgolly.babelTypes.mod.YieldExpression_
  - typingsJapgolly.babelTypes.mod.AwaitExpression_
  - typingsJapgolly.babelTypes.mod.Import_
  - typingsJapgolly.babelTypes.mod.BigIntLiteral_
  - typingsJapgolly.babelTypes.mod.OptionalMemberExpression_
  - typingsJapgolly.babelTypes.mod.OptionalCallExpression_
  - typingsJapgolly.babelTypes.mod.TypeCastExpression_
  - typingsJapgolly.babelTypes.mod.JSXElement_
  - typingsJapgolly.babelTypes.mod.JSXFragment_
  - typingsJapgolly.babelTypes.mod.BindExpression_
  - typingsJapgolly.babelTypes.mod.DoExpression_
  - typingsJapgolly.babelTypes.mod.RecordExpression_
  - typingsJapgolly.babelTypes.mod.TupleExpression_
  - typingsJapgolly.babelTypes.mod.DecimalLiteral_
  - typingsJapgolly.babelTypes.mod.ModuleExpression_
  - typingsJapgolly.babelTypes.mod.TopicReference_
  - typingsJapgolly.babelTypes.mod.PipelineTopicExpression_
  - typingsJapgolly.babelTypes.mod.PipelineBareFunction_
  - typingsJapgolly.babelTypes.mod.PipelinePrimaryTopicReference_
  - typingsJapgolly.babelTypes.mod.TSInstantiationExpression_
  - typingsJapgolly.babelTypes.mod.TSAsExpression_
  - typingsJapgolly.babelTypes.mod.TSTypeAssertion_
  - typingsJapgolly.babelTypes.mod.TSNonNullExpression_
*/
trait Expression
  extends StObject
     with _Node
object Expression {
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typingsJapgolly.babelTypes.mod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrayExpression_]
  }
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrowFunctionExpression_]
  }
  
  inline def AssignmentExpression_(left: LVal, operator: String, right: Expression): typingsJapgolly.babelTypes.mod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AssignmentExpression_]
  }
  
  inline def AwaitExpression_(argument: Expression): typingsJapgolly.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AwaitExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typingsJapgolly.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BigIntLiteral_]
  }
  
  inline def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typingsJapgolly.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
    right: Expression
  ): typingsJapgolly.babelTypes.mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BinaryExpression_]
  }
  
  inline def BindExpression_(callee: Expression, `object`: Expression): typingsJapgolly.babelTypes.mod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BindExpression_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanLiteral_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typingsJapgolly.babelTypes.mod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.CallExpression_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typingsJapgolly.babelTypes.mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ClassExpression_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typingsJapgolly.babelTypes.mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ConditionalExpression_]
  }
  
  inline def DecimalLiteral_(value: String): typingsJapgolly.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DecimalLiteral_]
  }
  
  inline def DoExpression_(async: Boolean, body: BlockStatement_): typingsJapgolly.babelTypes.mod.DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DoExpression_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.FunctionExpression_]
  }
  
  inline def Identifier_(name: String): typingsJapgolly.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Identifier_]
  }
  
  inline def Import_(): typingsJapgolly.babelTypes.mod.Import_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Import_]
  }
  
  inline def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsJapgolly.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typingsJapgolly.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXElement_]
  }
  
  inline def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsJapgolly.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typingsJapgolly.babelTypes.mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.JSXFragment_]
  }
  
  inline def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typingsJapgolly.babelTypes.mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.LogicalExpression_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typingsJapgolly.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MemberExpression_]
  }
  
  inline def MetaProperty_(meta: Identifier_, property: Identifier_): typingsJapgolly.babelTypes.mod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MetaProperty_]
  }
  
  inline def ModuleExpression_(body: Program_): typingsJapgolly.babelTypes.mod.ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ModuleExpression_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typingsJapgolly.babelTypes.mod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NewExpression_]
  }
  
  inline def NullLiteral_(): typingsJapgolly.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typingsJapgolly.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumericLiteral_]
  }
  
  inline def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typingsJapgolly.babelTypes.mod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectExpression_]
  }
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): typingsJapgolly.babelTypes.mod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.OptionalCallExpression_]
  }
  
  inline def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typingsJapgolly.babelTypes.mod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.OptionalMemberExpression_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ParenthesizedExpression_]
  }
  
  inline def PipelineBareFunction_(callee: Expression): typingsJapgolly.babelTypes.mod.PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.PipelineBareFunction_]
  }
  
  inline def PipelinePrimaryTopicReference_(): typingsJapgolly.babelTypes.mod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.PipelinePrimaryTopicReference_]
  }
  
  inline def PipelineTopicExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.PipelineTopicExpression_]
  }
  
  inline def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typingsJapgolly.babelTypes.mod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.RecordExpression_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typingsJapgolly.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.RegExpLiteral_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typingsJapgolly.babelTypes.mod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.SequenceExpression_]
  }
  
  inline def StringLiteral_(value: String): typingsJapgolly.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringLiteral_]
  }
  
  inline def Super_(): typingsJapgolly.babelTypes.mod.Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Super_]
  }
  
  inline def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSAsExpression_]
  }
  
  inline def TSInstantiationExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.TSInstantiationExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSInstantiationExpression_]
  }
  
  inline def TSNonNullExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSNonNullExpression_]
  }
  
  inline def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeAssertion_]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typingsJapgolly.babelTypes.mod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TaggedTemplateExpression_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typingsJapgolly.babelTypes.mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TemplateLiteral_]
  }
  
  inline def ThisExpression_(): typingsJapgolly.babelTypes.mod.ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ThisExpression_]
  }
  
  inline def TopicReference_(): typingsJapgolly.babelTypes.mod.TopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TopicReference_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typingsJapgolly.babelTypes.mod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TupleExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeCastExpression_]
  }
  
  inline def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typingsJapgolly.babelTypes.mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.UnaryExpression_]
  }
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typingsJapgolly.babelTypes.mod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.UpdateExpression_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typingsJapgolly.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.YieldExpression_]
  }
}
