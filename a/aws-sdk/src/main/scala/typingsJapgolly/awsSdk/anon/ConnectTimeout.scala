package typingsJapgolly.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectTimeout extends StObject {
  
  /**
    * Connection timeout in milliseconds.
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object ConnectTimeout {
  
  inline def apply(): ConnectTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectTimeout]
  }
  
  extension [Self <: ConnectTimeout](x: Self) {
    
    inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
