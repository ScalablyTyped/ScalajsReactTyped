package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookApplication extends Entity {
  var calculationMode: js.UndefOr[String] = js.undefined
}

object WorkbookApplication {
  @scala.inline
  def apply(calculationMode: String = null, id: String = null): WorkbookApplication = {
    val __obj = js.Dynamic.literal()
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookApplication]
  }
}

