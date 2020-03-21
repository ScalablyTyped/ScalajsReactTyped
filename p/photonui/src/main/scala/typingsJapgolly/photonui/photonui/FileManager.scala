package typingsJapgolly.photonui.photonui

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
@JSGlobal("photonui.FileManager")
@js.native
class FileManager () extends Base {
  var acceptedExts: js.Array[String] = js.native
  var acceptedMimes: js.Array[String] = js.native
  var dropZone: HTMLElement = js.native
  var multiselect: Boolean = js.native
  def open(): Unit = js.native
}

