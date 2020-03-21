package typingsJapgolly.escpos

import typingsJapgolly.escpos.escposStrings.CENTER
import typingsJapgolly.escpos.escposStrings.LEFT
import typingsJapgolly.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCols extends js.Object {
  var align: LEFT | CENTER | RIGHT
  var cols: Double
  var text: String
}

object AnonCols {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, cols: Double, text: String): AnonCols = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCols]
  }
}

