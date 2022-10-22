package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Budget Orders
trait BillingAccount extends StObject {
  
  def getId(): Double
  
  def getName(): String
  
  def getPrimaryBillingId(): String
  
  def getSecondaryBillingId(): String
}
object BillingAccount {
  
  inline def apply(
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getPrimaryBillingId: CallbackTo[String],
    getSecondaryBillingId: CallbackTo[String]
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getName = getName.toJsFn, getPrimaryBillingId = getPrimaryBillingId.toJsFn, getSecondaryBillingId = getSecondaryBillingId.toJsFn)
    __obj.asInstanceOf[BillingAccount]
  }
  
  extension [Self <: BillingAccount](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPrimaryBillingId(value: CallbackTo[String]): Self = StObject.set(x, "getPrimaryBillingId", value.toJsFn)
    
    inline def setGetSecondaryBillingId(value: CallbackTo[String]): Self = StObject.set(x, "getSecondaryBillingId", value.toJsFn)
  }
}
