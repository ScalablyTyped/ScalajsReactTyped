package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISplashScreen extends StObject {
  
  var imageLocation: Rect
  
  var ondismissed: Any
}
object ISplashScreen {
  
  inline def apply(imageLocation: Rect, ondismissed: Any): ISplashScreen = {
    val __obj = js.Dynamic.literal(imageLocation = imageLocation.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplashScreen]
  }
  
  extension [Self <: ISplashScreen](x: Self) {
    
    inline def setImageLocation(value: Rect): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    inline def setOndismissed(value: Any): Self = StObject.set(x, "ondismissed", value.asInstanceOf[js.Any])
  }
}
