package typingsJapgolly.slate.mod

import typingsJapgolly.slate.slateStrings.set_value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SetValueOperation")
@js.native
class SetValueOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newProperties: ValueProperties = js.native
  var properties: ValueProperties = js.native
  @JSName("type")
  var type_SetValueOperation: set_value = js.native
}

