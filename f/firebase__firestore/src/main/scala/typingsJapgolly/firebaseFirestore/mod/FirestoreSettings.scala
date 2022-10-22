package typingsJapgolly.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirestoreSettings extends StObject {
  
  /**
    * An approximate cache size threshold for the on-disk data. If the cache
    * grows beyond this size, Firestore will start removing data that hasn't been
    * recently used. The size is not a guarantee that the cache will stay below
    * that size, only that if the cache exceeds the given size, cleanup will be
    * attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and
    * can be set to `CACHE_SIZE_UNLIMITED` to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the SDK's underlying transport (WebChannel) to automatically
    * detect if long-polling should be used. This is very similar to
    * `experimentalForceLongPolling`, but only uses long-polling if required.
    *
    * This setting will likely be enabled by default in future releases and
    * cannot be combined with `experimentalForceLongPolling`.
    */
  var experimentalAutoDetectLongPolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces the SDK’s underlying network transport (WebChannel) to use
    * long-polling. Each response from the backend will be closed immediately
    * after the backend sends data (by default responses are kept open in
    * case the backend has more data to send). This avoids incompatibility
    * issues with certain proxies, antivirus software, etc. that incorrectly
    * buffer traffic indefinitely. Use of this option will cause some
    * performance degradation though.
    *
    * This setting cannot be used with `experimentalAutoDetectLongPolling` and
    * may be removed in a future release. If you find yourself using it to
    * work around a specific network reliability issue, please tell us about
    * it in https://github.com/firebase/firebase-js-sdk/issues/1674.
    */
  var experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hostname to connect to.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to skip nested properties that are set to `undefined` during
    * object serialization. If set to `true`, these properties are skipped
    * and not written to Firestore. If set to `false` or omitted, the SDK
    * throws an exception when it encounters properties of type `undefined`.
    */
  var ignoreUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to use SSL when connecting.
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
}
object FirestoreSettings {
  
  inline def apply(): FirestoreSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirestoreSettings]
  }
  
  extension [Self <: FirestoreSettings](x: Self) {
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
    
    inline def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalAutoDetectLongPollingUndefined: Self = StObject.set(x, "experimentalAutoDetectLongPolling", js.undefined)
    
    inline def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceLongPollingUndefined: Self = StObject.set(x, "experimentalForceLongPolling", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedPropertiesUndefined: Self = StObject.set(x, "ignoreUndefinedProperties", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
