package typingsJapgolly.emotionUtils.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  var container: HTMLElement
  var key: String
  var nonce: js.UndefOr[String] = js.undefined
  var tags: js.Array[HTMLStyleElement]
  def flush(): Unit
  def insert(rule: String): Unit
}

object StyleSheet {
  @scala.inline
  def apply(
    container: HTMLElement,
    flush: Callback,
    insert: String => Callback,
    key: String,
    tags: js.Array[HTMLStyleElement],
    nonce: String = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: java.lang.String) => insert(t0).runNow()))
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
}

