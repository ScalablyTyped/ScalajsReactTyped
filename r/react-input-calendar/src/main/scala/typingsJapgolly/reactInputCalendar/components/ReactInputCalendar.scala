package typingsJapgolly.reactInputCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInputCalendar.mod.^
import typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInputCalendar {
  
  @JSImport("react-input-calendar", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def computableFormat(value: String): this.type = set("computableFormat", value.asInstanceOf[js.Any])
    
    inline def date(value: String | js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def inputFieldClass(value: String): this.type = set("inputFieldClass", value.asInstanceOf[js.Any])
    
    inline def inputFieldId(value: String): this.type = set("inputFieldId", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: String | js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: String | js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minView(value: Double): this.type = set("minView", value.asInstanceOf[js.Any])
    
    inline def onBlur(
      value: (/* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], /* computableDate */ String) => Callback
    ): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], t1: /* computableDate */ String) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: /* computableDate */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* computableDate */ String) => value(t0).runNow()))
    
    inline def onFocus(
      value: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element] => Callback
    ): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element]) => value(t0).runNow()))
    
    inline def openOnInputFocus(value: Boolean): this.type = set("openOnInputFocus", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactInputCalendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactInputCalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
