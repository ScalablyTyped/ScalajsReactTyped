package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcTypesMod {
  
  type AbsoluteFsPath = BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]
  
  @js.native
  trait BrandedPath[B /* <: String */]
    extends StObject
       with typingsJapgolly.std.String {
    
    var _brand: B = js.native
  }
  
  trait FileStats extends StObject {
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    def isSymbolicLink(): Boolean
  }
  object FileStats {
    
    inline def apply(isDirectory: CallbackTo[Boolean], isFile: CallbackTo[Boolean], isSymbolicLink: CallbackTo[Boolean]): FileStats = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn)
      __obj.asInstanceOf[FileStats]
    }
    
    extension [Self <: FileStats](x: Self) {
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
    }
  }
  
  @js.native
  trait FileSystem
    extends StObject
       with ReadonlyFileSystem {
    
    def copyFile(from: AbsoluteFsPath, to: AbsoluteFsPath): Unit = js.native
    
    def ensureDir(path: AbsoluteFsPath): Unit = js.native
    
    def moveFile(from: AbsoluteFsPath, to: AbsoluteFsPath): Unit = js.native
    
    def removeDeep(path: AbsoluteFsPath): Unit = js.native
    
    def removeFile(path: AbsoluteFsPath): Unit = js.native
    
    def symlink(target: AbsoluteFsPath, path: AbsoluteFsPath): Unit = js.native
    
    def writeFile(path: AbsoluteFsPath, data: String): Unit = js.native
    def writeFile(path: AbsoluteFsPath, data: String, exclusive: Boolean): Unit = js.native
    def writeFile(path: AbsoluteFsPath, data: js.typedarray.Uint8Array): Unit = js.native
    def writeFile(path: AbsoluteFsPath, data: js.typedarray.Uint8Array, exclusive: Boolean): Unit = js.native
  }
  
  @js.native
  trait PathManipulation extends StObject {
    
    def basename(filePath: String): PathSegment = js.native
    def basename(filePath: String, `extension`: String): PathSegment = js.native
    
    def chdir(path: AbsoluteFsPath): Unit = js.native
    
    def dirname(file: String): String = js.native
    @JSName("dirname")
    def dirname_AbsoluteFsPath(file: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = js.native
    @JSName("dirname")
    def dirname_PathSegment(file: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment] = js.native
    
    def extname(path: AbsoluteFsPath | PathSegment): String = js.native
    
    def isRoot(path: AbsoluteFsPath): Boolean = js.native
    
    def isRooted(path: String): Boolean = js.native
    
    def join(basePath: String, paths: String*): String = js.native
    @JSName("join")
    def join_AbsoluteFsPath(
      basePath: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
      paths: String*
    ): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = js.native
    @JSName("join")
    def join_PathSegment(
      basePath: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment],
      paths: String*
    ): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment] = js.native
    
    def normalize(path: String): String = js.native
    @JSName("normalize")
    def normalize_AbsoluteFsPath(path: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = js.native
    @JSName("normalize")
    def normalize_PathSegment(path: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment] = js.native
    
    def pwd(): AbsoluteFsPath = js.native
    
    /**
      * Compute the relative path between `from` and `to`.
      *
      * In file-systems that can have multiple file trees the returned path may not actually be
      * "relative" (i.e. `PathSegment`). For example, Windows can have multiple drives :
      * `relative('c:/a/b', 'd:/a/c')` would be `d:/a/c'.
      */
    def relative(from: String, to: String): PathSegment | AbsoluteFsPath = js.native
    @JSName("relative")
    def relative_AbsoluteFsPath(
      from: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
      to: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]
    ): PathSegment | AbsoluteFsPath = js.native
    @JSName("relative")
    def relative_PathSegment(
      from: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment],
      to: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]
    ): PathSegment | AbsoluteFsPath = js.native
    
    def resolve(paths: String*): AbsoluteFsPath = js.native
  }
  
  type PathSegment = BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment]
  
  type PathString = String | AbsoluteFsPath | PathSegment
  
  @js.native
  trait ReadonlyFileSystem
    extends StObject
       with PathManipulation {
    
    def exists(path: AbsoluteFsPath): Boolean = js.native
    
    def getDefaultLibLocation(): AbsoluteFsPath = js.native
    
    def isCaseSensitive(): Boolean = js.native
    
    def lstat(path: AbsoluteFsPath): FileStats = js.native
    
    def readFile(path: AbsoluteFsPath): String = js.native
    
    def readFileBuffer(path: AbsoluteFsPath): js.typedarray.Uint8Array = js.native
    
    def readdir(path: AbsoluteFsPath): js.Array[PathSegment] = js.native
    
    def realpath(filePath: AbsoluteFsPath): AbsoluteFsPath = js.native
    
    def stat(path: AbsoluteFsPath): FileStats = js.native
  }
}
