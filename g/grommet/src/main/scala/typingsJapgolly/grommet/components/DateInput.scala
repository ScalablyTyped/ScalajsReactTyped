package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.EnterCalendar
import typingsJapgolly.grommet.anon.Value
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonType_
import typingsJapgolly.grommet.es6ComponentsCalendarMod.CalendarType
import typingsJapgolly.grommet.es6ComponentsDateInputMod.DateInputExtendedProps
import typingsJapgolly.grommet.es6ComponentsDropMod.DropType
import typingsJapgolly.grommet.es6ComponentsMaskedInputMod.MaskedInputType
import typingsJapgolly.grommet.grommetStrings.`2xl`
import typingsJapgolly.grommet.grommetStrings.`3xl`
import typingsJapgolly.grommet.grommetStrings.`4xl`
import typingsJapgolly.grommet.grommetStrings.`5xl`
import typingsJapgolly.grommet.grommetStrings.`6xl`
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateInput {
  
  @JSImport("grommet/es6", "DateInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonProps(value: ButtonType_): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def calendarProps(value: CalendarType): this.type = set("calendarProps", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dropProps(value: DropType): this.type = set("dropProps", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: MaskedInputType): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def messages(value: EnterCalendar): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ Value => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ Value) => value(t0).runNow()))
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def size(
      value: xsmall | small | medium | large | xlarge | xxlarge | `2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
    ): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def value(value: String | js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: DateInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateInputExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
