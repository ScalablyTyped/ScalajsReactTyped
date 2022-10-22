package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcAdapterMod.SourceFileTypeIdentifier
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.DefaultImportTracker
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticDepGraphUpdater
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DecoratorHandler
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.DetectResult
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcCompilationMod.ClassRecord
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.PendingTrait
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "CompilationMode")
  @js.native
  object CompilationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode & Double
      ] = js.native
    
    /* 0 */ val FULL: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode.FULL & Double = js.native
    
    /* 1 */ val PARTIAL: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.CompilationMode.PARTIAL & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "DtsTransformRegistry")
  @js.native
  open class DtsTransformRegistry ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "HandlerFlags")
  @js.native
  object HandlerFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags & Double
      ] = js.native
    
    /* 1 */ val FULL_INHERITANCE: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags.FULL_INHERITANCE & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags.NONE & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "HandlerPrecedence")
  @js.native
  object HandlerPrecedence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence & Double
      ] = js.native
    
    /* 0 */ val PRIMARY: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.PRIMARY & Double = js.native
    
    /* 1 */ val SHARED: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.SHARED & Double = js.native
    
    /* 2 */ val WEAK: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerPrecedence.WEAK & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "IvyDeclarationDtsTransform")
  @js.native
  open class IvyDeclarationDtsTransform ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.IvyDeclarationDtsTransform
  
  object Trait {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/transform", "Trait")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pending[D, A, S /* <: SemanticSymbol | Null */, R](handler: DecoratorHandler[D, A, S, R], detected: DetectResult[D]): PendingTrait[D, A, S, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("pending")(handler.asInstanceOf[js.Any], detected.asInstanceOf[js.Any])).asInstanceOf[PendingTrait[D, A, S, R]]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "TraitCompiler")
  @js.native
  open class TraitCompiler protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcCompilationMod.TraitCompiler {
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry,
      semanticDepGraphUpdater: Null,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      reflector: ReflectionHost,
      perf: PerfRecorder,
      incrementalBuild: IncrementalBuild[ClassRecord, Any],
      compileNonExportedClasses: Boolean,
      compilationMode: CompilationMode,
      dtsTransforms: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry,
      semanticDepGraphUpdater: SemanticDepGraphUpdater,
      sourceFileTypeIdentifier: SourceFileTypeIdentifier
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform", "TraitState")
  @js.native
  object TraitState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState & Double
      ] = js.native
    
    /* 1 */ val Analyzed: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Analyzed & Double = js.native
    
    /* 0 */ val Pending: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Pending & Double = js.native
    
    /* 2 */ val Resolved: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Resolved & Double = js.native
    
    /* 3 */ val Skipped: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcTraitMod.TraitState.Skipped & Double = js.native
  }
  
  inline def aliasTransformFactory(exportStatements: Map[String, Map[String, js.Tuple2[String, String]]]): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("aliasTransformFactory")(exportStatements.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def declarationTransformFactory(
    transformRegistry: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry,
    importRewriter: ImportRewriter
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  inline def declarationTransformFactory(
    transformRegistry: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcDeclarationMod.DtsTransformRegistry,
    importRewriter: ImportRewriter,
    importPrefix: String
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], importPrefix.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def ivyTransformFactory(
    compilation: typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcCompilationMod.TraitCompiler,
    reflector: ReflectionHost,
    importRewriter: ImportRewriter,
    defaultImportTracker: DefaultImportTracker,
    perf: PerfRecorder,
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("ivyTransformFactory")(compilation.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], defaultImportTracker.asInstanceOf[js.Any], perf.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
