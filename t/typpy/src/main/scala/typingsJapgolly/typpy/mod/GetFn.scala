package typingsJapgolly.typpy.mod

import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.RegExp
import typingsJapgolly.std.RegExpConstructor
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.typpy.typpyBooleans.`false`
import typingsJapgolly.typpy.typpyBooleans.`true`
import typingsJapgolly.typpy.typpyStrings.`null`
import typingsJapgolly.typpy.typpyStrings.array
import typingsJapgolly.typpy.typpyStrings.boolean
import typingsJapgolly.typpy.typpyStrings.function
import typingsJapgolly.typpy.typpyStrings.nan
import typingsJapgolly.typpy.typpyStrings.number
import typingsJapgolly.typpy.typpyStrings.regexp
import typingsJapgolly.typpy.typpyStrings.string
import typingsJapgolly.typpy.typpyStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFn extends js.Object {
  def apply(): Null = js.native
  def apply(input: js.UndefOr[scala.Nothing], asString: `false`): Unit = js.native
  def apply(input: js.UndefOr[scala.Nothing], asString: `true`): undefined = js.native
  def apply(input: String): StringConstructor = js.native
  def apply(input: String, asString: `false`): StringConstructor = js.native
  def apply(input: String, asString: `true`): string = js.native
   // tslint:disable-line:ban-types
  def apply(input: js.Any): ConstructorFn = js.native
  def apply(input: js.Any, asString: `false`): ConstructorFn = js.native
   // tslint:disable-line:ban-types
  def apply(input: js.Any, asString: `true`): String = js.native
  def apply(input: js.Array[_]): ArrayConstructor = js.native
  def apply(input: js.Array[_], asString: `false`): ArrayConstructor = js.native
  def apply(input: js.Array[_], asString: `true`): array = js.native
  def apply(input: js.Function): FunctionConstructor = js.native
  def apply(input: js.Function, asString: `false`): FunctionConstructor = js.native
  def apply(input: js.Function, asString: `true`): function = js.native
  def apply(input: Boolean): BooleanConstructor = js.native
  def apply(input: Boolean, asString: `false`): BooleanConstructor = js.native
  def apply(input: Boolean, asString: `true`): boolean = js.native
  def apply(input: Double): NumberConstructor | Double = js.native
  def apply(input: Double, asString: `false`): NumberConstructor | Double = js.native
  def apply(input: Double, asString: `true`): number | nan = js.native
  def apply(input: Null, asString: `false`): Null = js.native
  def apply(input: Null, asString: `true`): `null` = js.native
  def apply(input: RegExp): RegExpConstructor = js.native
  def apply(input: RegExp, asString: `false`): RegExpConstructor = js.native
  def apply(input: RegExp, asString: `true`): regexp = js.native
}

