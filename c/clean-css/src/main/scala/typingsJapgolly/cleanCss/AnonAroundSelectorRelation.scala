package typingsJapgolly.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAroundSelectorRelation extends js.Object {
  /**
    * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
    */
  var aroundSelectorRelation: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
    */
  var beforeBlockBegins: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
    */
  var beforeValue: js.UndefOr[Boolean] = js.undefined
}

object AnonAroundSelectorRelation {
  @scala.inline
  def apply(
    aroundSelectorRelation: js.UndefOr[Boolean] = js.undefined,
    beforeBlockBegins: js.UndefOr[Boolean] = js.undefined,
    beforeValue: js.UndefOr[Boolean] = js.undefined
  ): AnonAroundSelectorRelation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aroundSelectorRelation)) __obj.updateDynamic("aroundSelectorRelation")(aroundSelectorRelation.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeBlockBegins)) __obj.updateDynamic("beforeBlockBegins")(beforeBlockBegins.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeValue)) __obj.updateDynamic("beforeValue")(beforeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAroundSelectorRelation]
  }
}

