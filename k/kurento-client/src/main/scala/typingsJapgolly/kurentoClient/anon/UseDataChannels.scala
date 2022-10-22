package typingsJapgolly.kurentoClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseDataChannels extends StObject {
  
  var useDataChannels: js.UndefOr[Boolean] = js.undefined
}
object UseDataChannels {
  
  inline def apply(): UseDataChannels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDataChannels]
  }
  
  extension [Self <: UseDataChannels](x: Self) {
    
    inline def setUseDataChannels(value: Boolean): Self = StObject.set(x, "useDataChannels", value.asInstanceOf[js.Any])
    
    inline def setUseDataChannelsUndefined: Self = StObject.set(x, "useDataChannels", js.undefined)
  }
}
