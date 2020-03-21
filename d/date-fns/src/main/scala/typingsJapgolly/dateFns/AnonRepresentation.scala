package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.dateFnsStrings.basic
import typingsJapgolly.dateFns.dateFnsStrings.complete
import typingsJapgolly.dateFns.dateFnsStrings.date
import typingsJapgolly.dateFns.dateFnsStrings.extended
import typingsJapgolly.dateFns.dateFnsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepresentation extends js.Object {
  var format: js.UndefOr[extended | basic] = js.undefined
  var representation: js.UndefOr[complete | date | time] = js.undefined
}

object AnonRepresentation {
  @scala.inline
  def apply(format: extended | basic = null, representation: complete | date | time = null): AnonRepresentation = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (representation != null) __obj.updateDynamic("representation")(representation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRepresentation]
  }
}

