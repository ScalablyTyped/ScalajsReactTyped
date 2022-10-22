package typingsJapgolly.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosInfo extends StObject {
  
  /** iOS App Store ID. */
  var iosAppStoreId: js.UndefOr[String] = js.undefined
  
  /** iOS bundle ID of the app. */
  var iosBundleId: js.UndefOr[String] = js.undefined
  
  /** Custom (destination) scheme to use for iOS. By default, we’ll use the bundle ID as the custom scheme. Developer can override this behavior using this param. */
  var iosCustomScheme: js.UndefOr[String] = js.undefined
  
  /** Link to open on iOS if the app is not installed. */
  var iosFallbackLink: js.UndefOr[String] = js.undefined
  
  /** iPad bundle ID of the app. */
  var iosIpadBundleId: js.UndefOr[String] = js.undefined
  
  /** If specified, this overrides the ios_fallback_link value on iPads. */
  var iosIpadFallbackLink: js.UndefOr[String] = js.undefined
  
  /** iOS minimum version. */
  var iosMinimumVersion: js.UndefOr[String] = js.undefined
}
object IosInfo {
  
  inline def apply(): IosInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosInfo]
  }
  
  extension [Self <: IosInfo](x: Self) {
    
    inline def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
    
    inline def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
    
    inline def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    
    inline def setIosCustomScheme(value: String): Self = StObject.set(x, "iosCustomScheme", value.asInstanceOf[js.Any])
    
    inline def setIosCustomSchemeUndefined: Self = StObject.set(x, "iosCustomScheme", js.undefined)
    
    inline def setIosFallbackLink(value: String): Self = StObject.set(x, "iosFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setIosFallbackLinkUndefined: Self = StObject.set(x, "iosFallbackLink", js.undefined)
    
    inline def setIosIpadBundleId(value: String): Self = StObject.set(x, "iosIpadBundleId", value.asInstanceOf[js.Any])
    
    inline def setIosIpadBundleIdUndefined: Self = StObject.set(x, "iosIpadBundleId", js.undefined)
    
    inline def setIosIpadFallbackLink(value: String): Self = StObject.set(x, "iosIpadFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setIosIpadFallbackLinkUndefined: Self = StObject.set(x, "iosIpadFallbackLink", js.undefined)
    
    inline def setIosMinimumVersion(value: String): Self = StObject.set(x, "iosMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setIosMinimumVersionUndefined: Self = StObject.set(x, "iosMinimumVersion", js.undefined)
  }
}
