package typingsJapgolly.typescriptOptional

import typingsJapgolly.typescriptOptional.typesMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class Optional[T] ()
    extends typingsJapgolly.typescriptOptional.optionalMod.Optional[T]
  
  /* static members */
  @js.native
  object Optional extends js.Object {
    def empty[T](): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
    def from[T](option: Option[T]): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
    def of[T](value: T): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNonNull[T](value: T): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNullable[T](): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNullable[T](nullable: T): typingsJapgolly.typescriptOptional.optionalMod.Optional[T] = js.native
  }
  
}

