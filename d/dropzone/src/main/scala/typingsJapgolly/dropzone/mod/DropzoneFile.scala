package typingsJapgolly.dropzone.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.dropzone.mod._Global_.HTMLElement
import typingsJapgolly.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneFile extends File {
  var accepted: Boolean = js.native
  var previewElement: HTMLElement = js.native
  var previewTemplate: HTMLElement = js.native
  var previewsContainer: HTMLElement = js.native
  var status: String = js.native
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}

