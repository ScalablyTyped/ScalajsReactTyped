package typingsJapgolly.sodiumjs

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.lazyMod.Lazy
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/LazyCell", JSImport.Namespace)
@js.native
object lazyCellMod extends js.Object {
  @js.native
  class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
  
}

