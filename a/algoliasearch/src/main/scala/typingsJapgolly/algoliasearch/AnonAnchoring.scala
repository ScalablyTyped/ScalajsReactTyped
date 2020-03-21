package typingsJapgolly.algoliasearch

import typingsJapgolly.algoliasearch.algoliasearchStrings.contains
import typingsJapgolly.algoliasearch.algoliasearchStrings.endsWith
import typingsJapgolly.algoliasearch.algoliasearchStrings.is
import typingsJapgolly.algoliasearch.algoliasearchStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchoring extends js.Object {
  /**
    * Whether the pattern must match the beginning or the end of the query string, or both, or none.
    */
  var anchoring: js.UndefOr[is | startsWith | endsWith | contains] = js.undefined
  /**
    * Rule context (format: [A-Za-z0-9_-]+).
    * When specified, the rule is contextual and applies only when the same context is specified
    * at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies
    * (provided that its other conditions are met, of course).
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Query pattern
    */
  var pattern: js.UndefOr[String] = js.undefined
}

object AnonAnchoring {
  @scala.inline
  def apply(
    anchoring: is | startsWith | endsWith | contains = null,
    context: String = null,
    pattern: String = null
  ): AnonAnchoring = {
    val __obj = js.Dynamic.literal()
    if (anchoring != null) __obj.updateDynamic("anchoring")(anchoring.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchoring]
  }
}

