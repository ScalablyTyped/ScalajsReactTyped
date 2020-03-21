package typingsJapgolly.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report options.
  * @interface
  */
trait ReportOptions extends js.Object {
  /**
    * true to flatten the report object down to a single level by concatenating nested key names; false to keep the default hierarchical format.
    * @type {boolean}
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  /**
    * If flatten is true, this string will be used to separate key names when they are concatenated together.
    * @type {boolean}
    */
  var separator: js.UndefOr[String] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(flatten: js.UndefOr[Boolean] = js.undefined, separator: String = null): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
}

