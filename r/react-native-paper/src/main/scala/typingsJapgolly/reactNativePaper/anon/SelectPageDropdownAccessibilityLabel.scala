package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectPageDropdownAccessibilityLabel extends StObject {
  
  /**
    * AccessibilityLabel for `label`.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label text to display which indicates current pagination.
    */
  var label: js.UndefOr[Node] = js.undefined
  
  /**
    * AccessibilityLabel for `selectPageDropdownLabel`.
    */
  var selectPageDropdownAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label text for select page dropdown to display.
    */
  var selectPageDropdownLabel: js.UndefOr[Node] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object SelectPageDropdownAccessibilityLabel {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): SelectPageDropdownAccessibilityLabel = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPageDropdownAccessibilityLabel]
  }
  
  extension [Self <: SelectPageDropdownAccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelectPageDropdownAccessibilityLabel(value: String): Self = StObject.set(x, "selectPageDropdownAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setSelectPageDropdownAccessibilityLabelUndefined: Self = StObject.set(x, "selectPageDropdownAccessibilityLabel", js.undefined)
    
    inline def setSelectPageDropdownLabel(value: VdomNode): Self = StObject.set(x, "selectPageDropdownLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSelectPageDropdownLabelNull: Self = StObject.set(x, "selectPageDropdownLabel", null)
    
    inline def setSelectPageDropdownLabelUndefined: Self = StObject.set(x, "selectPageDropdownLabel", js.undefined)
    
    inline def setSelectPageDropdownLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectPageDropdownLabel", js.Array(value*))
    
    inline def setSelectPageDropdownLabelVdomElement(value: VdomElement): Self = StObject.set(x, "selectPageDropdownLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
