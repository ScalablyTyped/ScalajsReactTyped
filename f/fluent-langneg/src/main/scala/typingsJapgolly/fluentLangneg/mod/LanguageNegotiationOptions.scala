package typingsJapgolly.fluentLangneg.mod

import typingsJapgolly.fluentLangneg.fluentLangnegStrings.filtering
import typingsJapgolly.fluentLangneg.fluentLangnegStrings.lookup
import typingsJapgolly.fluentLangneg.fluentLangnegStrings.matching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageNegotiationOptions extends js.Object {
  var defaultLocale: js.UndefOr[String] = js.undefined
  var strategy: js.UndefOr[filtering | matching | lookup] = js.undefined
}

object LanguageNegotiationOptions {
  @scala.inline
  def apply(defaultLocale: String = null, strategy: filtering | matching | lookup = null): LanguageNegotiationOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageNegotiationOptions]
  }
}

