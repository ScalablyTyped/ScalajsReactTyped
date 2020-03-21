package typingsJapgolly.dojo.dojox.geo.charting

import japgolly.scalajs.react.Callback
import typingsJapgolly.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/_base.html
  *
  *
  */
trait base extends js.Object {
  /**
    * Hides the tooltip displayed around the given shape.
    *
    * @param gfxObject A gfx shape.
    */
  def hideTooltip(gfxObject: Shape): Unit
  /**
    * Show a Tooltip displaying the given HTML message around the given gfx shape.
    *
    * @param innerHTML The message to display as a HTML string.
    * @param gfxObject The gfx shape around which the tooltip will be placed.
    * @param positions               Optional
    */
  def showTooltip(innerHTML: String, gfxObject: Shape, positions: js.Array[String]): Unit
}

object base {
  @scala.inline
  def apply(hideTooltip: Shape => Callback, showTooltip: (String, Shape, js.Array[String]) => Callback): base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideTooltip")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.gfx.shape.Shape) => hideTooltip(t0).runNow()))
    __obj.updateDynamic("showTooltip")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.dojo.dojox.gfx.shape.Shape, t2: js.Array[java.lang.String]) => showTooltip(t0, t1, t2).runNow()))
    __obj.asInstanceOf[base]
  }
}

