package typingsJapgolly.emotionTheming

import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (Partial[Pick[T, Extract[String, U]]])
  type Omit[T, U] = Pick[T, Exclude[String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

