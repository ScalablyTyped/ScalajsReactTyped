package typingsJapgolly.astTypes

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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentLine
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement
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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.File
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression
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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Position
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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
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
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/gen/kinds", JSImport.Namespace)
@js.native
object kindsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait CallExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  */
  trait ClassPropertyKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Block
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Line
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentLine
  */
  trait CommentKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait DeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Super
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait ExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowPredicateKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  */
  trait FlowTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  */
  trait FunctionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  */
  trait IdentifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
  */
  trait InterfaceDeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  */
  trait LiteralKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  */
  trait MemberExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  */
  trait ModuleSpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.File
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Program
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchCase
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclarator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Property
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Variance
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceExtends
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Noop
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Super
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Decorator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Directive
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterpreterDirective
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSQualifiedName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNullKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSStringKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSThisType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumMember
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait NodeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  */
  trait PatternKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.File
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Program
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchCase
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclarator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Property
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Variance
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceExtends
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Block
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Line
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Noop
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Super
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BindExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Decorator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentLine
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Directive
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterpreterDirective
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSQualifiedName
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNullKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSStringKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSThisType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumMember
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleBlock
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait PrintableKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
  */
  trait SpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.Noop
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait StatementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  */
  trait TSHasOptionalTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
  */
  trait TSHasOptionalTypeParameterInstantiationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait TSHasOptionalTypeParametersKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  */
  trait TSTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNullKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSStringKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSThisType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
  */
  trait TSTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  */
  trait TypeAliasKind extends js.Object
  
  type AnyTypeAnnotationKind = AnyTypeAnnotation
  type ArrayExpressionKind = ArrayExpression
  type ArrayPatternKind = ArrayPattern
  type ArrayTypeAnnotationKind = ArrayTypeAnnotation
  type ArrowFunctionExpressionKind = ArrowFunctionExpression
  type AssignmentExpressionKind = AssignmentExpression
  type AssignmentPatternKind = AssignmentPattern
  type AwaitExpressionKind = AwaitExpression
  type BigIntLiteralKind = BigIntLiteral
  type BinaryExpressionKind = BinaryExpression
  type BindExpressionKind = BindExpression
  type BlockKind = Block
  type BlockStatementKind = BlockStatement
  type BooleanLiteralKind = BooleanLiteral
  type BooleanLiteralTypeAnnotationKind = BooleanLiteralTypeAnnotation
  type BooleanTypeAnnotationKind = BooleanTypeAnnotation
  type BreakStatementKind = BreakStatement
  type CatchClauseKind = CatchClause
  type ClassBodyKind = ClassBody
  type ClassDeclarationKind = ClassDeclaration
  type ClassExpressionKind = ClassExpression
  type ClassImplementsKind = ClassImplements
  type ClassMethodKind = ClassMethod
  type ClassPrivateMethodKind = ClassPrivateMethod
  type ClassPrivatePropertyKind = ClassPrivateProperty
  type ClassPropertyDefinitionKind = ClassPropertyDefinition
  type CommentBlockKind = CommentBlock
  type CommentLineKind = CommentLine
  type ComprehensionBlockKind = ComprehensionBlock
  type ComprehensionExpressionKind = ComprehensionExpression
  type ConditionalExpressionKind = ConditionalExpression
  type ContinueStatementKind = ContinueStatement
  type DebuggerStatementKind = DebuggerStatement
  type DeclareClassKind = DeclareClass
  type DeclareExportAllDeclarationKind = DeclareExportAllDeclaration
  type DeclareExportDeclarationKind = DeclareExportDeclaration
  type DeclareFunctionKind = DeclareFunction
  type DeclareInterfaceKind = DeclareInterface
  type DeclareModuleExportsKind = DeclareModuleExports
  type DeclareModuleKind = DeclareModule
  type DeclareOpaqueTypeKind = DeclareOpaqueType
  type DeclareTypeAliasKind = DeclareTypeAlias
  type DeclareVariableKind = DeclareVariable
  type DeclaredPredicateKind = DeclaredPredicate
  type DecoratorKind = Decorator
  type DirectiveKind = Directive
  type DirectiveLiteralKind = DirectiveLiteral
  type DoExpressionKind = DoExpression
  type DoWhileStatementKind = DoWhileStatement
  type EmptyStatementKind = EmptyStatement
  type EmptyTypeAnnotationKind = EmptyTypeAnnotation
  type ExistentialTypeParamKind = ExistentialTypeParam
  type ExistsTypeAnnotationKind = ExistsTypeAnnotation
  type ExportAllDeclarationKind = ExportAllDeclaration
  type ExportBatchSpecifierKind = ExportBatchSpecifier
  type ExportDeclarationKind = ExportDeclaration
  type ExportDefaultDeclarationKind = ExportDefaultDeclaration
  type ExportDefaultSpecifierKind = ExportDefaultSpecifier
  type ExportNamedDeclarationKind = ExportNamedDeclaration
  type ExportNamespaceSpecifierKind = ExportNamespaceSpecifier
  type ExportSpecifierKind = ExportSpecifier
  type ExpressionStatementKind = ExpressionStatement
  type FileKind = File
  type ForAwaitStatementKind = ForAwaitStatement
  type ForInStatementKind = ForInStatement
  type ForOfStatementKind = ForOfStatement
  type ForStatementKind = ForStatement
  type FunctionDeclarationKind = FunctionDeclaration
  type FunctionExpressionKind = FunctionExpression
  type FunctionTypeAnnotationKind = FunctionTypeAnnotation
  type FunctionTypeParamKind = FunctionTypeParam
  type GeneratorExpressionKind = GeneratorExpression
  type GenericTypeAnnotationKind = GenericTypeAnnotation
  type IfStatementKind = IfStatement
  type ImportDeclarationKind = ImportDeclaration
  type ImportDefaultSpecifierKind = ImportDefaultSpecifier
  type ImportKind = Import
  type ImportNamespaceSpecifierKind = ImportNamespaceSpecifier
  type ImportSpecifierKind = ImportSpecifier
  type InferredPredicateKind = InferredPredicate
  type InterfaceExtendsKind = InterfaceExtends
  type InterfaceTypeAnnotationKind = InterfaceTypeAnnotation
  type InterpreterDirectiveKind = InterpreterDirective
  type IntersectionTypeAnnotationKind = IntersectionTypeAnnotation
  type JSXAttributeKind = JSXAttribute
  type JSXClosingElementKind = JSXClosingElement
  type JSXClosingFragmentKind = JSXClosingFragment
  type JSXElementKind = JSXElement
  type JSXEmptyExpressionKind = JSXEmptyExpression
  type JSXExpressionContainerKind = JSXExpressionContainer
  type JSXFragmentKind = JSXFragment
  type JSXIdentifierKind = JSXIdentifier
  type JSXMemberExpressionKind = JSXMemberExpression
  type JSXNamespacedNameKind = JSXNamespacedName
  type JSXOpeningElementKind = JSXOpeningElement
  type JSXOpeningFragmentKind = JSXOpeningFragment
  type JSXSpreadAttributeKind = JSXSpreadAttribute
  type JSXSpreadChildKind = JSXSpreadChild
  type JSXTextKind = JSXText
  type LabeledStatementKind = LabeledStatement
  type LineKind = Line
  type LogicalExpressionKind = LogicalExpression
  type MemberTypeAnnotationKind = MemberTypeAnnotation
  type MetaPropertyKind = MetaProperty
  type MethodDefinitionKind = MethodDefinition
  type MixedTypeAnnotationKind = MixedTypeAnnotation
  type NewExpressionKind = NewExpression
  type NoopKind = Noop
  type NullLiteralKind = NullLiteral
  type NullLiteralTypeAnnotationKind = NullLiteralTypeAnnotation
  type NullTypeAnnotationKind = NullTypeAnnotation
  type NullableTypeAnnotationKind = NullableTypeAnnotation
  type NumberLiteralTypeAnnotationKind = NumberLiteralTypeAnnotation
  type NumberTypeAnnotationKind = NumberTypeAnnotation
  type NumericLiteralKind = NumericLiteral
  type NumericLiteralTypeAnnotationKind = NumericLiteralTypeAnnotation
  type ObjectExpressionKind = ObjectExpression
  type ObjectMethodKind = ObjectMethod
  type ObjectPatternKind = ObjectPattern
  type ObjectPropertyKind = ObjectProperty
  type ObjectTypeAnnotationKind = ObjectTypeAnnotation
  type ObjectTypeCallPropertyKind = ObjectTypeCallProperty
  type ObjectTypeIndexerKind = ObjectTypeIndexer
  type ObjectTypeInternalSlotKind = ObjectTypeInternalSlot
  type ObjectTypePropertyKind = ObjectTypeProperty
  type ObjectTypeSpreadPropertyKind = ObjectTypeSpreadProperty
  type OpaqueTypeKind = OpaqueType
  type OptionalCallExpressionKind = OptionalCallExpression
  type OptionalMemberExpressionKind = OptionalMemberExpression
  type ParenthesizedExpressionKind = ParenthesizedExpression
  type PositionKind = Position
  type PrivateNameKind = PrivateName
  type ProgramKind = Program
  type PropertyKind = Property
  type PropertyPatternKind = PropertyPattern
  type QualifiedTypeIdentifierKind = QualifiedTypeIdentifier
  type RegExpLiteralKind = RegExpLiteral
  type RestElementKind = RestElement
  type RestPropertyKind = RestProperty
  type ReturnStatementKind = ReturnStatement
  type SequenceExpressionKind = SequenceExpression
  type SourceLocationKind = SourceLocation
  type SpreadElementKind = SpreadElement
  type SpreadElementPatternKind = SpreadElementPattern
  type SpreadPropertyKind = SpreadProperty
  type SpreadPropertyPatternKind = SpreadPropertyPattern
  type StringLiteralKind = StringLiteral
  type StringLiteralTypeAnnotationKind = StringLiteralTypeAnnotation
  type StringTypeAnnotationKind = StringTypeAnnotation
  type SuperKind = Super
  type SwitchCaseKind = SwitchCase
  type SwitchStatementKind = SwitchStatement
  type TSAnyKeywordKind = TSAnyKeyword
  type TSArrayTypeKind = TSArrayType
  type TSAsExpressionKind = TSAsExpression
  type TSBigIntKeywordKind = TSBigIntKeyword
  type TSBooleanKeywordKind = TSBooleanKeyword
  type TSCallSignatureDeclarationKind = TSCallSignatureDeclaration
  type TSConditionalTypeKind = TSConditionalType
  type TSConstructSignatureDeclarationKind = TSConstructSignatureDeclaration
  type TSConstructorTypeKind = TSConstructorType
  type TSDeclareFunctionKind = TSDeclareFunction
  type TSDeclareMethodKind = TSDeclareMethod
  type TSEnumDeclarationKind = TSEnumDeclaration
  type TSEnumMemberKind = TSEnumMember
  type TSExportAssignmentKind = TSExportAssignment
  type TSExpressionWithTypeArgumentsKind = TSExpressionWithTypeArguments
  type TSExternalModuleReferenceKind = TSExternalModuleReference
  type TSFunctionTypeKind = TSFunctionType
  type TSImportEqualsDeclarationKind = TSImportEqualsDeclaration
  type TSImportTypeKind = TSImportType
  type TSIndexSignatureKind = TSIndexSignature
  type TSIndexedAccessTypeKind = TSIndexedAccessType
  type TSInferTypeKind = TSInferType
  type TSInterfaceBodyKind = TSInterfaceBody
  type TSInterfaceDeclarationKind = TSInterfaceDeclaration
  type TSIntersectionTypeKind = TSIntersectionType
  type TSLiteralTypeKind = TSLiteralType
  type TSMappedTypeKind = TSMappedType
  type TSMethodSignatureKind = TSMethodSignature
  type TSModuleBlockKind = TSModuleBlock
  type TSModuleDeclarationKind = TSModuleDeclaration
  type TSNamespaceExportDeclarationKind = TSNamespaceExportDeclaration
  type TSNeverKeywordKind = TSNeverKeyword
  type TSNonNullExpressionKind = TSNonNullExpression
  type TSNullKeywordKind = TSNullKeyword
  type TSNumberKeywordKind = TSNumberKeyword
  type TSObjectKeywordKind = TSObjectKeyword
  type TSOptionalTypeKind = TSOptionalType
  type TSParameterPropertyKind = TSParameterProperty
  type TSParenthesizedTypeKind = TSParenthesizedType
  type TSPropertySignatureKind = TSPropertySignature
  type TSQualifiedNameKind = TSQualifiedName
  type TSRestTypeKind = TSRestType
  type TSStringKeywordKind = TSStringKeyword
  type TSSymbolKeywordKind = TSSymbolKeyword
  type TSThisTypeKind = TSThisType
  type TSTupleTypeKind = TSTupleType
  type TSTypeAliasDeclarationKind = TSTypeAliasDeclaration
  type TSTypeAssertionKind = TSTypeAssertion
  type TSTypeLiteralKind = TSTypeLiteral
  type TSTypeOperatorKind = TSTypeOperator
  type TSTypeParameterDeclarationKind = TSTypeParameterDeclaration
  type TSTypeParameterInstantiationKind = TSTypeParameterInstantiation
  type TSTypeParameterKind = TSTypeParameter
  type TSTypePredicateKind = TSTypePredicate
  type TSTypeQueryKind = TSTypeQuery
  type TSTypeReferenceKind = TSTypeReference
  type TSUndefinedKeywordKind = TSUndefinedKeyword
  type TSUnionTypeKind = TSUnionType
  type TSUnknownKeywordKind = TSUnknownKeyword
  type TSVoidKeywordKind = TSVoidKeyword
  type TaggedTemplateExpressionKind = TaggedTemplateExpression
  type TemplateElementKind = TemplateElement
  type TemplateLiteralKind = TemplateLiteral
  type ThisExpressionKind = ThisExpression
  type ThisTypeAnnotationKind = ThisTypeAnnotation
  type ThrowStatementKind = ThrowStatement
  type TryStatementKind = TryStatement
  type TupleTypeAnnotationKind = TupleTypeAnnotation
  type TypeAnnotationKind = TypeAnnotation
  type TypeCastExpressionKind = TypeCastExpression
  type TypeParameterDeclarationKind = TypeParameterDeclaration
  type TypeParameterInstantiationKind = TypeParameterInstantiation
  type TypeParameterKind = TypeParameter
  type TypeofTypeAnnotationKind = TypeofTypeAnnotation
  type UnaryExpressionKind = UnaryExpression
  type UnionTypeAnnotationKind = UnionTypeAnnotation
  type UpdateExpressionKind = UpdateExpression
  type VariableDeclarationKind = VariableDeclaration
  type VariableDeclaratorKind = VariableDeclarator
  type VarianceKind = Variance
  type VoidTypeAnnotationKind = VoidTypeAnnotation
  type WhileStatementKind = WhileStatement
  type WithStatementKind = WithStatement
  type YieldExpressionKind = YieldExpression
}

