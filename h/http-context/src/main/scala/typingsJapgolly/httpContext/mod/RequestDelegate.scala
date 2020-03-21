package typingsJapgolly.httpContext.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.httpContext.httpContextBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDelegate extends js.Object {
  var fresh: Boolean = js.native
  var header: IncomingHttpHeaders = js.native
  var headers: IncomingHttpHeaders = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var idempotent: Boolean = js.native
  var method: String = js.native
  var path: String = js.native
  var protocol: String = js.native
  var query: StringDictionary[String | js.Array[String]] = js.native
  var querystring: String = js.native
  var search: String = js.native
  var secure: Boolean = js.native
  var subdomains: js.Array[String] = js.native
  var url: String = js.native
  def accepts(types: String*): js.Array[String] | String | `false` = js.native
  def accepts(types: js.Array[String]): js.Array[String] | String | `false` = js.native
  def acceptsCharsets(charsets: String*): String | `false` = js.native
  def acceptsCharsets(charsets: js.Array[String]): String | `false` = js.native
  def acceptsEncodings(encodings: String*): String | `false` = js.native
  def acceptsEncodings(encodings: js.Array[String]): String | `false` = js.native
  def acceptsLanguages(languages: String*): String | `false` = js.native
  def acceptsLanguages(languages: js.Array[String]): String | `false` = js.native
  def get(field: String): String = js.native
  def is(types: String*): String | `false` = js.native
  def is(types: js.Array[String]): String | `false` = js.native
}

