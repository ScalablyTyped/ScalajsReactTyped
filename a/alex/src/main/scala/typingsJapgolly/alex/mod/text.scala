package typingsJapgolly.alex.mod

import typingsJapgolly.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alex", "text")
@js.native
object text extends js.Object {
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /** Check plain text (as in, syntax is checked). */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}

