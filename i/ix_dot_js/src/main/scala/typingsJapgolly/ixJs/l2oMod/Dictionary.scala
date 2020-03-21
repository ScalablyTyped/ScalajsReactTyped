package typingsJapgolly.ixJs.l2oMod

import typingsJapgolly.ixJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("l2o", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typingsJapgolly.ixJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}

