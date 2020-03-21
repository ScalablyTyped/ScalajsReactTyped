package typingsJapgolly.ono

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.ono.typesMod.ErrorLike
import typingsJapgolly.ono.typesMod.ErrorLikeConstructor
import typingsJapgolly.ono.typesMod.OnoConstructor
import typingsJapgolly.ono.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typingsJapgolly.ono.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}

