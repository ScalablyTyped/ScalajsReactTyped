package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePath extends StObject {
  
  var basePath: AbsoluteFsPath
  
  var projectFile: AbsoluteFsPath
}
object BasePath {
  
  inline def apply(basePath: AbsoluteFsPath, projectFile: AbsoluteFsPath): BasePath = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], projectFile = projectFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  
  extension [Self <: BasePath](x: Self) {
    
    inline def setBasePath(value: AbsoluteFsPath): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setProjectFile(value: AbsoluteFsPath): Self = StObject.set(x, "projectFile", value.asInstanceOf[js.Any])
  }
}
