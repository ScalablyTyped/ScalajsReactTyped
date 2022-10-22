package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerInts.`0`
import typingsJapgolly.jwplayer.jwplayerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstFrameParam extends StObject {
  
  var loadTime: Double
  
  var viewable: `0` | `1`
}
object FirstFrameParam {
  
  inline def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
  
  extension [Self <: FirstFrameParam](x: Self) {
    
    inline def setLoadTime(value: Double): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
    
    inline def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
