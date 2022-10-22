package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBuilder[Media]
  extends StObject
     with AdWordsBuilder[Media] {
  
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media]
}
object VideoBuilder {
  
  inline def apply[Media](build: CallbackTo[AdWordsOperation[Media]], withYouTubeVideoId: String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
  
  extension [Self <: VideoBuilder[?], Media](x: Self & VideoBuilder[Media]) {
    
    inline def setWithYouTubeVideoId(value: String => VideoBuilder[Media]): Self = StObject.set(x, "withYouTubeVideoId", js.Any.fromFunction1(value))
  }
}
