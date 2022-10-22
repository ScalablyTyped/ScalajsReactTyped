package typingsJapgolly.reactAddToCalendar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAddToCalendar.mod.AddToCalendarEvent
import typingsJapgolly.reactAddToCalendar.mod.AddToCalendarProps
import typingsJapgolly.reactAddToCalendar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAddToCalendar {
  
  inline def apply(event: AddToCalendarEvent): Builder = {
    val __props = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AddToCalendarProps]))
  }
  
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def buttonClassClosed(value: String): this.type = set("buttonClassClosed", value.asInstanceOf[js.Any])
    
    inline def buttonClassOpen(value: String): this.type = set("buttonClassOpen", value.asInstanceOf[js.Any])
    
    inline def buttonIconClass(value: String): this.type = set("buttonIconClass", value.asInstanceOf[js.Any])
    
    inline def buttonLabel(value: String): this.type = set("buttonLabel", value.asInstanceOf[js.Any])
    
    inline def buttonTemplate(value: Any): this.type = set("buttonTemplate", value.asInstanceOf[js.Any])
    
    inline def buttonWrapperClass(value: String): this.type = set("buttonWrapperClass", value.asInstanceOf[js.Any])
    
    inline def displayItemIcons(value: Boolean): this.type = set("displayItemIcons", value.asInstanceOf[js.Any])
    
    inline def dropdownClass(value: String): this.type = set("dropdownClass", value.asInstanceOf[js.Any])
    
    inline def listItems(value: js.Array[Any]): this.type = set("listItems", value.asInstanceOf[js.Any])
    
    inline def listItemsVarargs(value: Any*): this.type = set("listItems", js.Array(value*))
    
    inline def optionsOpen(value: Boolean): this.type = set("optionsOpen", value.asInstanceOf[js.Any])
    
    inline def rootClass(value: String): this.type = set("rootClass", value.asInstanceOf[js.Any])
    
    inline def useFontAwesomeIcons(value: Boolean): this.type = set("useFontAwesomeIcons", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AddToCalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
