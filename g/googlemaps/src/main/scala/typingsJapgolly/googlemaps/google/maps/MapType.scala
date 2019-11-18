package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Map Types *****/
trait MapType extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Size] = js.undefined
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element
  def releaseTile(tile: Element): Unit
}

object MapType {
  @scala.inline
  def apply(
    getTile: (Point, Double, Document) => CallbackTo[Element],
    releaseTile: Element => Callback,
    alt: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null,
    projection: Projection = null,
    radius: Int | Double = null,
    tileSize: Size = null
  ): MapType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTile")(js.Any.fromFunction3((t0: typingsJapgolly.googlemaps.google.maps.Point, t1: scala.Double, t2: org.scalajs.dom.raw.Document) => getTile(t0, t1, t2).runNow()))
    __obj.updateDynamic("releaseTile")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => releaseTile(t0).runNow()))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
}

