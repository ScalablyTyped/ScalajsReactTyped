package typingsJapgolly.reactNativeElements

import typingsJapgolly.reactNativeElements.anon.Brand
import typingsJapgolly.reactNativeElements.anon.Solid
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersGetIconStyleMod {
  
  @JSImport("react-native-elements/dist/helpers/getIconStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: IconType, extraProps: Any): Brand | Solid = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Brand | Solid]
}
