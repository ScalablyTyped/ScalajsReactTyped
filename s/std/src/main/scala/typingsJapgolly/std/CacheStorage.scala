package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The storage for Cache objects. */
@js.native
trait CacheStorage extends js.Object {
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[org.scalajs.dom.experimental.Response]] = js.native
  def `match`(request: RequestInfo, options: org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.experimental.Response]] = js.native
  def open(cacheName: java.lang.String): js.Promise[org.scalajs.dom.experimental.serviceworkers.Cache] = js.native
}

@JSGlobal("CacheStorage")
@js.native
object CacheStorage extends Instantiable0[CacheStorage]

