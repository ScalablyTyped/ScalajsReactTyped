package typingsJapgolly.flatpickr.instanceMod

import typingsJapgolly.flatpickr.formattingMod.Formats_
import typingsJapgolly.flatpickr.formattingMod.RevFormat_
import typingsJapgolly.flatpickr.formattingMod.TokenRegex_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatting extends js.Object {
  var formats: Formats_
  var revFormat: RevFormat_
  var tokenRegex: TokenRegex_
}

object Formatting {
  @scala.inline
  def apply(formats: Formats_, revFormat: RevFormat_, tokenRegex: TokenRegex_): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Formatting]
  }
}

