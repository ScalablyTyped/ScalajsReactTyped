package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.EncryptedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShareInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** shareTicket */
  var shareTicket: String
  
  @JSName("success")
  def success_MGetShareInfoOptions(res: EncryptedData): Unit
}
object GetShareInfoOptions {
  
  inline def apply(shareTicket: String, success: EncryptedData => Callback): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: EncryptedData) => success(t0).runNow()))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
  
  extension [Self <: GetShareInfoOptions](x: Self) {
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: EncryptedData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: EncryptedData) => value(t0).runNow()))
  }
}
