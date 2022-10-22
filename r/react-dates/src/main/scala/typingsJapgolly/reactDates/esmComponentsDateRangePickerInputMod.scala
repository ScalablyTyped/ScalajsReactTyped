package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DateRangePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsDateRangePickerInputMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DateRangePickerInput", JSImport.Default)
  @js.native
  val default: ComponentClassP[DateRangePickerInputShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DateRangePickerInput", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DateRangePickerInputShape, js.Object, Any] {
    def this(props: DateRangePickerInputShape) = this()
    def this(props: DateRangePickerInputShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DateRangePickerInputShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsDateRangePickerInputMod.foo` */
  override def _to: ComponentClassP[DateRangePickerInputShape & js.Object] = default
}
