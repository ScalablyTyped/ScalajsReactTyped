package typingsJapgolly.stripeV3.stripe.paymentMethod

import typingsJapgolly.stripeV3.anon.Addressline1check
import typingsJapgolly.stripeV3.anon.Amexexpresscheckout
import typingsJapgolly.stripeV3.anon.Charge
import typingsJapgolly.stripeV3.anon.Supported
import typingsJapgolly.stripeV3.stripe.fundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodCard extends StObject {
  
  /**
    * Card brand
    */
  var brand: paymentMethodCardBrand
  
  /**
    * Checks on Card address and CVC if provided.
    */
  var checks: Addressline1check
  
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: String
  
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: Double
  
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: Double
  
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: String
  
  /**
    * Card funding type
    */
  var funding: fundingType
  
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: Charge
  
  /**
    * The last four digits of the card.
    */
  var last4: String
  
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[Supported] = js.undefined
  
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: Amexexpresscheckout | Null
}
object PaymentMethodCard {
  
  inline def apply(
    brand: paymentMethodCardBrand,
    checks: Addressline1check,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    generated_from: Charge,
    last4: String
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], generated_from = generated_from.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], wallet = null)
    __obj.asInstanceOf[PaymentMethodCard]
  }
  
  extension [Self <: PaymentMethodCard](x: Self) {
    
    inline def setBrand(value: paymentMethodCardBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setChecks(value: Addressline1check): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFunding(value: fundingType): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setGenerated_from(value: Charge): Self = StObject.set(x, "generated_from", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secure_usage(value: Supported): Self = StObject.set(x, "three_d_secure_usage", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secure_usageUndefined: Self = StObject.set(x, "three_d_secure_usage", js.undefined)
    
    inline def setWallet(value: Amexexpresscheckout): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWalletNull: Self = StObject.set(x, "wallet", null)
  }
}
