package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getOptions extends js.Object {
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
}

object getOptions {
  @scala.inline
  def apply(
    query: js.UndefOr[Callback] = js.undefined,
    withIds: js.UndefOr[Boolean] = js.undefined,
    withRefs: js.UndefOr[Boolean] = js.undefined
  ): getOptions = {
    val __obj = js.Dynamic.literal()
    query.foreach(p => __obj.updateDynamic("query")(p.toJsFn))
    if (!js.isUndefined(withIds)) __obj.updateDynamic("withIds")(withIds.asInstanceOf[js.Any])
    if (!js.isUndefined(withRefs)) __obj.updateDynamic("withRefs")(withRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[getOptions]
  }
}

