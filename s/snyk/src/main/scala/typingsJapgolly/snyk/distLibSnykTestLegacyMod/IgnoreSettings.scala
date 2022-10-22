package typingsJapgolly.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreSettings extends StObject {
  
  var adminOnly: Boolean
  
  var disregardFilesystemIgnores: Boolean
  
  var reasonRequired: Boolean
}
object IgnoreSettings {
  
  inline def apply(adminOnly: Boolean, disregardFilesystemIgnores: Boolean, reasonRequired: Boolean): IgnoreSettings = {
    val __obj = js.Dynamic.literal(adminOnly = adminOnly.asInstanceOf[js.Any], disregardFilesystemIgnores = disregardFilesystemIgnores.asInstanceOf[js.Any], reasonRequired = reasonRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreSettings]
  }
  
  extension [Self <: IgnoreSettings](x: Self) {
    
    inline def setAdminOnly(value: Boolean): Self = StObject.set(x, "adminOnly", value.asInstanceOf[js.Any])
    
    inline def setDisregardFilesystemIgnores(value: Boolean): Self = StObject.set(x, "disregardFilesystemIgnores", value.asInstanceOf[js.Any])
    
    inline def setReasonRequired(value: Boolean): Self = StObject.set(x, "reasonRequired", value.asInstanceOf[js.Any])
  }
}
