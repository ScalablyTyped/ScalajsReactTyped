package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ParsedHostBindings
import typingsJapgolly.angularCompiler.mod.R3QueryMetadata
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcTypeParametersMod.SemanticTypeParameter
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveDecoratorHandler")
  @js.native
  open class DirectiveDecoratorHandler protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcHandlerMod.DirectiveDecoratorHandler {
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: Null,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
    def this(
      reflector: ReflectionHost,
      evaluator: PartialEvaluator,
      metaRegistry: MetadataRegistry,
      scopeRegistry: LocalModuleScopeRegistry,
      metaReader: MetadataReader,
      injectableRegistry: InjectableClassRegistry,
      isCore: Boolean,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      annotateForClosureCompiler: Boolean,
      compileUndecoratedClassesWithAngularFeatures: Boolean,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive", "DirectiveSymbol")
  @js.native
  open class DirectiveSymbol protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscAnnotationsDirectiveSrcSymbolMod.DirectiveSymbol {
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
  }
  
  inline def extractDirectiveMetadata(
    clazz: ClassDeclaration[DeclarationNode],
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean
  ): js.UndefOr[typingsJapgolly.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.angularCompilerCli.anon.Decorator]]
  inline def extractDirectiveMetadata(
    clazz: ClassDeclaration[DeclarationNode],
    decorator: Decorator | Null,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    isCore: Boolean,
    flags: HandlerFlags,
    annotateForClosureCompiler: Boolean,
    defaultSelector: String
  ): js.UndefOr[typingsJapgolly.angularCompilerCli.anon.Decorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveMetadata")(clazz.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], defaultSelector.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.angularCompilerCli.anon.Decorator]]
  
  inline def extractHostBindings(members: js.Array[ClassMember], evaluator: PartialEvaluator): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(members: js.Array[ClassMember], evaluator: PartialEvaluator, coreModule: String): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(
    members: js.Array[ClassMember],
    evaluator: PartialEvaluator,
    coreModule: String,
    metadata: Map[String, Expression]
  ): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  inline def extractHostBindings(
    members: js.Array[ClassMember],
    evaluator: PartialEvaluator,
    coreModule: Unit,
    metadata: Map[String, Expression]
  ): ParsedHostBindings = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHostBindings")(members.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], coreModule.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedHostBindings]
  
  inline def extractQueryMetadata(
    exprNode: Node,
    name: String,
    args: js.Array[Expression],
    propertyName: String,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator
  ): R3QueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("extractQueryMetadata")(exprNode.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[R3QueryMetadata]
  
  inline def parseFieldArrayValue(directive: Map[String, Expression], field: String, evaluator: PartialEvaluator): Null | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFieldArrayValue")(directive.asInstanceOf[js.Any], field.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Null | js.Array[String]]
}
