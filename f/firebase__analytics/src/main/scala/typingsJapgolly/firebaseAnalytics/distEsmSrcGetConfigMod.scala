package typingsJapgolly.firebaseAnalytics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAnalytics.distEsmSrcTypesMod.DynamicConfig
import typingsJapgolly.firebaseAnalytics.distEsmSrcTypesMod.MinimalDynamicConfig
import typingsJapgolly.firebaseAnalytics.distEsmSrcTypesMod.ThrottleMetadata
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcGetConfigMod {
  
  @JSImport("@firebase/analytics/dist/esm/src/get-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/get-config", "AnalyticsAbortSignal")
  @js.native
  open class AnalyticsAbortSignal () extends StObject {
    
    def abort(): Unit = js.native
    
    def addEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    var listeners: js.Array[js.Function0[Unit]] = js.native
  }
  
  @JSImport("@firebase/analytics/dist/esm/src/get-config", "LONG_RETRY_FACTOR")
  @js.native
  val LONG_RETRY_FACTOR: /* 30 */ Double = js.native
  
  inline def fetchDynamicConfig(appFields: AppFields): js.Promise[DynamicConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfig")(appFields.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DynamicConfig]]
  
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp): js.Promise[DynamicConfig | MinimalDynamicConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: Unit, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], timeoutMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], timeoutMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  
  trait AppFields extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var measurementId: js.UndefOr[String] = js.undefined
  }
  object AppFields {
    
    inline def apply(apiKey: String, appId: String): AppFields = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppFields]
    }
    
    extension [Self <: AppFields](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    }
  }
  
  /**
    * Stubbable retry data storage class.
    */
  trait RetryData extends StObject {
    
    def deleteThrottleMetadata(appId: String): Unit
    
    def getThrottleMetadata(appId: String): ThrottleMetadata
    
    var intervalMillis: Double
    
    def setThrottleMetadata(appId: String, metadata: ThrottleMetadata): Unit
    
    var throttleMetadata: StringDictionary[ThrottleMetadata]
  }
  object RetryData {
    
    inline def apply(
      deleteThrottleMetadata: String => Callback,
      getThrottleMetadata: String => ThrottleMetadata,
      intervalMillis: Double,
      setThrottleMetadata: (String, ThrottleMetadata) => Callback,
      throttleMetadata: StringDictionary[ThrottleMetadata]
    ): RetryData = {
      val __obj = js.Dynamic.literal(deleteThrottleMetadata = js.Any.fromFunction1((t0: String) => deleteThrottleMetadata(t0).runNow()), getThrottleMetadata = js.Any.fromFunction1(getThrottleMetadata), intervalMillis = intervalMillis.asInstanceOf[js.Any], setThrottleMetadata = js.Any.fromFunction2((t0: String, t1: ThrottleMetadata) => (setThrottleMetadata(t0, t1)).runNow()), throttleMetadata = throttleMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryData]
    }
    
    extension [Self <: RetryData](x: Self) {
      
      inline def setDeleteThrottleMetadata(value: String => Callback): Self = StObject.set(x, "deleteThrottleMetadata", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetThrottleMetadata(value: String => ThrottleMetadata): Self = StObject.set(x, "getThrottleMetadata", js.Any.fromFunction1(value))
      
      inline def setIntervalMillis(value: Double): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
      
      inline def setSetThrottleMetadata(value: (String, ThrottleMetadata) => Callback): Self = StObject.set(x, "setThrottleMetadata", js.Any.fromFunction2((t0: String, t1: ThrottleMetadata) => (value(t0, t1)).runNow()))
      
      inline def setThrottleMetadata(value: StringDictionary[ThrottleMetadata]): Self = StObject.set(x, "throttleMetadata", value.asInstanceOf[js.Any])
    }
  }
}
