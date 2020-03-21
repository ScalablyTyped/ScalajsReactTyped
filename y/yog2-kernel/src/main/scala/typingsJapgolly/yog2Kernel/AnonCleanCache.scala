package typingsJapgolly.yog2Kernel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): Unit
}

object AnonCleanCache {
  @scala.inline
  def apply(cleanCache: Callback): AnonCleanCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanCache")(cleanCache.toJsFn)
    __obj.asInstanceOf[AnonCleanCache]
  }
}

