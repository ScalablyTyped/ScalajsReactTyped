package typingsJapgolly.autocannon.mod

import typingsJapgolly.autocannon.autocannonStrings.ACL
import typingsJapgolly.autocannon.autocannonStrings.BIND
import typingsJapgolly.autocannon.autocannonStrings.CHECKOUT
import typingsJapgolly.autocannon.autocannonStrings.CONNECT
import typingsJapgolly.autocannon.autocannonStrings.COPY
import typingsJapgolly.autocannon.autocannonStrings.DELETE
import typingsJapgolly.autocannon.autocannonStrings.GET
import typingsJapgolly.autocannon.autocannonStrings.HEAD
import typingsJapgolly.autocannon.autocannonStrings.LINK
import typingsJapgolly.autocannon.autocannonStrings.LOCK
import typingsJapgolly.autocannon.autocannonStrings.MERGE
import typingsJapgolly.autocannon.autocannonStrings.MKACTIVITY
import typingsJapgolly.autocannon.autocannonStrings.MKCALENDAR
import typingsJapgolly.autocannon.autocannonStrings.MKCOL
import typingsJapgolly.autocannon.autocannonStrings.MOVE
import typingsJapgolly.autocannon.autocannonStrings.NOTIFY
import typingsJapgolly.autocannon.autocannonStrings.OPTIONS
import typingsJapgolly.autocannon.autocannonStrings.PATCH
import typingsJapgolly.autocannon.autocannonStrings.POST
import typingsJapgolly.autocannon.autocannonStrings.PROPFIND
import typingsJapgolly.autocannon.autocannonStrings.PROPPATCH
import typingsJapgolly.autocannon.autocannonStrings.PURGE
import typingsJapgolly.autocannon.autocannonStrings.PUT
import typingsJapgolly.autocannon.autocannonStrings.REBIND
import typingsJapgolly.autocannon.autocannonStrings.REPORT
import typingsJapgolly.autocannon.autocannonStrings.SEARCH
import typingsJapgolly.autocannon.autocannonStrings.SOURCE
import typingsJapgolly.autocannon.autocannonStrings.SUBSCRIBE
import typingsJapgolly.autocannon.autocannonStrings.TRACE
import typingsJapgolly.autocannon.autocannonStrings.UNBIND
import typingsJapgolly.autocannon.autocannonStrings.UNLINK
import typingsJapgolly.autocannon.autocannonStrings.UNLOCK
import typingsJapgolly.autocannon.autocannonStrings.UNSUBSCRIBE
import typingsJapgolly.autocannon.autocannonStrings.`M-SEARCH`
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[String | Buffer] = js.undefined
  var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    body: String | Buffer = null,
    headers: IncomingHttpHeaders = null,
    method: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE = null,
    path: String = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

