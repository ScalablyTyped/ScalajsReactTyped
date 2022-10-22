package typingsJapgolly.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ytSearch.mod.UpcomingLiveSearchResult
  - typingsJapgolly.ytSearch.mod.LiveLiveSearchResult
*/
trait LiveSearchResult extends StObject
object LiveSearchResult {
  
  inline def LiveLiveSearchResult(
    author: Author,
    description: String,
    image: String,
    thumbnail: String,
    title: String,
    url: String,
    videoId: String,
    watching: Double
  ): typingsJapgolly.ytSearch.mod.LiveLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], status = "LIVE", thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("live")
    __obj.asInstanceOf[typingsJapgolly.ytSearch.mod.LiveLiveSearchResult]
  }
  
  inline def UpcomingLiveSearchResult(
    author: Author,
    description: String,
    image: String,
    startDate: String,
    startTime: Double,
    thumbnail: String,
    title: String,
    url: String,
    videoId: String,
    watching: Double
  ): typingsJapgolly.ytSearch.mod.UpcomingLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = "UPCOMING", thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("live")
    __obj.asInstanceOf[typingsJapgolly.ytSearch.mod.UpcomingLiveSearchResult]
  }
}
