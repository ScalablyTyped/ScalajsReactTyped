package typingsJapgolly.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: String */] extends ThemedStyledFunctionBase[C, T, O, A] {
  // Fun thing: 'attrs' can also provide a polymorphic 'as' prop
  // My head already hurts enough so maybe later...
  def attrs[U, NewA /* <: (Partial[StyledComponentPropsWithRef[C] with U]) with StringDictionary[js.Any] */](attrs: Attrs[StyledComponentPropsWithRef[C] with U, NewA, T]): ThemedStyledFunction[C, T, O with NewA, A | String] = js.native
}

