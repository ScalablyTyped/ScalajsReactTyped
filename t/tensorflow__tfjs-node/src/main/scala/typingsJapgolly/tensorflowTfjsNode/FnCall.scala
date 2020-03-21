package typingsJapgolly.tensorflowTfjsNode

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: String): IOHandler = js.native
  def apply(path: String, loadOptions: LoadOptions): IOHandler = js.native
}

