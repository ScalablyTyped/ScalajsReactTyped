package typingsJapgolly.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpand extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
}

object AnonExpand {
  @scala.inline
  def apply(
    customHeaders: StringDictionary[String] = null,
    expand: String = null,
    recurse: js.UndefOr[Boolean] = js.undefined
  ): AnonExpand = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpand]
  }
}

