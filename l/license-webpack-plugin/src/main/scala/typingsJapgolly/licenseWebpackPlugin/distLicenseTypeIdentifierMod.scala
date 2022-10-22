package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distPackageJsonMod.PackageJson
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicenseTypeIdentifierMod {
  
  trait LicenseTypeIdentifier extends StObject {
    
    def findLicenseIdentifier(compilation: WebpackCompilation, packageName: String, packageJson: PackageJson): String | Null
  }
  object LicenseTypeIdentifier {
    
    inline def apply(findLicenseIdentifier: (WebpackCompilation, String, PackageJson) => String | Null): LicenseTypeIdentifier = {
      val __obj = js.Dynamic.literal(findLicenseIdentifier = js.Any.fromFunction3(findLicenseIdentifier))
      __obj.asInstanceOf[LicenseTypeIdentifier]
    }
    
    extension [Self <: LicenseTypeIdentifier](x: Self) {
      
      inline def setFindLicenseIdentifier(value: (WebpackCompilation, String, PackageJson) => String | Null): Self = StObject.set(x, "findLicenseIdentifier", js.Any.fromFunction3(value))
    }
  }
}
