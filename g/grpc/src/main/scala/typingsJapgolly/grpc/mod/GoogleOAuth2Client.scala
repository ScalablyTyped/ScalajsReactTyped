package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleOAuth2Client extends StObject {
  
  def getRequestMetadata(optUri: String, metadataCallback: js.Function2[/* err */ js.Error, /* headers */ Any, Unit]): Unit
}
object GoogleOAuth2Client {
  
  inline def apply(
    getRequestMetadata: (String, js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => Callback
  ): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => (getRequestMetadata(t0, t1)).runNow()))
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
  
  extension [Self <: GoogleOAuth2Client](x: Self) {
    
    inline def setGetRequestMetadata(value: (String, js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => Callback): Self = StObject.set(x, "getRequestMetadata", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => (value(t0, t1)).runNow()))
  }
}
