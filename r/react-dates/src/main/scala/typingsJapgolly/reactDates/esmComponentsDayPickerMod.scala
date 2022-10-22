package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DayPickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsDayPickerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DayPicker", JSImport.Default)
  @js.native
  val default: ComponentClassP[DayPickerShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DayPicker", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DayPickerShape, js.Object, Any] {
    def this(props: DayPickerShape) = this()
    def this(props: DayPickerShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DayPickerShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsDayPickerMod.foo` */
  override def _to: ComponentClassP[DayPickerShape & js.Object] = default
}
