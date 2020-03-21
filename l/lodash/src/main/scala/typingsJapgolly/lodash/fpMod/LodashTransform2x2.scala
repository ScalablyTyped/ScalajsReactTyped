package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.Dictionary
import typingsJapgolly.lodash.mod.MemoVoidIteratorCapped
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform2x2[TResult] extends js.Object {
  def apply[T](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]]): LodashTransform2x3[T, TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], `object`: js.Array[T]): Dictionary[TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], `object`: Dictionary[T]): Dictionary[TResult] = js.native
  def apply[T](iteratee: __, `object`: js.Array[T]): LodashTransform2x6[T, TResult] = js.native
  def apply[T](iteratee: __, `object`: Dictionary[T]): LodashTransform3x6[T, TResult] = js.native
}

