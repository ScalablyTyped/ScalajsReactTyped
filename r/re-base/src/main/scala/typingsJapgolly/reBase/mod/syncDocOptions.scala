package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait syncDocOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The state property to sync.
    */
  var state: String
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object syncDocOptions {
  @scala.inline
  def apply(
    context: js.Object,
    state: String,
    onFailure: js.UndefOr[Callback] = js.undefined,
    `then`: js.UndefOr[Callback] = js.undefined
  ): syncDocOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    `then`.foreach(p => __obj.updateDynamic("then")(p.toJsFn))
    __obj.asInstanceOf[syncDocOptions]
  }
}

