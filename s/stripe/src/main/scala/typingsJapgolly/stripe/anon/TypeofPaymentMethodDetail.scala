package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodDetail extends StObject {
  
  val AchDebit: Any
  
  val Bancontact: Any
  
  val Card: TypeofCard
  
  val CardPresent: TypeofCardPresent
  
  val Eps: Any
  
  val Fpx: Any
  
  val Ideal: Any
  
  val InteracPresent: TypeofInteracPresent
  
  val Konbini: TypeofKonbini
  
  val P24: Any
  
  val Sofort: Any
  
  val UsBankAccount: Any
}
object TypeofPaymentMethodDetail {
  
  inline def apply(
    AchDebit: Any,
    Bancontact: Any,
    Card: TypeofCard,
    CardPresent: TypeofCardPresent,
    Eps: Any,
    Fpx: Any,
    Ideal: Any,
    InteracPresent: TypeofInteracPresent,
    Konbini: TypeofKonbini,
    P24: Any,
    Sofort: Any,
    UsBankAccount: Any
  ): TypeofPaymentMethodDetail = {
    val __obj = js.Dynamic.literal(AchDebit = AchDebit.asInstanceOf[js.Any], Bancontact = Bancontact.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CardPresent = CardPresent.asInstanceOf[js.Any], Eps = Eps.asInstanceOf[js.Any], Fpx = Fpx.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], InteracPresent = InteracPresent.asInstanceOf[js.Any], Konbini = Konbini.asInstanceOf[js.Any], P24 = P24.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodDetail]
  }
  
  extension [Self <: TypeofPaymentMethodDetail](x: Self) {
    
    inline def setAchDebit(value: Any): Self = StObject.set(x, "AchDebit", value.asInstanceOf[js.Any])
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCard): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCardPresent(value: TypeofCardPresent): Self = StObject.set(x, "CardPresent", value.asInstanceOf[js.Any])
    
    inline def setEps(value: Any): Self = StObject.set(x, "Eps", value.asInstanceOf[js.Any])
    
    inline def setFpx(value: Any): Self = StObject.set(x, "Fpx", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setInteracPresent(value: TypeofInteracPresent): Self = StObject.set(x, "InteracPresent", value.asInstanceOf[js.Any])
    
    inline def setKonbini(value: TypeofKonbini): Self = StObject.set(x, "Konbini", value.asInstanceOf[js.Any])
    
    inline def setP24(value: Any): Self = StObject.set(x, "P24", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: Any): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
