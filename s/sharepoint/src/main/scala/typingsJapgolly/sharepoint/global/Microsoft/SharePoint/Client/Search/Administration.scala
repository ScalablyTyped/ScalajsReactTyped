package typingsJapgolly.sharepoint.global.Microsoft.SharePoint.Client.Search

import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel
import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.Site
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Administration {
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog")
  @js.native
  open class DocumentCrawlLog protected ()
    extends StObject
       with typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog {
    def this(context: ClientContext, site: Site) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel")
  @js.native
  object SearchObjectLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel & Double
      ] = js.native
    
    /* 1 */ val spSite: typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSite & Double = js.native
    
    /* 2 */ val spSiteSubscription: typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSiteSubscription & Double = js.native
    
    /* 0 */ val spWeb: typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spWeb & Double = js.native
    
    /* 3 */ val ssa: typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.ssa & Double = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner")
  @js.native
  open class SearchObjectOwner protected ()
    extends StObject
       with ClientObject {
    def this(context: ClientContext, lowestCurrentLevelToUse: SearchObjectLevel) = this()
  }
}
