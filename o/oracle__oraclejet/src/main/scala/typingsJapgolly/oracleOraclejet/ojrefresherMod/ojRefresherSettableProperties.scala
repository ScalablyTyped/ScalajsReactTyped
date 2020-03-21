package typingsJapgolly.oracleOraclejet.ojrefresherMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRefresherSettableProperties extends baseComponentSettableProperties {
  var target: Element
  var text: String
  var threshold: Double
  def refreshContent(): js.Promise[_]
}

object ojRefresherSettableProperties {
  @scala.inline
  def apply(
    refreshContent: CallbackTo[js.Promise[js.Any]],
    target: Element,
    text: String,
    threshold: Double,
    translations: js.Object = null
  ): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.updateDynamic("refreshContent")(refreshContent.toJsFn)
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
}

