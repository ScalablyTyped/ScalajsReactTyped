package typingsJapgolly.mixpanelBrowser.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InTrackingOptions extends ClearOptOutInOutOptions {
  var track_event_name: String
  var track_event_properties: Dict
  def track(): Unit
}

object InTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: Double,
    cookie_prefix: String,
    cross_subdomain_cookie: Boolean,
    persistence_type: Persistence,
    secure_cookie: Boolean,
    track: Callback,
    track_event_name: String,
    track_event_properties: Dict
  ): InTrackingOptions = {
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], track_event_name = track_event_name.asInstanceOf[js.Any], track_event_properties = track_event_properties.asInstanceOf[js.Any])
    __obj.updateDynamic("track")(track.toJsFn)
    __obj.asInstanceOf[InTrackingOptions]
  }
}

