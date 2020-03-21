package typingsJapgolly.uifabricUtilities.classNamesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassNamesFunctionOptions extends js.Object {
  /**
    * Disables class caching for scenarios where styleProp parts mutate frequently.
    */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
}

object IClassNamesFunctionOptions {
  @scala.inline
  def apply(disableCaching: js.UndefOr[Boolean] = js.undefined): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
}

