package typingsJapgolly.knockstrap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsItemTemplate extends KnockstrapDefaultsTemplateBase {
  def converter(value: js.Any): js.Any
}

object KnockstrapCarouselDefaultsItemTemplate {
  @scala.inline
  def apply(
    converter: js.Any => CallbackTo[js.Any],
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsItemTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("converter")(js.Any.fromFunction1((t0: js.Any) => converter(t0).runNow()))
    __obj.asInstanceOf[KnockstrapCarouselDefaultsItemTemplate]
  }
}

