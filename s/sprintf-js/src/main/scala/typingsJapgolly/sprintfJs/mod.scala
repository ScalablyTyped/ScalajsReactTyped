package typingsJapgolly.sprintfJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sprintf-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def sprintf(format: String, args: js.Any*): String = js.native
  def vsprintf(format: String, args: js.Array[_]): String = js.native
}

