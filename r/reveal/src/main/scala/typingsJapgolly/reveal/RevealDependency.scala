package typingsJapgolly.reveal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#dependencies
trait RevealDependency extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var src: String
}

object RevealDependency {
  @scala.inline
  def apply(
    src: String,
    async: js.UndefOr[Boolean] = js.undefined,
    callback: js.UndefOr[Callback] = js.undefined,
    condition: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): RevealDependency = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    condition.foreach(p => __obj.updateDynamic("condition")(p.toJsFn))
    __obj.asInstanceOf[RevealDependency]
  }
}

