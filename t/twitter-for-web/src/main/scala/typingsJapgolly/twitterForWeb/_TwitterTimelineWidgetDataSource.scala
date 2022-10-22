package typingsJapgolly.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TwitterTimelineWidgetDataSource extends StObject
object _TwitterTimelineWidgetDataSource {
  
  inline def Id(id: String): typingsJapgolly.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.Id]
  }
  
  inline def OwnerScreenName(ownerScreenName: String, slug: String): typingsJapgolly.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.OwnerScreenName]
  }
  
  inline def ScreenName(screenName: String): typingsJapgolly.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "profile")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.ScreenName]
  }
  
  inline def ScreenNameSourceType(screenName: String): typingsJapgolly.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "likes")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  inline def SourceType(userId: String): typingsJapgolly.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = "profile", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.SourceType]
  }
  
  inline def TwitterTimelineWidgetCollectionDataSource(id: String): typingsJapgolly.twitterForWeb.TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "collection")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.TwitterTimelineWidgetCollectionDataSource]
  }
  
  inline def TwitterTimelineWidgetUrlDataSource(url: String): typingsJapgolly.twitterForWeb.TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = "url", url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.TwitterTimelineWidgetUrlDataSource]
  }
  
  inline def UserId(userId: String): typingsJapgolly.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = "likes", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.UserId]
  }
}
