package typingsJapgolly.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapDefaultsTemplateBase extends js.Object {
  var name: String
  var templateEngine: KnockstrapStringTemplateEngine
}

object KnockstrapDefaultsTemplateBase {
  @scala.inline
  def apply(name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapDefaultsTemplateBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockstrapDefaultsTemplateBase]
  }
}

