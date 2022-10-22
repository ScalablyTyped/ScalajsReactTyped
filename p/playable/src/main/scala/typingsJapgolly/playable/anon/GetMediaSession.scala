package typingsJapgolly.playable.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaSession extends StObject {
  
  def getMediaSession(): GetEstimatedTime
}
object GetMediaSession {
  
  inline def apply(getMediaSession: CallbackTo[GetEstimatedTime]): GetMediaSession = {
    val __obj = js.Dynamic.literal(getMediaSession = getMediaSession.toJsFn)
    __obj.asInstanceOf[GetMediaSession]
  }
  
  extension [Self <: GetMediaSession](x: Self) {
    
    inline def setGetMediaSession(value: CallbackTo[GetEstimatedTime]): Self = StObject.set(x, "getMediaSession", value.toJsFn)
  }
}
