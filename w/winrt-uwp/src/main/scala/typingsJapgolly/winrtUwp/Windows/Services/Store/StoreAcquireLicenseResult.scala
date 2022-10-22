package typingsJapgolly.winrtUwp.Windows.Services.Store

import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to acquire a downloadable content (DLC) package license. */
trait StoreAcquireLicenseResult extends StObject {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  
  /** Gets an object that represents the downloadable content (DLC) package license. */
  var storePackageLicense: StorePackageLicense
}
object StoreAcquireLicenseResult {
  
  inline def apply(extendedError: WinRTError, storePackageLicense: StorePackageLicense): StoreAcquireLicenseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], storePackageLicense = storePackageLicense.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAcquireLicenseResult]
  }
  
  extension [Self <: StoreAcquireLicenseResult](x: Self) {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    inline def setStorePackageLicense(value: StorePackageLicense): Self = StObject.set(x, "storePackageLicense", value.asInstanceOf[js.Any])
  }
}
