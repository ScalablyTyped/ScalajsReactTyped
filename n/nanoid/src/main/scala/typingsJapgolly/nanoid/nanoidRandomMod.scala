package typingsJapgolly.nanoid

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/random", JSImport.Namespace)
@js.native
object nanoidRandomMod extends js.Object {
  def apply(size: Double): Buffer = js.native
  def apply(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

