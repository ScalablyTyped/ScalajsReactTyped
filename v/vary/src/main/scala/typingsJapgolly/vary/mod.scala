package typingsJapgolly.vary

import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vary", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(res: ServerResponse, field: String): Unit = js.native
  def apply(res: ServerResponse, field: js.Array[String]): Unit = js.native
  def append(header: String, field: String): String = js.native
  def append(header: String, field: js.Array[String]): String = js.native
}

