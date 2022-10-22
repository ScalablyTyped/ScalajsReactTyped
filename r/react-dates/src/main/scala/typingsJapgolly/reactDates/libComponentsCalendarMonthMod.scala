package typingsJapgolly.reactDates

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDates.mod.CalendarMonthShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarMonthMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/CalendarMonth", JSImport.Default)
  @js.native
  val default: ComponentClassP[CalendarMonthShape & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-dates/lib/components/CalendarMonth", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[CalendarMonthShape, js.Object, Any] {
    def this(props: CalendarMonthShape) = this()
    def this(props: CalendarMonthShape, context: Any) = this()
  }
  
  type _To = ComponentClassP[CalendarMonthShape & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCalendarMonthMod.foo` */
  override def _to: ComponentClassP[CalendarMonthShape & js.Object] = default
}
