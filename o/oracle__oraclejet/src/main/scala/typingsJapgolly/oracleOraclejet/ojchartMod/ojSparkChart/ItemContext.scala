package typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var borderColor: String
  var color: String
  var date: js.Date
  var high: Double
  var low: Double
  var value: Double
}

object ItemContext {
  @scala.inline
  def apply(borderColor: String, color: String, date: js.Date, high: Double, low: Double, value: Double): ItemContext = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemContext]
  }
}

