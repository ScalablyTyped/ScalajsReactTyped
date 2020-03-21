package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindToStateOptions extends js.Object {
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.undefined
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback function that will be invoked if the current user does
    * not have read permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The state property you want to sync with Firebase; can be an
    * arbitrarily nested property a là `foo.bar` (no arrays).
    */
  var state: String
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with bindToState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object BindToStateOptions {
  @scala.inline
  def apply(
    context: js.Object,
    state: String,
    asArray: js.UndefOr[Boolean] = js.undefined,
    onFailure: js.UndefOr[Callback] = js.undefined,
    queries: js.Object = null,
    `then`: js.UndefOr[Callback] = js.undefined
  ): BindToStateOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    `then`.foreach(p => __obj.updateDynamic("then")(p.toJsFn))
    __obj.asInstanceOf[BindToStateOptions]
  }
}

