package typingsJapgolly.k6.httpMod

import typingsJapgolly.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "FileData")
@js.native
abstract class FileData () extends js.Object {
  /** Content type to include in MIME message. */
  var content_type: js.UndefOr[String] = js.native
  /** File data. */
  var data: String | bytes = js.native
  /** Filename to include in MIME message. */
  var filename: js.UndefOr[String] = js.native
}

