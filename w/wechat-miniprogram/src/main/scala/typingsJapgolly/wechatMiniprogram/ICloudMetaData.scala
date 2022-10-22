package typingsJapgolly.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloudMetaData extends StObject {
  
  var session_id: String
}
object ICloudMetaData {
  
  inline def apply(session_id: String): ICloudMetaData = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudMetaData]
  }
  
  extension [Self <: ICloudMetaData](x: Self) {
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
