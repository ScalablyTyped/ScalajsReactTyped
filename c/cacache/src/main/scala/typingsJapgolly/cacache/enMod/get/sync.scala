package typingsJapgolly.cacache.enMod.get

import typingsJapgolly.cacache.enMod.CacheObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get.sync")
@js.native
object sync extends js.Object {
  def apply(cachePath: String, key: String): CacheObject = js.native
  def apply(cachePath: String, key: String, opts: Options): CacheObject = js.native
}

