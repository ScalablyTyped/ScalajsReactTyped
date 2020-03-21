package typingsJapgolly.meteorPublishComposite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel]
}

object PublishCompositeConfig4 {
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](
    find: (InLevel4, InLevel3, InLevel2, InLevel1) => CallbackTo[Cursor[OutLevel]],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: String = null
  ): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction4((t0: InLevel4, t1: InLevel3, t2: InLevel2, t3: InLevel1) => find(t0, t1, t2, t3).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
}

