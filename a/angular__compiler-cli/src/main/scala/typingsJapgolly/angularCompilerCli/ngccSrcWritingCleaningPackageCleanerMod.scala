package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typingsJapgolly.angularCompilerCli.ngccSrcWritingCleaningCleaningStrategiesMod.CleaningStrategy
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingCleaningPackageCleanerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/package_cleaner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/package_cleaner", "PackageCleaner")
  @js.native
  open class PackageCleaner protected () extends StObject {
    def this(fs: ReadonlyFileSystem, cleaners: js.Array[CleaningStrategy]) = this()
    
    /**
      * Recurse through the file-system cleaning files and directories as determined by the configured
      * cleaning-strategies.
      *
      * @param directory the current directory to clean
      */
    def clean(directory: AbsoluteFsPath): Unit = js.native
    
    /* private */ var cleaners: Any = js.native
    
    /* private */ var fs: Any = js.native
  }
  
  inline def cleanOutdatedPackages(fileSystem: FileSystem, entryPoints: js.Array[EntryPoint]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanOutdatedPackages")(fileSystem.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
