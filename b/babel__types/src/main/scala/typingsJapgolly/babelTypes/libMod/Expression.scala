package typingsJapgolly.babelTypes.libMod

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
  - typingsJapgolly.babelTypes.libMod.ArrayExpression_
  - typingsJapgolly.babelTypes.libMod.AssignmentExpression_
  - typingsJapgolly.babelTypes.libMod.BinaryExpression_
  - typingsJapgolly.babelTypes.libMod.CallExpression_
  - typingsJapgolly.babelTypes.libMod.ConditionalExpression_
  - typingsJapgolly.babelTypes.libMod.FunctionExpression_
  - typingsJapgolly.babelTypes.libMod.Identifier_
  - typingsJapgolly.babelTypes.libMod.StringLiteral_
  - typingsJapgolly.babelTypes.libMod.NumericLiteral_
  - typingsJapgolly.babelTypes.libMod.NullLiteral_
  - typingsJapgolly.babelTypes.libMod.BooleanLiteral_
  - typingsJapgolly.babelTypes.libMod.RegExpLiteral_
  - typingsJapgolly.babelTypes.libMod.LogicalExpression_
  - typingsJapgolly.babelTypes.libMod.MemberExpression_
  - typingsJapgolly.babelTypes.libMod.NewExpression_
  - typingsJapgolly.babelTypes.libMod.ObjectExpression_
  - typingsJapgolly.babelTypes.libMod.SequenceExpression_
  - typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_
  - typingsJapgolly.babelTypes.libMod.ThisExpression_
  - typingsJapgolly.babelTypes.libMod.UnaryExpression_
  - typingsJapgolly.babelTypes.libMod.UpdateExpression_
  - typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_
  - typingsJapgolly.babelTypes.libMod.ClassExpression_
  - typingsJapgolly.babelTypes.libMod.MetaProperty_
  - typingsJapgolly.babelTypes.libMod.Super_
  - typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_
  - typingsJapgolly.babelTypes.libMod.TemplateLiteral_
  - typingsJapgolly.babelTypes.libMod.YieldExpression_
  - typingsJapgolly.babelTypes.libMod.AwaitExpression_
  - typingsJapgolly.babelTypes.libMod.Import_
  - typingsJapgolly.babelTypes.libMod.BigIntLiteral_
  - typingsJapgolly.babelTypes.libMod.OptionalMemberExpression_
  - typingsJapgolly.babelTypes.libMod.OptionalCallExpression_
  - typingsJapgolly.babelTypes.libMod.TypeCastExpression_
  - typingsJapgolly.babelTypes.libMod.JSXElement__
  - typingsJapgolly.babelTypes.libMod.JSXFragment__
  - typingsJapgolly.babelTypes.libMod.BindExpression_
  - typingsJapgolly.babelTypes.libMod.DoExpression_
  - typingsJapgolly.babelTypes.libMod.RecordExpression_
  - typingsJapgolly.babelTypes.libMod.TupleExpression_
  - typingsJapgolly.babelTypes.libMod.DecimalLiteral_
  - typingsJapgolly.babelTypes.libMod.ModuleExpression_
  - typingsJapgolly.babelTypes.libMod.TopicReference_
  - typingsJapgolly.babelTypes.libMod.PipelineTopicExpression_
  - typingsJapgolly.babelTypes.libMod.PipelineBareFunction_
  - typingsJapgolly.babelTypes.libMod.PipelinePrimaryTopicReference_
  - typingsJapgolly.babelTypes.libMod.TSInstantiationExpression__
  - typingsJapgolly.babelTypes.libMod.TSAsExpression__
  - typingsJapgolly.babelTypes.libMod.TSTypeAssertion__
  - typingsJapgolly.babelTypes.libMod.TSNonNullExpression__
*/
trait Expression
  extends StObject
     with ReturnedChild
object Expression {
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typingsJapgolly.babelTypes.libMod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrayExpression_]
  }
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_]
  }
  
  inline def AssignmentExpression_(left: LVal, operator: String, right: Expression): typingsJapgolly.babelTypes.libMod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.AssignmentExpression_]
  }
  
  inline def AwaitExpression_(argument: Expression): typingsJapgolly.babelTypes.libMod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.AwaitExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typingsJapgolly.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typingsJapgolly.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
    right: Expression
  ): typingsJapgolly.babelTypes.libMod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BinaryExpression_]
  }
  
  inline def BindExpression_(callee: Expression, `object`: Expression): typingsJapgolly.babelTypes.libMod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BindExpression_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typingsJapgolly.babelTypes.libMod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CallExpression_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typingsJapgolly.babelTypes.libMod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassExpression_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typingsJapgolly.babelTypes.libMod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ConditionalExpression_]
  }
  
  inline def DecimalLiteral_(value: String): typingsJapgolly.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def DoExpression_(async: Boolean, body: BlockStatement_): typingsJapgolly.babelTypes.libMod.DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DoExpression_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionExpression_]
  }
  
  inline def Identifier_(name: String): typingsJapgolly.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Identifier_]
  }
  
  inline def Import_(): typingsJapgolly.babelTypes.libMod.Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Import_]
  }
  
  inline def JSXElement__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | typingsJapgolly.babelTypes.libMod.JSXElement__ | JSXFragment__
    ],
    openingElement: JSXOpeningElement__
  ): typingsJapgolly.babelTypes.libMod.JSXElement__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.JSXElement__]
  }
  
  inline def JSXFragment__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | typingsJapgolly.babelTypes.libMod.JSXFragment__
    ],
    closingFragment: JSXClosingFragment__,
    openingFragment: JSXOpeningFragment__
  ): typingsJapgolly.babelTypes.libMod.JSXFragment__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.JSXFragment__]
  }
  
  inline def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typingsJapgolly.babelTypes.libMod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.LogicalExpression_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typingsJapgolly.babelTypes.libMod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.MemberExpression_]
  }
  
  inline def MetaProperty_(meta: Identifier_, property: Identifier_): typingsJapgolly.babelTypes.libMod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.MetaProperty_]
  }
  
  inline def ModuleExpression_(body: Program_): typingsJapgolly.babelTypes.libMod.ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ModuleExpression_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typingsJapgolly.babelTypes.libMod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NewExpression_]
  }
  
  inline def NullLiteral_(): typingsJapgolly.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typingsJapgolly.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typingsJapgolly.babelTypes.libMod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectExpression_]
  }
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): typingsJapgolly.babelTypes.libMod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OptionalCallExpression_]
  }
  
  inline def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typingsJapgolly.babelTypes.libMod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OptionalMemberExpression_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_]
  }
  
  inline def PipelineBareFunction_(callee: Expression): typingsJapgolly.babelTypes.libMod.PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.PipelineBareFunction_]
  }
  
  inline def PipelinePrimaryTopicReference_(): typingsJapgolly.babelTypes.libMod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.PipelinePrimaryTopicReference_]
  }
  
  inline def PipelineTopicExpression_(expression: Expression): typingsJapgolly.babelTypes.libMod.PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.PipelineTopicExpression_]
  }
  
  inline def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typingsJapgolly.babelTypes.libMod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RecordExpression_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typingsJapgolly.babelTypes.libMod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RegExpLiteral_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typingsJapgolly.babelTypes.libMod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SequenceExpression_]
  }
  
  inline def StringLiteral_(value: String): typingsJapgolly.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StringLiteral_]
  }
  
  inline def Super_(): typingsJapgolly.babelTypes.libMod.Super_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Super_]
  }
  
  inline def TSAsExpression__(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSAsExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSAsExpression__]
  }
  
  inline def TSInstantiationExpression__(expression: Expression): typingsJapgolly.babelTypes.libMod.TSInstantiationExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSInstantiationExpression__]
  }
  
  inline def TSNonNullExpression__(expression: Expression): typingsJapgolly.babelTypes.libMod.TSNonNullExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSNonNullExpression__]
  }
  
  inline def TSTypeAssertion__(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSTypeAssertion__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeAssertion__]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typingsJapgolly.babelTypes.libMod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TemplateLiteral_]
  }
  
  inline def ThisExpression_(): typingsJapgolly.babelTypes.libMod.ThisExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ThisExpression_]
  }
  
  inline def TopicReference_(): typingsJapgolly.babelTypes.libMod.TopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TopicReference_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typingsJapgolly.babelTypes.libMod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TupleExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeCastExpression_]
  }
  
  inline def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typingsJapgolly.babelTypes.libMod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.UnaryExpression_]
  }
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typingsJapgolly.babelTypes.libMod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.UpdateExpression_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typingsJapgolly.babelTypes.libMod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.YieldExpression_]
  }
}
