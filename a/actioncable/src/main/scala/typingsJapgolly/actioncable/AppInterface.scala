package typingsJapgolly.actioncable

import typingsJapgolly.actioncable.ActionCable.Cable
import typingsJapgolly.actioncable.ActionCable.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInterface extends StObject {
  
  var cable: js.UndefOr[Cable] = js.undefined
  
  var network: js.UndefOr[Channel] = js.undefined
}
object AppInterface {
  
  inline def apply(): AppInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInterface]
  }
  
  extension [Self <: AppInterface](x: Self) {
    
    inline def setCable(value: Cable): Self = StObject.set(x, "cable", value.asInstanceOf[js.Any])
    
    inline def setCableUndefined: Self = StObject.set(x, "cable", js.undefined)
    
    inline def setNetwork(value: Channel): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
