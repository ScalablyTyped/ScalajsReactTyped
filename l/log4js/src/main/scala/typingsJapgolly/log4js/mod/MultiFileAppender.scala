package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.multiFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiFileAppender extends Appender {
  // the base part of the generated log filename
  var base: String
  // the suffix for the generated log filename.
  var extension: String
  // the value to use to split files (see below).
  var property: String
  var `type`: multiFile
}

object MultiFileAppender {
  @scala.inline
  def apply(base: String, extension: String, property: String, `type`: multiFile): MultiFileAppender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFileAppender]
  }
}

