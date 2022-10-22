package typingsJapgolly.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Masks all rules that match the specified criteria.
  */
trait IgnoreRules
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.IgnoreRules
}
object IgnoreRules {
  
  inline def apply(instanceType: String): IgnoreRules = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "IgnoreRules")
    __obj.asInstanceOf[IgnoreRules]
  }
  
  extension [Self <: IgnoreRules](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typingsJapgolly.chromeApps.chromeAppsStrings.IgnoreRules): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
