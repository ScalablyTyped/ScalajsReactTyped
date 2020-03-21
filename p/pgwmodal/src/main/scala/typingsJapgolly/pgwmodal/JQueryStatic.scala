package typingsJapgolly.pgwmodal

import typingsJapgolly.pgwmodal.pgwmodalStrings.close
import typingsJapgolly.pgwmodal.pgwmodalStrings.getData
import typingsJapgolly.pgwmodal.pgwmodalStrings.isOpen
import typingsJapgolly.pgwmodal.pgwmodalStrings.reposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod = js.native
  def pgwModal(action: String): js.Any = js.native
  def pgwModal(option: PgwModalOption): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_close(action: close): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_getData(action: getData): js.Any = js.native
  @JSName("pgwModal")
  def pgwModal_isOpen(action: isOpen): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_reposition(action: reposition): Boolean = js.native
}

