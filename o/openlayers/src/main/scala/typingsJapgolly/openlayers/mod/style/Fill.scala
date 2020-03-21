package typingsJapgolly.openlayers.mod.style

import typingsJapgolly.openlayers.mod.ColorLike_
import typingsJapgolly.openlayers.mod.Color_
import typingsJapgolly.openlayers.mod.olx.style.FillOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set fill style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Fill")
@js.native
/**
  * @classdesc
  * Set fill style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
class Fill () extends js.Object {
  def this(opt_options: FillOptions) = this()
  /**
    * Get the fill color.
    * @return Color.
    * @api
    */
  def getColor(): Color_ | ColorLike_ = js.native
  /**
    * Set the color.
    *
    * @param color Color.
    * @api
    */
  def setColor(color: ColorLike_ | Color_): Unit = js.native
}

