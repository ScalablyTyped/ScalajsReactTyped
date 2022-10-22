package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDayPickerSingleDateControllerMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/DayPickerSingleDateController", JSImport.Default)
  @js.native
  val default: ComponentClassP[DayPickerSingleDateControllerShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/DayPickerSingleDateController", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DayPickerSingleDateControllerShape, js.Object, Any] {
    def this(props: DayPickerSingleDateControllerShape) = this()
    def this(props: DayPickerSingleDateControllerShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DayPickerSingleDateControllerShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDayPickerSingleDateControllerMod.foo` */
  override def _to: ComponentClassP[DayPickerSingleDateControllerShape & js.Object] = default
}
