package typingsJapgolly.getenv.mod

import typingsJapgolly.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "array")
@js.native
object array_url extends js.Object {
  def apply(name: String, `type`: typingsJapgolly.getenv.getenvStrings.url): js.Array[UrlWithStringQuery] = js.native
  def apply(
    name: String,
    `type`: typingsJapgolly.getenv.getenvStrings.url,
    fallback: js.Array[UrlWithStringQuery]
  ): js.Array[UrlWithStringQuery] = js.native
}

