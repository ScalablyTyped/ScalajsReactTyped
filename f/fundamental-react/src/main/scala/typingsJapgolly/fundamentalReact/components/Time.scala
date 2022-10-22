package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.Hour
import typingsJapgolly.fundamentalReact.anon.MeridiemAM
import typingsJapgolly.fundamentalReact.libTimeTimeMod.TimeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  @JSImport("fundamental-react", "Time")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.Time] {
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format12Hours(value: Boolean): this.type = set("format12Hours", value.asInstanceOf[js.Any])
    
    inline def hoursDownButtonProps(value: Any): this.type = set("hoursDownButtonProps", value.asInstanceOf[js.Any])
    
    inline def hoursInputProps(value: Any): this.type = set("hoursInputProps", value.asInstanceOf[js.Any])
    
    inline def hoursUpButtonProps(value: Any): this.type = set("hoursUpButtonProps", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def localizedText(value: MeridiemAM): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    inline def meridiemDownButtonProps(value: Any): this.type = set("meridiemDownButtonProps", value.asInstanceOf[js.Any])
    
    inline def meridiemInputProps(value: Any): this.type = set("meridiemInputProps", value.asInstanceOf[js.Any])
    
    inline def meridiemUpButtonProps(value: Any): this.type = set("meridiemUpButtonProps", value.asInstanceOf[js.Any])
    
    inline def minutesDownButtonProps(value: Any): this.type = set("minutesDownButtonProps", value.asInstanceOf[js.Any])
    
    inline def minutesInputProps(value: Any): this.type = set("minutesInputProps", value.asInstanceOf[js.Any])
    
    inline def minutesUpButtonProps(value: Any): this.type = set("minutesUpButtonProps", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* time */ Hour => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* time */ Hour) => value(t0).runNow()))
    
    inline def secondsDownButtonProps(value: Any): this.type = set("secondsDownButtonProps", value.asInstanceOf[js.Any])
    
    inline def secondsInputProps(value: Any): this.type = set("secondsInputProps", value.asInstanceOf[js.Any])
    
    inline def secondsUpButtonProps(value: Any): this.type = set("secondsUpButtonProps", value.asInstanceOf[js.Any])
    
    inline def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    
    inline def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    
    inline def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    
    inline def spinners(value: Boolean): this.type = set("spinners", value.asInstanceOf[js.Any])
    
    inline def time(value: Hour): this.type = set("time", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Time.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
