package typingsJapgolly.ember.mod.default

import typingsJapgolly.ember.emberStrings.undefined
import typingsJapgolly.emberUtils.typesMod.TypeLookup
import typingsJapgolly.emberUtils.typesMod.TypeOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "typeOf")
@js.native
object typeOf extends js.Object {
  def apply(): undefined = js.native
  def apply(item: js.Any): java.lang.String = js.native
  def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
}

