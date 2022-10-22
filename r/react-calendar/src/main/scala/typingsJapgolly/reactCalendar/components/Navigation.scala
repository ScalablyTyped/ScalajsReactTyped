package typingsJapgolly.reactCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendar.mod.NavigationLabelType
import typingsJapgolly.reactCalendar.mod.NavigationProps
import typingsJapgolly.reactCalendar.mod.ViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigation {
  
  inline def apply(
    activeStartDate: js.Date,
    drillUp: Callback,
    setActiveStartDate: js.Date => Callback,
    view: ViewType,
    views: js.Array[ViewType]
  ): Builder = {
    val __props = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], drillUp = drillUp.toJsFn, setActiveStartDate = js.Any.fromFunction1((t0: js.Date) => setActiveStartDate(t0).runNow()), view = view.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavigationProps]))
  }
  
  @JSImport("react-calendar", "Navigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def formatMonthYear(value: (/* locale */ String, /* date */ js.Date) => Callback): this.type = set("formatMonthYear", js.Any.fromFunction2((t0: /* locale */ String, t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
    
    inline def formatYear(value: (/* locale */ String, /* date */ js.Date) => Callback): this.type = set("formatYear", js.Any.fromFunction2((t0: /* locale */ String, t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def navigationAriaLabel(value: VdomNode): this.type = set("navigationAriaLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def navigationAriaLabelNull: this.type = set("navigationAriaLabel", null)
    
    inline def navigationAriaLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("navigationAriaLabel", js.Array(value*))
    
    inline def navigationAriaLabelVdomElement(value: VdomElement): this.type = set("navigationAriaLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def navigationAriaLive(value: VdomNode): this.type = set("navigationAriaLive", value.rawNode.asInstanceOf[js.Any])
    
    inline def navigationAriaLiveNull: this.type = set("navigationAriaLive", null)
    
    inline def navigationAriaLiveVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("navigationAriaLive", js.Array(value*))
    
    inline def navigationAriaLiveVdomElement(value: VdomElement): this.type = set("navigationAriaLive", value.rawElement.asInstanceOf[js.Any])
    
    inline def navigationLabel(value: /* props */ NavigationLabelType => String): this.type = set("navigationLabel", js.Any.fromFunction1(value))
    
    inline def next2AriaLabel(value: String): this.type = set("next2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def next2Label(value: VdomNode): this.type = set("next2Label", value.rawNode.asInstanceOf[js.Any])
    
    inline def next2LabelNull: this.type = set("next2Label", null)
    
    inline def next2LabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("next2Label", js.Array(value*))
    
    inline def next2LabelVdomElement(value: VdomElement): this.type = set("next2Label", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextAriaLabel(value: String): this.type = set("nextAriaLabel", value.asInstanceOf[js.Any])
    
    inline def nextLabel(value: VdomNode): this.type = set("nextLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def nextLabelNull: this.type = set("nextLabel", null)
    
    inline def nextLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextLabel", js.Array(value*))
    
    inline def nextLabelVdomElement(value: VdomElement): this.type = set("nextLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def prev2AriaLabel(value: String): this.type = set("prev2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def prev2Label(value: VdomNode): this.type = set("prev2Label", value.rawNode.asInstanceOf[js.Any])
    
    inline def prev2LabelNull: this.type = set("prev2Label", null)
    
    inline def prev2LabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prev2Label", js.Array(value*))
    
    inline def prev2LabelVdomElement(value: VdomElement): this.type = set("prev2Label", value.rawElement.asInstanceOf[js.Any])
    
    inline def prevAriaLabel(value: VdomNode): this.type = set("prevAriaLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def prevAriaLabelNull: this.type = set("prevAriaLabel", null)
    
    inline def prevAriaLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevAriaLabel", js.Array(value*))
    
    inline def prevAriaLabelVdomElement(value: VdomElement): this.type = set("prevAriaLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def prevLabel(value: VdomNode): this.type = set("prevLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def prevLabelNull: this.type = set("prevLabel", null)
    
    inline def prevLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevLabel", js.Array(value*))
    
    inline def prevLabelVdomElement(value: VdomElement): this.type = set("prevLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def showDoubleView(value: Boolean): this.type = set("showDoubleView", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
