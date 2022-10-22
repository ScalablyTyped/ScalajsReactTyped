package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.CalendarDayShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarDayMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/CalendarDay", JSImport.Default)
  @js.native
  val default: ComponentClassP[CalendarDayShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/CalendarDay", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[CalendarDayShape, js.Object, Any] {
    def this(props: CalendarDayShape) = this()
    def this(props: CalendarDayShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[CalendarDayShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCalendarDayMod.foo` */
  override def _to: ComponentClassP[CalendarDayShape & js.Object] = default
}
