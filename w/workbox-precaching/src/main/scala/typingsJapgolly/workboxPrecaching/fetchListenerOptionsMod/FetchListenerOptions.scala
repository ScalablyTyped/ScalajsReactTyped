package typingsJapgolly.workboxPrecaching.fetchListenerOptionsMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.URL
import typingsJapgolly.workboxPrecaching.AnonUrl
import typingsJapgolly.workboxPrecaching.urlmanipulationMod.URLManipulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchListenerOptions extends js.Object {
  var cleanURLs: js.UndefOr[Boolean] = js.undefined
  var directoryIndex: js.UndefOr[String] = js.undefined
  var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  var urlManipulation: js.UndefOr[URLManipulation] = js.undefined
}

object FetchListenerOptions {
  @scala.inline
  def apply(
    cleanURLs: js.UndefOr[Boolean] = js.undefined,
    directoryIndex: String = null,
    ignoreURLParametersMatching: js.Array[js.RegExp] = null,
    urlManipulation: /* url */ AnonUrl => CallbackTo[js.Array[URL]] = null
  ): FetchListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanURLs)) __obj.updateDynamic("cleanURLs")(cleanURLs.asInstanceOf[js.Any])
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex.asInstanceOf[js.Any])
    if (ignoreURLParametersMatching != null) __obj.updateDynamic("ignoreURLParametersMatching")(ignoreURLParametersMatching.asInstanceOf[js.Any])
    if (urlManipulation != null) __obj.updateDynamic("urlManipulation")(js.Any.fromFunction1((t0: /* url */ typingsJapgolly.workboxPrecaching.AnonUrl) => urlManipulation(t0).runNow()))
    __obj.asInstanceOf[FetchListenerOptions]
  }
}

