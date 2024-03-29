package typingsJapgolly.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media Stream
  *
  * The `MediaStream` interface represents a stream of media content.
  *
  * A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of [[MediaStreamTrack]].
  *
  * See [MediaStream](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream) for details.
  */
trait MediaStream extends StObject {
  
  /**
    * (Read-only) A Boolean value that returns `true` if the stream is active, or `false` otherwise.
    *
    * See [active](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/active) for details.
    */
  var active: Boolean
  
  /**
    * (Read-only) A [`DOMString`](https://developer.mozilla.org/en-US/docs/Web/API/DOMString) containing 36 characters denoting a universally unique identifier (UUID) for the object.
    *
    * See [MediaStream.id](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/id) for details.
    */
  var id: String
}
object MediaStream {
  
  inline def apply(active: Boolean, id: String): MediaStream = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStream]
  }
  
  extension [Self <: MediaStream](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
