package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.CalendarMonthGridShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmComponentsCalendarMonthGridMod extends Shortcut {
  
  @JSImport("react-dates/esm/components/CalendarMonthGrid", JSImport.Default)
  @js.native
  val default: ComponentClassP[CalendarMonthGridShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/esm/components/CalendarMonthGrid", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[CalendarMonthGridShape, js.Object, Any] {
    def this(props: CalendarMonthGridShape) = this()
    def this(props: CalendarMonthGridShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[CalendarMonthGridShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esmComponentsCalendarMonthGridMod.foo` */
  override def _to: ComponentClassP[CalendarMonthGridShape & js.Object] = default
}
