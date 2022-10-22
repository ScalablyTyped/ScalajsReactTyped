package typingsJapgolly.materialFloatingLabel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LABELFLOATABOVE extends StObject {
    
    var LABEL_FLOAT_ABOVE: String
    
    var LABEL_REQUIRED: String
    
    var LABEL_SHAKE: String
    
    var ROOT: String
  }
  object LABELFLOATABOVE {
    
    inline def apply(LABEL_FLOAT_ABOVE: String, LABEL_REQUIRED: String, LABEL_SHAKE: String, ROOT: String): LABELFLOATABOVE = {
      val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_REQUIRED = LABEL_REQUIRED.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELFLOATABOVE]
    }
    
    extension [Self <: LABELFLOATABOVE](x: Self) {
      
      inline def setLABEL_FLOAT_ABOVE(value: String): Self = StObject.set(x, "LABEL_FLOAT_ABOVE", value.asInstanceOf[js.Any])
      
      inline def setLABEL_REQUIRED(value: String): Self = StObject.set(x, "LABEL_REQUIRED", value.asInstanceOf[js.Any])
      
      inline def setLABEL_SHAKE(value: String): Self = StObject.set(x, "LABEL_SHAKE", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/floating-label.@material/floating-label/adapter.MDCFloatingLabelAdapter> */
  trait PartialMDCFloatingLabelAd extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  }
  object PartialMDCFloatingLabelAd {
    
    inline def apply(): PartialMDCFloatingLabelAd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFloatingLabelAd]
    }
    
    extension [Self <: PartialMDCFloatingLabelAd](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    }
  }
}
