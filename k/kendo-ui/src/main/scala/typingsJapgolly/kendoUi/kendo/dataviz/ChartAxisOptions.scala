package typingsJapgolly.kendoUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ChartAxisOptions {
  @scala.inline
  def apply(name: String = null): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisOptions]
  }
}

