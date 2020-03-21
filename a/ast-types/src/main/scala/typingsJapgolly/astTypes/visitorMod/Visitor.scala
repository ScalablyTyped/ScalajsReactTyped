package typingsJapgolly.astTypes.visitorMod

import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.AwaitExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BindExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Block
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Comment
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentLine
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Declaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Decorator
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Directive
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Expression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.File
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Flow
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FlowPredicate
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FlowType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Function
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceExtends
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterpreterDirective
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXAttribute
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Line
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ModuleSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Node
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Noop
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Pattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Position
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Printable
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Program
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Property
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.PropertyPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SequenceExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SourceLocation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Specifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Statement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Super
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchCase
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumMember
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNullKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSStringKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSThisType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeOperator
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclarator
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Variance
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.YieldExpression
import typingsJapgolly.astTypes.nodePathMod.NodePath
import typingsJapgolly.astTypes.pathVisitorMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[M] extends js.Object {
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]
  ] = js.undefined
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]
  ] = js.undefined
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
  ] = js.undefined
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
  ] = js.undefined
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]
  ] = js.undefined
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]
  ] = js.undefined
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]
  ] = js.undefined
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]
  ] = js.undefined
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]
  ] = js.undefined
  var visitBlock: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]] = js.undefined
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]
  ] = js.undefined
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]
  ] = js.undefined
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
  ] = js.undefined
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]
  ] = js.undefined
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]
  ] = js.undefined
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]
  ] = js.undefined
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]
  ] = js.undefined
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]
  ] = js.undefined
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]
  ] = js.undefined
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]
  ] = js.undefined
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]
  ] = js.undefined
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]
  ] = js.undefined
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
  ] = js.undefined
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]
  ] = js.undefined
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
  ] = js.undefined
  var visitComment: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]] = js.undefined
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]
  ] = js.undefined
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]
  ] = js.undefined
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]
  ] = js.undefined
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
  ] = js.undefined
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
  ] = js.undefined
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]
  ] = js.undefined
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]
  ] = js.undefined
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]
  ] = js.undefined
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]
  ] = js.undefined
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
  ] = js.undefined
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
  ] = js.undefined
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]
  ] = js.undefined
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]
  ] = js.undefined
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]
  ] = js.undefined
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
  ] = js.undefined
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]
  ] = js.undefined
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]
  ] = js.undefined
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]
  ] = js.undefined
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]
  ] = js.undefined
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]
  ] = js.undefined
  var visitDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]
  ] = js.undefined
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]
  ] = js.undefined
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]
  ] = js.undefined
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]
  ] = js.undefined
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]
  ] = js.undefined
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]
  ] = js.undefined
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
  ] = js.undefined
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
  ] = js.undefined
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
  ] = js.undefined
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
  ] = js.undefined
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
  ] = js.undefined
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]
  ] = js.undefined
  var visitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]
  ] = js.undefined
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]
  ] = js.undefined
  var visitFile: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]] = js.undefined
  var visitFlow: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]] = js.undefined
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]
  ] = js.undefined
  var visitFlowType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]] = js.undefined
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]
  ] = js.undefined
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]
  ] = js.undefined
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]
  ] = js.undefined
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]
  ] = js.undefined
  var visitFunction: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]] = js.undefined
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]
  ] = js.undefined
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]
  ] = js.undefined
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
  ] = js.undefined
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]
  ] = js.undefined
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]
  ] = js.undefined
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
  ] = js.undefined
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]
  ] = js.undefined
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]
  ] = js.undefined
  var visitImport: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]] = js.undefined
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]
  ] = js.undefined
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]
  ] = js.undefined
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]
  ] = js.undefined
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
  ] = js.undefined
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]
  ] = js.undefined
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
  ] = js.undefined
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
  ] = js.undefined
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
  ] = js.undefined
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]
  ] = js.undefined
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]
  ] = js.undefined
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]
  ] = js.undefined
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]
  ] = js.undefined
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]
  ] = js.undefined
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
  ] = js.undefined
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]
  ] = js.undefined
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]
  ] = js.undefined
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]
  ] = js.undefined
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]
  ] = js.undefined
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]
  ] = js.undefined
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]
  ] = js.undefined
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]
  ] = js.undefined
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]
  ] = js.undefined
  var visitJSXText: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]] = js.undefined
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]
  ] = js.undefined
  var visitLine: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]] = js.undefined
  var visitLiteral: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]] = js.undefined
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]
  ] = js.undefined
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]
  ] = js.undefined
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
  ] = js.undefined
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]
  ] = js.undefined
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]
  ] = js.undefined
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]
  ] = js.undefined
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]
  ] = js.undefined
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]
  ] = js.undefined
  var visitNode: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]] = js.undefined
  var visitNoop: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]] = js.undefined
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]
  ] = js.undefined
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]
  ] = js.undefined
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]
  ] = js.undefined
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]
  ] = js.undefined
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]
  ] = js.undefined
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]
  ] = js.undefined
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
  ] = js.undefined
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]
  ] = js.undefined
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
  ] = js.undefined
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]
  ] = js.undefined
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
  ] = js.undefined
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]
  ] = js.undefined
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
  ] = js.undefined
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
  ] = js.undefined
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
  ] = js.undefined
  var visitPattern: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]] = js.undefined
  var visitPosition: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]] = js.undefined
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]
  ] = js.undefined
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]
  ] = js.undefined
  var visitProgram: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]] = js.undefined
  var visitProperty: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]] = js.undefined
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]
  ] = js.undefined
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
  ] = js.undefined
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]
  ] = js.undefined
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]
  ] = js.undefined
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]
  ] = js.undefined
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]
  ] = js.undefined
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]
  ] = js.undefined
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]
  ] = js.undefined
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]
  ] = js.undefined
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]
  ] = js.undefined
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
  ] = js.undefined
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]
  ] = js.undefined
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
  ] = js.undefined
  var visitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]
  ] = js.undefined
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]
  ] = js.undefined
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
  ] = js.undefined
  var visitSuper: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]] = js.undefined
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]
  ] = js.undefined
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]
  ] = js.undefined
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]
  ] = js.undefined
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]
  ] = js.undefined
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]
  ] = js.undefined
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]
  ] = js.undefined
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]
  ] = js.undefined
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
  ] = js.undefined
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]
  ] = js.undefined
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]
  ] = js.undefined
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]
  ] = js.undefined
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]
  ] = js.undefined
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]
  ] = js.undefined
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]
  ] = js.undefined
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]
  ] = js.undefined
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
  ] = js.undefined
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
  ] = js.undefined
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
  ] = js.undefined
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
  ] = js.undefined
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]
  ] = js.undefined
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]
  ] = js.undefined
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]
  ] = js.undefined
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]
  ] = js.undefined
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]
  ] = js.undefined
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
  ] = js.undefined
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]
  ] = js.undefined
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]
  ] = js.undefined
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]
  ] = js.undefined
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]
  ] = js.undefined
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]
  ] = js.undefined
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]
  ] = js.undefined
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
  ] = js.undefined
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]
  ] = js.undefined
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]
  ] = js.undefined
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]
  ] = js.undefined
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]
  ] = js.undefined
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]
  ] = js.undefined
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]
  ] = js.undefined
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]
  ] = js.undefined
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]
  ] = js.undefined
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]
  ] = js.undefined
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]
  ] = js.undefined
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]
  ] = js.undefined
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]
  ] = js.undefined
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]
  ] = js.undefined
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]
  ] = js.undefined
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]
  ] = js.undefined
  var visitTSType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]] = js.undefined
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]
  ] = js.undefined
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]
  ] = js.undefined
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]
  ] = js.undefined
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]
  ] = js.undefined
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]
  ] = js.undefined
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]
  ] = js.undefined
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]
  ] = js.undefined
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]
  ] = js.undefined
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]
  ] = js.undefined
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]
  ] = js.undefined
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]
  ] = js.undefined
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
  ] = js.undefined
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]
  ] = js.undefined
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]
  ] = js.undefined
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]
  ] = js.undefined
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]
  ] = js.undefined
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]
  ] = js.undefined
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]
  ] = js.undefined
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]
  ] = js.undefined
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]
  ] = js.undefined
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]
  ] = js.undefined
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
  ] = js.undefined
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]
  ] = js.undefined
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]
  ] = js.undefined
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]
  ] = js.undefined
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]
  ] = js.undefined
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]
  ] = js.undefined
  var visitVariance: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]] = js.undefined
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]
  ] = js.undefined
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]
  ] = js.undefined
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]
  ] = js.undefined
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]
  ] = js.undefined
}

