package typingsJapgolly.pgwmodal

import typingsJapgolly.pgwmodal.pgwmodalStrings.close
import typingsJapgolly.pgwmodal.pgwmodalStrings.getData
import typingsJapgolly.pgwmodal.pgwmodalStrings.isOpen
import typingsJapgolly.pgwmodal.pgwmodalStrings.reposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgwModalMethod extends js.Object {
  def apply(action: String): js.Any = js.native
  def apply(action: close): Boolean = js.native
  def apply(action: getData): js.Any = js.native
  def apply(action: isOpen): Boolean = js.native
  def apply(action: reposition): Boolean = js.native
  def apply(option: PgwModalOption): Boolean = js.native
}

