package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DateRangePickerInputControllerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDateRangePickerInputControllerMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/DateRangePickerInputController", JSImport.Default)
  @js.native
  val default: ComponentClassP[DateRangePickerInputControllerShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/DateRangePickerInputController", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DateRangePickerInputControllerShape, js.Object, Any] {
    def this(props: DateRangePickerInputControllerShape) = this()
    def this(props: DateRangePickerInputControllerShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DateRangePickerInputControllerShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDateRangePickerInputControllerMod.foo` */
  override def _to: ComponentClassP[DateRangePickerInputControllerShape & js.Object] = default
}
