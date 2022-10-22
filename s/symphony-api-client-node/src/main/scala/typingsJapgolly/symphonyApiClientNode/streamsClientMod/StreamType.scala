package typingsJapgolly.symphonyApiClientNode.streamsClientMod

import typingsJapgolly.symphonyApiClientNode.symphonyApiClientNodeStrings.IM
import typingsJapgolly.symphonyApiClientNode.symphonyApiClientNodeStrings.MIM
import typingsJapgolly.symphonyApiClientNode.symphonyApiClientNodeStrings.POST
import typingsJapgolly.symphonyApiClientNode.symphonyApiClientNodeStrings.ROOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamType extends StObject {
  
  var `type`: IM | MIM | ROOM | POST
}
object StreamType {
  
  inline def apply(`type`: IM | MIM | ROOM | POST): StreamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  extension [Self <: StreamType](x: Self) {
    
    inline def setType(value: IM | MIM | ROOM | POST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
