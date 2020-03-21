package typingsJapgolly.typpy.mod

import typingsJapgolly.std.RegExp
import typingsJapgolly.typpy.typpyStrings.`null`
import typingsJapgolly.typpy.typpyStrings.array
import typingsJapgolly.typpy.typpyStrings.boolean
import typingsJapgolly.typpy.typpyStrings.function
import typingsJapgolly.typpy.typpyStrings.nan
import typingsJapgolly.typpy.typpyStrings.number
import typingsJapgolly.typpy.typpyStrings.regexp
import typingsJapgolly.typpy.typpyStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFn extends js.Object {
  def apply(): `null` = js.native
  def apply(input: String): string = js.native
  def apply(input: js.Any): String = js.native
  def apply(input: js.Array[_]): array = js.native
  def apply(input: js.Function): function = js.native
  def apply(input: Boolean): boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double): number | nan = js.native
  def apply(input: RegExp): regexp = js.native
}

