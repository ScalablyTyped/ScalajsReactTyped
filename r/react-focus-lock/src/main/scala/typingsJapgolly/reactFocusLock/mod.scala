package typingsJapgolly.reactFocusLock

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactFocusLock.interfacesMod.AutoFocusProps
import typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps
import typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps
import typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-focus-lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AutoFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  @js.native
  class FreeFocusInside ()
    extends Component[FreeFocusProps, js.Object, js.Any]
  
  @js.native
  class InFocusGuard ()
    extends Component[InFocusGuardProps, js.Object, js.Any]
  
  @js.native
  class MoveFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  /**
    * Traps Focus inside a Lock
    */
  val default: FC[ReactFocusLockProps[Node, Record[String, js.Any]]] = js.native
}

