package typingsJapgolly.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWindows.rntypesMod.RippleBackgroundPropType
  - typingsJapgolly.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  inline def RippleBackgroundPropType(borderless: Boolean): typingsJapgolly.reactNativeWindows.rntypesMod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RippleAndroid")
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.rntypesMod.RippleBackgroundPropType]
  }
  
  inline def ThemeAttributeBackgroundPropType(attribute: String): typingsJapgolly.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThemeAttrAndroid")
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType]
  }
}
