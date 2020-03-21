package typingsJapgolly.astTypes.namedTypesMod

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
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypes_ extends js.Object {
  var AnyTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  var ArrayExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  var ArrayPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  var ArrayTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  var ArrowFunctionExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  var AssignmentExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  var AssignmentPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  var AwaitExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  var BigIntLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  var BinaryExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  var BindExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BindExpression]
  var Block: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Block]
  var BlockStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BlockStatement]
  var BooleanLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  var BooleanLiteralTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  var BooleanTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  var BreakStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.BreakStatement]
  var CallExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.CallExpression]
  var CatchClause: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.CatchClause]
  var ClassBody: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody]
  var ClassDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  var ClassExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassExpression]
  var ClassImplements: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements]
  var ClassMethod: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassMethod]
  var ClassPrivateMethod: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  var ClassPrivateProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  var ClassProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassProperty]
  var ClassPropertyDefinition: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  var Comment: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Comment]
  var CommentBlock: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentBlock]
  var CommentLine: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.CommentLine]
  var ComprehensionBlock: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionBlock]
  var ComprehensionExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  var ConditionalExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  var ContinueStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ContinueStatement]
  var DebuggerStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DebuggerStatement]
  var Declaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Declaration]
  var DeclareClass: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareClass]
  var DeclareExportAllDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  var DeclareExportDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  var DeclareFunction: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareFunction]
  var DeclareInterface: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  var DeclareModule: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModule]
  var DeclareModuleExports: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareModuleExports]
  var DeclareOpaqueType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  var DeclareTypeAlias: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  var DeclareVariable: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareVariable]
  var DeclaredPredicate: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  var Decorator: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Decorator]
  var Directive: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Directive]
  var DirectiveLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  var DoExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression]
  var DoWhileStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement]
  var EmptyStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyStatement]
  var EmptyTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  var ExistentialTypeParam: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  var ExistsTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  var ExportAllDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  var ExportBatchSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  var ExportDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  var ExportDefaultDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  var ExportDefaultSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  var ExportNamedDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  var ExportNamespaceSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  var ExportSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  var Expression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Expression]
  var ExpressionStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement]
  var File: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.File]
  var Flow: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Flow]
  var FlowPredicate: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FlowPredicate]
  var FlowType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FlowType]
  var ForAwaitStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForAwaitStatement]
  var ForInStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForInStatement]
  var ForOfStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForOfStatement]
  var ForStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ForStatement]
  var Function: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Function]
  var FunctionDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  var FunctionExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  var FunctionTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  var FunctionTypeParam: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionTypeParam]
  var GeneratorExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  var GenericTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  var Identifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier]
  var IfStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.IfStatement]
  var Import: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Import]
  var ImportDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  var ImportDefaultSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  var ImportNamespaceSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  var ImportSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  var InferredPredicate: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  var InterfaceDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  var InterfaceExtends: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceExtends]
  var InterfaceTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  var InterpreterDirective: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterpreterDirective]
  var IntersectionTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  var JSXAttribute: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXAttribute]
  var JSXClosingElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingElement]
  var JSXClosingFragment: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXClosingFragment]
  var JSXElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXElement]
  var JSXEmptyExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression]
  var JSXExpressionContainer: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  var JSXFragment: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment]
  var JSXIdentifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  var JSXMemberExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  var JSXNamespacedName: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXNamespacedName]
  var JSXOpeningElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningElement]
  var JSXOpeningFragment: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment]
  var JSXSpreadAttribute: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute]
  var JSXSpreadChild: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXSpreadChild]
  var JSXText: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXText]
  var LabeledStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.LabeledStatement]
  var Line: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Line]
  var Literal: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Literal]
  var LogicalExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  var MemberExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberExpression]
  var MemberTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  var MetaProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.MetaProperty]
  var MethodDefinition: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  var MixedTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  var ModuleSpecifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ModuleSpecifier]
  var NewExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NewExpression]
  var Node: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Node]
  var Noop: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Noop]
  var NullLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteral]
  var NullLiteralTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  var NullTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  var NullableTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  var NumberLiteralTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  var NumberTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  var NumericLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  var NumericLiteralTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  var ObjectExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  var ObjectMethod: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  var ObjectPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  var ObjectProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectProperty]
  var ObjectTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  var ObjectTypeCallProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty]
  var ObjectTypeIndexer: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer]
  var ObjectTypeInternalSlot: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot]
  var ObjectTypeProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty]
  var ObjectTypeSpreadProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty]
  var OpaqueType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.OpaqueType]
  var OptionalCallExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  var OptionalMemberExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  var ParenthesizedExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  var Pattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Pattern]
  var Position: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Position]
  var Printable: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Printable]
  var PrivateName: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName]
  var Program: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Program]
  var Property: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Property]
  var PropertyPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  var QualifiedTypeIdentifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier]
  var RegExpLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  var RestElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestElement]
  var RestProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.RestProperty]
  var ReturnStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement]
  var SequenceExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  var SourceLocation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SourceLocation]
  var Specifier: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Specifier]
  var SpreadElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElement]
  var SpreadElementPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  var SpreadProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadProperty]
  var SpreadPropertyPattern: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  var Statement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Statement]
  var StringLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteral]
  var StringLiteralTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  var StringTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  var Super: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Super]
  var SwitchCase: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchCase]
  var SwitchStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchStatement]
  var TSAnyKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  var TSArrayType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSArrayType]
  var TSAsExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  var TSBigIntKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  var TSBooleanKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  var TSCallSignatureDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  var TSConditionalType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  var TSConstructSignatureDeclaration: Type[
    typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  ]
  var TSConstructorType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  var TSDeclareFunction: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  var TSDeclareMethod: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  var TSEnumDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  var TSEnumMember: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSEnumMember]
  var TSExportAssignment: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExportAssignment]
  var TSExpressionWithTypeArguments: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  var TSExternalModuleReference: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  var TSFunctionType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  var TSHasOptionalTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation]
  var TSHasOptionalTypeParameterInstantiation: Type[
    typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
  ]
  var TSHasOptionalTypeParameters: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters]
  var TSImportEqualsDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  var TSImportType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType]
  var TSIndexSignature: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  var TSIndexedAccessType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  var TSInferType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInferType]
  var TSInterfaceBody: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceBody]
  var TSInterfaceDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  var TSIntersectionType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  var TSLiteralType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  var TSMappedType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMappedType]
  var TSMethodSignature: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  var TSModuleBlock: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleBlock]
  var TSModuleDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  var TSNamespaceExportDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  var TSNeverKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  var TSNonNullExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  var TSNullKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  var TSNumberKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  var TSObjectKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  var TSOptionalType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  var TSParameterProperty: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  var TSParenthesizedType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  var TSPropertySignature: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  var TSQualifiedName: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSQualifiedName]
  var TSRestType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSRestType]
  var TSStringKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  var TSSymbolKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  var TSThisType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSThisType]
  var TSTupleType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTupleType]
  var TSType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSType]
  var TSTypeAliasDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  var TSTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  var TSTypeAssertion: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  var TSTypeLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  var TSTypeOperator: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  var TSTypeParameter: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  var TSTypeParameterDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  var TSTypeParameterInstantiation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation]
  var TSTypePredicate: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  var TSTypeQuery: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  var TSTypeReference: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  var TSUndefinedKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  var TSUnionType: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnionType]
  var TSUnknownKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  var TSVoidKeyword: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  var TaggedTemplateExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  var TemplateElement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateElement]
  var TemplateLiteral: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  var ThisExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisExpression]
  var ThisTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  var ThrowStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement]
  var TryStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TryStatement]
  var TupleTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  var TypeAlias: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias]
  var TypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAnnotation]
  var TypeCastExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  var TypeParameter: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameter]
  var TypeParameterDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration]
  var TypeParameterInstantiation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation]
  var TypeofTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  var UnaryExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  var UnionTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  var UpdateExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  var VariableDeclaration: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  var VariableDeclarator: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclarator]
  var Variance: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.Variance]
  var VoidTypeAnnotation: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  var WhileStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement]
  var WithStatement: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement]
  var YieldExpression: Type[typingsJapgolly.astTypes.namedTypesMod.namedTypes.YieldExpression]
}

object NamedTypes_ {
  @scala.inline
  def apply(
    AnyTypeAnnotation: Type[AnyTypeAnnotation],
    ArrayExpression: Type[ArrayExpression],
    ArrayPattern: Type[ArrayPattern],
    ArrayTypeAnnotation: Type[ArrayTypeAnnotation],
    ArrowFunctionExpression: Type[ArrowFunctionExpression],
    AssignmentExpression: Type[AssignmentExpression],
    AssignmentPattern: Type[AssignmentPattern],
    AwaitExpression: Type[AwaitExpression],
    BigIntLiteral: Type[BigIntLiteral],
    BinaryExpression: Type[BinaryExpression],
    BindExpression: Type[BindExpression],
    Block: Type[Block],
    BlockStatement: Type[BlockStatement],
    BooleanLiteral: Type[BooleanLiteral],
    BooleanLiteralTypeAnnotation: Type[BooleanLiteralTypeAnnotation],
    BooleanTypeAnnotation: Type[BooleanTypeAnnotation],
    BreakStatement: Type[BreakStatement],
    CallExpression: Type[CallExpression],
    CatchClause: Type[CatchClause],
    ClassBody: Type[ClassBody],
    ClassDeclaration: Type[ClassDeclaration],
    ClassExpression: Type[ClassExpression],
    ClassImplements: Type[ClassImplements],
    ClassMethod: Type[ClassMethod],
    ClassPrivateMethod: Type[ClassPrivateMethod],
    ClassPrivateProperty: Type[ClassPrivateProperty],
    ClassProperty: Type[ClassProperty],
    ClassPropertyDefinition: Type[ClassPropertyDefinition],
    Comment: Type[Comment],
    CommentBlock: Type[CommentBlock],
    CommentLine: Type[CommentLine],
    ComprehensionBlock: Type[ComprehensionBlock],
    ComprehensionExpression: Type[ComprehensionExpression],
    ConditionalExpression: Type[ConditionalExpression],
    ContinueStatement: Type[ContinueStatement],
    DebuggerStatement: Type[DebuggerStatement],
    Declaration: Type[Declaration],
    DeclareClass: Type[DeclareClass],
    DeclareExportAllDeclaration: Type[DeclareExportAllDeclaration],
    DeclareExportDeclaration: Type[DeclareExportDeclaration],
    DeclareFunction: Type[DeclareFunction],
    DeclareInterface: Type[DeclareInterface],
    DeclareModule: Type[DeclareModule],
    DeclareModuleExports: Type[DeclareModuleExports],
    DeclareOpaqueType: Type[DeclareOpaqueType],
    DeclareTypeAlias: Type[DeclareTypeAlias],
    DeclareVariable: Type[DeclareVariable],
    DeclaredPredicate: Type[DeclaredPredicate],
    Decorator: Type[Decorator],
    Directive: Type[Directive],
    DirectiveLiteral: Type[DirectiveLiteral],
    DoExpression: Type[DoExpression],
    DoWhileStatement: Type[DoWhileStatement],
    EmptyStatement: Type[EmptyStatement],
    EmptyTypeAnnotation: Type[EmptyTypeAnnotation],
    ExistentialTypeParam: Type[ExistentialTypeParam],
    ExistsTypeAnnotation: Type[ExistsTypeAnnotation],
    ExportAllDeclaration: Type[ExportAllDeclaration],
    ExportBatchSpecifier: Type[ExportBatchSpecifier],
    ExportDeclaration: Type[ExportDeclaration],
    ExportDefaultDeclaration: Type[ExportDefaultDeclaration],
    ExportDefaultSpecifier: Type[ExportDefaultSpecifier],
    ExportNamedDeclaration: Type[ExportNamedDeclaration],
    ExportNamespaceSpecifier: Type[ExportNamespaceSpecifier],
    ExportSpecifier: Type[ExportSpecifier],
    Expression: Type[Expression],
    ExpressionStatement: Type[ExpressionStatement],
    File: Type[File],
    Flow: Type[Flow],
    FlowPredicate: Type[FlowPredicate],
    FlowType: Type[FlowType],
    ForAwaitStatement: Type[ForAwaitStatement],
    ForInStatement: Type[ForInStatement],
    ForOfStatement: Type[ForOfStatement],
    ForStatement: Type[ForStatement],
    Function: Type[Function],
    FunctionDeclaration: Type[FunctionDeclaration],
    FunctionExpression: Type[FunctionExpression],
    FunctionTypeAnnotation: Type[FunctionTypeAnnotation],
    FunctionTypeParam: Type[FunctionTypeParam],
    GeneratorExpression: Type[GeneratorExpression],
    GenericTypeAnnotation: Type[GenericTypeAnnotation],
    Identifier: Type[Identifier],
    IfStatement: Type[IfStatement],
    Import: Type[Import],
    ImportDeclaration: Type[ImportDeclaration],
    ImportDefaultSpecifier: Type[ImportDefaultSpecifier],
    ImportNamespaceSpecifier: Type[ImportNamespaceSpecifier],
    ImportSpecifier: Type[ImportSpecifier],
    InferredPredicate: Type[InferredPredicate],
    InterfaceDeclaration: Type[InterfaceDeclaration],
    InterfaceExtends: Type[InterfaceExtends],
    InterfaceTypeAnnotation: Type[InterfaceTypeAnnotation],
    InterpreterDirective: Type[InterpreterDirective],
    IntersectionTypeAnnotation: Type[IntersectionTypeAnnotation],
    JSXAttribute: Type[JSXAttribute],
    JSXClosingElement: Type[JSXClosingElement],
    JSXClosingFragment: Type[JSXClosingFragment],
    JSXElement: Type[JSXElement],
    JSXEmptyExpression: Type[JSXEmptyExpression],
    JSXExpressionContainer: Type[JSXExpressionContainer],
    JSXFragment: Type[JSXFragment],
    JSXIdentifier: Type[JSXIdentifier],
    JSXMemberExpression: Type[JSXMemberExpression],
    JSXNamespacedName: Type[JSXNamespacedName],
    JSXOpeningElement: Type[JSXOpeningElement],
    JSXOpeningFragment: Type[JSXOpeningFragment],
    JSXSpreadAttribute: Type[JSXSpreadAttribute],
    JSXSpreadChild: Type[JSXSpreadChild],
    JSXText: Type[JSXText],
    LabeledStatement: Type[LabeledStatement],
    Line: Type[Line],
    Literal: Type[Literal],
    LogicalExpression: Type[LogicalExpression],
    MemberExpression: Type[MemberExpression],
    MemberTypeAnnotation: Type[MemberTypeAnnotation],
    MetaProperty: Type[MetaProperty],
    MethodDefinition: Type[MethodDefinition],
    MixedTypeAnnotation: Type[MixedTypeAnnotation],
    ModuleSpecifier: Type[ModuleSpecifier],
    NewExpression: Type[NewExpression],
    Node: Type[Node],
    Noop: Type[Noop],
    NullLiteral: Type[NullLiteral],
    NullLiteralTypeAnnotation: Type[NullLiteralTypeAnnotation],
    NullTypeAnnotation: Type[NullTypeAnnotation],
    NullableTypeAnnotation: Type[NullableTypeAnnotation],
    NumberLiteralTypeAnnotation: Type[NumberLiteralTypeAnnotation],
    NumberTypeAnnotation: Type[NumberTypeAnnotation],
    NumericLiteral: Type[NumericLiteral],
    NumericLiteralTypeAnnotation: Type[NumericLiteralTypeAnnotation],
    ObjectExpression: Type[ObjectExpression],
    ObjectMethod: Type[ObjectMethod],
    ObjectPattern: Type[ObjectPattern],
    ObjectProperty: Type[ObjectProperty],
    ObjectTypeAnnotation: Type[ObjectTypeAnnotation],
    ObjectTypeCallProperty: Type[ObjectTypeCallProperty],
    ObjectTypeIndexer: Type[ObjectTypeIndexer],
    ObjectTypeInternalSlot: Type[ObjectTypeInternalSlot],
    ObjectTypeProperty: Type[ObjectTypeProperty],
    ObjectTypeSpreadProperty: Type[ObjectTypeSpreadProperty],
    OpaqueType: Type[OpaqueType],
    OptionalCallExpression: Type[OptionalCallExpression],
    OptionalMemberExpression: Type[OptionalMemberExpression],
    ParenthesizedExpression: Type[ParenthesizedExpression],
    Pattern: Type[Pattern],
    Position: Type[Position],
    Printable: Type[Printable],
    PrivateName: Type[PrivateName],
    Program: Type[Program],
    Property: Type[Property],
    PropertyPattern: Type[PropertyPattern],
    QualifiedTypeIdentifier: Type[QualifiedTypeIdentifier],
    RegExpLiteral: Type[RegExpLiteral],
    RestElement: Type[RestElement],
    RestProperty: Type[RestProperty],
    ReturnStatement: Type[ReturnStatement],
    SequenceExpression: Type[SequenceExpression],
    SourceLocation: Type[SourceLocation],
    Specifier: Type[Specifier],
    SpreadElement: Type[SpreadElement],
    SpreadElementPattern: Type[SpreadElementPattern],
    SpreadProperty: Type[SpreadProperty],
    SpreadPropertyPattern: Type[SpreadPropertyPattern],
    Statement: Type[Statement],
    StringLiteral: Type[StringLiteral],
    StringLiteralTypeAnnotation: Type[StringLiteralTypeAnnotation],
    StringTypeAnnotation: Type[StringTypeAnnotation],
    Super: Type[Super],
    SwitchCase: Type[SwitchCase],
    SwitchStatement: Type[SwitchStatement],
    TSAnyKeyword: Type[TSAnyKeyword],
    TSArrayType: Type[TSArrayType],
    TSAsExpression: Type[TSAsExpression],
    TSBigIntKeyword: Type[TSBigIntKeyword],
    TSBooleanKeyword: Type[TSBooleanKeyword],
    TSCallSignatureDeclaration: Type[TSCallSignatureDeclaration],
    TSConditionalType: Type[TSConditionalType],
    TSConstructSignatureDeclaration: Type[TSConstructSignatureDeclaration],
    TSConstructorType: Type[TSConstructorType],
    TSDeclareFunction: Type[TSDeclareFunction],
    TSDeclareMethod: Type[TSDeclareMethod],
    TSEnumDeclaration: Type[TSEnumDeclaration],
    TSEnumMember: Type[TSEnumMember],
    TSExportAssignment: Type[TSExportAssignment],
    TSExpressionWithTypeArguments: Type[TSExpressionWithTypeArguments],
    TSExternalModuleReference: Type[TSExternalModuleReference],
    TSFunctionType: Type[TSFunctionType],
    TSHasOptionalTypeAnnotation: Type[TSHasOptionalTypeAnnotation],
    TSHasOptionalTypeParameterInstantiation: Type[TSHasOptionalTypeParameterInstantiation],
    TSHasOptionalTypeParameters: Type[TSHasOptionalTypeParameters],
    TSImportEqualsDeclaration: Type[TSImportEqualsDeclaration],
    TSImportType: Type[TSImportType],
    TSIndexSignature: Type[TSIndexSignature],
    TSIndexedAccessType: Type[TSIndexedAccessType],
    TSInferType: Type[TSInferType],
    TSInterfaceBody: Type[TSInterfaceBody],
    TSInterfaceDeclaration: Type[TSInterfaceDeclaration],
    TSIntersectionType: Type[TSIntersectionType],
    TSLiteralType: Type[TSLiteralType],
    TSMappedType: Type[TSMappedType],
    TSMethodSignature: Type[TSMethodSignature],
    TSModuleBlock: Type[TSModuleBlock],
    TSModuleDeclaration: Type[TSModuleDeclaration],
    TSNamespaceExportDeclaration: Type[TSNamespaceExportDeclaration],
    TSNeverKeyword: Type[TSNeverKeyword],
    TSNonNullExpression: Type[TSNonNullExpression],
    TSNullKeyword: Type[TSNullKeyword],
    TSNumberKeyword: Type[TSNumberKeyword],
    TSObjectKeyword: Type[TSObjectKeyword],
    TSOptionalType: Type[TSOptionalType],
    TSParameterProperty: Type[TSParameterProperty],
    TSParenthesizedType: Type[TSParenthesizedType],
    TSPropertySignature: Type[TSPropertySignature],
    TSQualifiedName: Type[TSQualifiedName],
    TSRestType: Type[TSRestType],
    TSStringKeyword: Type[TSStringKeyword],
    TSSymbolKeyword: Type[TSSymbolKeyword],
    TSThisType: Type[TSThisType],
    TSTupleType: Type[TSTupleType],
    TSType: Type[TSType],
    TSTypeAliasDeclaration: Type[TSTypeAliasDeclaration],
    TSTypeAnnotation: Type[TSTypeAnnotation],
    TSTypeAssertion: Type[TSTypeAssertion],
    TSTypeLiteral: Type[TSTypeLiteral],
    TSTypeOperator: Type[TSTypeOperator],
    TSTypeParameter: Type[TSTypeParameter],
    TSTypeParameterDeclaration: Type[TSTypeParameterDeclaration],
    TSTypeParameterInstantiation: Type[TSTypeParameterInstantiation],
    TSTypePredicate: Type[TSTypePredicate],
    TSTypeQuery: Type[TSTypeQuery],
    TSTypeReference: Type[TSTypeReference],
    TSUndefinedKeyword: Type[TSUndefinedKeyword],
    TSUnionType: Type[TSUnionType],
    TSUnknownKeyword: Type[TSUnknownKeyword],
    TSVoidKeyword: Type[TSVoidKeyword],
    TaggedTemplateExpression: Type[TaggedTemplateExpression],
    TemplateElement: Type[TemplateElement],
    TemplateLiteral: Type[TemplateLiteral],
    ThisExpression: Type[ThisExpression],
    ThisTypeAnnotation: Type[ThisTypeAnnotation],
    ThrowStatement: Type[ThrowStatement],
    TryStatement: Type[TryStatement],
    TupleTypeAnnotation: Type[TupleTypeAnnotation],
    TypeAlias: Type[TypeAlias],
    TypeAnnotation: Type[TypeAnnotation],
    TypeCastExpression: Type[TypeCastExpression],
    TypeParameter: Type[TypeParameter],
    TypeParameterDeclaration: Type[TypeParameterDeclaration],
    TypeParameterInstantiation: Type[TypeParameterInstantiation],
    TypeofTypeAnnotation: Type[TypeofTypeAnnotation],
    UnaryExpression: Type[UnaryExpression],
    UnionTypeAnnotation: Type[UnionTypeAnnotation],
    UpdateExpression: Type[UpdateExpression]
  ): NamedTypes_ = {
    val __obj = js.Dynamic.literal(AnyTypeAnnotation = AnyTypeAnnotation.asInstanceOf[js.Any], ArrayExpression = ArrayExpression.asInstanceOf[js.Any], ArrayPattern = ArrayPattern.asInstanceOf[js.Any], ArrayTypeAnnotation = ArrayTypeAnnotation.asInstanceOf[js.Any], ArrowFunctionExpression = ArrowFunctionExpression.asInstanceOf[js.Any], AssignmentExpression = AssignmentExpression.asInstanceOf[js.Any], AssignmentPattern = AssignmentPattern.asInstanceOf[js.Any], AwaitExpression = AwaitExpression.asInstanceOf[js.Any], BigIntLiteral = BigIntLiteral.asInstanceOf[js.Any], BinaryExpression = BinaryExpression.asInstanceOf[js.Any], BindExpression = BindExpression.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], BlockStatement = BlockStatement.asInstanceOf[js.Any], BooleanLiteral = BooleanLiteral.asInstanceOf[js.Any], BooleanLiteralTypeAnnotation = BooleanLiteralTypeAnnotation.asInstanceOf[js.Any], BooleanTypeAnnotation = BooleanTypeAnnotation.asInstanceOf[js.Any], BreakStatement = BreakStatement.asInstanceOf[js.Any], CallExpression = CallExpression.asInstanceOf[js.Any], CatchClause = CatchClause.asInstanceOf[js.Any], ClassBody = ClassBody.asInstanceOf[js.Any], ClassDeclaration = ClassDeclaration.asInstanceOf[js.Any], ClassExpression = ClassExpression.asInstanceOf[js.Any], ClassImplements = ClassImplements.asInstanceOf[js.Any], ClassMethod = ClassMethod.asInstanceOf[js.Any], ClassPrivateMethod = ClassPrivateMethod.asInstanceOf[js.Any], ClassPrivateProperty = ClassPrivateProperty.asInstanceOf[js.Any], ClassProperty = ClassProperty.asInstanceOf[js.Any], ClassPropertyDefinition = ClassPropertyDefinition.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], CommentBlock = CommentBlock.asInstanceOf[js.Any], CommentLine = CommentLine.asInstanceOf[js.Any], ComprehensionBlock = ComprehensionBlock.asInstanceOf[js.Any], ComprehensionExpression = ComprehensionExpression.asInstanceOf[js.Any], ConditionalExpression = ConditionalExpression.asInstanceOf[js.Any], ContinueStatement = ContinueStatement.asInstanceOf[js.Any], DebuggerStatement = DebuggerStatement.asInstanceOf[js.Any], Declaration = Declaration.asInstanceOf[js.Any], DeclareClass = DeclareClass.asInstanceOf[js.Any], DeclareExportAllDeclaration = DeclareExportAllDeclaration.asInstanceOf[js.Any], DeclareExportDeclaration = DeclareExportDeclaration.asInstanceOf[js.Any], DeclareFunction = DeclareFunction.asInstanceOf[js.Any], DeclareInterface = DeclareInterface.asInstanceOf[js.Any], DeclareModule = DeclareModule.asInstanceOf[js.Any], DeclareModuleExports = DeclareModuleExports.asInstanceOf[js.Any], DeclareOpaqueType = DeclareOpaqueType.asInstanceOf[js.Any], DeclareTypeAlias = DeclareTypeAlias.asInstanceOf[js.Any], DeclareVariable = DeclareVariable.asInstanceOf[js.Any], DeclaredPredicate = DeclaredPredicate.asInstanceOf[js.Any], Decorator = Decorator.asInstanceOf[js.Any], Directive = Directive.asInstanceOf[js.Any], DirectiveLiteral = DirectiveLiteral.asInstanceOf[js.Any], DoExpression = DoExpression.asInstanceOf[js.Any], DoWhileStatement = DoWhileStatement.asInstanceOf[js.Any], EmptyStatement = EmptyStatement.asInstanceOf[js.Any], EmptyTypeAnnotation = EmptyTypeAnnotation.asInstanceOf[js.Any], ExistentialTypeParam = ExistentialTypeParam.asInstanceOf[js.Any], ExistsTypeAnnotation = ExistsTypeAnnotation.asInstanceOf[js.Any], ExportAllDeclaration = ExportAllDeclaration.asInstanceOf[js.Any], ExportBatchSpecifier = ExportBatchSpecifier.asInstanceOf[js.Any], ExportDeclaration = ExportDeclaration.asInstanceOf[js.Any], ExportDefaultDeclaration = ExportDefaultDeclaration.asInstanceOf[js.Any], ExportDefaultSpecifier = ExportDefaultSpecifier.asInstanceOf[js.Any], ExportNamedDeclaration = ExportNamedDeclaration.asInstanceOf[js.Any], ExportNamespaceSpecifier = ExportNamespaceSpecifier.asInstanceOf[js.Any], ExportSpecifier = ExportSpecifier.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionStatement = ExpressionStatement.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], Flow = Flow.asInstanceOf[js.Any], FlowPredicate = FlowPredicate.asInstanceOf[js.Any], FlowType = FlowType.asInstanceOf[js.Any], ForAwaitStatement = ForAwaitStatement.asInstanceOf[js.Any], ForInStatement = ForInStatement.asInstanceOf[js.Any], ForOfStatement = ForOfStatement.asInstanceOf[js.Any], ForStatement = ForStatement.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], FunctionDeclaration = FunctionDeclaration.asInstanceOf[js.Any], FunctionExpression = FunctionExpression.asInstanceOf[js.Any], FunctionTypeAnnotation = FunctionTypeAnnotation.asInstanceOf[js.Any], FunctionTypeParam = FunctionTypeParam.asInstanceOf[js.Any], GeneratorExpression = GeneratorExpression.asInstanceOf[js.Any], GenericTypeAnnotation = GenericTypeAnnotation.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], IfStatement = IfStatement.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], ImportDeclaration = ImportDeclaration.asInstanceOf[js.Any], ImportDefaultSpecifier = ImportDefaultSpecifier.asInstanceOf[js.Any], ImportNamespaceSpecifier = ImportNamespaceSpecifier.asInstanceOf[js.Any], ImportSpecifier = ImportSpecifier.asInstanceOf[js.Any], InferredPredicate = InferredPredicate.asInstanceOf[js.Any], InterfaceDeclaration = InterfaceDeclaration.asInstanceOf[js.Any], InterfaceExtends = InterfaceExtends.asInstanceOf[js.Any], InterfaceTypeAnnotation = InterfaceTypeAnnotation.asInstanceOf[js.Any], InterpreterDirective = InterpreterDirective.asInstanceOf[js.Any], IntersectionTypeAnnotation = IntersectionTypeAnnotation.asInstanceOf[js.Any], JSXAttribute = JSXAttribute.asInstanceOf[js.Any], JSXClosingElement = JSXClosingElement.asInstanceOf[js.Any], JSXClosingFragment = JSXClosingFragment.asInstanceOf[js.Any], JSXElement = JSXElement.asInstanceOf[js.Any], JSXEmptyExpression = JSXEmptyExpression.asInstanceOf[js.Any], JSXExpressionContainer = JSXExpressionContainer.asInstanceOf[js.Any], JSXFragment = JSXFragment.asInstanceOf[js.Any], JSXIdentifier = JSXIdentifier.asInstanceOf[js.Any], JSXMemberExpression = JSXMemberExpression.asInstanceOf[js.Any], JSXNamespacedName = JSXNamespacedName.asInstanceOf[js.Any], JSXOpeningElement = JSXOpeningElement.asInstanceOf[js.Any], JSXOpeningFragment = JSXOpeningFragment.asInstanceOf[js.Any], JSXSpreadAttribute = JSXSpreadAttribute.asInstanceOf[js.Any], JSXSpreadChild = JSXSpreadChild.asInstanceOf[js.Any], JSXText = JSXText.asInstanceOf[js.Any], LabeledStatement = LabeledStatement.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], LogicalExpression = LogicalExpression.asInstanceOf[js.Any], MemberExpression = MemberExpression.asInstanceOf[js.Any], MemberTypeAnnotation = MemberTypeAnnotation.asInstanceOf[js.Any], MetaProperty = MetaProperty.asInstanceOf[js.Any], MethodDefinition = MethodDefinition.asInstanceOf[js.Any], MixedTypeAnnotation = MixedTypeAnnotation.asInstanceOf[js.Any], ModuleSpecifier = ModuleSpecifier.asInstanceOf[js.Any], NewExpression = NewExpression.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Noop = Noop.asInstanceOf[js.Any], NullLiteral = NullLiteral.asInstanceOf[js.Any], NullLiteralTypeAnnotation = NullLiteralTypeAnnotation.asInstanceOf[js.Any], NullTypeAnnotation = NullTypeAnnotation.asInstanceOf[js.Any], NullableTypeAnnotation = NullableTypeAnnotation.asInstanceOf[js.Any], NumberLiteralTypeAnnotation = NumberLiteralTypeAnnotation.asInstanceOf[js.Any], NumberTypeAnnotation = NumberTypeAnnotation.asInstanceOf[js.Any], NumericLiteral = NumericLiteral.asInstanceOf[js.Any], NumericLiteralTypeAnnotation = NumericLiteralTypeAnnotation.asInstanceOf[js.Any], ObjectExpression = ObjectExpression.asInstanceOf[js.Any], ObjectMethod = ObjectMethod.asInstanceOf[js.Any], ObjectPattern = ObjectPattern.asInstanceOf[js.Any], ObjectProperty = ObjectProperty.asInstanceOf[js.Any], ObjectTypeAnnotation = ObjectTypeAnnotation.asInstanceOf[js.Any], ObjectTypeCallProperty = ObjectTypeCallProperty.asInstanceOf[js.Any], ObjectTypeIndexer = ObjectTypeIndexer.asInstanceOf[js.Any], ObjectTypeInternalSlot = ObjectTypeInternalSlot.asInstanceOf[js.Any], ObjectTypeProperty = ObjectTypeProperty.asInstanceOf[js.Any], ObjectTypeSpreadProperty = ObjectTypeSpreadProperty.asInstanceOf[js.Any], OpaqueType = OpaqueType.asInstanceOf[js.Any], OptionalCallExpression = OptionalCallExpression.asInstanceOf[js.Any], OptionalMemberExpression = OptionalMemberExpression.asInstanceOf[js.Any], ParenthesizedExpression = ParenthesizedExpression.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PrivateName = PrivateName.asInstanceOf[js.Any], Program = Program.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], PropertyPattern = PropertyPattern.asInstanceOf[js.Any], QualifiedTypeIdentifier = QualifiedTypeIdentifier.asInstanceOf[js.Any], RegExpLiteral = RegExpLiteral.asInstanceOf[js.Any], RestElement = RestElement.asInstanceOf[js.Any], RestProperty = RestProperty.asInstanceOf[js.Any], ReturnStatement = ReturnStatement.asInstanceOf[js.Any], SequenceExpression = SequenceExpression.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], Specifier = Specifier.asInstanceOf[js.Any], SpreadElement = SpreadElement.asInstanceOf[js.Any], SpreadElementPattern = SpreadElementPattern.asInstanceOf[js.Any], SpreadProperty = SpreadProperty.asInstanceOf[js.Any], SpreadPropertyPattern = SpreadPropertyPattern.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], StringLiteral = StringLiteral.asInstanceOf[js.Any], StringLiteralTypeAnnotation = StringLiteralTypeAnnotation.asInstanceOf[js.Any], StringTypeAnnotation = StringTypeAnnotation.asInstanceOf[js.Any], Super = Super.asInstanceOf[js.Any], SwitchCase = SwitchCase.asInstanceOf[js.Any], SwitchStatement = SwitchStatement.asInstanceOf[js.Any], TSAnyKeyword = TSAnyKeyword.asInstanceOf[js.Any], TSArrayType = TSArrayType.asInstanceOf[js.Any], TSAsExpression = TSAsExpression.asInstanceOf[js.Any], TSBigIntKeyword = TSBigIntKeyword.asInstanceOf[js.Any], TSBooleanKeyword = TSBooleanKeyword.asInstanceOf[js.Any], TSCallSignatureDeclaration = TSCallSignatureDeclaration.asInstanceOf[js.Any], TSConditionalType = TSConditionalType.asInstanceOf[js.Any], TSConstructSignatureDeclaration = TSConstructSignatureDeclaration.asInstanceOf[js.Any], TSConstructorType = TSConstructorType.asInstanceOf[js.Any], TSDeclareFunction = TSDeclareFunction.asInstanceOf[js.Any], TSDeclareMethod = TSDeclareMethod.asInstanceOf[js.Any], TSEnumDeclaration = TSEnumDeclaration.asInstanceOf[js.Any], TSEnumMember = TSEnumMember.asInstanceOf[js.Any], TSExportAssignment = TSExportAssignment.asInstanceOf[js.Any], TSExpressionWithTypeArguments = TSExpressionWithTypeArguments.asInstanceOf[js.Any], TSExternalModuleReference = TSExternalModuleReference.asInstanceOf[js.Any], TSFunctionType = TSFunctionType.asInstanceOf[js.Any], TSHasOptionalTypeAnnotation = TSHasOptionalTypeAnnotation.asInstanceOf[js.Any], TSHasOptionalTypeParameterInstantiation = TSHasOptionalTypeParameterInstantiation.asInstanceOf[js.Any], TSHasOptionalTypeParameters = TSHasOptionalTypeParameters.asInstanceOf[js.Any], TSImportEqualsDeclaration = TSImportEqualsDeclaration.asInstanceOf[js.Any], TSImportType = TSImportType.asInstanceOf[js.Any], TSIndexSignature = TSIndexSignature.asInstanceOf[js.Any], TSIndexedAccessType = TSIndexedAccessType.asInstanceOf[js.Any], TSInferType = TSInferType.asInstanceOf[js.Any], TSInterfaceBody = TSInterfaceBody.asInstanceOf[js.Any], TSInterfaceDeclaration = TSInterfaceDeclaration.asInstanceOf[js.Any], TSIntersectionType = TSIntersectionType.asInstanceOf[js.Any], TSLiteralType = TSLiteralType.asInstanceOf[js.Any], TSMappedType = TSMappedType.asInstanceOf[js.Any], TSMethodSignature = TSMethodSignature.asInstanceOf[js.Any], TSModuleBlock = TSModuleBlock.asInstanceOf[js.Any], TSModuleDeclaration = TSModuleDeclaration.asInstanceOf[js.Any], TSNamespaceExportDeclaration = TSNamespaceExportDeclaration.asInstanceOf[js.Any], TSNeverKeyword = TSNeverKeyword.asInstanceOf[js.Any], TSNonNullExpression = TSNonNullExpression.asInstanceOf[js.Any], TSNullKeyword = TSNullKeyword.asInstanceOf[js.Any], TSNumberKeyword = TSNumberKeyword.asInstanceOf[js.Any], TSObjectKeyword = TSObjectKeyword.asInstanceOf[js.Any], TSOptionalType = TSOptionalType.asInstanceOf[js.Any], TSParameterProperty = TSParameterProperty.asInstanceOf[js.Any], TSParenthesizedType = TSParenthesizedType.asInstanceOf[js.Any], TSPropertySignature = TSPropertySignature.asInstanceOf[js.Any], TSQualifiedName = TSQualifiedName.asInstanceOf[js.Any], TSRestType = TSRestType.asInstanceOf[js.Any], TSStringKeyword = TSStringKeyword.asInstanceOf[js.Any], TSSymbolKeyword = TSSymbolKeyword.asInstanceOf[js.Any], TSThisType = TSThisType.asInstanceOf[js.Any], TSTupleType = TSTupleType.asInstanceOf[js.Any], TSType = TSType.asInstanceOf[js.Any], TSTypeAliasDeclaration = TSTypeAliasDeclaration.asInstanceOf[js.Any], TSTypeAnnotation = TSTypeAnnotation.asInstanceOf[js.Any], TSTypeAssertion = TSTypeAssertion.asInstanceOf[js.Any], TSTypeLiteral = TSTypeLiteral.asInstanceOf[js.Any], TSTypeOperator = TSTypeOperator.asInstanceOf[js.Any], TSTypeParameter = TSTypeParameter.asInstanceOf[js.Any], TSTypeParameterDeclaration = TSTypeParameterDeclaration.asInstanceOf[js.Any], TSTypeParameterInstantiation = TSTypeParameterInstantiation.asInstanceOf[js.Any], TSTypePredicate = TSTypePredicate.asInstanceOf[js.Any], TSTypeQuery = TSTypeQuery.asInstanceOf[js.Any], TSTypeReference = TSTypeReference.asInstanceOf[js.Any], TSUndefinedKeyword = TSUndefinedKeyword.asInstanceOf[js.Any], TSUnionType = TSUnionType.asInstanceOf[js.Any], TSUnknownKeyword = TSUnknownKeyword.asInstanceOf[js.Any], TSVoidKeyword = TSVoidKeyword.asInstanceOf[js.Any], TaggedTemplateExpression = TaggedTemplateExpression.asInstanceOf[js.Any], TemplateElement = TemplateElement.asInstanceOf[js.Any], TemplateLiteral = TemplateLiteral.asInstanceOf[js.Any], ThisExpression = ThisExpression.asInstanceOf[js.Any], ThisTypeAnnotation = ThisTypeAnnotation.asInstanceOf[js.Any], ThrowStatement = ThrowStatement.asInstanceOf[js.Any], TryStatement = TryStatement.asInstanceOf[js.Any], TupleTypeAnnotation = TupleTypeAnnotation.asInstanceOf[js.Any], TypeAlias = TypeAlias.asInstanceOf[js.Any], TypeAnnotation = TypeAnnotation.asInstanceOf[js.Any], TypeCastExpression = TypeCastExpression.asInstanceOf[js.Any], TypeParameter = TypeParameter.asInstanceOf[js.Any], TypeParameterDeclaration = TypeParameterDeclaration.asInstanceOf[js.Any], TypeParameterInstantiation = TypeParameterInstantiation.asInstanceOf[js.Any], TypeofTypeAnnotation = TypeofTypeAnnotation.asInstanceOf[js.Any], UnaryExpression = UnaryExpression.asInstanceOf[js.Any], UnionTypeAnnotation = UnionTypeAnnotation.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedTypes_]
  }
}

