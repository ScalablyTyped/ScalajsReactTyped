package typingsJapgolly.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "IntersectionType")
@js.native
class IntersectionType[CS /* <: js.Array[Any_] */, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: CS) = this()
  val _tag: typingsJapgolly.ioTs.ioTsStrings.IntersectionType = js.native
  val types: CS = js.native
}

