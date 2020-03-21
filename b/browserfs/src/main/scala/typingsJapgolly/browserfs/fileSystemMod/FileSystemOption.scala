package typingsJapgolly.browserfs.fileSystemMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemOption[T] extends js.Object {
  var description: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: String | js.Array[String]
  var validator: js.UndefOr[js.Function2[/* opt */ T, /* cb */ BFSOneArgCallback, Unit]] = js.undefined
}

object FileSystemOption {
  @scala.inline
  def apply[T](
    description: String,
    `type`: String | js.Array[String],
    optional: js.UndefOr[Boolean] = js.undefined,
    validator: (/* opt */ T, /* cb */ BFSOneArgCallback) => Callback = null
  ): FileSystemOption[T] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction2((t0: /* opt */ T, t1: /* cb */ typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback) => validator(t0, t1).runNow()))
    __obj.asInstanceOf[FileSystemOption[T]]
  }
}

