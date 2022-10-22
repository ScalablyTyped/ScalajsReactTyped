package typingsJapgolly.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.builderUtilRuntime.outUpdateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packages extends StObject {
  
  var packages: StringDictionary[PackageFileInfo]
}
object Packages {
  
  inline def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packages]
  }
  
  extension [Self <: Packages](x: Self) {
    
    inline def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
  }
}
