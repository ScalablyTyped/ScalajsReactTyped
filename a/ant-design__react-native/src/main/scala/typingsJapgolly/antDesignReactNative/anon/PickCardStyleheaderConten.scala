package typingsJapgolly.antDesignReactNative.anon

import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'headerContentWrap' | 'headerContent' | 'headerExtraWrap' | 'headerExtra' | 'headerImage' | 'headerTitle' | 'headerWrap'> */
trait PickCardStyleheaderConten extends StObject {
  
  var headerContent: TextStyle
  
  var headerContentWrap: ViewStyle
  
  var headerExtra: TextStyle
  
  var headerExtraWrap: ViewStyle
  
  var headerImage: ImageStyle
  
  var headerTitle: ViewStyle
  
  var headerWrap: ViewStyle
}
object PickCardStyleheaderConten {
  
  inline def apply(
    headerContent: TextStyle,
    headerContentWrap: ViewStyle,
    headerExtra: TextStyle,
    headerExtraWrap: ViewStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): PickCardStyleheaderConten = {
    val __obj = js.Dynamic.literal(headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStyleheaderConten]
  }
  
  extension [Self <: PickCardStyleheaderConten](x: Self) {
    
    inline def setHeaderContent(value: TextStyle): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
    
    inline def setHeaderContentWrap(value: ViewStyle): Self = StObject.set(x, "headerContentWrap", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtra(value: TextStyle): Self = StObject.set(x, "headerExtra", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtraWrap(value: ViewStyle): Self = StObject.set(x, "headerExtraWrap", value.asInstanceOf[js.Any])
    
    inline def setHeaderImage(value: ImageStyle): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitle(value: ViewStyle): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    
    inline def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
  }
}
