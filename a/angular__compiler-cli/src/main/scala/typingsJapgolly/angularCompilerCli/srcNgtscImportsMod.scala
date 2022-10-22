package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.ModuleResolutionHostPickC
import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemMod.LogicalFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitResult
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitStrategy
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReferencesMod.OwningModule
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "AbsoluteModuleStrategy")
  @js.native
  open class AbsoluteModuleStrategy protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.AbsoluteModuleStrategy {
    def this(
      program: Program,
      checker: TypeChecker,
      moduleResolver: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcResolverMod.ModuleResolver,
      reflectionHost: ReflectionHost
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "AliasStrategy")
  @js.native
  open class AliasStrategy ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "DefaultImportTracker")
  @js.native
  open class DefaultImportTracker ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcDefaultMod.DefaultImportTracker
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ImportFlags")
  @js.native
  object ImportFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags & Double
      ] = js.native
    
    /* 8 */ val AllowRelativeDtsImports: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.AllowRelativeDtsImports & Double = js.native
    
    /* 4 */ val AllowTypeImports: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.AllowTypeImports & Double = js.native
    
    /* 1 */ val ForceNewImport: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.ForceNewImport & Double = js.native
    
    /* 2 */ val NoAliasing: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.NoAliasing & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags.None & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "LocalIdentifierStrategy")
  @js.native
  open class LocalIdentifierStrategy ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.LocalIdentifierStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "LogicalProjectStrategy")
  @js.native
  open class LogicalProjectStrategy protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.LogicalProjectStrategy {
    def this(reflector: ReflectionHost, logicalFs: LogicalFileSystem) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ModuleResolver")
  @js.native
  open class ModuleResolver protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcResolverMod.ModuleResolver {
    def this(program: Program, compilerOptions: CompilerOptions, host: ModuleResolutionHostPickC) = this()
    def this(
      program: Program,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHostPickC,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "NoopImportRewriter")
  @js.native
  open class NoopImportRewriter ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.NoopImportRewriter
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "PrivateExportAliasingHost")
  @js.native
  open class PrivateExportAliasingHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcAliasMod.PrivateExportAliasingHost {
    def this(host: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "R3SymbolsImportRewriter")
  @js.native
  open class R3SymbolsImportRewriter protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.R3SymbolsImportRewriter {
    def this(r3SymbolsPath: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "Reference")
  @js.native
  open class Reference[T /* <: Node */] protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReferencesMod.Reference[T] {
    def this(node: T) = this()
    def this(node: T, bestGuessOwningModule: OwningModule) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "ReferenceEmitter")
  @js.native
  open class ReferenceEmitter protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitter {
    def this(strategies: js.Array[ReferenceEmitStrategy]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "RelativePathStrategy")
  @js.native
  open class RelativePathStrategy protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.RelativePathStrategy {
    def this(reflector: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "UnifiedModulesAliasingHost")
  @js.native
  open class UnifiedModulesAliasingHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcAliasMod.UnifiedModulesAliasingHost {
    def this(unifiedModulesHost: UnifiedModulesHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports", "UnifiedModulesStrategy")
  @js.native
  open class UnifiedModulesStrategy protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcEmitterMod.UnifiedModulesStrategy {
    def this(reflector: ReflectionHost, unifiedModulesHost: UnifiedModulesHost) = this()
  }
  
  inline def assertSuccessfulReferenceEmit(result: ReferenceEmitResult, origin: Node, typeKind: String): /* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuccessfulReferenceEmit")(result.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], typeKind.asInstanceOf[js.Any])).asInstanceOf[/* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean]
  
  inline def validateAndRewriteCoreSymbol(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndRewriteCoreSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
