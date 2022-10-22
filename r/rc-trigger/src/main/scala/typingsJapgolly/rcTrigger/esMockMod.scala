package typingsJapgolly.rcTrigger

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTrigger.mod.TriggerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  open class default protected () extends Component[TriggerProps, Any, Any] {
    def this(props: TriggerProps) = this()
    def this(props: TriggerProps, context: Any) = this()
  }
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  val default: ComponentClassP[TriggerProps & js.Object] = js.native
  
  type _To = ComponentClassP[TriggerProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esMockMod.foo` */
  override def _to: ComponentClassP[TriggerProps & js.Object] = default
}
