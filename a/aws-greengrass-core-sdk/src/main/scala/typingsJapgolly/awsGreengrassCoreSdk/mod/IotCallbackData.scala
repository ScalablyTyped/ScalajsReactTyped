package typingsJapgolly.awsGreengrassCoreSdk.mod

import org.scalajs.dom.Blob
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotCallbackData extends StObject {
  
  var payload: Buffer | Blob | String | ArrayLike[Any]
}
object IotCallbackData {
  
  inline def apply(payload: Buffer | Blob | String | ArrayLike[Any]): IotCallbackData = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotCallbackData]
  }
  
  extension [Self <: IotCallbackData](x: Self) {
    
    inline def setPayload(value: Buffer | Blob | String | ArrayLike[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
