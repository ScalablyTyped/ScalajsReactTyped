package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenToCollectionOptions extends js.Object {
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
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[Boolean] = js.undefined
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback that will be called with the data.
    */
  def `then`(): Unit
}

object listenToCollectionOptions {
  @scala.inline
  def apply(
    context: js.Object,
    `then`: Callback,
    onFailure: js.UndefOr[Callback] = js.undefined,
    query: js.UndefOr[Callback] = js.undefined,
    withIds: js.UndefOr[Boolean] = js.undefined,
    withRefs: js.UndefOr[Boolean] = js.undefined
  ): listenToCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.toJsFn)
    onFailure.foreach(p => __obj.updateDynamic("onFailure")(p.toJsFn))
    query.foreach(p => __obj.updateDynamic("query")(p.toJsFn))
    if (!js.isUndefined(withIds)) __obj.updateDynamic("withIds")(withIds.asInstanceOf[js.Any])
    if (!js.isUndefined(withRefs)) __obj.updateDynamic("withRefs")(withRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[listenToCollectionOptions]
  }
}

