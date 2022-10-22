package typingsJapgolly.fhirJsClient

import typingsJapgolly.fhirJsClient.FHIR.SMART.Client
import typingsJapgolly.fhirJsClient.FHIR.SMART.Context
import typingsJapgolly.fhirJsClient.FHIR.SMART.OAuth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FHIR {
    
    @JSGlobal("FHIR")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct the SMART client directly without using the Oauth2 workflow
      * @param context Context required to construct the client.
      */
    inline def client(context: Context): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(context.asInstanceOf[js.Any]).asInstanceOf[Client]
    
    /**
      * Property which exposes the OAUth2 specific workflow helpers
      */
    @JSGlobal("FHIR.oauth2")
    @js.native
    val oauth2: OAuth2 = js.native
  }
}
