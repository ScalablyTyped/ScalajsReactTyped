package typingsJapgolly.materialFormField

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LABELSELECTOR extends StObject {
    
    var LABEL_SELECTOR: String
  }
  object LABELSELECTOR {
    
    inline def apply(LABEL_SELECTOR: String): LABELSELECTOR = {
      val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELSELECTOR]
    }
    
    extension [Self <: LABELSELECTOR](x: Self) {
      
      inline def setLABEL_SELECTOR(value: String): Self = StObject.set(x, "LABEL_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/form-field.@material/form-field/adapter.MDCFormFieldAdapter> */
  trait PartialMDCFormFieldAdapte extends StObject {
    
    var activateInputRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deactivateInputRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
  }
  object PartialMDCFormFieldAdapte {
    
    inline def apply(): PartialMDCFormFieldAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFormFieldAdapte]
    }
    
    extension [Self <: PartialMDCFormFieldAdapte](x: Self) {
      
      inline def setActivateInputRipple(value: Callback): Self = StObject.set(x, "activateInputRipple", value.toJsFn)
      
      inline def setActivateInputRippleUndefined: Self = StObject.set(x, "activateInputRipple", js.undefined)
      
      inline def setDeactivateInputRipple(value: Callback): Self = StObject.set(x, "deactivateInputRipple", value.toJsFn)
      
      inline def setDeactivateInputRippleUndefined: Self = StObject.set(x, "deactivateInputRipple", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
    }
  }
  
  trait ROOT extends StObject {
    
    var ROOT: String
  }
  object ROOT {
    
    inline def apply(ROOT: String): ROOT = {
      val __obj = js.Dynamic.literal(ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ROOT]
    }
    
    extension [Self <: ROOT](x: Self) {
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
}
