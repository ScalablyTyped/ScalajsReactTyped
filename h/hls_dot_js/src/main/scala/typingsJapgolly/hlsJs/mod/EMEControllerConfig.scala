package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.std.MediaKeySystemAccess
import typingsJapgolly.std.MediaKeySystemConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EMEControllerConfig extends StObject {
  
  var drmSystemOptions: DRMSystemOptions
  
  var emeEnabled: Boolean
  
  var licenseResponseCallback: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, js.typedarray.ArrayBuffer]
  ] = js.undefined
  
  var licenseXhrSetup: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
  
  var requestMediaKeySystemAccessFunc: MediaKeyFunc | Null
  
  var widevineLicenseUrl: js.UndefOr[String] = js.undefined
}
object EMEControllerConfig {
  
  inline def apply(drmSystemOptions: DRMSystemOptions, emeEnabled: Boolean): EMEControllerConfig = {
    val __obj = js.Dynamic.literal(drmSystemOptions = drmSystemOptions.asInstanceOf[js.Any], emeEnabled = emeEnabled.asInstanceOf[js.Any], requestMediaKeySystemAccessFunc = null)
    __obj.asInstanceOf[EMEControllerConfig]
  }
  
  extension [Self <: EMEControllerConfig](x: Self) {
    
    inline def setDrmSystemOptions(value: DRMSystemOptions): Self = StObject.set(x, "drmSystemOptions", value.asInstanceOf[js.Any])
    
    inline def setEmeEnabled(value: Boolean): Self = StObject.set(x, "emeEnabled", value.asInstanceOf[js.Any])
    
    inline def setLicenseResponseCallback(value: (/* xhr */ XMLHttpRequest, /* url */ String) => js.typedarray.ArrayBuffer): Self = StObject.set(x, "licenseResponseCallback", js.Any.fromFunction2(value))
    
    inline def setLicenseResponseCallbackUndefined: Self = StObject.set(x, "licenseResponseCallback", js.undefined)
    
    inline def setLicenseXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Callback): Self = StObject.set(x, "licenseXhrSetup", js.Any.fromFunction2((t0: /* xhr */ XMLHttpRequest, t1: /* url */ String) => (value(t0, t1)).runNow()))
    
    inline def setLicenseXhrSetupUndefined: Self = StObject.set(x, "licenseXhrSetup", js.undefined)
    
    inline def setRequestMediaKeySystemAccessFunc(
      value: (/* keySystem */ KeySystems, /* supportedConfigurations */ js.Array[MediaKeySystemConfiguration]) => js.Promise[MediaKeySystemAccess]
    ): Self = StObject.set(x, "requestMediaKeySystemAccessFunc", js.Any.fromFunction2(value))
    
    inline def setRequestMediaKeySystemAccessFuncNull: Self = StObject.set(x, "requestMediaKeySystemAccessFunc", null)
    
    inline def setWidevineLicenseUrl(value: String): Self = StObject.set(x, "widevineLicenseUrl", value.asInstanceOf[js.Any])
    
    inline def setWidevineLicenseUrlUndefined: Self = StObject.set(x, "widevineLicenseUrl", js.undefined)
  }
}
