package typingsJapgolly.slate.mod

import typingsJapgolly.slate.slateStrings.set_selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SetSelectionOperation")
@js.native
class SetSelectionOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newProperties: SelectionProperties = js.native
  var properties: SelectionProperties = js.native
  @JSName("type")
  var type_SetSelectionOperation: set_selection = js.native
}

