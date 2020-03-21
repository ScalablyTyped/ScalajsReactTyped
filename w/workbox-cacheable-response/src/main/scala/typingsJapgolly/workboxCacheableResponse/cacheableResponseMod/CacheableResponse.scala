package typingsJapgolly.workboxCacheableResponse.cacheableResponseMod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-cacheable-response/CacheableResponse", "CacheableResponse")
@js.native
class CacheableResponse () extends js.Object {
  def this(config: CacheableResponseConfig) = this()
  def isResponseCacheable(response: Response): Boolean = js.native
}

