package typingsJapgolly.reactBootstrapDatePicker

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrapDatePicker.mod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DatePicker extends Shortcut {
    
    @JSGlobal("DatePicker")
    @js.native
    val ^ : typingsJapgolly.reactBootstrapDatePicker.mod.DatePicker = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("DatePicker")
    @js.native
    open class Class protected ()
      extends Component[DatePickerProps, js.Object, Any] {
      def this(props: DatePickerProps) = this()
      def this(props: DatePickerProps, context: Any) = this()
    }
    
    type _To = typingsJapgolly.reactBootstrapDatePicker.mod.DatePicker
    
    /* This means you don't have to write `^`, but can instead just say `DatePicker.foo` */
    override def _to: typingsJapgolly.reactBootstrapDatePicker.mod.DatePicker = ^
  }
}
