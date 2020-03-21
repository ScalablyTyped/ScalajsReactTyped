package typingsJapgolly.nodeResque.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  def perform(args: js.Any*): js.Promise[TResult]
}

object Job {
  @scala.inline
  def apply[TResult](
    perform: /* repeated */ js.Any => CallbackTo[js.Promise[TResult]],
    pluginOptions: StringDictionary[js.Any] = null,
    plugins: js.Array[String] = null
  ): Job[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perform")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => perform(t0).runNow()))
    if (pluginOptions != null) __obj.updateDynamic("pluginOptions")(pluginOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job[TResult]]
  }
}

