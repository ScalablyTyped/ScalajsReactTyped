package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.ProgramDriver
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiContextMod.ProgramTypeCheckAdapter
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.FileTypeCheckingData
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcContextMod.InliningMode
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TypeCheckingHost
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TemplateTypeCheckerImpl")
  @js.native
  open class TemplateTypeCheckerImpl protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcCheckerMod.TemplateTypeCheckerImpl {
    def this(
      originalProgram: Program,
      programDriver: ProgramDriver,
      typeCheckAdapter: ProgramTypeCheckAdapter,
      config: TypeCheckingConfig,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      compilerHost: PickCompilerHostgetCanoni,
      priorBuild: IncrementalBuild[Any, FileTypeCheckingData],
      metaReader: MetadataReader,
      componentScopeReader: ComponentScopeReader,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckContextImpl")
  @js.native
  open class TypeCheckContextImpl protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TypeCheckContextImpl {
    def this(
      config: TypeCheckingConfig,
      compilerHost: PickCompilerHostgetCanoni,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      host: TypeCheckingHost,
      inlining: InliningMode,
      perf: PerfRecorder
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckShimGenerator")
  @js.native
  open class TypeCheckShimGenerator ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcShimMod.TypeCheckShimGenerator
  /* static members */
  object TypeCheckShimGenerator {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/typecheck", "TypeCheckShimGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def shimFor(fileName: AbsoluteFsPath): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("shimFor")(fileName.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  }
  
  inline def typeCheckFilePath(rootDirs: js.Array[AbsoluteFsPath]): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("typeCheckFilePath")(rootDirs.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
