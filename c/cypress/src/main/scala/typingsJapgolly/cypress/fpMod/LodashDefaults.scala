package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.__
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDefaults extends js.Object {
  def apply[TSource](source: TSource): LodashDefaults1x1[TSource] = js.native
  def apply[TObject](source: __, `object`: TObject): LodashDefaults1x2[TObject] = js.native
  def apply[TObject, TSource](source: TSource, `object`: TObject): NonNullable[TSource with TObject] = js.native
}

