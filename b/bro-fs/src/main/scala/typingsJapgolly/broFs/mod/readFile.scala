package typingsJapgolly.broFs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.broFs.Anon0
import typingsJapgolly.broFs.Anon1
import typingsJapgolly.broFs.AnonType
import typingsJapgolly.broFs.AnonTypeTextType
import typingsJapgolly.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: String, options: Anon1): js.Promise[File] = js.native
  def apply(path: String, options: AnonType): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: String, options: AnonTypeTextType): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: Anon1): js.Promise[File] = js.native
  def apply(path: FileEntry, options: AnonType): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: FileEntry, options: AnonTypeTextType): js.Promise[String] = js.native
}

