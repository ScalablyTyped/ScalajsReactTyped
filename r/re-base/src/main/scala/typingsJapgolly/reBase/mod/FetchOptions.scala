package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
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
    * The callback function that will be invoked with an error that occurs
    * reading data from the specified endpoint.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    context: js.Object,
    asArray: js.UndefOr[Boolean] = js.undefined,
    onFailure: js.UndefOr[Callback] = js.undefined,
    queries: js.Object = null,
    `then`: /* result */ js.Any => Callback = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction1((t0: /* result */ js.Any) => `then`(t0).runNow()))
    __obj.asInstanceOf[FetchOptions]
  }
}

