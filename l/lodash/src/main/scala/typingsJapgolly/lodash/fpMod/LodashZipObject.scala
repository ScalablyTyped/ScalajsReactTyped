package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.lodashMod.Dictionary
import typingsJapgolly.lodash.lodashMod.List
import typingsJapgolly.lodash.lodashMod.PropertyName
import typingsJapgolly.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZipObject extends js.Object {
  def apply(props: List[PropertyName]): LodashZipObject1x1 = js.native
  def apply[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  def apply[T](props: __, values: List[T]): LodashZipObject1x2[T] = js.native
}

