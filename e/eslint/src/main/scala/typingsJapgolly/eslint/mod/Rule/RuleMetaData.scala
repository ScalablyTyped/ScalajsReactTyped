package typingsJapgolly.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.eslint.AnonCategory
import typingsJapgolly.eslint.eslintStrings.code
import typingsJapgolly.eslint.eslintStrings.layout
import typingsJapgolly.eslint.eslintStrings.problem
import typingsJapgolly.eslint.eslintStrings.suggestion
import typingsJapgolly.eslint.eslintStrings.whitespace
import typingsJapgolly.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleMetaData extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var docs: js.UndefOr[AnonCategory] = js.undefined
  var fixable: js.UndefOr[code | whitespace] = js.undefined
  var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  var schema: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.undefined
  var `type`: js.UndefOr[problem | suggestion | layout] = js.undefined
}

object RuleMetaData {
  @scala.inline
  def apply(
    deprecated: js.UndefOr[Boolean] = js.undefined,
    docs: AnonCategory = null,
    fixable: code | whitespace = null,
    messages: StringDictionary[String] = null,
    schema: JSONSchema4 | js.Array[JSONSchema4] = null,
    `type`: problem | suggestion | layout = null
  ): RuleMetaData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (fixable != null) __obj.updateDynamic("fixable")(fixable.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMetaData]
  }
}

