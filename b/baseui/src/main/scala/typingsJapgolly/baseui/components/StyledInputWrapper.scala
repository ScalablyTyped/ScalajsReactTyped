package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.separateRangeInputsboolea
import typingsJapgolly.baseui.datepickerTypesMod.Density
import typingsJapgolly.baseui.datepickerTypesMod.InputRole
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledInputWrapper {
  
  inline def apply[C /* <: ElementType */](
    $date: Any,
    $density: Density,
    $hasLockedBehavior: Boolean,
    $separateRangeInputs: Boolean,
    $value: js.Date | js.Array[js.Date]
  ): Builder[C] = {
    val __props = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $density = $density.asInstanceOf[js.Any], $hasLockedBehavior = $hasLockedBehavior.asInstanceOf[js.Any], $separateRangeInputs = $separateRangeInputs.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, separateRangeInputsboolea])]))
  }
  
  @JSImport("baseui/datepicker", "StyledInputWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
    
    inline def $disabledNull: this.type = set("$disabled", null)
    
    inline def $endDate(value: Boolean): this.type = set("$endDate", value.asInstanceOf[js.Any])
    
    inline def $endDateNull: this.type = set("$endDate", null)
    
    inline def $endOfMonth(value: Boolean): this.type = set("$endOfMonth", value.asInstanceOf[js.Any])
    
    inline def $endOfMonthNull: this.type = set("$endOfMonth", null)
    
    inline def $hasDateLabel(value: Boolean): this.type = set("$hasDateLabel", value.asInstanceOf[js.Any])
    
    inline def $hasDateLabelNull: this.type = set("$hasDateLabel", null)
    
    inline def $hasRangeHighlighted(value: Boolean): this.type = set("$hasRangeHighlighted", value.asInstanceOf[js.Any])
    
    inline def $hasRangeHighlightedNull: this.type = set("$hasRangeHighlighted", null)
    
    inline def $hasRangeOnRight(value: Boolean): this.type = set("$hasRangeOnRight", value.asInstanceOf[js.Any])
    
    inline def $hasRangeOnRightNull: this.type = set("$hasRangeOnRight", null)
    
    inline def $hasRangeSelected(value: Boolean): this.type = set("$hasRangeSelected", value.asInstanceOf[js.Any])
    
    inline def $hasRangeSelectedNull: this.type = set("$hasRangeSelected", null)
    
    inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def $isFocusVisibleNull: this.type = set("$isFocusVisible", null)
    
    inline def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def $isHighlightedNull: this.type = set("$isHighlighted", null)
    
    inline def $isHovered(value: Boolean): this.type = set("$isHovered", value.asInstanceOf[js.Any])
    
    inline def $isHoveredNull: this.type = set("$isHovered", null)
    
    inline def $month(value: Double): this.type = set("$month", value.asInstanceOf[js.Any])
    
    inline def $monthNull: this.type = set("$month", null)
    
    inline def $order(value: Double): this.type = set("$order", value.asInstanceOf[js.Any])
    
    inline def $orderNull: this.type = set("$order", null)
    
    inline def $outsideMonth(value: Boolean): this.type = set("$outsideMonth", value.asInstanceOf[js.Any])
    
    inline def $outsideMonthNull: this.type = set("$outsideMonth", null)
    
    inline def $outsideMonthWithinRange(value: Boolean): this.type = set("$outsideMonthWithinRange", value.asInstanceOf[js.Any])
    
    inline def $outsideMonthWithinRangeNull: this.type = set("$outsideMonthWithinRange", null)
    
    inline def $peekNextMonth(value: Boolean): this.type = set("$peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def $peekNextMonthNull: this.type = set("$peekNextMonth", null)
    
    inline def $pseudoHighlighted(value: Boolean): this.type = set("$pseudoHighlighted", value.asInstanceOf[js.Any])
    
    inline def $pseudoHighlightedNull: this.type = set("$pseudoHighlighted", null)
    
    inline def $pseudoSelected(value: Boolean): this.type = set("$pseudoSelected", value.asInstanceOf[js.Any])
    
    inline def $pseudoSelectedNull: this.type = set("$pseudoSelected", null)
    
    inline def $range(value: Boolean): this.type = set("$range", value.asInstanceOf[js.Any])
    
    inline def $rangeNull: this.type = set("$range", null)
    
    inline def $selected(value: Boolean): this.type = set("$selected", value.asInstanceOf[js.Any])
    
    inline def $selectedInput(value: InputRole): this.type = set("$selectedInput", value.asInstanceOf[js.Any])
    
    inline def $selectedInputNull: this.type = set("$selectedInput", null)
    
    inline def $selectedNull: this.type = set("$selected", null)
    
    inline def $startDate(value: Boolean): this.type = set("$startDate", value.asInstanceOf[js.Any])
    
    inline def $startDateNull: this.type = set("$startDate", null)
    
    inline def $startOfMonth(value: Boolean): this.type = set("$startOfMonth", value.asInstanceOf[js.Any])
    
    inline def $startOfMonthNull: this.type = set("$startOfMonth", null)
    
    inline def $style(value: StyleObject | (js.Function1[separateRangeInputsboolea, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: separateRangeInputsboolea => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, separateRangeInputsboolea])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
