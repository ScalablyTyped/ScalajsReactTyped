package typingsJapgolly.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode extends StObject {
  
  var statusCode: js.UndefOr[Double | String] = js.undefined
}
object StatusCode {
  
  inline def apply(): StatusCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCode]
  }
  
  extension [Self <: StatusCode](x: Self) {
    
    inline def setStatusCode(value: Double | String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
