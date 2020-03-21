package typingsJapgolly.knockstrap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsControlsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdDataConverted
}

object KnockstrapCarouselDefaultsControlsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => CallbackTo[KnockstrapCarouselDefaultsIdDataConverted],
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("dataConverter")(js.Any.fromFunction1((t0: js.Any) => dataConverter(t0).runNow()))
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
}

