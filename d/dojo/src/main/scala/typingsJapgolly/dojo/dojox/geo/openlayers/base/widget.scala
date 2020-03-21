package typingsJapgolly.dojo.dojox.geo.openlayers.base

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.widget.html
  *
  *
  */
trait widget extends js.Object {
  /**
    *
    */
  def Map(): Unit
}

object widget {
  @scala.inline
  def apply(Map: Callback): widget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Map")(Map.toJsFn)
    __obj.asInstanceOf[widget]
  }
}

