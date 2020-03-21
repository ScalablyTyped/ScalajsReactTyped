package typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationItem extends js.Object {
  /**
    * The scope to get the configuration section for.
    */
  var scopeUri: js.UndefOr[String] = js.undefined
  /**
    * The configuration section asked for.
    */
  var section: js.UndefOr[String] = js.undefined
}

object ConfigurationItem {
  @scala.inline
  def apply(scopeUri: String = null, section: String = null): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    if (scopeUri != null) __obj.updateDynamic("scopeUri")(scopeUri.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationItem]
  }
}

