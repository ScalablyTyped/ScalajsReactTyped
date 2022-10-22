package typingsJapgolly.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twitterForWeb.anon.OwnerScreenName
  - typingsJapgolly.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetListDataSource {
  
  inline def Id(id: String): typingsJapgolly.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.Id]
  }
  
  inline def OwnerScreenName(ownerScreenName: String, slug: String): typingsJapgolly.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.OwnerScreenName]
  }
}
