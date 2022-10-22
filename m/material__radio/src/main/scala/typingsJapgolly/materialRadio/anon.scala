package typingsJapgolly.materialRadio

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DISABLED extends StObject {
    
    var DISABLED: String
    
    var ROOT: String
  }
  object DISABLED {
    
    inline def apply(DISABLED: String, ROOT: String): DISABLED = {
      val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DISABLED]
    }
    
    extension [Self <: DISABLED](x: Self) {
      
      inline def setDISABLED(value: String): Self = StObject.set(x, "DISABLED", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  trait NATIVECONTROLSELECTOR extends StObject {
    
    var NATIVE_CONTROL_SELECTOR: String
  }
  object NATIVECONTROLSELECTOR {
    
    inline def apply(NATIVE_CONTROL_SELECTOR: String): NATIVECONTROLSELECTOR = {
      val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[NATIVECONTROLSELECTOR]
    }
    
    extension [Self <: NATIVECONTROLSELECTOR](x: Self) {
      
      inline def setNATIVE_CONTROL_SELECTOR(value: String): Self = StObject.set(x, "NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/radio.@material/radio/adapter.MDCRadioAdapter> */
  trait PartialMDCRadioAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.undefined
  }
  object PartialMDCRadioAdapter {
    
    inline def apply(): PartialMDCRadioAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCRadioAdapter]
    }
    
    extension [Self <: PartialMDCRadioAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetNativeControlDisabled(value: /* disabled */ Boolean => Callback): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1((t0: /* disabled */ Boolean) => value(t0).runNow()))
      
      inline def setSetNativeControlDisabledUndefined: Self = StObject.set(x, "setNativeControlDisabled", js.undefined)
    }
  }
}
