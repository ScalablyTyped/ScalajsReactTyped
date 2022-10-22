package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerAndroidOnPageScrollEventData extends StObject {
  
  var offset: Double
  
  var position: Double
}
object ViewPagerAndroidOnPageScrollEventData {
  
  inline def apply(offset: Double, position: Double): ViewPagerAndroidOnPageScrollEventData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPagerAndroidOnPageScrollEventData]
  }
  
  extension [Self <: ViewPagerAndroidOnPageScrollEventData](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
