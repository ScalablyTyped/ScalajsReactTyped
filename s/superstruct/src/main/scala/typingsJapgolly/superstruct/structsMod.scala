package typingsJapgolly.superstruct

import typingsJapgolly.superstruct.structErrorMod.Branch
import typingsJapgolly.superstruct.structErrorMod.Path
import typingsJapgolly.superstruct.structMod.Struct
import typingsJapgolly.superstruct.superstructMod.Superstruct_
import typingsJapgolly.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs", JSImport.Namespace)
@js.native
object structsMod extends js.Object {
  def createArray(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createDynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any,
    struct: Superstruct_
  ): Struct = js.native
  def createEnum(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createFunction(schema: Validator, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createInstance(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createInterface(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createIntersection(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createLazy(schema: js.Function0[Struct], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createLiteral(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createObject(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createPartial(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createPick(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createRecord(schema: js.Tuple2[_, _], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createScalar(schema: String, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createShorthand(schema: js.Any, defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createSize(schema: js.Tuple2[Double, Double], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createTuple(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
  def createUnion(schema: js.Array[_], defaults: js.Any, struct: Superstruct_): Struct = js.native
}

