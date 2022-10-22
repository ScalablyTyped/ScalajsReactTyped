package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing credential information. */
trait Credentials extends StObject {
  
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.undefined
  
  /** Unique identifier for this set of credentials. */
  var credential_id: js.UndefOr[String] = js.undefined
  
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[String] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setCredential_details(value: CredentialDetails): Self = StObject.set(x, "credential_details", value.asInstanceOf[js.Any])
    
    inline def setCredential_detailsUndefined: Self = StObject.set(x, "credential_details", js.undefined)
    
    inline def setCredential_id(value: String): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    inline def setCredential_idUndefined: Self = StObject.set(x, "credential_id", js.undefined)
    
    inline def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
  }
}
