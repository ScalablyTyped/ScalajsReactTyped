package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data about the chat message transport. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration")
@js.native
open class ChatMessageTransportConfiguration ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration {
  
  /** Gets the extended properties of the transport. */
  /* CompleteClass */
  var extendedProperties: IMapView[String, Any] = js.native
  
  /** Gets the maximum attachment limit for a message on the transport. */
  /* CompleteClass */
  var maxAttachmentCount: Double = js.native
  
  /** Gets the maximum size of an attachment for the transport. */
  /* CompleteClass */
  var maxMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum number of recipients for the transport. */
  /* CompleteClass */
  var maxRecipientCount: Double = js.native
  
  /** Gets the supported video encoding format for the transport. */
  /* CompleteClass */
  var supportedVideoFormat: MediaEncodingProfile = js.native
}
