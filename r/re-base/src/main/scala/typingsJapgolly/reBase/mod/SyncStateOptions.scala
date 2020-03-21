package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncStateOptions extends js.Object {
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
    * A default value to set when the Firebase endpoint has no value (i.e.,
    * on init) (use this if you want a value other than an empty object or
    * empty array)
    */
  var defaultValue: js.UndefOr[String | Boolean | Double | js.Object] = js.undefined
  /**
    * Will keep any firebase generated keys intact when manipulating data
    * using the asArray option.
    */
  var keepKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function that will be invoked if the current user does
    * not have read or write permissions at the location.
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
    * arbitrarily nested property a là `foo.bar`.
    */
  var state: String
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with syncState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SyncStateOptions {
  @scala.inline
  def apply(
    context: js.Object,
    state: String,
    asArray: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Boolean | Double | js.Object = null,
    keepKeys: js.UndefOr[Boolean] = js.undefined,
    onFailure: js.UndefOr[Callback] = js.undefined,
    queries: js.Object = null,
    `then`: js.UndefOr[Callback] = js.undefined
  ): SyncStateOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(keepKeys)) __obj.updateDynamic("keepKeys")(keepKeys.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    `then`.foreach(p => __obj.updateDynamic("then")(p.toJsFn))
    __obj.asInstanceOf[SyncStateOptions]
  }
}

