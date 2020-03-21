package typingsJapgolly.qlik

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.mod.CustomProperty
import typingsJapgolly.qlik.qlikStrings.measures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var uses: measures
}

object AnonMax {
  @scala.inline
  def apply(
    uses: measures,
    items: StringDictionary[CustomProperty] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null
  ): AnonMax = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

