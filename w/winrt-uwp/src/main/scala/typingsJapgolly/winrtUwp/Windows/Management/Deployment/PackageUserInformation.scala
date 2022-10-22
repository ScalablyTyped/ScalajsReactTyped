package typingsJapgolly.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the users of an installed package. */
trait PackageUserInformation extends StObject {
  
  /** Gets the install state of the package for the user. */
  var installState: PackageInstallState
  
  /** Gets the security identifier (SID) of the package user. */
  var userSecurityId: String
}
object PackageUserInformation {
  
  inline def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageUserInformation]
  }
  
  extension [Self <: PackageUserInformation](x: Self) {
    
    inline def setInstallState(value: PackageInstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setUserSecurityId(value: String): Self = StObject.set(x, "userSecurityId", value.asInstanceOf[js.Any])
  }
}
