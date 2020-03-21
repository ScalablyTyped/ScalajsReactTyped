package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object AnonTitle {
  @scala.inline
  def apply(title: String, titleHalign: center | end | start, titleStyle: js.Object): AnonTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTitle]
  }
}

