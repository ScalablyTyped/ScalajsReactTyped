package typingsJapgolly.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of products in a single package. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#count.
  */
@js.native
trait SchemaCount extends js.Object {
  /**
    * The unit in which these products are counted.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The numeric value of the number of products in a package.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCount {
  @scala.inline
  def apply(unit: String = null, value: String = null): SchemaCount = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCount]
  }
}

