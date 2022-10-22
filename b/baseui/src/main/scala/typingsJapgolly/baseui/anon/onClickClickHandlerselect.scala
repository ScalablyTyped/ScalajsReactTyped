package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.checkbox
import typingsJapgolly.baseui.baseuiStrings.circle
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.radio
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.baseui.buttonGroupTypesMod.ButtonGroupOverrides
import typingsJapgolly.baseui.buttonGroupTypesMod.ClickHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  onClick :baseui.baseui/button-group/types.ClickHandler,   selected :number | std.Array<number>} & std.Omit<baseui.baseui/button-group/types.ButtonGroupProps, 'children'> */
trait onClickClickHandlerselect extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
  
  var mode: js.UndefOr[radio | checkbox] = js.undefined
  
  var onClick: ClickHandler & js.UndefOr[ClickHandler]
  
  var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
  
  var selected: (Double | js.Array[Double]) & (js.UndefOr[Double | js.Array[Double]])
  
  var shape: js.UndefOr[pill | default_ | square | round_ | circle] = js.undefined
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
}
object onClickClickHandlerselect {
  
  inline def apply(
    onClick: ClickHandler & js.UndefOr[ClickHandler],
    selected: (Double | js.Array[Double]) & (js.UndefOr[Double | js.Array[Double]])
  ): onClickClickHandlerselect = {
    val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[onClickClickHandlerselect]
  }
  
  extension [Self <: onClickClickHandlerselect](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setKind(value: primary | secondary | tertiary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMode(value: radio | checkbox): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnClick(value: ClickHandler & js.UndefOr[ClickHandler]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: ButtonGroupOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSelected(value: (Double | js.Array[Double]) & (js.UndefOr[Double | js.Array[Double]])): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setShape(value: pill | default_ | square | round_ | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
