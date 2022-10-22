package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponderProvided extends StObject {
  
  var announce: Announce
}
object ResponderProvided {
  
  inline def apply(announce: /* message */ String => Callback): ResponderProvided = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1((t0: /* message */ String) => announce(t0).runNow()))
    __obj.asInstanceOf[ResponderProvided]
  }
  
  extension [Self <: ResponderProvided](x: Self) {
    
    inline def setAnnounce(value: /* message */ String => Callback): Self = StObject.set(x, "announce", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
  }
}
