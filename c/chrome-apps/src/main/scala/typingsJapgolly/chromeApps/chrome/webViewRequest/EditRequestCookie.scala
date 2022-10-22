package typingsJapgolly.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edits one or more cookies of request.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait EditRequestCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typingsJapgolly.chromeApps.chromeAppsStrings.EditRequestCookie
}
object EditRequestCookie {
  
  inline def apply(instanceType: String): EditRequestCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "EditRequestCookie")
    __obj.asInstanceOf[EditRequestCookie]
  }
  
  extension [Self <: EditRequestCookie](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typingsJapgolly.chromeApps.chromeAppsStrings.EditRequestCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
