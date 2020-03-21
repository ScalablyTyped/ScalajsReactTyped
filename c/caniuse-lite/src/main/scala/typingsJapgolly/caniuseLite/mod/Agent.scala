package typingsJapgolly.caniuseLite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  /**
    * The agent's name
    */
  var browser: String
  /**
    * The agents vendor prefix
    */
  var prefix: String
  /**
    * Exceptions to vendor prefix use.
    */
  var prefix_exceptions: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  /**
    * Release dates as seconds since epoch by version.
    */
  var release_date: StringDictionary[js.UndefOr[Double]]
  /**
    * Global agent usage by version
    */
  var usage_global: UsageByVersion
  /**
    * Version matrix. See [caniuse](https://caniuse.com)
    */
  var versions: js.Array[js.Any]
}

object Agent {
  @scala.inline
  def apply(
    browser: String,
    prefix: String,
    release_date: StringDictionary[js.UndefOr[Double]],
    usage_global: UsageByVersion,
    versions: js.Array[js.Any],
    prefix_exceptions: StringDictionary[js.UndefOr[String]] = null
  ): Agent = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], usage_global = usage_global.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (prefix_exceptions != null) __obj.updateDynamic("prefix_exceptions")(prefix_exceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
}

