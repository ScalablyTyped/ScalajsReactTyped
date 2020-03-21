package typingsJapgolly.chromeApps.chrome.webViewRequest

import typingsJapgolly.chromeApps.chrome.double
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMessageEventDetails extends js.Object {
  /**
    * The value 0 indicates that the request happens in the main frame;
    * a positive value indicates the ID of a subframe in which the request happens.
    * If the document of a (sub-)frame is loaded (type is main_frame or sub_frame),
    * frameId indicates the ID of this frame, not the ID of the outer frame.
    * Frame IDs are unique within a tab.
    */
  var frameId: integer
  /** The message sent by the calling script. */
  var message: String
  /** Standard HTTP method. */
  var method: String
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: integer
  /**
    * The ID of the request.
    * Request IDs are unique within a browser session.
    * As a result, they could be used to relate different events of the same request.
    */
  var requestId: String
  /** The stage of the network request during which the event was triggered. */
  var stage: Stage
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: integer
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: double
  /** How the requested resource will be used. */
  var `type`: ResourceType
  /** URL */
  var url: String
}

object OnMessageEventDetails {
  @scala.inline
  def apply(
    frameId: integer,
    message: String,
    method: String,
    parentFrameId: integer,
    requestId: String,
    stage: Stage,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): OnMessageEventDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMessageEventDetails]
  }
}

