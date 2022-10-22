package typingsJapgolly.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMuteChangeRequestedEventArgs extends StObject {
  
  var mute: Boolean
}
object IMuteChangeRequestedEventArgs {
  
  inline def apply(mute: Boolean): IMuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMuteChangeRequestedEventArgs]
  }
  
  extension [Self <: IMuteChangeRequestedEventArgs](x: Self) {
    
    inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
  }
}
