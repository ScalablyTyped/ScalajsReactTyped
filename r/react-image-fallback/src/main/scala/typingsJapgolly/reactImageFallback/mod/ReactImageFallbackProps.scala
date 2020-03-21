package typingsJapgolly.reactImageFallback.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: String | Element | (js.Array[Element | String])
  var initialImage: js.UndefOr[String | Element] = js.undefined
  var initialTimeout: js.UndefOr[Double] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
  var src: String
}

object ReactImageFallbackProps {
  @scala.inline
  def apply(
    fallbackImage: String | Element | (js.Array[Element | String]),
    src: String,
    initialImage: String | Element = null,
    initialTimeout: Int | Double = null,
    onError: /* event */ ReactEventFrom[HTMLImageElement] => Callback = null,
    onLoad: /* event */ ReactEventFrom[HTMLImageElement] => Callback = null
  ): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (initialImage != null) __obj.updateDynamic("initialImage")(initialImage.asInstanceOf[js.Any])
    if (initialTimeout != null) __obj.updateDynamic("initialTimeout")(initialTimeout.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onLoad(t0).runNow()))
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
}

