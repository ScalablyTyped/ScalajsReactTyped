package typingsJapgolly.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twitterForWeb.anon.ScreenNameSourceType
  - typingsJapgolly.twitterForWeb.anon.UserId
*/
trait TwitterTimelineWidgetLikesDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetLikesDataSource {
  
  inline def ScreenNameSourceType(screenName: String): typingsJapgolly.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "likes")
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  inline def UserId(userId: String): typingsJapgolly.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = "likes", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.twitterForWeb.anon.UserId]
  }
}
