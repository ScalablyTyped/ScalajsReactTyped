package typingsJapgolly.uiBox.styleSheetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CSSRule
import org.scalajs.dom.raw.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStyleSheet extends js.Object {
  var ctr: js.Any
  var injected: js.Any
  var isSpeedy: js.Any
  var maxLength: js.Any
  var sheet: js.UndefOr[js.Any] = js.undefined
  var tags: js.Any
  def _insert(sheet: CSSStyleSheet, rule: String): Unit
  def flush(): Unit
  def getSheet(): js.UndefOr[CSSStyleSheet]
  def inject(): Unit
  def insert(rule: String): Double
  def rules(): js.Array[CSSRule]
  def speedy(bool: Boolean): Unit
}

object CustomStyleSheet {
  @scala.inline
  def apply(
    _insert: (CSSStyleSheet, String) => Callback,
    ctr: js.Any,
    flush: Callback,
    getSheet: CallbackTo[js.UndefOr[CSSStyleSheet]],
    inject: Callback,
    injected: js.Any,
    insert: String => CallbackTo[Double],
    isSpeedy: js.Any,
    maxLength: js.Any,
    rules: CallbackTo[js.Array[CSSRule]],
    speedy: Boolean => Callback,
    tags: js.Any,
    sheet: js.Any = null
  ): CustomStyleSheet = {
    val __obj = js.Dynamic.literal(ctr = ctr.asInstanceOf[js.Any], injected = injected.asInstanceOf[js.Any], isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("_insert")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.CSSStyleSheet, t1: java.lang.String) => _insert(t0, t1).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getSheet")(getSheet.toJsFn)
    __obj.updateDynamic("inject")(inject.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: java.lang.String) => insert(t0).runNow()))
    __obj.updateDynamic("rules")(rules.toJsFn)
    __obj.updateDynamic("speedy")(js.Any.fromFunction1((t0: scala.Boolean) => speedy(t0).runNow()))
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleSheet]
  }
}

