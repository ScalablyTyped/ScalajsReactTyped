package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait removeFromCollectionOptions extends js.Object {
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object removeFromCollectionOptions {
  @scala.inline
  def apply(query: js.UndefOr[Callback] = js.undefined): removeFromCollectionOptions = {
    val __obj = js.Dynamic.literal()
    query.foreach(p => __obj.updateDynamic("query")(p.toJsFn))
    __obj.asInstanceOf[removeFromCollectionOptions]
  }
}

