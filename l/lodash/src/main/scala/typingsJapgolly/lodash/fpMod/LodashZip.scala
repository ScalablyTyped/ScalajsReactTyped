package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.List
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZip extends js.Object {
  def apply[T1](arrays1: List[T1]): LodashZip1x1[T1] = js.native
  def apply[T2](arrays1: __, arrays2: List[T2]): LodashZip1x2[T2] = js.native
  def apply[T1, T2](arrays1: List[T1], arrays2: List[T2]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]] = js.native
}

