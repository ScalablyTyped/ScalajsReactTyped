package typingsJapgolly.reactFocusLock

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactFocusLock.interfacesMod.AutoFocusProps
import typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps
import typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps
import typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Traps Focus inside a Lock
    */
  @JSImport("react-focus-lock", JSImport.Default)
  @js.native
  val default: FC[ReactFocusLockProps[Node, Record[String, Any]]] = js.native
  
  @JSImport("react-focus-lock", "AutoFocusInside")
  @js.native
  open class AutoFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock", "FreeFocusInside")
  @js.native
  open class FreeFocusInside protected ()
    extends Component[FreeFocusProps, js.Object, Any] {
    def this(props: FreeFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FreeFocusProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock", "InFocusGuard")
  @js.native
  open class InFocusGuard protected ()
    extends Component[InFocusGuardProps, js.Object, Any] {
    def this(props: InFocusGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InFocusGuardProps, context: Any) = this()
  }
  
  @JSImport("react-focus-lock", "MoveFocusInside")
  @js.native
  open class MoveFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: Any) = this()
  }
  
  type _To = FC[ReactFocusLockProps[Node, Record[String, Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[ReactFocusLockProps[Node, Record[String, Any]]] = default
}
