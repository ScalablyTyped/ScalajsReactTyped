package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsJapgolly.blueprintjsDatetime.libEsmShortcutsMod.DateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.libEsmShortcutsMod.IShortcutsProps
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shortcuts {
  
  inline def apply(
    allowSingleDayRange: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onShortcutClick: (DateRangeShortcut, Double) => Callback,
    shortcuts: js.Array[DateRangeShortcut] | `true`,
    timePrecision: TimePrecision
  ): Builder = {
    val __props = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2((t0: DateRangeShortcut, t1: Double) => (onShortcutClick(t0, t1)).runNow()), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IShortcutsProps]))
  }
  
  @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.libEsmShortcutsMod.Shortcuts] {
    
    inline def selectedShortcutIndex(value: Double): this.type = set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    inline def useSingleDateShortcuts(value: Boolean): this.type = set("useSingleDateShortcuts", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IShortcutsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
