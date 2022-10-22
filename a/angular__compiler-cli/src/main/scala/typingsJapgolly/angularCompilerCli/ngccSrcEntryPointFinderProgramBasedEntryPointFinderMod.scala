package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.EntryPointWithDependencies
import typingsJapgolly.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.DependencyResolver
import typingsJapgolly.angularCompilerCli.ngccSrcEntryPointFinderEntryPointCollectorMod.EntryPointCollector
import typingsJapgolly.angularCompilerCli.ngccSrcEntryPointFinderTracingEntryPointFinderMod.TracingEntryPointFinder
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccConfiguration
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointManifestMod.EntryPointManifest
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderProgramBasedEntryPointFinderMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/program_based_entry_point_finder", "ProgramBasedEntryPointFinder")
  @js.native
  open class ProgramBasedEntryPointFinder protected () extends TracingEntryPointFinder {
    def this(
      fs: ReadonlyFileSystem,
      config: NgccConfiguration,
      logger: Logger,
      resolver: DependencyResolver,
      entryPointCollector: EntryPointCollector,
      entryPointManifest: EntryPointManifest,
      basePath: AbsoluteFsPath,
      tsConfig: ParsedConfiguration,
      projectPath: AbsoluteFsPath
    ) = this()
    
    /* private */ var entryPointCollector: Any = js.native
    
    /* private */ var entryPointManifest: Any = js.native
    
    /* private */ var entryPointsWithDependencies: Any = js.native
    
    /**
      * Walk the base paths looking for entry-points or load this information from an entry-point
      * manifest, if available.
      */
    /* private */ var findOrLoadEntryPoints: Any = js.native
    
    /* private */ var tsConfig: Any = js.native
    
    /**
      * Search the `basePath` for possible Angular packages and entry-points.
      *
      * @param basePath The path at which to start the search.
      * @returns an array of `EntryPoint`s that were found within `basePath`.
      */
    def walkBasePathForPackages(basePath: AbsoluteFsPath): js.Array[EntryPointWithDependencies] = js.native
  }
}
