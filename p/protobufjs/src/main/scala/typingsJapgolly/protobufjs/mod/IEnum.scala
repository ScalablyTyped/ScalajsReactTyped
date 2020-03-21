package typingsJapgolly.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnum extends AnyNestedObject {
  /** Enum options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** Enum values */
  var values: StringDictionary[Double]
}

object IEnum {
  @scala.inline
  def apply(values: StringDictionary[Double], options: StringDictionary[js.Any] = null): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
}

