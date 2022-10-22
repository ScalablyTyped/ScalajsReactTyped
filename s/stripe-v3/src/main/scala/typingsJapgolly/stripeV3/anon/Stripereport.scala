package typingsJapgolly.stripeV3.anon

import typingsJapgolly.stripeV3.stripeV3Strings.fraudulent
import typingsJapgolly.stripeV3.stripeV3Strings.safe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stripereport extends StObject {
  
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[fraudulent] = js.undefined
  
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.undefined
}
object Stripereport {
  
  inline def apply(): Stripereport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stripereport]
  }
  
  extension [Self <: Stripereport](x: Self) {
    
    inline def setStripe_report(value: fraudulent): Self = StObject.set(x, "stripe_report", value.asInstanceOf[js.Any])
    
    inline def setStripe_reportUndefined: Self = StObject.set(x, "stripe_report", js.undefined)
    
    inline def setUser_report(value: fraudulent | safe): Self = StObject.set(x, "user_report", value.asInstanceOf[js.Any])
    
    inline def setUser_reportUndefined: Self = StObject.set(x, "user_report", js.undefined)
  }
}
