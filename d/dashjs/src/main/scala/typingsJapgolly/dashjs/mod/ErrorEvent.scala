package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.anon.Cc
import typingsJapgolly.dashjs.anon.Code
import typingsJapgolly.dashjs.anon.Id
import typingsJapgolly.dashjs.dashjsStrings.capability
import typingsJapgolly.dashjs.dashjsStrings.key_message
import typingsJapgolly.dashjs.dashjsStrings.key_session
import typingsJapgolly.dashjs.dashjsStrings.mediasource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dashjs.mod.GenericErrorEvent
  - typingsJapgolly.dashjs.mod.DownloadErrorEvent
  - typingsJapgolly.dashjs.mod.ManifestErrorEvent
  - typingsJapgolly.dashjs.mod.TimedTextErrorEvent
  - typingsJapgolly.dashjs.mod.MediaPlayerErrorEvent
*/
trait ErrorEvent extends StObject
object ErrorEvent {
  
  inline def DownloadErrorEvent(event: Id): typingsJapgolly.dashjs.mod.DownloadErrorEvent = {
    val __obj = js.Dynamic.literal(error = "download", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.dashjs.mod.DownloadErrorEvent]
  }
  
  inline def GenericErrorEvent(error: capability | mediasource | key_session | key_message, event: String): typingsJapgolly.dashjs.mod.GenericErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.dashjs.mod.GenericErrorEvent]
  }
  
  inline def ManifestErrorEvent(event: typingsJapgolly.dashjs.anon.Event): typingsJapgolly.dashjs.mod.ManifestErrorEvent = {
    val __obj = js.Dynamic.literal(error = "manifestError", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.dashjs.mod.ManifestErrorEvent]
  }
  
  inline def MediaPlayerErrorEvent(error: Code): typingsJapgolly.dashjs.mod.MediaPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.dashjs.mod.MediaPlayerErrorEvent]
  }
  
  inline def TimedTextErrorEvent(event: Cc): typingsJapgolly.dashjs.mod.TimedTextErrorEvent = {
    val __obj = js.Dynamic.literal(error = "cc", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.dashjs.mod.TimedTextErrorEvent]
  }
}
