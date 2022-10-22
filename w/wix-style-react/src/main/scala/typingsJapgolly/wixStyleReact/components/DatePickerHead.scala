package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.LeftArrowAriaLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerHead {
  
  inline def apply(
    className: Any,
    date: Any,
    leftArrowAriaLabel: Any,
    leftArrowAriaLabelledBy: Any,
    locale: Any,
    localeUtils: Any,
    monthDropdownAriaLabel: Any,
    monthDropdownAriaLabelledBy: Any,
    onChange: Any,
    onLeftArrowClick: Any,
    onRightArrowClick: Any,
    rightArrowAriaLabel: Any,
    rightArrowAriaLabelledBy: Any,
    showMonthDropdown: Any,
    showYearDropdown: Any,
    size: Any,
    yearDropdownAriaLabel: Any,
    yearDropdownAriaLabelledBy: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], leftArrowAriaLabel = leftArrowAriaLabel.asInstanceOf[js.Any], leftArrowAriaLabelledBy = leftArrowAriaLabelledBy.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], monthDropdownAriaLabel = monthDropdownAriaLabel.asInstanceOf[js.Any], monthDropdownAriaLabelledBy = monthDropdownAriaLabelledBy.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onLeftArrowClick = onLeftArrowClick.asInstanceOf[js.Any], onRightArrowClick = onRightArrowClick.asInstanceOf[js.Any], rightArrowAriaLabel = rightArrowAriaLabel.asInstanceOf[js.Any], rightArrowAriaLabelledBy = rightArrowAriaLabelledBy.asInstanceOf[js.Any], showMonthDropdown = showMonthDropdown.asInstanceOf[js.Any], showYearDropdown = showYearDropdown.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], yearDropdownAriaLabel = yearDropdownAriaLabel.asInstanceOf[js.Any], yearDropdownAriaLabelledBy = yearDropdownAriaLabelledBy.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LeftArrowAriaLabel]))
  }
  
  @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LeftArrowAriaLabel): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
