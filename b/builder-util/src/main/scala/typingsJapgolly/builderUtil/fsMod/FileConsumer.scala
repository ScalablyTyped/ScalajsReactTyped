package typingsJapgolly.builderUtil.fsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConsumer extends js.Object {
  /**
    * @default false
    */
  var isIncludeDir: js.UndefOr[Boolean] = js.undefined
  def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): js.Any
}

object FileConsumer {
  @scala.inline
  def apply(
    consume: (String, Stats, String, js.Array[String]) => CallbackTo[js.Any],
    isIncludeDir: js.UndefOr[Boolean] = js.undefined
  ): FileConsumer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consume")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.fsExtra.mod.Stats, t2: java.lang.String, t3: js.Array[java.lang.String]) => consume(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(isIncludeDir)) __obj.updateDynamic("isIncludeDir")(isIncludeDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConsumer]
  }
}

