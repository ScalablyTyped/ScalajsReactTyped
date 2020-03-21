package typingsJapgolly.ol.mod

import typingsJapgolly.ol.collectionMod.Options
import typingsJapgolly.ol.collectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Collection")
@js.native
class Collection[T] () extends default[T] {
  def this(opt_array: js.Array[T]) = this()
  def this(opt_array: js.Array[T], opt_options: Options) = this()
}

