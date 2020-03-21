package typingsJapgolly.loaderRunner.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var data: js.Any
  var normal: Null | (js.Function1[/* request */ String, String])
  var normalExecuted: Boolean
  var options: js.Any
  var path: String
  var pitch: Null | (js.Function1[/* request */ String, String])
  var pitchExecuted: Boolean
  var query: String
  var raw: String
  var request: String
}

object Loader {
  @scala.inline
  def apply(
    data: js.Any,
    normalExecuted: Boolean,
    options: js.Any,
    path: String,
    pitchExecuted: Boolean,
    query: String,
    raw: String,
    request: String,
    normal: /* request */ String => CallbackTo[String] = null,
    pitch: /* request */ String => CallbackTo[String] = null
  ): Loader = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], normalExecuted = normalExecuted.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pitchExecuted = pitchExecuted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(js.Any.fromFunction1((t0: /* request */ java.lang.String) => normal(t0).runNow()))
    if (pitch != null) __obj.updateDynamic("pitch")(js.Any.fromFunction1((t0: /* request */ java.lang.String) => pitch(t0).runNow()))
    __obj.asInstanceOf[Loader]
  }
}

