package typingsJapgolly.firebaseAnalytics

import typingsJapgolly.firebaseAnalytics.distSrcPublicTypesMod.ConsentSettings
import typingsJapgolly.firebaseAnalytics.distSrcPublicTypesMod.ControlParams
import typingsJapgolly.firebaseAnalytics.distSrcPublicTypesMod.CustomParams
import typingsJapgolly.firebaseAnalytics.distSrcPublicTypesMod.EventParams
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.config
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.consent
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.default
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.event
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.set
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.update
import typingsJapgolly.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type DataLayer = js.Array[IArguments]
  
  trait DynamicConfig extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var authDomain: String
    
    var databaseURL: String
    
    var locationId: String
    
    var measurementId: String
    
    var messagingSenderId: String
    
    var projectId: String
    
    var storageBucket: String
  }
  object DynamicConfig {
    
    inline def apply(
      apiKey: String,
      appId: String,
      authDomain: String,
      databaseURL: String,
      locationId: String,
      measurementId: String,
      messagingSenderId: String,
      projectId: String,
      storageBucket: String
    ): DynamicConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], authDomain = authDomain.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicConfig]
    }
    
    extension [Self <: DynamicConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
      
      inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      inline def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Gtag extends StObject {
    
    def apply(command: config, targetId: String): Unit = js.native
    def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
    def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
    def apply(command: config, targetId: String, config: EventParams): Unit = js.native
    def apply(command: consent, subCommand: default | update, consentSettings: ConsentSettings): Unit = js.native
    def apply(command: event, eventName: String): Unit = js.native
    def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    def apply(command: set, config: CustomParams): Unit = js.native
  }
  
  trait MinimalDynamicConfig extends StObject {
    
    var appId: String
    
    var measurementId: String
  }
  object MinimalDynamicConfig {
    
    inline def apply(appId: String, measurementId: String): MinimalDynamicConfig = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimalDynamicConfig]
    }
    
    extension [Self <: MinimalDynamicConfig](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottleMetadata extends StObject {
    
    var backoffCount: Double
    
    var throttleEndTimeMillis: Double
  }
  object ThrottleMetadata {
    
    inline def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
      val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleMetadata]
    }
    
    extension [Self <: ThrottleMetadata](x: Self) {
      
      inline def setBackoffCount(value: Double): Self = StObject.set(x, "backoffCount", value.asInstanceOf[js.Any])
      
      inline def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
