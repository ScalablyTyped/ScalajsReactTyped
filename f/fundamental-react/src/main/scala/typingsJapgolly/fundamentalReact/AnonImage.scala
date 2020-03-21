package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  var glyph: String
  var image: String
  var link: js.UndefOr[String] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(
    glyph: String,
    image: String,
    title: String,
    callback: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    link: String = null,
    url: String = null
  ): AnonImage = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => callback(t0).runNow()))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

