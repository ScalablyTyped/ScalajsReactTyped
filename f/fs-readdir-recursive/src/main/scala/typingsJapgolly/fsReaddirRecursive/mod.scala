package typingsJapgolly.fsReaddirRecursive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-readdir-recursive", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: String): js.Array[String] = js.native
  def apply(path: String, filter: js.Function1[/* path */ String, Boolean]): js.Array[String] = js.native
}

