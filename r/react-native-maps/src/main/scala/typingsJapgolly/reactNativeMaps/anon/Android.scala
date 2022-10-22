package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.ImplementationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android extends StObject {
  
  var android: ImplementationStatus
  
  var ios: ImplementationStatus
}
object Android {
  
  inline def apply(android: ImplementationStatus, ios: ImplementationStatus): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  extension [Self <: Android](x: Self) {
    
    inline def setAndroid(value: ImplementationStatus): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: ImplementationStatus): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
