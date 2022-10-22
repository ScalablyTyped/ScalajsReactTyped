package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelFooterMod.CalendarPanelFooterProps
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.SelectedDaysType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarPanelFooter {
  
  inline def apply(
    dateToString: SelectedDaysType => String,
    primaryActionDisabled: Boolean,
    primaryActionLabel: String,
    primaryActionOnClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback,
    secondaryActionLabel: String,
    secondaryActionOnClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(dateToString = js.Any.fromFunction1(dateToString), primaryActionDisabled = primaryActionDisabled.asInstanceOf[js.Any], primaryActionLabel = primaryActionLabel.asInstanceOf[js.Any], primaryActionOnClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => primaryActionOnClick(t0).runNow()), secondaryActionLabel = secondaryActionLabel.asInstanceOf[js.Any], secondaryActionOnClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => secondaryActionOnClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CalendarPanelFooterProps]))
  }
  
  @JSImport("wix-style-react", "CalendarPanelFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CalendarPanelFooter] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def selectedDays(value: SelectedDaysType): this.type = set("selectedDays", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarPanelFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
