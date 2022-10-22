package typingsJapgolly.matrixJsSdk.mod

import typingsJapgolly.matrixJsSdk.anon.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushAction extends StObject {
  
  @JSName("notify")
  var notify_FPushAction: Boolean
  
  var tweaks: Highlight
}
object PushAction {
  
  inline def apply(notify_ : Boolean, tweaks: Highlight): PushAction = {
    val __obj = js.Dynamic.literal(tweaks = tweaks.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushAction]
  }
  
  extension [Self <: PushAction](x: Self) {
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setTweaks(value: Highlight): Self = StObject.set(x, "tweaks", value.asInstanceOf[js.Any])
  }
}
