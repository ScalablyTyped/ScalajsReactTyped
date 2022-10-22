package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an account to which invoices are sent in consolidated billing. */
trait BillingAccount extends StObject {
  
  /** Returns the ID of the billing account. */
  def getId(): Double
  
  /** Returns the name of the billing account. */
  def getName(): String
  
  /** Returns the primary billing ID. */
  def getPrimaryBillingId(): String
  
  /** Returns the secondary billing ID or null if there is no secondary billing account. */
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
