package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerAndroidOnPageSelectedEventData extends StObject {
  
  var position: Double
}
object ViewPagerAndroidOnPageSelectedEventData {
  
  inline def apply(position: Double): ViewPagerAndroidOnPageSelectedEventData = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPagerAndroidOnPageSelectedEventData]
  }
  
  extension [Self <: ViewPagerAndroidOnPageSelectedEventData](x: Self) {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
