package typingsJapgolly.typescript.mod.server

import typingsJapgolly.typescript.mod.Path
import typingsJapgolly.typescript.typescriptStrings.installPackage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallPackageRequest
  extends StObject
     with TypingInstallerRequestWithProjectName {
  
  val fileName: Path
  
  val kind: installPackage
  
  val packageName: String
  
  val projectRootPath: Path
}
object InstallPackageRequest {
  
  inline def apply(fileName: Path, packageName: String, projectName: String, projectRootPath: Path): InstallPackageRequest = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = "installPackage", packageName = packageName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageRequest]
  }
  
  extension [Self <: InstallPackageRequest](x: Self) {
    
    inline def setFileName(value: Path): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: installPackage): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
  }
}
