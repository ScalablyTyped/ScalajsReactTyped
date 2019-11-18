package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyntaxKind extends js.Object

@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends js.Object {
  @js.native
  sealed trait AbstractKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends SyntaxKind
       with LogicalOperator
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AmpersandToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait AnyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ArrayBindingPattern extends SyntaxKind
  
  @js.native
  sealed trait ArrayLiteralExpression extends SyntaxKind
  
  @js.native
  sealed trait ArrayType extends SyntaxKind
  
  @js.native
  sealed trait ArrowFunction extends SyntaxKind
  
  @js.native
  sealed trait AsExpression extends SyntaxKind
  
  @js.native
  sealed trait AsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AssertsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskToken extends SyntaxKind
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait AsyncKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AtToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait AwaitExpression extends SyntaxKind
  
  @js.native
  sealed trait AwaitKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait BarBarToken
    extends SyntaxKind
       with LogicalOperator
  
  @js.native
  sealed trait BarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait BarToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait BigIntKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BigIntLiteral extends SyntaxKind
  
  @js.native
  sealed trait BinaryExpression extends SyntaxKind
  
  @js.native
  sealed trait BindingElement extends SyntaxKind
  
  @js.native
  sealed trait Block extends SyntaxKind
  
  @js.native
  sealed trait BooleanKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BreakKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BreakStatement extends SyntaxKind
  
  @js.native
  sealed trait Bundle extends SyntaxKind
  
  @js.native
  sealed trait CallExpression extends SyntaxKind
  
  @js.native
  sealed trait CallSignature extends SyntaxKind
  
  @js.native
  sealed trait CaretEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait CaretToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait CaseBlock extends SyntaxKind
  
  @js.native
  sealed trait CaseClause extends SyntaxKind
  
  @js.native
  sealed trait CaseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait CatchClause extends SyntaxKind
  
  @js.native
  sealed trait CatchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ClassDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ClassExpression extends SyntaxKind
  
  @js.native
  sealed trait ClassKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait CloseBraceToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait CloseBracketToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait CloseParenToken extends SyntaxKind
  
  @js.native
  sealed trait ColonToken extends SyntaxKind
  
  @js.native
  sealed trait CommaListExpression extends SyntaxKind
  
  @js.native
  sealed trait CommaToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with _BinaryOperator
  
  @js.native
  sealed trait ComputedPropertyName extends SyntaxKind
  
  @js.native
  sealed trait ConditionalExpression extends SyntaxKind
  
  @js.native
  sealed trait ConditionalType extends SyntaxKind
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait ConstKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ConstructSignature extends SyntaxKind
  
  @js.native
  sealed trait Constructor extends SyntaxKind
  
  @js.native
  sealed trait ConstructorKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ConstructorType extends SyntaxKind
  
  @js.native
  sealed trait ContinueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ContinueStatement extends SyntaxKind
  
  @js.native
  sealed trait Count extends SyntaxKind
  
  @js.native
  sealed trait DebuggerKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DebuggerStatement extends SyntaxKind
  
  @js.native
  sealed trait DeclareKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Decorator extends SyntaxKind
  
  @js.native
  sealed trait DefaultClause extends SyntaxKind
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DeleteExpression extends SyntaxKind
  
  @js.native
  sealed trait DeleteKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DoKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DoStatement extends SyntaxKind
  
  @js.native
  sealed trait DotDotDotToken extends SyntaxKind
  
  @js.native
  sealed trait DotToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait ElementAccessExpression extends SyntaxKind
  
  @js.native
  sealed trait ElseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait EmptyStatement extends SyntaxKind
  
  @js.native
  sealed trait EndOfDeclarationMarker extends SyntaxKind
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait EnumDeclaration extends SyntaxKind
  
  @js.native
  sealed trait EnumKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait EnumMember extends SyntaxKind
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait EqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait EqualsGreaterThanToken extends SyntaxKind
  
  @js.native
  sealed trait EqualsToken
    extends AssignmentOperator
       with SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait ExclamationToken
    extends SyntaxKind
       with PrefixUnaryOperator
  
  @js.native
  sealed trait ExportAssignment extends SyntaxKind
  
  @js.native
  sealed trait ExportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ExportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ExportSpecifier extends SyntaxKind
  
  @js.native
  sealed trait ExpressionStatement extends SyntaxKind
  
  @js.native
  sealed trait ExpressionWithTypeArguments extends SyntaxKind
  
  @js.native
  sealed trait ExtendsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ExternalModuleReference extends SyntaxKind
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FinallyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FirstAssignment extends SyntaxKind
  
  @js.native
  sealed trait FirstBinaryOperator extends SyntaxKind
  
  @js.native
  sealed trait FirstCompoundAssignment extends SyntaxKind
  
  @js.native
  sealed trait FirstFutureReservedWord extends SyntaxKind
  
  @js.native
  sealed trait FirstJSDocNode extends SyntaxKind
  
  @js.native
  sealed trait FirstJSDocTagNode extends SyntaxKind
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  
  @js.native
  sealed trait FirstLiteralToken extends SyntaxKind
  
  @js.native
  sealed trait FirstNode extends SyntaxKind
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  
  @js.native
  sealed trait FirstReservedWord extends SyntaxKind
  
  @js.native
  sealed trait FirstStatement extends SyntaxKind
  
  @js.native
  sealed trait FirstTemplateToken extends SyntaxKind
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  
  @js.native
  sealed trait FirstTriviaToken extends SyntaxKind
  
  @js.native
  sealed trait FirstTypeNode extends SyntaxKind
  
  @js.native
  sealed trait ForInStatement extends SyntaxKind
  
  @js.native
  sealed trait ForKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ForOfStatement extends SyntaxKind
  
  @js.native
  sealed trait ForStatement extends SyntaxKind
  
  @js.native
  sealed trait FromKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FunctionDeclaration extends SyntaxKind
  
  @js.native
  sealed trait FunctionExpression extends SyntaxKind
  
  @js.native
  sealed trait FunctionKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FunctionType extends SyntaxKind
  
  @js.native
  sealed trait GetAccessor extends SyntaxKind
  
  @js.native
  sealed trait GetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait GlobalKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait GreaterThanToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait HeritageClause extends SyntaxKind
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait IfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait IfStatement extends SyntaxKind
  
  @js.native
  sealed trait ImplementsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ImportClause extends SyntaxKind
  
  @js.native
  sealed trait ImportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ImportEqualsDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ImportSpecifier extends SyntaxKind
  
  @js.native
  sealed trait ImportType extends SyntaxKind
  
  @js.native
  sealed trait InKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait IndexSignature extends SyntaxKind
  
  @js.native
  sealed trait IndexedAccessType extends SyntaxKind
  
  @js.native
  sealed trait InferKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait InferType extends SyntaxKind
  
  @js.native
  sealed trait InputFiles extends SyntaxKind
  
  @js.native
  sealed trait InstanceOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait InterfaceDeclaration extends SyntaxKind
  
  @js.native
  sealed trait InterfaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait IntersectionType extends SyntaxKind
  
  @js.native
  sealed trait IsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait JSDocAllType extends SyntaxKind
  
  @js.native
  sealed trait JSDocAugmentsTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocAuthorTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocCallbackTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocClassTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocComment extends SyntaxKind
  
  @js.native
  sealed trait JSDocEnumTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocFunctionType extends SyntaxKind
  
  @js.native
  sealed trait JSDocNamepathType extends SyntaxKind
  
  @js.native
  sealed trait JSDocNonNullableType extends SyntaxKind
  
  @js.native
  sealed trait JSDocNullableType extends SyntaxKind
  
  @js.native
  sealed trait JSDocOptionalType extends SyntaxKind
  
  @js.native
  sealed trait JSDocParameterTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocPropertyTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocReturnTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocSignature extends SyntaxKind
  
  @js.native
  sealed trait JSDocTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTemplateTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocThisTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeExpression extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeLiteral extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypedefTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocUnknownType extends SyntaxKind
  
  @js.native
  sealed trait JSDocVariadicType extends SyntaxKind
  
  @js.native
  sealed trait JsxAttribute extends SyntaxKind
  
  @js.native
  sealed trait JsxAttributes extends SyntaxKind
  
  @js.native
  sealed trait JsxClosingElement extends SyntaxKind
  
  @js.native
  sealed trait JsxClosingFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxElement extends SyntaxKind
  
  @js.native
  sealed trait JsxExpression extends SyntaxKind
  
  @js.native
  sealed trait JsxFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxOpeningElement extends SyntaxKind
  
  @js.native
  sealed trait JsxOpeningFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxSelfClosingElement extends SyntaxKind
  
  @js.native
  sealed trait JsxSpreadAttribute extends SyntaxKind
  
  @js.native
  sealed trait JsxText
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait KeyOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait LabeledStatement extends SyntaxKind
  
  @js.native
  sealed trait LastAssignment extends SyntaxKind
  
  @js.native
  sealed trait LastBinaryOperator extends SyntaxKind
  
  @js.native
  sealed trait LastCompoundAssignment extends SyntaxKind
  
  @js.native
  sealed trait LastFutureReservedWord extends SyntaxKind
  
  @js.native
  sealed trait LastJSDocNode extends SyntaxKind
  
  @js.native
  sealed trait LastJSDocTagNode extends SyntaxKind
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  
  @js.native
  sealed trait LastLiteralToken extends SyntaxKind
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  
  @js.native
  sealed trait LastReservedWord extends SyntaxKind
  
  @js.native
  sealed trait LastStatement extends SyntaxKind
  
  @js.native
  sealed trait LastTemplateToken extends SyntaxKind
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  
  @js.native
  sealed trait LastTriviaToken extends SyntaxKind
  
  @js.native
  sealed trait LastTypeNode extends SyntaxKind
  
  @js.native
  sealed trait LessThanEqualsToken
    extends SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait LessThanLessThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait LessThanSlashToken
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait LessThanToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait LetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait LiteralType extends SyntaxKind
  
  @js.native
  sealed trait MappedType extends SyntaxKind
  
  @js.native
  sealed trait MergeDeclarationMarker extends SyntaxKind
  
  @js.native
  sealed trait MetaProperty extends SyntaxKind
  
  @js.native
  sealed trait MethodDeclaration extends SyntaxKind
  
  @js.native
  sealed trait MethodSignature extends SyntaxKind
  
  @js.native
  sealed trait MinusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait MinusMinusToken
    extends SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait MinusToken
    extends SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait MissingDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ModuleBlock extends SyntaxKind
  
  @js.native
  sealed trait ModuleDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ModuleKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends SyntaxKind
       with CommentKind
  
  @js.native
  sealed trait NamedExports extends SyntaxKind
  
  @js.native
  sealed trait NamedImports extends SyntaxKind
  
  @js.native
  sealed trait NamespaceExportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait NamespaceImport extends SyntaxKind
  
  @js.native
  sealed trait NamespaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NeverKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NewExpression extends SyntaxKind
  
  @js.native
  sealed trait NewKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NewLineTrivia
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral extends SyntaxKind
  
  @js.native
  sealed trait NonNullExpression extends SyntaxKind
  
  @js.native
  sealed trait NotEmittedStatement extends SyntaxKind
  
  @js.native
  sealed trait NullKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NumberKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NumericLiteral extends SyntaxKind
  
  @js.native
  sealed trait ObjectBindingPattern extends SyntaxKind
  
  @js.native
  sealed trait ObjectKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ObjectLiteralExpression extends SyntaxKind
  
  @js.native
  sealed trait OfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait OmittedExpression extends SyntaxKind
  
  @js.native
  sealed trait OpenBraceToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait OpenBracketToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait OpenParenToken extends SyntaxKind
  
  @js.native
  sealed trait OptionalType extends SyntaxKind
  
  @js.native
  sealed trait PackageKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  
  @js.native
  sealed trait ParenthesizedExpression extends SyntaxKind
  
  @js.native
  sealed trait ParenthesizedType extends SyntaxKind
  
  @js.native
  sealed trait PartiallyEmittedExpression extends SyntaxKind
  
  @js.native
  sealed trait PercentEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait PercentToken
    extends SyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait PlusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait PlusPlusToken
    extends SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait PlusToken
    extends SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait PostfixUnaryExpression extends SyntaxKind
  
  @js.native
  sealed trait PrefixUnaryExpression extends SyntaxKind
  
  @js.native
  sealed trait PrivateKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait PropertyAccessExpression extends SyntaxKind
  
  @js.native
  sealed trait PropertyAssignment extends SyntaxKind
  
  @js.native
  sealed trait PropertyDeclaration extends SyntaxKind
  
  @js.native
  sealed trait PropertySignature extends SyntaxKind
  
  @js.native
  sealed trait ProtectedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait PublicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait QualifiedName extends SyntaxKind
  
  @js.native
  sealed trait QuestionDotToken extends SyntaxKind
  
  @js.native
  sealed trait QuestionQuestionToken
    extends _AssignmentOperatorOrHigher
       with SyntaxKind
  
  @js.native
  sealed trait QuestionToken extends SyntaxKind
  
  @js.native
  sealed trait ReadonlyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait RegularExpressionLiteral extends SyntaxKind
  
  @js.native
  sealed trait RequireKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait RestType extends SyntaxKind
  
  @js.native
  sealed trait ReturnKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ReturnStatement extends SyntaxKind
  
  @js.native
  sealed trait SemicolonClassElement extends SyntaxKind
  
  @js.native
  sealed trait SemicolonToken extends SyntaxKind
  
  @js.native
  sealed trait SetAccessor extends SyntaxKind
  
  @js.native
  sealed trait SetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ShebangTrivia extends SyntaxKind
  
  @js.native
  sealed trait ShorthandPropertyAssignment extends SyntaxKind
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends SyntaxKind
       with CommentKind
  
  @js.native
  sealed trait SlashEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait SlashToken
    extends SyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  
  @js.native
  sealed trait SpreadAssignment extends SyntaxKind
  
  @js.native
  sealed trait SpreadElement extends SyntaxKind
  
  @js.native
  sealed trait StaticKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait StringKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait StringLiteral extends SyntaxKind
  
  @js.native
  sealed trait SuperKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SwitchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SwitchStatement extends SyntaxKind
  
  @js.native
  sealed trait SymbolKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SyntaxList extends SyntaxKind
  
  @js.native
  sealed trait SyntheticExpression extends SyntaxKind
  
  @js.native
  sealed trait SyntheticReferenceExpression extends SyntaxKind
  
  @js.native
  sealed trait TaggedTemplateExpression extends SyntaxKind
  
  @js.native
  sealed trait TemplateExpression extends SyntaxKind
  
  @js.native
  sealed trait TemplateHead extends SyntaxKind
  
  @js.native
  sealed trait TemplateMiddle extends SyntaxKind
  
  @js.native
  sealed trait TemplateSpan extends SyntaxKind
  
  @js.native
  sealed trait TemplateTail extends SyntaxKind
  
  @js.native
  sealed trait ThisKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ThisType extends SyntaxKind
  
  @js.native
  sealed trait ThrowKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ThrowStatement extends SyntaxKind
  
  @js.native
  sealed trait TildeToken
    extends SyntaxKind
       with PrefixUnaryOperator
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TryKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TryStatement extends SyntaxKind
  
  @js.native
  sealed trait TupleType extends SyntaxKind
  
  @js.native
  sealed trait TypeAliasDeclaration extends SyntaxKind
  
  @js.native
  sealed trait TypeAssertionExpression extends SyntaxKind
  
  @js.native
  sealed trait TypeKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TypeLiteral extends SyntaxKind
  
  @js.native
  sealed trait TypeOfExpression extends SyntaxKind
  
  @js.native
  sealed trait TypeOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TypeOperator extends SyntaxKind
  
  @js.native
  sealed trait TypeParameter extends SyntaxKind
  
  @js.native
  sealed trait TypePredicate extends SyntaxKind
  
  @js.native
  sealed trait TypeQuery extends SyntaxKind
  
  @js.native
  sealed trait TypeReference extends SyntaxKind
  
  @js.native
  sealed trait UndefinedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait UnionType extends SyntaxKind
  
  @js.native
  sealed trait UniqueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Unknown
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait UnknownKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait UnparsedInternalText extends SyntaxKind
  
  @js.native
  sealed trait UnparsedPrepend extends SyntaxKind
  
  @js.native
  sealed trait UnparsedPrologue extends SyntaxKind
  
  @js.native
  sealed trait UnparsedSource extends SyntaxKind
  
  @js.native
  sealed trait UnparsedSyntheticReference extends SyntaxKind
  
  @js.native
  sealed trait UnparsedText extends SyntaxKind
  
  @js.native
  sealed trait VarKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait VariableDeclaration extends SyntaxKind
  
  @js.native
  sealed trait VariableDeclarationList extends SyntaxKind
  
  @js.native
  sealed trait VariableStatement extends SyntaxKind
  
  @js.native
  sealed trait VoidExpression extends SyntaxKind
  
  @js.native
  sealed trait VoidKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WhileKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WhileStatement extends SyntaxKind
  
  @js.native
  sealed trait WhitespaceTrivia
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait WithKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WithStatement extends SyntaxKind
  
  @js.native
  sealed trait YieldExpression extends SyntaxKind
  
  @js.native
  sealed trait YieldKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  /* 121 */ val AbstractKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AbstractKeyword with Double = js.native
  /* 55 */ val AmpersandAmpersandToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AmpersandAmpersandToken with Double = js.native
  /* 72 */ val AmpersandEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AmpersandEqualsToken with Double = js.native
  /* 50 */ val AmpersandToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AmpersandToken with Double = js.native
  /* 124 */ val AnyKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AnyKeyword with Double = js.native
  /* 189 */ val ArrayBindingPattern: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrayBindingPattern with Double = js.native
  /* 191 */ val ArrayLiteralExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrayLiteralExpression with Double = js.native
  /* 173 */ val ArrayType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrayType with Double = js.native
  /* 201 */ val ArrowFunction: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ArrowFunction with Double = js.native
  /* 216 */ val AsExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsExpression with Double = js.native
  /* 122 */ val AsKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsKeyword with Double = js.native
  /* 123 */ val AssertsKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AssertsKeyword with Double = js.native
  /* 66 */ val AsteriskAsteriskEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskEqualsToken with Double = js.native
  /* 42 */ val AsteriskAsteriskToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskToken with Double = js.native
  /* 65 */ val AsteriskEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsteriskEqualsToken with Double = js.native
  /* 41 */ val AsteriskToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsteriskToken with Double = js.native
  /* 125 */ val AsyncKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AsyncKeyword with Double = js.native
  /* 59 */ val AtToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AtToken with Double = js.native
  /* 205 */ val AwaitExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AwaitExpression with Double = js.native
  /* 126 */ val AwaitKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.AwaitKeyword with Double = js.native
  /* 61 */ val BacktickToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BacktickToken with Double = js.native
  /* 56 */ val BarBarToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BarBarToken with Double = js.native
  /* 73 */ val BarEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BarEqualsToken with Double = js.native
  /* 51 */ val BarToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BarToken with Double = js.native
  /* 150 */ val BigIntKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BigIntKeyword with Double = js.native
  /* 9 */ val BigIntLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BigIntLiteral with Double = js.native
  /* 208 */ val BinaryExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BinaryExpression with Double = js.native
  /* 190 */ val BindingElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BindingElement with Double = js.native
  /* 222 */ val Block: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Block with Double = js.native
  /* 127 */ val BooleanKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BooleanKeyword with Double = js.native
  /* 76 */ val BreakKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BreakKeyword with Double = js.native
  /* 233 */ val BreakStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.BreakStatement with Double = js.native
  /* 289 */ val Bundle: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Bundle with Double = js.native
  /* 195 */ val CallExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CallExpression with Double = js.native
  /* 164 */ val CallSignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CallSignature with Double = js.native
  /* 74 */ val CaretEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaretEqualsToken with Double = js.native
  /* 52 */ val CaretToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaretToken with Double = js.native
  /* 250 */ val CaseBlock: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaseBlock with Double = js.native
  /* 275 */ val CaseClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaseClause with Double = js.native
  /* 77 */ val CaseKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CaseKeyword with Double = js.native
  /* 278 */ val CatchClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CatchClause with Double = js.native
  /* 78 */ val CatchKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CatchKeyword with Double = js.native
  /* 244 */ val ClassDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ClassDeclaration with Double = js.native
  /* 213 */ val ClassExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ClassExpression with Double = js.native
  /* 79 */ val ClassKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ClassKeyword with Double = js.native
  /* 19 */ val CloseBraceToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CloseBraceToken with Double = js.native
  /* 23 */ val CloseBracketToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CloseBracketToken with Double = js.native
  /* 21 */ val CloseParenToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CloseParenToken with Double = js.native
  /* 58 */ val ColonToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ColonToken with Double = js.native
  /* 320 */ val CommaListExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CommaListExpression with Double = js.native
  /* 27 */ val CommaToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.CommaToken with Double = js.native
  /* 153 */ val ComputedPropertyName: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ComputedPropertyName with Double = js.native
  /* 209 */ val ConditionalExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConditionalExpression with Double = js.native
  /* 179 */ val ConditionalType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConditionalType with Double = js.native
  /* 7 */ val ConflictMarkerTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConflictMarkerTrivia with Double = js.native
  /* 80 */ val ConstKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConstKeyword with Double = js.native
  /* 165 */ val ConstructSignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConstructSignature with Double = js.native
  /* 161 */ val Constructor: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Constructor with Double = js.native
  /* 128 */ val ConstructorKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConstructorKeyword with Double = js.native
  /* 170 */ val ConstructorType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ConstructorType with Double = js.native
  /* 81 */ val ContinueKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ContinueKeyword with Double = js.native
  /* 232 */ val ContinueStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ContinueStatement with Double = js.native
  /* 324 */ val Count: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Count with Double = js.native
  /* 82 */ val DebuggerKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DebuggerKeyword with Double = js.native
  /* 240 */ val DebuggerStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DebuggerStatement with Double = js.native
  /* 129 */ val DeclareKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DeclareKeyword with Double = js.native
  /* 156 */ val Decorator: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Decorator with Double = js.native
  /* 276 */ val DefaultClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DefaultClause with Double = js.native
  /* 83 */ val DefaultKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DefaultKeyword with Double = js.native
  /* 202 */ val DeleteExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DeleteExpression with Double = js.native
  /* 84 */ val DeleteKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DeleteKeyword with Double = js.native
  /* 85 */ val DoKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DoKeyword with Double = js.native
  /* 227 */ val DoStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DoStatement with Double = js.native
  /* 25 */ val DotDotDotToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DotDotDotToken with Double = js.native
  /* 24 */ val DotToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.DotToken with Double = js.native
  /* 194 */ val ElementAccessExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ElementAccessExpression with Double = js.native
  /* 86 */ val ElseKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ElseKeyword with Double = js.native
  /* 223 */ val EmptyStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EmptyStatement with Double = js.native
  /* 322 */ val EndOfDeclarationMarker: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EndOfDeclarationMarker with Double = js.native
  /* 1 */ val EndOfFileToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EndOfFileToken with Double = js.native
  /* 247 */ val EnumDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EnumDeclaration with Double = js.native
  /* 87 */ val EnumKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EnumKeyword with Double = js.native
  /* 282 */ val EnumMember: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EnumMember with Double = js.native
  /* 36 */ val EqualsEqualsEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EqualsEqualsEqualsToken with Double = js.native
  /* 34 */ val EqualsEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  /* 38 */ val EqualsGreaterThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EqualsGreaterThanToken with Double = js.native
  /* 62 */ val EqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.EqualsToken with Double = js.native
  /* 37 */ val ExclamationEqualsEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExclamationEqualsEqualsToken with Double = js.native
  /* 35 */ val ExclamationEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  /* 53 */ val ExclamationToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExclamationToken with Double = js.native
  /* 258 */ val ExportAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExportAssignment with Double = js.native
  /* 259 */ val ExportDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExportDeclaration with Double = js.native
  /* 88 */ val ExportKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExportKeyword with Double = js.native
  /* 261 */ val ExportSpecifier: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExportSpecifier with Double = js.native
  /* 225 */ val ExpressionStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExpressionStatement with Double = js.native
  /* 215 */ val ExpressionWithTypeArguments: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExpressionWithTypeArguments with Double = js.native
  /* 89 */ val ExtendsKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExtendsKeyword with Double = js.native
  /* 263 */ val ExternalModuleReference: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ExternalModuleReference with Double = js.native
  /* 90 */ val FalseKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FalseKeyword with Double = js.native
  /* 91 */ val FinallyKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FinallyKeyword with Double = js.native
  /* 62 */ val FirstAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstAssignment with Double = js.native
  /* 29 */ val FirstBinaryOperator: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstBinaryOperator with Double = js.native
  /* 63 */ val FirstCompoundAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstCompoundAssignment with Double = js.native
  /* 112 */ val FirstFutureReservedWord: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstFutureReservedWord with Double = js.native
  /* 292 */ val FirstJSDocNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstJSDocNode with Double = js.native
  /* 304 */ val FirstJSDocTagNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstJSDocTagNode with Double = js.native
  /* 76 */ val FirstKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstKeyword with Double = js.native
  /* 8 */ val FirstLiteralToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstLiteralToken with Double = js.native
  /* 152 */ val FirstNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstNode with Double = js.native
  /* 18 */ val FirstPunctuation: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstPunctuation with Double = js.native
  /* 76 */ val FirstReservedWord: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstReservedWord with Double = js.native
  /* 224 */ val FirstStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstStatement with Double = js.native
  /* 14 */ val FirstTemplateToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstTemplateToken with Double = js.native
  /* 0 */ val FirstToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstToken with Double = js.native
  /* 2 */ val FirstTriviaToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstTriviaToken with Double = js.native
  /* 167 */ val FirstTypeNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FirstTypeNode with Double = js.native
  /* 230 */ val ForInStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ForInStatement with Double = js.native
  /* 92 */ val ForKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ForKeyword with Double = js.native
  /* 231 */ val ForOfStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ForOfStatement with Double = js.native
  /* 229 */ val ForStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ForStatement with Double = js.native
  /* 148 */ val FromKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FromKeyword with Double = js.native
  /* 243 */ val FunctionDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FunctionDeclaration with Double = js.native
  /* 200 */ val FunctionExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FunctionExpression with Double = js.native
  /* 93 */ val FunctionKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FunctionKeyword with Double = js.native
  /* 169 */ val FunctionType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.FunctionType with Double = js.native
  /* 162 */ val GetAccessor: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GetAccessor with Double = js.native
  /* 130 */ val GetKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GetKeyword with Double = js.native
  /* 149 */ val GlobalKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GlobalKeyword with Double = js.native
  /* 33 */ val GreaterThanEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanEqualsToken with Double = js.native
  /* 70 */ val GreaterThanGreaterThanEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanEqualsToken with Double = js.native
  /* 71 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken with Double = js.native
  /* 49 */ val GreaterThanGreaterThanGreaterThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken with Double = js.native
  /* 48 */ val GreaterThanGreaterThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanToken with Double = js.native
  /* 31 */ val GreaterThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.GreaterThanToken with Double = js.native
  /* 277 */ val HeritageClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.HeritageClause with Double = js.native
  /* 75 */ val Identifier: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Identifier with Double = js.native
  /* 94 */ val IfKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IfKeyword with Double = js.native
  /* 226 */ val IfStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IfStatement with Double = js.native
  /* 112 */ val ImplementsKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImplementsKeyword with Double = js.native
  /* 254 */ val ImportClause: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportClause with Double = js.native
  /* 253 */ val ImportDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportDeclaration with Double = js.native
  /* 252 */ val ImportEqualsDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportEqualsDeclaration with Double = js.native
  /* 95 */ val ImportKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportKeyword with Double = js.native
  /* 257 */ val ImportSpecifier: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportSpecifier with Double = js.native
  /* 187 */ val ImportType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportType with Double = js.native
  /* 96 */ val InKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InKeyword with Double = js.native
  /* 166 */ val IndexSignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IndexSignature with Double = js.native
  /* 184 */ val IndexedAccessType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IndexedAccessType with Double = js.native
  /* 131 */ val InferKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InferKeyword with Double = js.native
  /* 180 */ val InferType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InferType with Double = js.native
  /* 291 */ val InputFiles: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InputFiles with Double = js.native
  /* 97 */ val InstanceOfKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InstanceOfKeyword with Double = js.native
  /* 245 */ val InterfaceDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InterfaceDeclaration with Double = js.native
  /* 113 */ val InterfaceKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.InterfaceKeyword with Double = js.native
  /* 178 */ val IntersectionType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IntersectionType with Double = js.native
  /* 132 */ val IsKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.IsKeyword with Double = js.native
  /* 293 */ val JSDocAllType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocAllType with Double = js.native
  /* 305 */ val JSDocAugmentsTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocAugmentsTag with Double = js.native
  /* 306 */ val JSDocAuthorTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocAuthorTag with Double = js.native
  /* 308 */ val JSDocCallbackTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocCallbackTag with Double = js.native
  /* 307 */ val JSDocClassTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocClassTag with Double = js.native
  /* 301 */ val JSDocComment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocComment with Double = js.native
  /* 309 */ val JSDocEnumTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocEnumTag with Double = js.native
  /* 298 */ val JSDocFunctionType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocFunctionType with Double = js.native
  /* 300 */ val JSDocNamepathType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocNamepathType with Double = js.native
  /* 296 */ val JSDocNonNullableType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocNonNullableType with Double = js.native
  /* 295 */ val JSDocNullableType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocNullableType with Double = js.native
  /* 297 */ val JSDocOptionalType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocOptionalType with Double = js.native
  /* 310 */ val JSDocParameterTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocParameterTag with Double = js.native
  /* 316 */ val JSDocPropertyTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocPropertyTag with Double = js.native
  /* 311 */ val JSDocReturnTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocReturnTag with Double = js.native
  /* 303 */ val JSDocSignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocSignature with Double = js.native
  /* 304 */ val JSDocTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTag with Double = js.native
  /* 314 */ val JSDocTemplateTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTemplateTag with Double = js.native
  /* 312 */ val JSDocThisTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocThisTag with Double = js.native
  /* 292 */ val JSDocTypeExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTypeExpression with Double = js.native
  /* 302 */ val JSDocTypeLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTypeLiteral with Double = js.native
  /* 313 */ val JSDocTypeTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTypeTag with Double = js.native
  /* 315 */ val JSDocTypedefTag: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocTypedefTag with Double = js.native
  /* 294 */ val JSDocUnknownType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocUnknownType with Double = js.native
  /* 299 */ val JSDocVariadicType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JSDocVariadicType with Double = js.native
  /* 271 */ val JsxAttribute: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxAttribute with Double = js.native
  /* 272 */ val JsxAttributes: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxAttributes with Double = js.native
  /* 267 */ val JsxClosingElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxClosingElement with Double = js.native
  /* 270 */ val JsxClosingFragment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxClosingFragment with Double = js.native
  /* 264 */ val JsxElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxElement with Double = js.native
  /* 274 */ val JsxExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxExpression with Double = js.native
  /* 268 */ val JsxFragment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxFragment with Double = js.native
  /* 266 */ val JsxOpeningElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxOpeningElement with Double = js.native
  /* 269 */ val JsxOpeningFragment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxOpeningFragment with Double = js.native
  /* 265 */ val JsxSelfClosingElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxSelfClosingElement with Double = js.native
  /* 273 */ val JsxSpreadAttribute: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxSpreadAttribute with Double = js.native
  /* 11 */ val JsxText: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxText with Double = js.native
  /* 12 */ val JsxTextAllWhiteSpaces: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxTextAllWhiteSpaces with Double = js.native
  /* 133 */ val KeyOfKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.KeyOfKeyword with Double = js.native
  /* 237 */ val LabeledStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LabeledStatement with Double = js.native
  /* 74 */ val LastAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastAssignment with Double = js.native
  /* 74 */ val LastBinaryOperator: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastBinaryOperator with Double = js.native
  /* 74 */ val LastCompoundAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastCompoundAssignment with Double = js.native
  /* 120 */ val LastFutureReservedWord: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastFutureReservedWord with Double = js.native
  /* 316 */ val LastJSDocNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastJSDocNode with Double = js.native
  /* 316 */ val LastJSDocTagNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastJSDocTagNode with Double = js.native
  /* 151 */ val LastKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastKeyword with Double = js.native
  /* 14 */ val LastLiteralToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastLiteralToken with Double = js.native
  /* 74 */ val LastPunctuation: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastPunctuation with Double = js.native
  /* 111 */ val LastReservedWord: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastReservedWord with Double = js.native
  /* 240 */ val LastStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastStatement with Double = js.native
  /* 17 */ val LastTemplateToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastTemplateToken with Double = js.native
  /* 151 */ val LastToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastToken with Double = js.native
  /* 7 */ val LastTriviaToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastTriviaToken with Double = js.native
  /* 187 */ val LastTypeNode: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LastTypeNode with Double = js.native
  /* 32 */ val LessThanEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LessThanEqualsToken with Double = js.native
  /* 69 */ val LessThanLessThanEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LessThanLessThanEqualsToken with Double = js.native
  /* 47 */ val LessThanLessThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LessThanLessThanToken with Double = js.native
  /* 30 */ val LessThanSlashToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LessThanSlashToken with Double = js.native
  /* 29 */ val LessThanToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LessThanToken with Double = js.native
  /* 114 */ val LetKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LetKeyword with Double = js.native
  /* 186 */ val LiteralType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.LiteralType with Double = js.native
  /* 185 */ val MappedType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MappedType with Double = js.native
  /* 321 */ val MergeDeclarationMarker: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MergeDeclarationMarker with Double = js.native
  /* 218 */ val MetaProperty: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MetaProperty with Double = js.native
  /* 160 */ val MethodDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MethodDeclaration with Double = js.native
  /* 159 */ val MethodSignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MethodSignature with Double = js.native
  /* 64 */ val MinusEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MinusEqualsToken with Double = js.native
  /* 46 */ val MinusMinusToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MinusMinusToken with Double = js.native
  /* 40 */ val MinusToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MinusToken with Double = js.native
  /* 262 */ val MissingDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MissingDeclaration with Double = js.native
  /* 249 */ val ModuleBlock: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ModuleBlock with Double = js.native
  /* 248 */ val ModuleDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ModuleDeclaration with Double = js.native
  /* 134 */ val ModuleKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ModuleKeyword with Double = js.native
  /* 3 */ val MultiLineCommentTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  /* 260 */ val NamedExports: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NamedExports with Double = js.native
  /* 256 */ val NamedImports: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NamedImports with Double = js.native
  /* 251 */ val NamespaceExportDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NamespaceExportDeclaration with Double = js.native
  /* 255 */ val NamespaceImport: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NamespaceImport with Double = js.native
  /* 135 */ val NamespaceKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NamespaceKeyword with Double = js.native
  /* 136 */ val NeverKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NeverKeyword with Double = js.native
  /* 196 */ val NewExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NewExpression with Double = js.native
  /* 98 */ val NewKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NewKeyword with Double = js.native
  /* 4 */ val NewLineTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NewLineTrivia with Double = js.native
  /* 14 */ val NoSubstitutionTemplateLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NoSubstitutionTemplateLiteral with Double = js.native
  /* 217 */ val NonNullExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NonNullExpression with Double = js.native
  /* 318 */ val NotEmittedStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NotEmittedStatement with Double = js.native
  /* 99 */ val NullKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NullKeyword with Double = js.native
  /* 139 */ val NumberKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NumberKeyword with Double = js.native
  /* 8 */ val NumericLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.NumericLiteral with Double = js.native
  /* 188 */ val ObjectBindingPattern: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ObjectBindingPattern with Double = js.native
  /* 140 */ val ObjectKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ObjectKeyword with Double = js.native
  /* 192 */ val ObjectLiteralExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ObjectLiteralExpression with Double = js.native
  /* 151 */ val OfKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OfKeyword with Double = js.native
  /* 214 */ val OmittedExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OmittedExpression with Double = js.native
  /* 18 */ val OpenBraceToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OpenBraceToken with Double = js.native
  /* 22 */ val OpenBracketToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OpenBracketToken with Double = js.native
  /* 20 */ val OpenParenToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OpenParenToken with Double = js.native
  /* 175 */ val OptionalType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.OptionalType with Double = js.native
  /* 115 */ val PackageKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PackageKeyword with Double = js.native
  /* 155 */ val Parameter: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Parameter with Double = js.native
  /* 199 */ val ParenthesizedExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ParenthesizedExpression with Double = js.native
  /* 181 */ val ParenthesizedType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ParenthesizedType with Double = js.native
  /* 319 */ val PartiallyEmittedExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PartiallyEmittedExpression with Double = js.native
  /* 68 */ val PercentEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PercentEqualsToken with Double = js.native
  /* 44 */ val PercentToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PercentToken with Double = js.native
  /* 63 */ val PlusEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PlusEqualsToken with Double = js.native
  /* 45 */ val PlusPlusToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PlusPlusToken with Double = js.native
  /* 39 */ val PlusToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PlusToken with Double = js.native
  /* 207 */ val PostfixUnaryExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PostfixUnaryExpression with Double = js.native
  /* 206 */ val PrefixUnaryExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PrefixUnaryExpression with Double = js.native
  /* 116 */ val PrivateKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PrivateKeyword with Double = js.native
  /* 193 */ val PropertyAccessExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PropertyAccessExpression with Double = js.native
  /* 279 */ val PropertyAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PropertyAssignment with Double = js.native
  /* 158 */ val PropertyDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PropertyDeclaration with Double = js.native
  /* 157 */ val PropertySignature: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PropertySignature with Double = js.native
  /* 117 */ val ProtectedKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ProtectedKeyword with Double = js.native
  /* 118 */ val PublicKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.PublicKeyword with Double = js.native
  /* 152 */ val QualifiedName: typingsJapgolly.typescript.typescriptMod.SyntaxKind.QualifiedName with Double = js.native
  /* 28 */ val QuestionDotToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.QuestionDotToken with Double = js.native
  /* 60 */ val QuestionQuestionToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.QuestionQuestionToken with Double = js.native
  /* 57 */ val QuestionToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.QuestionToken with Double = js.native
  /* 137 */ val ReadonlyKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword with Double = js.native
  /* 13 */ val RegularExpressionLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.RegularExpressionLiteral with Double = js.native
  /* 138 */ val RequireKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.RequireKeyword with Double = js.native
  /* 176 */ val RestType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.RestType with Double = js.native
  /* 100 */ val ReturnKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ReturnKeyword with Double = js.native
  /* 234 */ val ReturnStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ReturnStatement with Double = js.native
  /* 221 */ val SemicolonClassElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SemicolonClassElement with Double = js.native
  /* 26 */ val SemicolonToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SemicolonToken with Double = js.native
  /* 163 */ val SetAccessor: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SetAccessor with Double = js.native
  /* 141 */ val SetKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SetKeyword with Double = js.native
  /* 6 */ val ShebangTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ShebangTrivia with Double = js.native
  /* 280 */ val ShorthandPropertyAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ShorthandPropertyAssignment with Double = js.native
  /* 2 */ val SingleLineCommentTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  /* 67 */ val SlashEqualsToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SlashEqualsToken with Double = js.native
  /* 43 */ val SlashToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SlashToken with Double = js.native
  /* 288 */ val SourceFile: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SourceFile with Double = js.native
  /* 281 */ val SpreadAssignment: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SpreadAssignment with Double = js.native
  /* 212 */ val SpreadElement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SpreadElement with Double = js.native
  /* 119 */ val StaticKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.StaticKeyword with Double = js.native
  /* 142 */ val StringKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.StringKeyword with Double = js.native
  /* 10 */ val StringLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.StringLiteral with Double = js.native
  /* 101 */ val SuperKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SuperKeyword with Double = js.native
  /* 102 */ val SwitchKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SwitchKeyword with Double = js.native
  /* 236 */ val SwitchStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SwitchStatement with Double = js.native
  /* 143 */ val SymbolKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SymbolKeyword with Double = js.native
  /* 317 */ val SyntaxList: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SyntaxList with Double = js.native
  /* 219 */ val SyntheticExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SyntheticExpression with Double = js.native
  /* 323 */ val SyntheticReferenceExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.SyntheticReferenceExpression with Double = js.native
  /* 197 */ val TaggedTemplateExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TaggedTemplateExpression with Double = js.native
  /* 210 */ val TemplateExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TemplateExpression with Double = js.native
  /* 15 */ val TemplateHead: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TemplateHead with Double = js.native
  /* 16 */ val TemplateMiddle: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TemplateMiddle with Double = js.native
  /* 220 */ val TemplateSpan: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TemplateSpan with Double = js.native
  /* 17 */ val TemplateTail: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TemplateTail with Double = js.native
  /* 103 */ val ThisKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ThisKeyword with Double = js.native
  /* 182 */ val ThisType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ThisType with Double = js.native
  /* 104 */ val ThrowKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ThrowKeyword with Double = js.native
  /* 238 */ val ThrowStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.ThrowStatement with Double = js.native
  /* 54 */ val TildeToken: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TildeToken with Double = js.native
  /* 105 */ val TrueKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TrueKeyword with Double = js.native
  /* 106 */ val TryKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TryKeyword with Double = js.native
  /* 239 */ val TryStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TryStatement with Double = js.native
  /* 174 */ val TupleType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TupleType with Double = js.native
  /* 246 */ val TypeAliasDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeAliasDeclaration with Double = js.native
  /* 198 */ val TypeAssertionExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeAssertionExpression with Double = js.native
  /* 144 */ val TypeKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeKeyword with Double = js.native
  /* 172 */ val TypeLiteral: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeLiteral with Double = js.native
  /* 203 */ val TypeOfExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeOfExpression with Double = js.native
  /* 107 */ val TypeOfKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeOfKeyword with Double = js.native
  /* 183 */ val TypeOperator: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeOperator with Double = js.native
  /* 154 */ val TypeParameter: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeParameter with Double = js.native
  /* 167 */ val TypePredicate: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypePredicate with Double = js.native
  /* 171 */ val TypeQuery: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeQuery with Double = js.native
  /* 168 */ val TypeReference: typingsJapgolly.typescript.typescriptMod.SyntaxKind.TypeReference with Double = js.native
  /* 145 */ val UndefinedKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UndefinedKeyword with Double = js.native
  /* 177 */ val UnionType: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnionType with Double = js.native
  /* 146 */ val UniqueKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UniqueKeyword with Double = js.native
  /* 0 */ val Unknown: typingsJapgolly.typescript.typescriptMod.SyntaxKind.Unknown with Double = js.native
  /* 147 */ val UnknownKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnknownKeyword with Double = js.native
  /* 286 */ val UnparsedInternalText: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedInternalText with Double = js.native
  /* 284 */ val UnparsedPrepend: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedPrepend with Double = js.native
  /* 283 */ val UnparsedPrologue: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedPrologue with Double = js.native
  /* 290 */ val UnparsedSource: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedSource with Double = js.native
  /* 287 */ val UnparsedSyntheticReference: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedSyntheticReference with Double = js.native
  /* 285 */ val UnparsedText: typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnparsedText with Double = js.native
  /* 108 */ val VarKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VarKeyword with Double = js.native
  /* 241 */ val VariableDeclaration: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VariableDeclaration with Double = js.native
  /* 242 */ val VariableDeclarationList: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VariableDeclarationList with Double = js.native
  /* 224 */ val VariableStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VariableStatement with Double = js.native
  /* 204 */ val VoidExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VoidExpression with Double = js.native
  /* 109 */ val VoidKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.VoidKeyword with Double = js.native
  /* 110 */ val WhileKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.WhileKeyword with Double = js.native
  /* 228 */ val WhileStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.WhileStatement with Double = js.native
  /* 5 */ val WhitespaceTrivia: typingsJapgolly.typescript.typescriptMod.SyntaxKind.WhitespaceTrivia with Double = js.native
  /* 111 */ val WithKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.WithKeyword with Double = js.native
  /* 235 */ val WithStatement: typingsJapgolly.typescript.typescriptMod.SyntaxKind.WithStatement with Double = js.native
  /* 211 */ val YieldExpression: typingsJapgolly.typescript.typescriptMod.SyntaxKind.YieldExpression with Double = js.native
  /* 120 */ val YieldKeyword: typingsJapgolly.typescript.typescriptMod.SyntaxKind.YieldKeyword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
}

