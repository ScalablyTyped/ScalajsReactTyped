package typingsJapgolly.gapiClientUrlshortener.gapi.client

import typingsJapgolly.gapiClientUrlshortener.gapiClientUrlshortenerStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load URL Shortener API v1 */
  def apply(
    name: typingsJapgolly.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener,
    version: v1
  ): js.Thenable[Unit] = js.native
  def apply(
    name: typingsJapgolly.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

