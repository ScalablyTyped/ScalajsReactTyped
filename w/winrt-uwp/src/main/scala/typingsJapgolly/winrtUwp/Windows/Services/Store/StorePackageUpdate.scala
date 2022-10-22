package typingsJapgolly.winrtUwp.Windows.Services.Store

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
trait StorePackageUpdate extends StObject {
  
  /** Gets the package that has an update available for download from the Windows Store. */
  @JSName("package")
  var _package: Package
  
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  var mandatory: Boolean
}
object StorePackageUpdate {
  
  inline def apply(_package: Package, mandatory: Boolean): StorePackageUpdate = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdate]
  }
  
  extension [Self <: StorePackageUpdate](x: Self) {
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
