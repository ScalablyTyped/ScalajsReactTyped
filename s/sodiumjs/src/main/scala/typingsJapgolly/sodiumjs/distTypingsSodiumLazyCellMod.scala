package typingsJapgolly.sodiumjs

import typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell
import typingsJapgolly.sodiumjs.distTypingsSodiumLazyMod.Lazy
import typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumLazyCellMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/LazyCell", "LazyCell")
  @js.native
  open class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
}
