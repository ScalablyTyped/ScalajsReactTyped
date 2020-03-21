package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Array[AnonBorderColor]
  var sections: js.Array[js.Object]
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object AnonItems {
  @scala.inline
  def apply(
    items: js.Array[AnonBorderColor],
    sections: js.Array[js.Object],
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItems]
  }
}

