package typingsJapgolly.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[K, V] extends js.Object {
  var e: Double
  var k: K
  var v: V
}

object Entry {
  @scala.inline
  def apply[K, V](e: Double, k: K, v: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry[K, V]]
  }
}

