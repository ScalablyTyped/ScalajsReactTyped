package typingsJapgolly.recurlyRecurlyJs

import typingsJapgolly.recurlyRecurlyJs.anon.All
import typingsJapgolly.recurlyRecurlyJs.anon.Braintree
import typingsJapgolly.recurlyRecurlyJs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigureMod {
  
  type Configure = js.Function1[/* recurlyConfig */ RecurlyOptions | String, Unit]
  
  trait RecurlyOptions extends StObject {
    
    var cors: js.UndefOr[Boolean] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use {@link https://developers.recurly.com/reference/recurly-js/index.html#elements|Elements} instead.
      */
    var fields: js.UndefOr[All] = js.undefined
    
    var fraud: js.UndefOr[Braintree] = js.undefined
    
    var publicKey: String
    
    var required: js.UndefOr[js.Array[String]] = js.undefined
    
    var risk: js.UndefOr[`0`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RecurlyOptions {
    
    inline def apply(publicKey: String): RecurlyOptions = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurlyOptions]
    }
    
    extension [Self <: RecurlyOptions](x: Self) {
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setFields(value: All): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFraud(value: Braintree): Self = StObject.set(x, "fraud", value.asInstanceOf[js.Any])
      
      inline def setFraudUndefined: Self = StObject.set(x, "fraud", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setRisk(value: `0`): Self = StObject.set(x, "risk", value.asInstanceOf[js.Any])
      
      inline def setRiskUndefined: Self = StObject.set(x, "risk", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
