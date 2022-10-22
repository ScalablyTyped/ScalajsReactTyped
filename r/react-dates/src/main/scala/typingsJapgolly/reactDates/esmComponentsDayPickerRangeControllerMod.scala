package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.DayPickerRangeControllerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsDayPickerRangeControllerMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/DayPickerRangeController", JSImport.Default)
  @js.native
  val default: ComponentClassP[DayPickerRangeControllerShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/DayPickerRangeController", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[DayPickerRangeControllerShape, js.Object, Any] {
    def this(props: DayPickerRangeControllerShape) = this()
    def this(props: DayPickerRangeControllerShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[DayPickerRangeControllerShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsDayPickerRangeControllerMod.foo` */
  override def _to: ComponentClassP[DayPickerRangeControllerShape & js.Object] = default
}
