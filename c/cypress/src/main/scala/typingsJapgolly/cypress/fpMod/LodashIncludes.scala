package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.Dictionary
import typingsJapgolly.cypress.lodashMod.List
import typingsJapgolly.cypress.lodashMod.NumericDictionary
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIncludes extends js.Object {
  def apply[T](target: T): LodashIncludes1x1[T] = js.native
  def apply[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def apply[T](target: T, collection: List[T]): Boolean = js.native
  def apply[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def apply[T](target: __): LodashIncludes1x2[T] = js.native
  def apply[T](target: __, collection: Dictionary[T]): LodashIncludes1x2[T] = js.native
  def apply[T](target: __, collection: List[T]): LodashIncludes1x2[T] = js.native
  def apply[T](target: __, collection: NumericDictionary[T]): LodashIncludes1x2[T] = js.native
}

