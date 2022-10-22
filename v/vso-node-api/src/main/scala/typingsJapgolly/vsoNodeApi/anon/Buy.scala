package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buy extends StObject {
  
  var buy: scala.Double
  
  var get: scala.Double
  
  var install: scala.Double
  
  var none: scala.Double
  
  var purchaseRequest: scala.Double
  
  var request: scala.Double
  
  var `try`: scala.Double
}
object Buy {
  
  inline def apply(
    buy: scala.Double,
    get: scala.Double,
    install: scala.Double,
    none: scala.Double,
    purchaseRequest: scala.Double,
    request: scala.Double,
    `try`: scala.Double
  ): Buy = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], purchaseRequest = purchaseRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buy]
  }
  
  extension [Self <: Buy](x: Self) {
    
    inline def setBuy(value: scala.Double): Self = StObject.set(x, "buy", value.asInstanceOf[js.Any])
    
    inline def setGet(value: scala.Double): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setInstall(value: scala.Double): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPurchaseRequest(value: scala.Double): Self = StObject.set(x, "purchaseRequest", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: scala.Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTry(value: scala.Double): Self = StObject.set(x, "try", value.asInstanceOf[js.Any])
  }
}
