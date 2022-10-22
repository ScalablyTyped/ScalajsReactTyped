package typingsJapgolly.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes all response headers of the specified names and values.
  */
trait RemoveResponseHeader
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveResponseHeader
}
object RemoveResponseHeader {
  
  inline def apply(instanceType: String): RemoveResponseHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RemoveResponseHeader")
    __obj.asInstanceOf[RemoveResponseHeader]
  }
  
  extension [Self <: RemoveResponseHeader](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typingsJapgolly.chromeApps.chromeAppsStrings.RemoveResponseHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
