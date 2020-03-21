package typingsJapgolly.superstruct

import typingsJapgolly.superstruct.structMod.Struct
import typingsJapgolly.superstruct.superstructMod.Superstruct_
import typingsJapgolly.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/function", JSImport.Namespace)
@js.native
object functionMod extends js.Object {
  def createFunction(schema: Validator, defaults: js.Any, struct: Superstruct_): Struct = js.native
}

