package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderControl_ extends js.Object {
  def getURL(): String
  /**
  			 * Bind a listener to an event emitted by the geocoder control. Supported additional events are
  			 */
  def on(event: String, callback: js.Function): js.Any
  def onAdd(map: Map_): js.Any
  /**
  			 * Set the map id used for geocoding.
  			 */
  def setID(id: String): js.Any
  /**
  			 * Set the TileJSON used for geocoding.
  			 */
  def setTileJSON(tilejson: js.Any): js.Any
  /**
  			 * Set the url used for geocoding.
  			 */
  def setURL(url: String): js.Any
}

object GeocoderControl_ {
  @scala.inline
  def apply(
    getURL: CallbackTo[String],
    on: (String, js.Function) => CallbackTo[js.Any],
    onAdd: Map_ => CallbackTo[js.Any],
    setID: String => CallbackTo[js.Any],
    setTileJSON: js.Any => CallbackTo[js.Any],
    setURL: String => CallbackTo[js.Any]
  ): GeocoderControl_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getURL")(getURL.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onAdd(t0).runNow()))
    __obj.updateDynamic("setID")(js.Any.fromFunction1((t0: java.lang.String) => setID(t0).runNow()))
    __obj.updateDynamic("setTileJSON")(js.Any.fromFunction1((t0: js.Any) => setTileJSON(t0).runNow()))
    __obj.updateDynamic("setURL")(js.Any.fromFunction1((t0: java.lang.String) => setURL(t0).runNow()))
    __obj.asInstanceOf[GeocoderControl_]
  }
}

