package typingsJapgolly.jsmediatags.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackType extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  def onSuccess(data: TagType): Unit
}

object CallbackType {
  @scala.inline
  def apply(onSuccess: TagType => Callback, onError: /* error */ jsmediatagsError => Callback = null): CallbackType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.jsmediatags.typesMod.TagType) => onSuccess(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.jsmediatags.typesMod.jsmediatagsError) => onError(t0).runNow()))
    __obj.asInstanceOf[CallbackType]
  }
}

