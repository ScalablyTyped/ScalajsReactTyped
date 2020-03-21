package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenToDocOptions extends js.Object {
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
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object listenToDocOptions {
  @scala.inline
  def apply(
    context: js.Object,
    onFailure: js.UndefOr[Callback] = js.undefined,
    `then`: js.UndefOr[Callback] = js.undefined
  ): listenToDocOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    `then`.foreach(p => __obj.updateDynamic("then")(p.toJsFn))
    __obj.asInstanceOf[listenToDocOptions]
  }
}

