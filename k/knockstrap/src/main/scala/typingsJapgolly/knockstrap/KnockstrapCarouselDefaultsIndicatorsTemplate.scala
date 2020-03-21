package typingsJapgolly.knockstrap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsIndicatorsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted
}

object KnockstrapCarouselDefaultsIndicatorsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => CallbackTo[KnockstrapCarouselDefaultsIdItemsDataConverted],
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("dataConverter")(js.Any.fromFunction1((t0: js.Any) => dataConverter(t0).runNow()))
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
}

