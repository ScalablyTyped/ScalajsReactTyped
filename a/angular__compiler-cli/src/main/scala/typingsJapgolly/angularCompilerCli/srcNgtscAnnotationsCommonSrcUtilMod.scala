package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.FactoryTarget
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.R3CompiledExpression
import typingsJapgolly.angularCompiler.mod.R3FactoryMetadata
import typingsJapgolly.angularCompiler.mod.R3Reference
import typingsJapgolly.angularCompiler.mod.Statement
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.dynamic
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.target
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ModuleResolver
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportedFile
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeValueReference
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompileResult
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineResolvers(resolvers: js.Array[ForeignFunctionResolver]): ForeignFunctionResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("combineResolvers")(resolvers.asInstanceOf[js.Any]).asInstanceOf[ForeignFunctionResolver]
  
  inline def compileResults(fac: CompileResult, `def`: R3CompiledExpression, metadataStmt: Null, propName: String): js.Array[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileResults")(fac.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], metadataStmt.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[CompileResult]]
  inline def compileResults(fac: CompileResult, `def`: R3CompiledExpression, metadataStmt: Statement, propName: String): js.Array[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileResults")(fac.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], metadataStmt.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[CompileResult]]
  
  inline def createSourceSpan(node: Node): ParseSourceSpan = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourceSpan")(node.asInstanceOf[js.Any]).asInstanceOf[ParseSourceSpan]
  
  inline def findAngularDecorator(decorators: js.Array[Decorator], name: String, isCore: Boolean): js.UndefOr[Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAngularDecorator")(decorators.asInstanceOf[js.Any], name.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Decorator]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/util", "forwardRefResolver")
  @js.native
  val forwardRefResolver: ForeignFunctionResolver = js.native
  
  inline def getOriginNodeForDiagnostics(expr: Expression, container: Expression): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginNodeForDiagnostics")(expr.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def isAngularCore(decorator: Decorator): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCore")(decorator.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAngularCoreReference(reference: Reference[Node], symbolName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCoreReference")(reference.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAngularDecorator(decorator: Decorator, name: String, isCore: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularDecorator")(decorator.asInstanceOf[js.Any], name.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExpressionForwardReference(expr: typingsJapgolly.angularCompiler.mod.Expression, context: Node, contextSource: SourceFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionForwardReference")(expr.asInstanceOf[js.Any], context.asInstanceOf[js.Any], contextSource.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWrappedTsNodeExpr(expr: typingsJapgolly.angularCompiler.mod.Expression): /* is @angular/compiler.@angular/compiler.WrappedNodeExpr<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrappedTsNodeExpr")(expr.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler.WrappedNodeExpr<typescript.typescript.Node> */ Boolean]
  
  inline def readBaseClass(node: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, evaluator: PartialEvaluator): Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readBaseClass")(node.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Reference[ClassDeclaration[DeclarationNode]] | dynamic | Null]
  
  inline def resolveImportedFile(
    moduleResolver: ModuleResolver,
    importedFile: ImportedFile,
    expr: typingsJapgolly.angularCompiler.mod.Expression,
    origin: SourceFile
  ): SourceFile | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveImportedFile")(moduleResolver.asInstanceOf[js.Any], importedFile.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[SourceFile | Null]
  
  inline def resolveProvidersRequiringFactory(rawProviders: Expression, reflector: ReflectionHost, evaluator: PartialEvaluator): Set[Reference[ClassDeclaration[DeclarationNode]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProvidersRequiringFactory")(rawProviders.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Set[Reference[ClassDeclaration[DeclarationNode]]]]
  
  inline def toFactoryMetadata_target(meta: Omit[R3FactoryMetadata, target], target: FactoryTarget): R3FactoryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("toFactoryMetadata")(meta.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[R3FactoryMetadata]
  
  inline def toR3Reference(
    origin: Node,
    valueRef: Reference[Node],
    typeRef: Reference[Node],
    valueContext: SourceFile,
    typeContext: SourceFile,
    refEmitter: ReferenceEmitter
  ): R3Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("toR3Reference")(origin.asInstanceOf[js.Any], valueRef.asInstanceOf[js.Any], typeRef.asInstanceOf[js.Any], valueContext.asInstanceOf[js.Any], typeContext.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any])).asInstanceOf[R3Reference]
  
  inline def tryUnwrapForwardRef(node: Expression, reflector: ReflectionHost): Expression | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tryUnwrapForwardRef")(node.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[Expression | Null]
  
  inline def unwrapExpression(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def valueReferenceToExpression(valueRef: ImportedTypeValueReference): typingsJapgolly.angularCompiler.mod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompiler.mod.Expression]
  inline def valueReferenceToExpression(valueRef: LocalTypeValueReference): typingsJapgolly.angularCompiler.mod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompiler.mod.Expression]
  inline def valueReferenceToExpression(valueRef: TypeValueReference): typingsJapgolly.angularCompiler.mod.Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("valueReferenceToExpression")(valueRef.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompiler.mod.Expression | Null]
  
  inline def wrapFunctionExpressionsInParens(expression: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFunctionExpressionsInParens")(expression.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def wrapTypeReference(reflector: ReflectionHost, clazz: ClassDeclaration[DeclarationNode]): R3Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTypeReference")(reflector.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[R3Reference]
}
