package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.anon.Cooked
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
import typingsJapgolly.babelTypes.babelTypesStrings.`var`
import typingsJapgolly.babelTypes.babelTypesStrings.const
import typingsJapgolly.babelTypes.babelTypesStrings.constructor
import typingsJapgolly.babelTypes.babelTypesStrings.delete
import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.in
import typingsJapgolly.babelTypes.babelTypesStrings.instanceof
import typingsJapgolly.babelTypes.babelTypesStrings.let
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.module
import typingsJapgolly.babelTypes.babelTypesStrings.script
import typingsJapgolly.babelTypes.babelTypesStrings.set
import typingsJapgolly.babelTypes.babelTypesStrings.typeof
import typingsJapgolly.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.ArrayExpression_
  - typingsJapgolly.babelTypes.libMod.AssignmentExpression_
  - typingsJapgolly.babelTypes.libMod.BinaryExpression_
  - typingsJapgolly.babelTypes.libMod.InterpreterDirective_
  - typingsJapgolly.babelTypes.libMod.Directive_
  - typingsJapgolly.babelTypes.libMod.DirectiveLiteral_
  - typingsJapgolly.babelTypes.libMod.BlockStatement_
  - typingsJapgolly.babelTypes.libMod.BreakStatement_
  - typingsJapgolly.babelTypes.libMod.CallExpression_
  - typingsJapgolly.babelTypes.libMod.CatchClause_
  - typingsJapgolly.babelTypes.libMod.ConditionalExpression_
  - typingsJapgolly.babelTypes.libMod.ContinueStatement_
  - typingsJapgolly.babelTypes.libMod.DebuggerStatement_
  - typingsJapgolly.babelTypes.libMod.DoWhileStatement_
  - typingsJapgolly.babelTypes.libMod.EmptyStatement_
  - typingsJapgolly.babelTypes.libMod.ExpressionStatement_
  - typingsJapgolly.babelTypes.libMod.File_
  - typingsJapgolly.babelTypes.libMod.ForInStatement_
  - typingsJapgolly.babelTypes.libMod.ForStatement_
  - typingsJapgolly.babelTypes.libMod.FunctionDeclaration_
  - typingsJapgolly.babelTypes.libMod.FunctionExpression_
  - typingsJapgolly.babelTypes.libMod.Identifier_
  - typingsJapgolly.babelTypes.libMod.IfStatement_
  - typingsJapgolly.babelTypes.libMod.LabeledStatement_
  - typingsJapgolly.babelTypes.libMod.StringLiteral_
  - typingsJapgolly.babelTypes.libMod.NumericLiteral_
  - typingsJapgolly.babelTypes.libMod.NullLiteral_
  - typingsJapgolly.babelTypes.libMod.BooleanLiteral_
  - typingsJapgolly.babelTypes.libMod.RegExpLiteral_
  - typingsJapgolly.babelTypes.libMod.LogicalExpression_
  - typingsJapgolly.babelTypes.libMod.MemberExpression_
  - typingsJapgolly.babelTypes.libMod.NewExpression_
  - typingsJapgolly.babelTypes.libMod.Program_
  - typingsJapgolly.babelTypes.libMod.ObjectExpression_
  - typingsJapgolly.babelTypes.libMod.ObjectMethod_
  - typingsJapgolly.babelTypes.libMod.ObjectProperty_
  - typingsJapgolly.babelTypes.libMod.RestElement_
  - typingsJapgolly.babelTypes.libMod.ReturnStatement_
  - typingsJapgolly.babelTypes.libMod.SequenceExpression_
  - typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_
  - typingsJapgolly.babelTypes.libMod.SwitchCase_
  - typingsJapgolly.babelTypes.libMod.SwitchStatement_
  - typingsJapgolly.babelTypes.libMod.ThisExpression_
  - typingsJapgolly.babelTypes.libMod.ThrowStatement_
  - typingsJapgolly.babelTypes.libMod.TryStatement_
  - typingsJapgolly.babelTypes.libMod.UnaryExpression_
  - typingsJapgolly.babelTypes.libMod.UpdateExpression_
  - typingsJapgolly.babelTypes.libMod.VariableDeclaration_
  - typingsJapgolly.babelTypes.libMod.VariableDeclarator_
  - typingsJapgolly.babelTypes.libMod.WhileStatement_
  - typingsJapgolly.babelTypes.libMod.WithStatement_
  - typingsJapgolly.babelTypes.libMod.AssignmentPattern_
  - typingsJapgolly.babelTypes.libMod.ArrayPattern_
  - typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_
  - typingsJapgolly.babelTypes.libMod.ClassBody_
  - typingsJapgolly.babelTypes.libMod.ClassExpression_
  - typingsJapgolly.babelTypes.libMod.ClassDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_
  - typingsJapgolly.babelTypes.libMod.ExportSpecifier_
  - typingsJapgolly.babelTypes.libMod.ForOfStatement_
  - typingsJapgolly.babelTypes.libMod.ImportDeclaration_
  - typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_
  - typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_
  - typingsJapgolly.babelTypes.libMod.ImportSpecifier_
  - typingsJapgolly.babelTypes.libMod.MetaProperty_
  - typingsJapgolly.babelTypes.libMod.ClassMethod_
  - typingsJapgolly.babelTypes.libMod.ObjectPattern_
  - typingsJapgolly.babelTypes.libMod.SpreadElement_
  - typingsJapgolly.babelTypes.libMod.Super_
  - typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_
  - typingsJapgolly.babelTypes.libMod.TemplateElement_
  - typingsJapgolly.babelTypes.libMod.TemplateLiteral_
  - typingsJapgolly.babelTypes.libMod.YieldExpression_
  - typingsJapgolly.babelTypes.libMod.AwaitExpression_
  - typingsJapgolly.babelTypes.libMod.Import_
  - typingsJapgolly.babelTypes.libMod.BigIntLiteral_
  - typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_
  - typingsJapgolly.babelTypes.libMod.OptionalMemberExpression_
  - typingsJapgolly.babelTypes.libMod.OptionalCallExpression_
  - typingsJapgolly.babelTypes.libMod.ClassProperty_
  - typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_
  - typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_
  - typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_
  - typingsJapgolly.babelTypes.libMod.PrivateName_
  - typingsJapgolly.babelTypes.libMod.StaticBlock_
*/
trait Standardized extends StObject
object Standardized {
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typingsJapgolly.babelTypes.libMod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrayExpression_]
  }
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typingsJapgolly.babelTypes.libMod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrayPattern_]
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
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSTypeAssertion__ | TSNonNullExpression__,
    right: Expression
  ): typingsJapgolly.babelTypes.libMod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.AssignmentPattern_]
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
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typingsJapgolly.babelTypes.libMod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BlockStatement_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typingsJapgolly.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def BreakStatement_(): typingsJapgolly.babelTypes.libMod.BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BreakStatement_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typingsJapgolly.babelTypes.libMod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CallExpression_]
  }
  
  inline def CatchClause_(body: BlockStatement_): typingsJapgolly.babelTypes.libMod.CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CatchClause_]
  }
  
  inline def ClassAccessorProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_]
  }
  
  inline def ClassBody_(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod__ | TSIndexSignature__ | StaticBlock_
    ]
  ): typingsJapgolly.babelTypes.libMod.ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassBody_]
  }
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typingsJapgolly.babelTypes.libMod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassDeclaration_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typingsJapgolly.babelTypes.libMod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassExpression_]
  }
  
  inline def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: get | set | method_ | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassMethod_]
  }
  
  inline def ClassPrivateMethod_(
    body: BlockStatement_,
    key: PrivateName_,
    kind: get | set | method_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_]
  }
  
  inline def ClassPrivateProperty_(key: PrivateName_, static: Boolean): typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_]
  }
  
  inline def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassProperty_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typingsJapgolly.babelTypes.libMod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ConditionalExpression_]
  }
  
  inline def ContinueStatement_(): typingsJapgolly.babelTypes.libMod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ContinueStatement_]
  }
  
  inline def DebuggerStatement_(): typingsJapgolly.babelTypes.libMod.DebuggerStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DebuggerStatement_]
  }
  
  inline def DirectiveLiteral_(value: String): typingsJapgolly.babelTypes.libMod.DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DirectiveLiteral_]
  }
  
  inline def Directive_(value: DirectiveLiteral_): typingsJapgolly.babelTypes.libMod.Directive_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Directive_]
  }
  
  inline def DoWhileStatement_(body: Statement, test: Expression): typingsJapgolly.babelTypes.libMod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DoWhileStatement_]
  }
  
  inline def EmptyStatement_(): typingsJapgolly.babelTypes.libMod.EmptyStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EmptyStatement_]
  }
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction__ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportNamedDeclaration_]
  }
  
  inline def ExportNamespaceSpecifier_(exported: Identifier_): typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_): typingsJapgolly.babelTypes.libMod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportSpecifier_]
  }
  
  inline def ExpressionStatement_(expression: Expression): typingsJapgolly.babelTypes.libMod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExpressionStatement_]
  }
  
  inline def File_(program: Program_): typingsJapgolly.babelTypes.libMod.File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.File_]
  }
  
  inline def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typingsJapgolly.babelTypes.libMod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForInStatement_]
  }
  
  inline def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typingsJapgolly.babelTypes.libMod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForOfStatement_]
  }
  
  inline def ForStatement_(body: Statement): typingsJapgolly.babelTypes.libMod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionDeclaration_]
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
  
  inline def IfStatement_(consequent: Statement, test: Expression): typingsJapgolly.babelTypes.libMod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.IfStatement_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typingsJapgolly.babelTypes.libMod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportDeclaration_]
  }
  
  inline def ImportDefaultSpecifier_(local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportSpecifier_]
  }
  
  inline def Import_(): typingsJapgolly.babelTypes.libMod.Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Import_]
  }
  
  inline def InterpreterDirective_(value: String): typingsJapgolly.babelTypes.libMod.InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InterpreterDirective_]
  }
  
  inline def LabeledStatement_(body: Statement, label: Identifier_): typingsJapgolly.babelTypes.libMod.LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.LabeledStatement_]
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
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectMethod_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typingsJapgolly.babelTypes.libMod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectPattern_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typingsJapgolly.babelTypes.libMod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectProperty_]
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
  
  inline def PrivateName_(id: Identifier_): typingsJapgolly.babelTypes.libMod.PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.PrivateName_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typingsJapgolly.babelTypes.libMod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Program_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typingsJapgolly.babelTypes.libMod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RegExpLiteral_]
  }
  
  inline def RestElement_(argument: LVal): typingsJapgolly.babelTypes.libMod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RestElement_]
  }
  
  inline def ReturnStatement_(): typingsJapgolly.babelTypes.libMod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ReturnStatement_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typingsJapgolly.babelTypes.libMod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SequenceExpression_]
  }
  
  inline def SpreadElement_(argument: Expression): typingsJapgolly.babelTypes.libMod.SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SpreadElement_]
  }
  
  inline def StaticBlock_(body: js.Array[Statement]): typingsJapgolly.babelTypes.libMod.StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StaticBlock_]
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
  
  inline def SwitchCase_(consequent: js.Array[Statement]): typingsJapgolly.babelTypes.libMod.SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SwitchCase_]
  }
  
  inline def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typingsJapgolly.babelTypes.libMod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SwitchStatement_]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TaggedTemplateExpression_]
  }
  
  inline def TemplateElement_(tail: Boolean, value: Cooked): typingsJapgolly.babelTypes.libMod.TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TemplateElement_]
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
  
  inline def ThrowStatement_(argument: Expression): typingsJapgolly.babelTypes.libMod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ThrowStatement_]
  }
  
  inline def TryStatement_(block: BlockStatement_): typingsJapgolly.babelTypes.libMod.TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TryStatement_]
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
  
  inline def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): typingsJapgolly.babelTypes.libMod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.VariableDeclaration_]
  }
  
  inline def VariableDeclarator_(id: LVal): typingsJapgolly.babelTypes.libMod.VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.VariableDeclarator_]
  }
  
  inline def WhileStatement_(body: Statement, test: Expression): typingsJapgolly.babelTypes.libMod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.WhileStatement_]
  }
  
  inline def WithStatement_(body: Statement, `object`: Expression): typingsJapgolly.babelTypes.libMod.WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.WithStatement_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typingsJapgolly.babelTypes.libMod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.YieldExpression_]
  }
}
