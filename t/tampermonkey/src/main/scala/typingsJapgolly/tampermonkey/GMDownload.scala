package typingsJapgolly.tampermonkey

import typingsJapgolly.tampermonkey.Tampermonkey.AbortHandle
import typingsJapgolly.tampermonkey.Tampermonkey.DownloadRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_download")
@js.native
object GMDownload extends js.Object {
  /** Downloads a given URL to the local disk */
  def apply(details: DownloadRequest): AbortHandle[Boolean] = js.native
  def apply(url: String, name: String): AbortHandle[Boolean] = js.native
}

