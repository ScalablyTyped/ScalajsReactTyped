package typingsJapgolly.reactNative

import typingsJapgolly.reactNative.parseErrorStackMod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native/Libraries/Core/Devtools/symbolicateStackTrace", JSImport.Namespace)
@js.native
object symbolicateStackTraceMod extends js.Object {
  def default(stack: js.Array[StackFrame]): js.Promise[js.Array[StackFrame]] = js.native
}

