package typingsJapgolly.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdditiveOperatorOrHigher = typingsJapgolly.typescript.mod.MultiplicativeOperatorOrHigher | typingsJapgolly.typescript.mod.AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[typingsJapgolly.typescript.AnonAffected[T]]
  type AssertsToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.AssertsKeyword]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.SyntaxKind.QuestionQuestionToken
    - typingsJapgolly.typescript.mod.LogicalOperatorOrHigher
    - typingsJapgolly.typescript.mod.AssignmentOperator
  */
  type AssignmentOperatorOrHigher = typingsJapgolly.typescript.mod._AssignmentOperatorOrHigher | typingsJapgolly.typescript.mod.LogicalOperatorOrHigher
  type AssignmentOperatorToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.AssignmentOperator]
  type AsteriskToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.AwaitKeyword]
  type BaseType = typingsJapgolly.typescript.mod.ObjectType | typingsJapgolly.typescript.mod.IntersectionType | typingsJapgolly.typescript.mod.TypeVariable
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.AssignmentOperatorOrHigher
    - typingsJapgolly.typescript.mod.SyntaxKind.CommaToken
  */
  type BinaryOperator = typingsJapgolly.typescript.mod._BinaryOperator | typingsJapgolly.typescript.mod.LogicalOperatorOrHigher
  type BinaryOperatorToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.BinaryOperator]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.VariableDeclaration
    - typingsJapgolly.typescript.mod.ParameterDeclaration
    - typingsJapgolly.typescript.mod.BindingElement
    - typingsJapgolly.typescript.mod.PropertyAssignment
    - typingsJapgolly.typescript.mod.ShorthandPropertyAssignment
    - typingsJapgolly.typescript.mod.SpreadAssignment
    - typingsJapgolly.typescript.mod.OmittedExpression
    - typingsJapgolly.typescript.mod.SpreadElement
    - typingsJapgolly.typescript.mod.ArrayLiteralExpression
    - typingsJapgolly.typescript.mod.ObjectLiteralExpression
    - typingsJapgolly.typescript.mod.AssignmentExpression[typingsJapgolly.typescript.mod.EqualsToken]
    - typingsJapgolly.typescript.mod.Identifier
    - typingsJapgolly.typescript.mod.PropertyAccessExpression
    - typingsJapgolly.typescript.mod.ElementAccessExpression
  */
  type BindingOrAssignmentElement = typingsJapgolly.typescript.mod._BindingOrAssignmentElement | typingsJapgolly.typescript.mod.AssignmentExpression[typingsJapgolly.typescript.mod.EqualsToken]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.DotDotDotToken
    - typingsJapgolly.typescript.mod.SpreadElement
    - typingsJapgolly.typescript.mod.SpreadAssignment
  */
  type BindingOrAssignmentElementRestIndicator = typingsJapgolly.typescript.mod._BindingOrAssignmentElementRestIndicator | typingsJapgolly.typescript.mod.DotDotDotToken
  type BitwiseOperatorOrHigher = typingsJapgolly.typescript.mod.EqualityOperatorOrHigher | typingsJapgolly.typescript.mod.BitwiseOperator
  type CodeActionCommand = typingsJapgolly.typescript.mod.InstallPackageAction
  type ColonToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.ColonToken]
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[
      scala.Double | typingsJapgolly.typescript.mod.PluginImport | typingsJapgolly.typescript.mod.ProjectReference | java.lang.String
    ]) | typingsJapgolly.typescript.mod.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  type ConciseBody = typingsJapgolly.typescript.mod.FunctionBody | typingsJapgolly.typescript.mod.Expression
  /** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
  type CreateProgram_[T /* <: typingsJapgolly.typescript.mod.BuilderProgram */] = js.Function6[
    /* rootNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[typingsJapgolly.typescript.mod.CompilerOptions], 
    /* host */ js.UndefOr[typingsJapgolly.typescript.mod.CompilerHost], 
    /* oldProgram */ js.UndefOr[T], 
    /* configFileParsingDiagnostics */ js.UndefOr[js.Array[typingsJapgolly.typescript.mod.Diagnostic]], 
    /* projectReferences */ js.UndefOr[js.Array[typingsJapgolly.typescript.mod.ProjectReference]], 
    T
  ]
  type CustomTransformerFactory = js.Function1[
    /* context */ typingsJapgolly.typescript.mod.TransformationContext, 
    typingsJapgolly.typescript.mod.CustomTransformer
  ]
  type DeferredTypeReference = typingsJapgolly.typescript.mod.TypeReference
  type DiagnosticReporter = js.Function1[/* diagnostic */ typingsJapgolly.typescript.mod.Diagnostic, scala.Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, scala.Unit]
  type DocumentRegistryBucketKey = java.lang.String with typingsJapgolly.typescript.AnonBucketKey
  type DotDotDotToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.DotDotDotToken]
  type DotToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.DotToken]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]
  type EndOfFileToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.EndOfFileToken] with typingsJapgolly.typescript.mod.JSDocContainer
  type EnumType = typingsJapgolly.typescript.mod.Type
  type EqualityOperatorOrHigher = typingsJapgolly.typescript.mod.RelationalOperatorOrHigher | typingsJapgolly.typescript.mod.EqualityOperator
  type EqualsGreaterThanToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.EqualsGreaterThanToken]
  type EqualsToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.EqualsToken]
  type ErrorCallback = js.Function2[
    /* message */ typingsJapgolly.typescript.mod.DiagnosticMessage, 
    /* length */ scala.Double, 
    scala.Unit
  ]
  type ExclamationToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.ExclamationToken]
  type ExponentiationOperator = typingsJapgolly.typescript.mod.SyntaxKind.AsteriskAsteriskToken
  type FileWatcherCallback = js.Function2[
    /* fileName */ java.lang.String, 
    /* eventKind */ typingsJapgolly.typescript.mod.FileWatcherEventKind, 
    scala.Unit
  ]
  type FunctionBody = typingsJapgolly.typescript.mod.Block
  type FunctionLike = typingsJapgolly.typescript.mod.SignatureDeclaration
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescript.mod.ParameterDeclaration
    - typingsJapgolly.typescript.mod.CallSignatureDeclaration
    - typingsJapgolly.typescript.mod.ConstructSignatureDeclaration
    - typingsJapgolly.typescript.mod.MethodSignature
    - typingsJapgolly.typescript.mod.PropertySignature
    - typingsJapgolly.typescript.mod.ArrowFunction
    - typingsJapgolly.typescript.mod.ParenthesizedExpression
    - typingsJapgolly.typescript.mod.SpreadAssignment
    - typingsJapgolly.typescript.mod.ShorthandPropertyAssignment
    - typingsJapgolly.typescript.mod.PropertyAssignment
    - typingsJapgolly.typescript.mod.FunctionExpression
    - typingsJapgolly.typescript.mod.LabeledStatement
    - typingsJapgolly.typescript.mod.ExpressionStatement
    - typingsJapgolly.typescript.mod.VariableStatement
    - typingsJapgolly.typescript.mod.FunctionDeclaration
    - typingsJapgolly.typescript.mod.ConstructorDeclaration
    - typingsJapgolly.typescript.mod.MethodDeclaration
    - typingsJapgolly.typescript.mod.PropertyDeclaration
    - typingsJapgolly.typescript.mod.AccessorDeclaration
    - typingsJapgolly.typescript.mod.ClassLikeDeclaration
    - typingsJapgolly.typescript.mod.InterfaceDeclaration
    - typingsJapgolly.typescript.mod.TypeAliasDeclaration
    - typingsJapgolly.typescript.mod.EnumMember
    - typingsJapgolly.typescript.mod.EnumDeclaration
    - typingsJapgolly.typescript.mod.ModuleDeclaration
    - typingsJapgolly.typescript.mod.ImportEqualsDeclaration
    - typingsJapgolly.typescript.mod.IndexSignatureDeclaration
    - typingsJapgolly.typescript.mod.FunctionTypeNode
    - typingsJapgolly.typescript.mod.ConstructorTypeNode
    - typingsJapgolly.typescript.mod.JSDocFunctionType
    - typingsJapgolly.typescript.mod.ExportDeclaration
    - typingsJapgolly.typescript.mod.EndOfFileToken
  */
  type HasJSDoc = typingsJapgolly.typescript.mod._HasJSDoc | typingsJapgolly.typescript.mod.EndOfFileToken
  type IncrementExpression = typingsJapgolly.typescript.mod.UpdateExpression
  type InstantiableType = typingsJapgolly.typescript.mod.Type
  type IntersectionType = typingsJapgolly.typescript.mod.UnionOrIntersectionType
  type JsFileExtensionInfo = typingsJapgolly.typescript.mod.FileExtensionInfo
  type LogicalOperatorOrHigher = typingsJapgolly.typescript.mod.BitwiseOperatorOrHigher | typingsJapgolly.typescript.mod.LogicalOperator
  /**
    * Type of objects whose values are all of the same type.
    * The `in` and `for-in` operators can *not* be safely used,
    * since `Object.prototype` may be modified by outside code.
    */
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  type MinusToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.MinusToken]
  type Modifier = typingsJapgolly.typescript.mod.Token[
    typingsJapgolly.typescript.mod.SyntaxKind.AbstractKeyword | typingsJapgolly.typescript.mod.SyntaxKind.AsyncKeyword | typingsJapgolly.typescript.mod.SyntaxKind.ConstKeyword | typingsJapgolly.typescript.mod.SyntaxKind.DeclareKeyword | typingsJapgolly.typescript.mod.SyntaxKind.DefaultKeyword | typingsJapgolly.typescript.mod.SyntaxKind.ExportKeyword | typingsJapgolly.typescript.mod.SyntaxKind.PrivateKeyword | typingsJapgolly.typescript.mod.SyntaxKind.ProtectedKeyword | typingsJapgolly.typescript.mod.SyntaxKind.PublicKeyword | typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword | typingsJapgolly.typescript.mod.SyntaxKind.StaticKeyword
  ]
  type ModifiersArray = typingsJapgolly.typescript.mod.NodeArray[typingsJapgolly.typescript.mod.Modifier]
  type MultiplicativeOperatorOrHigher = typingsJapgolly.typescript.mod.ExponentiationOperator | typingsJapgolly.typescript.mod.MultiplicativeOperator
  type OrganizeImportsScope = typingsJapgolly.typescript.mod.CombinedCodeFixScope
  type Path = java.lang.String with typingsJapgolly.typescript.AnonPathBrand
  type PlusToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.PlusToken]
  type QuestionDotToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.QuestionDotToken]
  type QuestionToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.QuestionToken]
  type ReadonlyToken = typingsJapgolly.typescript.mod.Token[typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword]
  type RelationalOperatorOrHigher = typingsJapgolly.typescript.mod.ShiftOperatorOrHigher | typingsJapgolly.typescript.mod.RelationalOperator
  type ReportEmitErrorSummary = js.Function1[/* errorCount */ scala.Double, scala.Unit]
  type ResolvedConfigFileName = java.lang.String with js.Object
  type ShiftOperatorOrHigher = typingsJapgolly.typescript.mod.AdditiveOperatorOrHigher | typingsJapgolly.typescript.mod.ShiftOperator
  type String = (java.lang.String with typingsJapgolly.typescript.AnonEscapedIdentifier) | (scala.Unit with typingsJapgolly.typescript.AnonEscapedIdentifier) | typingsJapgolly.typescript.mod.InternalSymbolName
  type StructuredType = typingsJapgolly.typescript.mod.ObjectType | typingsJapgolly.typescript.mod.UnionType | typingsJapgolly.typescript.mod.IntersectionType
  type SymbolTable = typingsJapgolly.typescript.mod.UnderscoreEscapedMap[typingsJapgolly.typescript.mod.Symbol]
  type Transformer[T /* <: typingsJapgolly.typescript.mod.Node */] = js.Function1[/* node */ T, T]
  type TransformerFactory[T /* <: typingsJapgolly.typescript.mod.Node */] = js.Function1[
    /* context */ typingsJapgolly.typescript.mod.TransformationContext, 
    typingsJapgolly.typescript.mod.Transformer[T]
  ]
  type TypeParameter = typingsJapgolly.typescript.mod.InstantiableType
  type TypeVariable = typingsJapgolly.typescript.mod.TypeParameter | typingsJapgolly.typescript.mod.IndexedAccessType
  type UnionType = typingsJapgolly.typescript.mod.UnionOrIntersectionType
  type VisitResult[T /* <: typingsJapgolly.typescript.mod.Node */] = js.UndefOr[T | js.Array[T]]
  type Visitor = js.Function1[
    /* node */ typingsJapgolly.typescript.mod.Node, 
    typingsJapgolly.typescript.mod.VisitResult[typingsJapgolly.typescript.mod.Node]
  ]
  /**
    * Creates the watch what generates program using the config file
    */
  type WatchOfConfigFile[T] = typingsJapgolly.typescript.mod.Watch[T]
  type WatchStatusReporter = js.Function4[
    /* diagnostic */ typingsJapgolly.typescript.mod.Diagnostic, 
    /* newLine */ java.lang.String, 
    /* options */ typingsJapgolly.typescript.mod.CompilerOptions, 
    /* errorCount */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type WithMetadata[T] = T with typingsJapgolly.typescript.AnonMetadata
  type WriteFileCallback = js.Function5[
    /* fileName */ java.lang.String, 
    /* data */ java.lang.String, 
    /* writeByteOrderMark */ scala.Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[typingsJapgolly.typescript.mod.SourceFile]], 
    scala.Unit
  ]
}
