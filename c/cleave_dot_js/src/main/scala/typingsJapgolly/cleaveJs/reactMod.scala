package typingsJapgolly.cleaveJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cleaveJs.reactPropsMod.Props
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    def this(props: Props, context: Any) = this()
  }
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[Props, js.Object]) = js.native
  
  type _To = js.Object & (ComponentClass[Props, js.Object])
  
  /* This means you don't have to write `^`, but can instead just say `reactMod.foo` */
  override def _to: js.Object & (ComponentClass[Props, js.Object]) = ^
}
