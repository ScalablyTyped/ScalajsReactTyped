package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.handsontableStrings.average
import typingsJapgolly.handsontable.handsontableStrings.count
import typingsJapgolly.handsontable.handsontableStrings.max
import typingsJapgolly.handsontable.handsontableStrings.min
import typingsJapgolly.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: sum | min | max | count | average
}

object AnonType {
  @scala.inline
  def apply(`type`: sum | min | max | count | average): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

