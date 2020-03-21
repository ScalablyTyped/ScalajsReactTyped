package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.SavedSearch")
@js.native
class SavedSearch () extends js.Object {
  def this(args: AnonFormat) = this()
  var format: js.UndefOr[QueryFormat] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var name: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var scope: js.UndefOr[SavedSearchScope] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

