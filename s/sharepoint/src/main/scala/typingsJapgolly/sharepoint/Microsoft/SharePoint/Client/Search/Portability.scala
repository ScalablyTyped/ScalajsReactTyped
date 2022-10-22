package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search

import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.JsonObjectResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portability {
  
  @js.native
  trait SearchConfigurationPortability
    extends StObject
       with ClientObject {
    
    def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
    
    def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
    
    def get_importWarnings(): String = js.native
    
    def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  }
  
  trait SearchConfigurationPortabilityPropertyNames extends StObject
}
