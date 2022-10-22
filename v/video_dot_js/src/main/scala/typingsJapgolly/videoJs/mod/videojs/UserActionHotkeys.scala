package typingsJapgolly.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserActionHotkeys extends StObject {
  
  var fullscreenKey: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  
  var muteKey: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  
  var playPauseKey: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
}
object UserActionHotkeys {
  
  inline def apply(): UserActionHotkeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActionHotkeys]
  }
  
  extension [Self <: UserActionHotkeys](x: Self) {
    
    inline def setFullscreenKey(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "fullscreenKey", js.Any.fromFunction1(value))
    
    inline def setFullscreenKeyUndefined: Self = StObject.set(x, "fullscreenKey", js.undefined)
    
    inline def setMuteKey(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "muteKey", js.Any.fromFunction1(value))
    
    inline def setMuteKeyUndefined: Self = StObject.set(x, "muteKey", js.undefined)
    
    inline def setPlayPauseKey(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "playPauseKey", js.Any.fromFunction1(value))
    
    inline def setPlayPauseKeyUndefined: Self = StObject.set(x, "playPauseKey", js.undefined)
  }
}
