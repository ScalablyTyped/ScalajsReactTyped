package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search

import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner
import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.JsonObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Portability")
@js.native
object Portability extends js.Object {
  @js.native
  class SearchConfigurationPortability protected () extends ClientObject {
    def this(context: ClientContext) = this()
    def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
    def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
    def get_importWarnings(): String = js.native
    def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  }
  
  @js.native
  class SearchConfigurationPortabilityPropertyNames () extends js.Object
  
  /* static members */
  @js.native
  object SearchConfigurationPortabilityPropertyNames extends js.Object {
    var importWarnings: String = js.native
  }
  
}

