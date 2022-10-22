package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcPackagesSourceFileCacheMod.EntryPointFileCache
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemMod.NgtscCompilerHost
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionCache
import typingsJapgolly.typescript.mod.ResolvedModule
import typingsJapgolly.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesNgccCompilerHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/ngcc_compiler_host", "NgccDtsCompilerHost")
  @js.native
  open class NgccDtsCompilerHost protected () extends NgtscCompilerHost {
    def this(
      fs: FileSystem,
      options: CompilerOptions,
      cache: EntryPointFileCache,
      moduleResolutionCache: ModuleResolutionCache
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(moduleNames: js.Array[String], containingFile: String): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(moduleNames: js.Array[String], containingFile: String, reusedNames: js.Array[String]): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: js.Array[String],
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccDtsCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: Unit,
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/ngcc_compiler_host", "NgccSourcesCompilerHost")
  @js.native
  open class NgccSourcesCompilerHost protected () extends NgtscCompilerHost {
    def this(
      fs: FileSystem,
      options: CompilerOptions,
      cache: EntryPointFileCache,
      moduleResolutionCache: ModuleResolutionCache,
      packagePath: AbsoluteFsPath
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var moduleResolutionCache: Any = js.native
    
    /* protected */ var packagePath: AbsoluteFsPath = js.native
    
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(moduleNames: js.Array[String], containingFile: String): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(moduleNames: js.Array[String], containingFile: String, reusedNames: js.Array[String]): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: js.Array[String],
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
    @JSName("resolveModuleNames")
    def resolveModuleNames_MNgccSourcesCompilerHost(
      moduleNames: js.Array[String],
      containingFile: String,
      reusedNames: Unit,
      redirectedReference: ResolvedProjectReference
    ): js.Array[js.UndefOr[ResolvedModule]] = js.native
  }
}
