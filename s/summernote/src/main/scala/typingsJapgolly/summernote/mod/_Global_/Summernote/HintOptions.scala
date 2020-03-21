package typingsJapgolly.summernote.mod._Global_.Summernote

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery_.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintOptions extends js.Object {
  var content: js.UndefOr[js.Function1[/* item */ String, htmlElement | Node]] = js.undefined
  var `match`: js.RegExp
  var mentions: js.UndefOr[js.Array[String]] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ String, htmlElement]] = js.undefined
  var words: js.UndefOr[js.Array[String]] = js.undefined
  def search(keyword: String, callback: js.Function1[/* plausibleItems */ js.Array[String], Unit]): Unit
}

object HintOptions {
  @scala.inline
  def apply(
    `match`: js.RegExp,
    search: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Callback,
    content: /* item */ String => CallbackTo[htmlElement | Node] = null,
    mentions: js.Array[String] = null,
    template: /* item */ String => CallbackTo[htmlElement] = null,
    words: js.Array[String] = null
  ): HintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* plausibleItems */ js.Array[java.lang.String], scala.Unit]) => search(t0, t1).runNow()))
    if (content != null) __obj.updateDynamic("content")(js.Any.fromFunction1((t0: /* item */ java.lang.String) => content(t0).runNow()))
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* item */ java.lang.String) => template(t0).runNow()))
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintOptions]
  }
}

