package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrashDialogError extends StObject {
  
  /** The name of the package that caused the dialog. */
  var crashPackage: js.UndefOr[String] = js.undefined
}
object CrashDialogError {
  
  inline def apply(): CrashDialogError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrashDialogError]
  }
  
  extension [Self <: CrashDialogError](x: Self) {
    
    inline def setCrashPackage(value: String): Self = StObject.set(x, "crashPackage", value.asInstanceOf[js.Any])
    
    inline def setCrashPackageUndefined: Self = StObject.set(x, "crashPackage", js.undefined)
  }
}
