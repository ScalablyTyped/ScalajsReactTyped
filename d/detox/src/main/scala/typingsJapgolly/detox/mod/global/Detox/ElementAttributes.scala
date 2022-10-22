package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Element Attributes Shared Among iOS and Android
trait ElementAttributes extends StObject {
  
  /**
    * Whether or not the element is enabled for user interaction.
    */
  var enabled: Boolean
  
  /**
    * The identifier of the element. Matches accessibilityIdentifier on iOS, and the main view tag, on Android - both commonly holding the component's test ID in React Native apps.
    */
  var identifier: String
  
  /**
    * The label of the element. Matches accessibilityLabel for ios, and contentDescription for android.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The placeholder text value of the element. Matches hint on android.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * The text value of any textual element.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the element, where applicable.
    * Matches accessibilityValue, on iOS.
    * For example: the position of a slider, or whether a checkbox has been marked (Android).
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether the element is visible. On iOS, visibility is calculated for the activation point. On Android, the attribute directly holds the value returned by View.getLocalVisibleRect()).
    */
  var visible: Boolean
}
object ElementAttributes {
  
  inline def apply(enabled: Boolean, identifier: String, visible: Boolean): ElementAttributes = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributes]
  }
  
  extension [Self <: ElementAttributes](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
