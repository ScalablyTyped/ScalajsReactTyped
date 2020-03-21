package typingsJapgolly.knockoutMapping.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingStandardOptions extends js.Object {
  var copy: js.UndefOr[js.Array[String]] = js.undefined
   // Undocumented
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
  var mappedProperties: js.UndefOr[js.Array[String]] = js.undefined
  var observe: js.UndefOr[js.Array[String]] = js.undefined
}

object KnockoutMappingStandardOptions {
  @scala.inline
  def apply(
    copy: js.Array[String] = null,
    deferEvaluation: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String] = null,
    include: js.Array[String] = null,
    mappedProperties: js.Array[String] = null,
    observe: js.Array[String] = null
  ): KnockoutMappingStandardOptions = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (mappedProperties != null) __obj.updateDynamic("mappedProperties")(mappedProperties.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutMappingStandardOptions]
  }
}

