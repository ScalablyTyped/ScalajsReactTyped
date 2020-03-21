package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocoder_ extends js.Object {
  def getURL(): String
  /**
  			 * Queries the geocoder with a query string, and returns its result, if any.
  			 */
  def query(queryString: String, callback: js.Function): js.Any
  def queryURL(url: String): String
  /**
  			 * Queries the geocoder with a location, and returns its result, if any.
  			 */
  def reverseQuery(location: js.Any, callback: js.Function): js.Any
  def setID(id: String): js.Any
  def setTileJSON(tilejson: js.Any): js.Any
  def setURL(url: String): js.Any
}

object Geocoder_ {
  @scala.inline
  def apply(
    getURL: CallbackTo[String],
    query: (String, js.Function) => CallbackTo[js.Any],
    queryURL: String => CallbackTo[String],
    reverseQuery: (js.Any, js.Function) => CallbackTo[js.Any],
    setID: String => CallbackTo[js.Any],
    setTileJSON: js.Any => CallbackTo[js.Any],
    setURL: String => CallbackTo[js.Any]
  ): Geocoder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getURL")(getURL.toJsFn)
    __obj.updateDynamic("query")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => query(t0, t1).runNow()))
    __obj.updateDynamic("queryURL")(js.Any.fromFunction1((t0: java.lang.String) => queryURL(t0).runNow()))
    __obj.updateDynamic("reverseQuery")(js.Any.fromFunction2((t0: js.Any, t1: js.Function) => reverseQuery(t0, t1).runNow()))
    __obj.updateDynamic("setID")(js.Any.fromFunction1((t0: java.lang.String) => setID(t0).runNow()))
    __obj.updateDynamic("setTileJSON")(js.Any.fromFunction1((t0: js.Any) => setTileJSON(t0).runNow()))
    __obj.updateDynamic("setURL")(js.Any.fromFunction1((t0: java.lang.String) => setURL(t0).runNow()))
    __obj.asInstanceOf[Geocoder_]
  }
}

