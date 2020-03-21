package typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Equalssign
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.ExclamationmarkEqualssign
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Greaterthansign
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.GreaterthansignEqualssign
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Lessthansign
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.LessthansignEqualssign
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQuerySelectorNode
  extends /* key */ StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | RegExp | Boolean | Double | String
    ] {
  var index: TSQuerySelectorNode
  var left: TSQuerySelectorNode
  var name: String
  var operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
  var right: TSQuerySelectorNode
  var selectors: js.Array[TSQuerySelectorNode]
  var subject: Boolean
  var `type`: TSQueryAttributeOperatorType
  var value: TSQuerySelectorNode | js.RegExp | Double | String
}

object TSQuerySelectorNode {
  @scala.inline
  def apply(
    index: TSQuerySelectorNode,
    left: TSQuerySelectorNode,
    name: String,
    operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign,
    right: TSQuerySelectorNode,
    selectors: js.Array[TSQuerySelectorNode],
    subject: Boolean,
    `type`: TSQueryAttributeOperatorType,
    value: TSQuerySelectorNode | js.RegExp | Double | String,
    StringDictionary: /* key */ StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | js.RegExp | Boolean | Double | String
    ] = null
  ): TSQuerySelectorNode = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TSQuerySelectorNode]
  }
}

