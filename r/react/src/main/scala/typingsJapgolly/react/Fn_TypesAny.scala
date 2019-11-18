package typingsJapgolly.react

import typingsJapgolly.propDashTypes.propDashTypesMod.InferType
import typingsJapgolly.propDashTypes.propDashTypesMod.Requireable
import typingsJapgolly.propDashTypes.propDashTypesMod.Validator
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_TypesAny extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}

