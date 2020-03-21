package typingsJapgolly.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
@js.native
object skipduplicatesMod extends js.Object {
  def default[A](src: typingsJapgolly.baconjs.observableMod.default[A]): typingsJapgolly.baconjs.observableMod.default[A] = js.native
  def default[A](src: typingsJapgolly.baconjs.observableMod.default[A], isEqual: Equals_[A]): typingsJapgolly.baconjs.observableMod.default[A] = js.native
  def equals[A](a: A, b: A): Boolean = js.native
  type Equals_[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}

