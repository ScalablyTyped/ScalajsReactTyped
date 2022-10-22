package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUrlDestinationSummary extends StObject {
  
  /**
    * The URL used to confirm ownership of or access to the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.undefined
}
object HttpUrlDestinationSummary {
  
  inline def apply(): HttpUrlDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpUrlDestinationSummary]
  }
  
  extension [Self <: HttpUrlDestinationSummary](x: Self) {
    
    inline def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUrlUndefined: Self = StObject.set(x, "confirmationUrl", js.undefined)
  }
}
