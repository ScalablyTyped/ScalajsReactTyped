package typingsJapgolly.typpy.mod

import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.RegExp
import typingsJapgolly.std.RegExpConstructor
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.typpy.typpyBooleans.`true`
import typingsJapgolly.typpy.typpyStrings.`null`
import typingsJapgolly.typpy.typpyStrings.`object`
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
trait CompareFn extends js.Object {
  def apply(): `true` = js.native
  def apply(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
  def apply(input: String, compareTo: StringConstructor): `true` = js.native
  def apply(input: String, compareTo: string): `true` = js.native
  def apply(input: js.Any, compareTo: js.Any): Boolean = js.native
  def apply(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def apply(input: js.Array[_], compareTo: array): `true` = js.native
  def apply(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def apply(input: js.Function, compareTo: function): `true` = js.native
  def apply(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def apply(input: js.Object, compareTo: `object`): Boolean = js.native
  def apply(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def apply(input: Boolean, compareTo: boolean): `true` = js.native
  def apply(input: Double, compareTo: Double): Boolean = js.native
  def apply(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def apply(input: Double, compareTo: nan): Boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double, compareTo: number): Boolean = js.native
  def apply(input: Null, compareTo: `null`): `true` = js.native
  def apply(input: RegExp, compareTo: RegExpConstructor): `true` = js.native
  def apply(input: RegExp, compareTo: regexp): `true` = js.native
}

