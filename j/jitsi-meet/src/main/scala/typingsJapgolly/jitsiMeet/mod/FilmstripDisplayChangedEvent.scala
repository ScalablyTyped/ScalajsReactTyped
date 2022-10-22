package typingsJapgolly.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilmstripDisplayChangedEvent extends StObject {
  
  var visible: Boolean
}
object FilmstripDisplayChangedEvent {
  
  inline def apply(visible: Boolean): FilmstripDisplayChangedEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilmstripDisplayChangedEvent]
  }
  
  extension [Self <: FilmstripDisplayChangedEvent](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
