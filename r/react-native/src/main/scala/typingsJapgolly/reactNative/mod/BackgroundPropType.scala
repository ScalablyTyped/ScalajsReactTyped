package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.RippleBackgroundPropType
  - typingsJapgolly.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  inline def RippleBackgroundPropType(borderless: Boolean): typingsJapgolly.reactNative.mod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.RippleBackgroundPropType]
  }
  
  inline def ThemeAttributeBackgroundPropType(attribute: String): typingsJapgolly.reactNative.mod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThemeAttrAndroid")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.ThemeAttributeBackgroundPropType]
  }
}
