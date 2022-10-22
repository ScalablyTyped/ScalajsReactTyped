package typingsJapgolly.jquery.anon

import typingsJapgolly.jquery.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration
  extends StObject
     with _SpeedSettings[Any] {
  
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typingsJapgolly.jquery.JQuery.Duration
}
object Duration {
  
  inline def apply(duration: typingsJapgolly.jquery.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: typingsJapgolly.jquery.JQuery.Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
