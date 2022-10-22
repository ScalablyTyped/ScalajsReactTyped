package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callbacks for dealing with FairPlay DRM.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSecureKeyDelivery extends StObject {
  
  /**
    * Called when the player wants to cancel all FairPlay related requests.
    */
  var cancelAllRequests: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Fetch the asset ID. Usually, the asset ID is parsed from the URI parameter.
    *
    * The 'uri' parameter is a string containing the secure key delivery URI. This is the URI that is contained within the m3u8 in the EXT-X-KEY tag. The URI will begin with "skd://". Usually
    * the asset ID is parsed directly from this (e.g. by removing the skd:// bit).
    * The callback parameter allows you to return the asset ID and indicate whether it is Base64 encoded or not, or to return an error.
    */
  var fetchAssetID: js.UndefOr[
    js.Function2[/* uri */ String, /* callback */ ATVSecureKeyFetchAssetCallback, Unit]
  ] = js.undefined
  
  /**
    * Fetch the FairPlay certificate. The certificate must be in the DER format. These are generally shared across an app, so can be cached if desired.
    *
    * The 'uri' parameter is a string containing the secure key delivery URI. This is the URI that is contained within the m3u8 in the EXT-X-KEY tag. The URI will begin with "skd://".
    * The callback parameter allows you to return the certificate. This must be base64 encoded (e.g. by using XMLHttpRequest.responseDataAsBase64).
    */
  var fetchCertificate: js.UndefOr[js.Function2[/* uri */ String, /* callback */ ATVSecureKeyGenericCallback, Unit]] = js.undefined
  
  /**
    * Fetch the FairPlay keys for this particular asset. These are usually unique to each media item.
    *
    * The 'uri' parameter is a string containing the secure key delivery URI. This is the URI that is contained within the m3u8 in the EXT-X-KEY tag. The URI will begin with "skd://.
    * The 'requestData' parameter is a base64 encoded string of the request data that FairPlay needs to send to the server to decrypt the content. This (generally) can't be decoded before sending,
    * as the XMLHttpRequest will send an empty body. See https://github.com/SheaSmith/atv.js/issues/2 for more information.
    *
    * The callback parameter allows you to return the keys. This must be base64 encoded (e.g. by using XMLHttpRequest.responseDataAsBase64).
    */
  var fetchKey: js.UndefOr[
    js.Function3[
      /* uri */ String, 
      /* requestData */ String, 
      /* callback */ ATVSecureKeyGenericCallback, 
      Unit
    ]
  ] = js.undefined
}
object ATVSecureKeyDelivery {
  
  inline def apply(): ATVSecureKeyDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATVSecureKeyDelivery]
  }
  
  extension [Self <: ATVSecureKeyDelivery](x: Self) {
    
    inline def setCancelAllRequests(value: Callback): Self = StObject.set(x, "cancelAllRequests", value.toJsFn)
    
    inline def setCancelAllRequestsUndefined: Self = StObject.set(x, "cancelAllRequests", js.undefined)
    
    inline def setFetchAssetID(value: (/* uri */ String, /* callback */ ATVSecureKeyFetchAssetCallback) => Callback): Self = StObject.set(x, "fetchAssetID", js.Any.fromFunction2((t0: /* uri */ String, t1: /* callback */ ATVSecureKeyFetchAssetCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetchAssetIDUndefined: Self = StObject.set(x, "fetchAssetID", js.undefined)
    
    inline def setFetchCertificate(value: (/* uri */ String, /* callback */ ATVSecureKeyGenericCallback) => Callback): Self = StObject.set(x, "fetchCertificate", js.Any.fromFunction2((t0: /* uri */ String, t1: /* callback */ ATVSecureKeyGenericCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetchCertificateUndefined: Self = StObject.set(x, "fetchCertificate", js.undefined)
    
    inline def setFetchKey(
      value: (/* uri */ String, /* requestData */ String, /* callback */ ATVSecureKeyGenericCallback) => Callback
    ): Self = StObject.set(x, "fetchKey", js.Any.fromFunction3((t0: /* uri */ String, t1: /* requestData */ String, t2: /* callback */ ATVSecureKeyGenericCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
  }
}
