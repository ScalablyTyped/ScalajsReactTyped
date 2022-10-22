package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerInts.`0`
import typingsJapgolly.jwplayer.jwplayerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeParam extends StObject {
  
  var duration: Double
  
  var position: Double
  
  var viewable: `0` | `1`
}
object TimeParam {
  
  inline def apply(duration: Double, position: Double, viewable: `0` | `1`): TimeParam = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeParam]
  }
  
  extension [Self <: TimeParam](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
