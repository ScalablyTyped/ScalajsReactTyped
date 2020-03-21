package typingsJapgolly.watsonDeveloperCloud.sdkMod.DiscoveryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateCredentials` operation. */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1.UpdateCredentialsConstants")
@js.native
object UpdateCredentialsConstants extends js.Object {
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  @js.native
  object SourceType extends js.Object {
    /* "box" */ val BOX: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.BOX with String = js.native
    /* "cloud_object_storage" */ val CLOUD_OBJECT_STORAGE: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.CLOUD_OBJECT_STORAGE with String = js.native
    /* "salesforce" */ val SALESFORCE: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.SALESFORCE with String = js.native
    /* "sharepoint" */ val SHAREPOINT: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.SHAREPOINT with String = js.native
    /* "web_crawl" */ val WEB_CRAWL: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType.WEB_CRAWL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.UpdateCredentialsConstants.SourceType with String
      ] = js.native
  }
  
}

