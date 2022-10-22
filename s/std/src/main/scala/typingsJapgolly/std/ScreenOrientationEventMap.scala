package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenOrientationEventMap extends StObject {
  
  /* standard dom */
  var change: org.scalajs.dom.Event
}
object ScreenOrientationEventMap {
  
  inline def apply(change: org.scalajs.dom.Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
  
  extension [Self <: ScreenOrientationEventMap](x: Self) {
    
    inline def setChange(value: org.scalajs.dom.Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
