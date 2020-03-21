package typingsJapgolly.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBorders extends Base {
  var savedBorderSettings: js.Array[_] = js.native
  def clearBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])]): Unit = js.native
  def getBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])]): js.Array[js.Array[js.Object]] = js.native
  def setBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])], borderObject: js.Object): Unit = js.native
}

