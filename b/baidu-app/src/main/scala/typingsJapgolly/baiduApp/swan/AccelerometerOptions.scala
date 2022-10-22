package typingsJapgolly.baiduApp.swan

import typingsJapgolly.baiduApp.baiduAppStrings.game
import typingsJapgolly.baiduApp.baiduAppStrings.normal
import typingsJapgolly.baiduApp.baiduAppStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var interval: game | ui | normal
}
object AccelerometerOptions {
  
  inline def apply(interval: game | ui | normal): AccelerometerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOptions]
  }
  
  extension [Self <: AccelerometerOptions](x: Self) {
    
    inline def setInterval(value: game | ui | normal): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
