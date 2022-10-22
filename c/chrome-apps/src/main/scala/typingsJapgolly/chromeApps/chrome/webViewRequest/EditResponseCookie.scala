package typingsJapgolly.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edits one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait EditResponseCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.EditResponseCookie
}
object EditResponseCookie {
  
  inline def apply(instanceType: String): EditResponseCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "EditResponseCookie")
    __obj.asInstanceOf[EditResponseCookie]
  }
  
  extension [Self <: EditResponseCookie](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typingsJapgolly.chromeApps.chromeAppsStrings.EditResponseCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
