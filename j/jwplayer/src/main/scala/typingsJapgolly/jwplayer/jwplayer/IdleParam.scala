package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.buffering
import typingsJapgolly.jwplayer.jwplayerStrings.paused
import typingsJapgolly.jwplayer.jwplayerStrings.playing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleParam extends StObject {
  
  var oldstate: buffering | playing | paused
}
object IdleParam {
  
  inline def apply(oldstate: buffering | playing | paused): IdleParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleParam]
  }
  
  extension [Self <: IdleParam](x: Self) {
    
    inline def setOldstate(value: buffering | playing | paused): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
  }
}
