package typingsJapgolly.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends BaseType[T]
     with Type[T] {
  val fields: js.Array[FieldType[_]] = js.native
  val kind: typingsJapgolly.astTypes.astTypesStrings.ObjectType = js.native
}

