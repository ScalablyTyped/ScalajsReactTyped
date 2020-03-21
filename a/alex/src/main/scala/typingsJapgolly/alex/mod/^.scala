package typingsJapgolly.alex.mod

import typingsJapgolly.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /**
    * finds gender favoring, polarizing, race related, religion inconsiderate, or other unequal phrasing in text.
    */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}

