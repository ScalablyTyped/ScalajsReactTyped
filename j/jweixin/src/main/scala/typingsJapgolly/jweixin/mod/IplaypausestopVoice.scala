package typingsJapgolly.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IplaypausestopVoice
  extends StObject
     with BaseParams {
  
  var localId: String
}
object IplaypausestopVoice {
  
  inline def apply(localId: String): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IplaypausestopVoice]
  }
  
  extension [Self <: IplaypausestopVoice](x: Self) {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
  }
}
