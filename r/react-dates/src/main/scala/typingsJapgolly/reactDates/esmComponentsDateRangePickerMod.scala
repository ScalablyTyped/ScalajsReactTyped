package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DateRangePickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsDateRangePickerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DateRangePicker", JSImport.Default)
  @js.native
  val default: ComponentClassP[DateRangePickerShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DateRangePicker", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DateRangePickerShape, js.Object, Any] {
    def this(props: DateRangePickerShape) = this()
    def this(props: DateRangePickerShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DateRangePickerShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsDateRangePickerMod.foo` */
  override def _to: ComponentClassP[DateRangePickerShape & js.Object] = default
}
