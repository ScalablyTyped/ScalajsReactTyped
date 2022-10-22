package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingCleaningCleaningStrategiesMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/cleaning_strategies", "BackupFileCleaner")
  @js.native
  open class BackupFileCleaner protected ()
    extends StObject
       with CleaningStrategy {
    def this(fs: FileSystem) = this()
    
    /* CompleteClass */
    override def canClean(path: AbsoluteFsPath, basename: PathSegment): Boolean = js.native
    
    /* CompleteClass */
    override def clean(path: AbsoluteFsPath, basename: PathSegment): Unit = js.native
    
    /* private */ var fs: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/cleaning_strategies", "NgccDirectoryCleaner")
  @js.native
  open class NgccDirectoryCleaner protected ()
    extends StObject
       with CleaningStrategy {
    def this(fs: FileSystem) = this()
    
    /* CompleteClass */
    override def canClean(path: AbsoluteFsPath, basename: PathSegment): Boolean = js.native
    
    /* CompleteClass */
    override def clean(path: AbsoluteFsPath, basename: PathSegment): Unit = js.native
    
    /* private */ var fs: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/cleaning_strategies", "PackageJsonCleaner")
  @js.native
  open class PackageJsonCleaner protected ()
    extends StObject
       with CleaningStrategy {
    def this(fs: FileSystem) = this()
    
    /* CompleteClass */
    override def canClean(path: AbsoluteFsPath, basename: PathSegment): Boolean = js.native
    
    /* CompleteClass */
    override def clean(path: AbsoluteFsPath, basename: PathSegment): Unit = js.native
    
    /* private */ var fs: Any = js.native
  }
  
  trait CleaningStrategy extends StObject {
    
    def canClean(path: AbsoluteFsPath, basename: PathSegment): Boolean
    
    def clean(path: AbsoluteFsPath, basename: PathSegment): Unit
  }
  object CleaningStrategy {
    
    inline def apply(
      canClean: (AbsoluteFsPath, PathSegment) => Boolean,
      clean: (AbsoluteFsPath, PathSegment) => Callback
    ): CleaningStrategy = {
      val __obj = js.Dynamic.literal(canClean = js.Any.fromFunction2(canClean), clean = js.Any.fromFunction2((t0: AbsoluteFsPath, t1: PathSegment) => (clean(t0, t1)).runNow()))
      __obj.asInstanceOf[CleaningStrategy]
    }
    
    extension [Self <: CleaningStrategy](x: Self) {
      
      inline def setCanClean(value: (AbsoluteFsPath, PathSegment) => Boolean): Self = StObject.set(x, "canClean", js.Any.fromFunction2(value))
      
      inline def setClean(value: (AbsoluteFsPath, PathSegment) => Callback): Self = StObject.set(x, "clean", js.Any.fromFunction2((t0: AbsoluteFsPath, t1: PathSegment) => (value(t0, t1)).runNow()))
    }
  }
}
