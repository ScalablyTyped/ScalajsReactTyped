package typingsJapgolly.nivoLine

import typingsJapgolly.nivoLine.mod.LineComputedSerieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: AnonY
  var position: AnonX
  var serie: LineComputedSerieData
}

object AnonData {
  @scala.inline
  def apply(data: AnonY, position: AnonX, serie: LineComputedSerieData): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], serie = serie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

