package typingsJapgolly.oracleOraclejet.ojrefresherMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojrefresher.ojRefresherSettableProperties> */
trait ojRefresherSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var refreshContent: js.UndefOr[js.Function0[js.Promise[_]]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojRefresherSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    refreshContent: js.UndefOr[CallbackTo[js.Promise[js.Any]]] = js.undefined,
    target: Element = null,
    text: String = null,
    threshold: Int | Double = null,
    translations: js.Object = null
  ): ojRefresherSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    refreshContent.foreach(p => __obj.updateDynamic("refreshContent")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRefresherSettablePropertiesLenient]
  }
}

