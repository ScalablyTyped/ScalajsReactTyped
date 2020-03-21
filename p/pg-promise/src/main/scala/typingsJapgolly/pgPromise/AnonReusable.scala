package typingsJapgolly.pgPromise

import typingsJapgolly.pgPromise.mod.ITask
import typingsJapgolly.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReusable[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var reusable: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object AnonReusable {
  @scala.inline
  def apply[Ext](
    cnd: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null,
    mode: TransactionMode = null,
    reusable: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null,
    tag: js.Any = null
  ): AnonReusable[Ext] = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (reusable != null) __obj.updateDynamic("reusable")(reusable.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReusable[Ext]]
  }
}

