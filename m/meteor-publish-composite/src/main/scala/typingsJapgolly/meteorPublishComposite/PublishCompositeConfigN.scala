package typingsJapgolly.meteorPublishComposite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfigN extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(args: js.Any*): Cursor[_]
}

object PublishCompositeConfigN {
  @scala.inline
  def apply(
    find: /* repeated */ js.Any => CallbackTo[Cursor[js.Any]],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: String = null
  ): PublishCompositeConfigN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => find(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfigN]
  }
}

