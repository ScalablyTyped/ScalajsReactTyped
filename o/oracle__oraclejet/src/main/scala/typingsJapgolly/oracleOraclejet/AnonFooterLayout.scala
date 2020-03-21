package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings._empty
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.image
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFooterLayout extends js.Object {
  var footerLayout: _empty | now
  var showOn: focus | image
  var timeIncrement: String
}

object AnonFooterLayout {
  @scala.inline
  def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): AnonFooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFooterLayout]
  }
}

