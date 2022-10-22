package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.OnChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YearDropdown {
  
  inline def apply(ariaLabel: Any, ariaLabelledBy: Any, className: Any, date: Any, onChange: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelledBy = ariaLabelledBy.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OnChange]))
  }
  
  @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/YearDropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnChange): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
