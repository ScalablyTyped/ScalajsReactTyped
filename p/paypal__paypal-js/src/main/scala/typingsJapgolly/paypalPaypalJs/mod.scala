package typingsJapgolly.paypalPaypalJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paypalPaypalJs.anon.Attributes
import typingsJapgolly.paypalPaypalJs.typesComponentsButtonsMod.PayPalButtonsComponent
import typingsJapgolly.paypalPaypalJs.typesComponentsButtonsMod.PayPalButtonsComponentOptions
import typingsJapgolly.paypalPaypalJs.typesComponentsFundingEligibilityMod.FUNDING_SOURCE
import typingsJapgolly.paypalPaypalJs.typesComponentsHostedFieldsMod.PayPalHostedFieldsComponent
import typingsJapgolly.paypalPaypalJs.typesComponentsMarksMod.PayPalMarksComponent
import typingsJapgolly.paypalPaypalJs.typesComponentsMarksMod.PayPalMarksComponentOptions
import typingsJapgolly.paypalPaypalJs.typesComponentsMessagesMod.PayPalMessagesComponent
import typingsJapgolly.paypalPaypalJs.typesComponentsMessagesMod.PayPalMessagesComponentOptions
import typingsJapgolly.paypalPaypalJs.typesScriptOptionsMod.PayPalScriptOptions
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@paypal/paypal-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCustomScript(options: Attributes): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomScript")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadScript(options: PayPalScriptOptions): js.Promise[PayPalNamespace | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PayPalNamespace | Null]]
  inline def loadScript(options: PayPalScriptOptions, PromisePonyfill: PromiseConstructor): js.Promise[PayPalNamespace | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(options.asInstanceOf[js.Any], PromisePonyfill.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PayPalNamespace | Null]]
  
  @JSImport("@paypal/paypal-js", "version")
  @js.native
  val version: String = js.native
  
  trait PayPalNamespace extends StObject {
    
    var Buttons: js.UndefOr[
        js.Function1[/* options */ js.UndefOr[PayPalButtonsComponentOptions], PayPalButtonsComponent]
      ] = js.undefined
    
    var FUNDING: js.UndefOr[Record[String, FUNDING_SOURCE]] = js.undefined
    
    var HostedFields: js.UndefOr[PayPalHostedFieldsComponent] = js.undefined
    
    var Marks: js.UndefOr[
        js.Function1[/* options */ js.UndefOr[PayPalMarksComponentOptions], PayPalMarksComponent]
      ] = js.undefined
    
    var Messages: js.UndefOr[
        js.Function1[/* options */ js.UndefOr[PayPalMessagesComponentOptions], PayPalMessagesComponent]
      ] = js.undefined
    
    var getFundingSources: js.UndefOr[
        typingsJapgolly.paypalPaypalJs.typesComponentsFundingEligibilityMod.getFundingSources
      ] = js.undefined
    
    var isFundingEligible: js.UndefOr[
        typingsJapgolly.paypalPaypalJs.typesComponentsFundingEligibilityMod.isFundingEligible
      ] = js.undefined
    
    var rememberFunding: js.UndefOr[
        typingsJapgolly.paypalPaypalJs.typesComponentsFundingEligibilityMod.rememberFunding
      ] = js.undefined
    
    var version: String
  }
  object PayPalNamespace {
    
    inline def apply(version: String): PayPalNamespace = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalNamespace]
    }
    
    extension [Self <: PayPalNamespace](x: Self) {
      
      inline def setButtons(value: /* options */ js.UndefOr[PayPalButtonsComponentOptions] => PayPalButtonsComponent): Self = StObject.set(x, "Buttons", js.Any.fromFunction1(value))
      
      inline def setButtonsUndefined: Self = StObject.set(x, "Buttons", js.undefined)
      
      inline def setFUNDING(value: Record[String, FUNDING_SOURCE]): Self = StObject.set(x, "FUNDING", value.asInstanceOf[js.Any])
      
      inline def setFUNDINGUndefined: Self = StObject.set(x, "FUNDING", js.undefined)
      
      inline def setGetFundingSources(value: CallbackTo[js.Array[FUNDING_SOURCE]]): Self = StObject.set(x, "getFundingSources", value.toJsFn)
      
      inline def setGetFundingSourcesUndefined: Self = StObject.set(x, "getFundingSources", js.undefined)
      
      inline def setHostedFields(value: PayPalHostedFieldsComponent): Self = StObject.set(x, "HostedFields", value.asInstanceOf[js.Any])
      
      inline def setHostedFieldsUndefined: Self = StObject.set(x, "HostedFields", js.undefined)
      
      inline def setIsFundingEligible(value: /* fundingSource */ FUNDING_SOURCE => Boolean): Self = StObject.set(x, "isFundingEligible", js.Any.fromFunction1(value))
      
      inline def setIsFundingEligibleUndefined: Self = StObject.set(x, "isFundingEligible", js.undefined)
      
      inline def setMarks(value: /* options */ js.UndefOr[PayPalMarksComponentOptions] => PayPalMarksComponent): Self = StObject.set(x, "Marks", js.Any.fromFunction1(value))
      
      inline def setMarksUndefined: Self = StObject.set(x, "Marks", js.undefined)
      
      inline def setMessages(value: /* options */ js.UndefOr[PayPalMessagesComponentOptions] => PayPalMessagesComponent): Self = StObject.set(x, "Messages", js.Any.fromFunction1(value))
      
      inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
      
      inline def setRememberFunding(value: /* fundingSource */ js.Array[FUNDING_SOURCE] => Callback): Self = StObject.set(x, "rememberFunding", js.Any.fromFunction1((t0: /* fundingSource */ js.Array[FUNDING_SOURCE]) => value(t0).runNow()))
      
      inline def setRememberFundingUndefined: Self = StObject.set(x, "rememberFunding", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var paypal: js.UndefOr[PayPalNamespace | Null] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setPaypal(value: PayPalNamespace): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
        
        inline def setPaypalNull: Self = StObject.set(x, "paypal", null)
        
        inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
      }
    }
  }
}
