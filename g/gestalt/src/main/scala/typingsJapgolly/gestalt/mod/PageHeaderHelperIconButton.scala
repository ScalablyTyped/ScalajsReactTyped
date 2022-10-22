package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.anon.DangerouslyDisableOnNavigationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderHelperIconButton extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  def onClick(args: DangerouslyDisableOnNavigationEvent): Unit
}
object PageHeaderHelperIconButton {
  
  inline def apply(onClick: DangerouslyDisableOnNavigationEvent => Callback): PageHeaderHelperIconButton = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: DangerouslyDisableOnNavigationEvent) => onClick(t0).runNow()))
    __obj.asInstanceOf[PageHeaderHelperIconButton]
  }
  
  extension [Self <: PageHeaderHelperIconButton](x: Self) {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setOnClick(value: DangerouslyDisableOnNavigationEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: DangerouslyDisableOnNavigationEvent) => value(t0).runNow()))
  }
}
