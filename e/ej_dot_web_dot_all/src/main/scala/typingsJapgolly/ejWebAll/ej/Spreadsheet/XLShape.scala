package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLShape extends js.Object {
  /** This method is used to set a picture in the Spreadsheet.
    * @param {string} Pass the range of the cell.
    * @param {string} Pass the path of the specified image.
    * @param {number} Optional. Pass the width of the image that you want to set.
    * @param {number} Optional. Pass the height of the image that you want to set.
    * @param {number} Optional. Pass the top of the image that you want to set.
    * @param {number} Optional. Pass the left of the image that you want to set.
    * @returns {string}
    */
  def setPicture(range: String, url: String, width: Double, height: Double, top: Double, left: Double): String
}

object XLShape {
  @scala.inline
  def apply(setPicture: (String, String, Double, Double, Double, Double) => CallbackTo[String]): XLShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setPicture")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => setPicture(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[XLShape]
  }
}

