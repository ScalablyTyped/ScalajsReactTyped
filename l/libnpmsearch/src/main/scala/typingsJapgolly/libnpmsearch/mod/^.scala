package typingsJapgolly.libnpmsearch.mod

import typingsJapgolly.libnpmsearch.Optionsdetailedtrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libnpmsearch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(query: String): js.Promise[js.Array[Result]] = js.native
  def apply(query: String, opts: Optionsdetailedtrue): js.Promise[js.Array[DetailedResult]] = js.native
  def apply(query: String, opts: Options): js.Promise[js.Array[Result]] = js.native
  def apply(query: js.Array[String]): js.Promise[js.Array[Result]] = js.native
  def apply(query: js.Array[String], opts: Optionsdetailedtrue): js.Promise[js.Array[DetailedResult]] = js.native
  def apply(query: js.Array[String], opts: Options): js.Promise[js.Array[Result]] = js.native
}

