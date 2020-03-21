package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bindCollectionOptions extends js.Object {
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
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The state property to bind the collection to.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[Boolean] = js.undefined
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[Boolean] = js.undefined
}

object bindCollectionOptions {
  @scala.inline
  def apply(
    context: js.Object,
    onFailure: js.UndefOr[Callback] = js.undefined,
    query: js.UndefOr[Callback] = js.undefined,
    state: String = null,
    `then`: js.UndefOr[Callback] = js.undefined,
    withIds: js.UndefOr[Boolean] = js.undefined,
    withRefs: js.UndefOr[Boolean] = js.undefined
  ): bindCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    query.foreach(p => __obj.updateDynamic("query")(p.toJsFn))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    `then`.foreach(p => __obj.updateDynamic("then")(p.toJsFn))
    if (!js.isUndefined(withIds)) __obj.updateDynamic("withIds")(withIds.asInstanceOf[js.Any])
    if (!js.isUndefined(withRefs)) __obj.updateDynamic("withRefs")(withRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[bindCollectionOptions]
  }
}

