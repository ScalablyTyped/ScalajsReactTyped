package typingsJapgolly.superstruct

import typingsJapgolly.superstruct.structErrorMod.Branch
import typingsJapgolly.superstruct.structErrorMod.Path
import typingsJapgolly.superstruct.structMod.Struct
import typingsJapgolly.superstruct.superstructMod.Superstruct_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def createDynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any,
    struct: Superstruct_
  ): Struct = js.native
}

