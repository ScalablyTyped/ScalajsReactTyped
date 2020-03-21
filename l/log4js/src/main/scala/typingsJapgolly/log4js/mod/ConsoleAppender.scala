package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleAppender extends Appender {
  // defaults to colouredLayout
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: console
}

object ConsoleAppender {
  @scala.inline
  def apply(`type`: console, layout: Layout = null): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAppender]
  }
}

