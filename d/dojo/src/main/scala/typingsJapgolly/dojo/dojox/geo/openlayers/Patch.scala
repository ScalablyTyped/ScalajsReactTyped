package typingsJapgolly.dojo.dojox.geo.openlayers

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/Patch.html
  *
  *
  */
trait Patch extends js.Object {
  /**
    *
    */
  def patchGFX(): Unit
}

object Patch {
  @scala.inline
  def apply(patchGFX: Callback): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("patchGFX")(patchGFX.toJsFn)
    __obj.asInstanceOf[Patch]
  }
}

