package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonParentGuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.Tag")
@js.native
class Tag () extends js.Object {
  def this(args: AnonParentGuid) = this()
  var guid: js.UndefOr[Guid] = js.native
  var name: js.UndefOr[String] = js.native
  var parentGuid: js.UndefOr[Guid] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

