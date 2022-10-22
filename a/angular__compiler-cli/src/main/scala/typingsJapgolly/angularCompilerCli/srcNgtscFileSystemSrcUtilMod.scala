package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.PathSegment
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  
  inline def normalizeSeparators(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSeparators")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension_AbsoluteFsPath(path: BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def stripExtension_PathSegment(path: BrandedPath[PathSegment]): BrandedPath[PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[PathSegment]]
}
