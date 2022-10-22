package typingsJapgolly.apigeeAccess

import japgolly.scalajs.react.Callback
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.apigee
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.application
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.day
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.environment
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.exclusive
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.global
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.hour
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.minute
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.month
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.organization
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.standalone
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.week
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.CacheOptions
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.QuotaService
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.SecureVault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("apigee-access", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def deleteVariable(request: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getCache(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCache")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getCache(name: String, options: CacheOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCache")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getMode(): apigee | standalone = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")().asInstanceOf[apigee | standalone]
    
    inline def getQuota(): QuotaService = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuota")().asInstanceOf[QuotaService]
    inline def getQuota(options: Any): QuotaService = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuota")(options.asInstanceOf[js.Any]).asInstanceOf[QuotaService]
    
    inline def getVariable(request: Any, name: String): String | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Double | Boolean]
    
    inline def getVault(name: String): SecureVault = ^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(name.asInstanceOf[js.Any]).asInstanceOf[SecureVault]
    inline def getVault(name: String, scope: organization | environment): SecureVault = (^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[SecureVault]
    
    inline def setIntVariable(request: Any, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setIntVariable(request: Any, name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setVariable(request: Any, name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setVariable(request: Any, name: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setVariable(request: Any, name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVariable")(request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ApigeeAccess {
    
    @js.native
    trait Cache extends StObject {
      
      def get(key: String, callback: js.Function2[/* err */ Any, /* data */ Any, Unit]): Unit = js.native
      
      def put(key: String, data: Any): Unit = js.native
      def put(key: String, data: Any, ttl: Double): Unit = js.native
      def put(key: String, data: Any, ttl: Double, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
      def put(key: String, data: Any, ttl: Unit, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
      
      def remove(key: String): Unit = js.native
      def remove(key: String, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    }
    
    trait CacheOptions extends StObject {
      
      var defaultTtl: js.UndefOr[Double] = js.undefined
      
      var resource: js.UndefOr[String] = js.undefined
      
      var scope: js.UndefOr[global | application | exclusive] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object CacheOptions {
      
      inline def apply(): CacheOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CacheOptions]
      }
      
      extension [Self <: CacheOptions](x: Self) {
        
        inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
        
        inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setScope(value: global | application | exclusive): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait QuotaService extends StObject {
      
      @JSName("apply")
      def apply(): Unit = js.native
      @JSName("apply")
      def apply(
        options: Unit,
        callback: js.Function2[/* err */ Any, /* data */ QuotaServiceApplyCallbackData, Unit]
      ): Unit = js.native
      @JSName("apply")
      def apply(options: QuotaServiceApplyOptions): Unit = js.native
      @JSName("apply")
      def apply(
        options: QuotaServiceApplyOptions,
        callback: js.Function2[/* err */ Any, /* data */ QuotaServiceApplyCallbackData, Unit]
      ): Unit = js.native
    }
    
    trait QuotaServiceApplyCallbackData extends StObject {
      
      var allowed: Double
      
      var expiryTime: Double
      
      var isAllowed: Boolean
      
      var timestamp: Double
      
      var used: Double
    }
    object QuotaServiceApplyCallbackData {
      
      inline def apply(allowed: Double, expiryTime: Double, isAllowed: Boolean, timestamp: Double, used: Double): QuotaServiceApplyCallbackData = {
        val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], expiryTime = expiryTime.asInstanceOf[js.Any], isAllowed = isAllowed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
        __obj.asInstanceOf[QuotaServiceApplyCallbackData]
      }
      
      extension [Self <: QuotaServiceApplyCallbackData](x: Self) {
        
        inline def setAllowed(value: Double): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        inline def setExpiryTime(value: Double): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
        
        inline def setIsAllowed(value: Boolean): Self = StObject.set(x, "isAllowed", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
      }
    }
    
    trait QuotaServiceApplyOptions extends StObject {
      
      var allow: Double
      
      var identifier: String
      
      var interval: js.UndefOr[Double] = js.undefined
      
      var timeUnit: minute | hour | day | week | month
      
      var weight: js.UndefOr[Double] = js.undefined
    }
    object QuotaServiceApplyOptions {
      
      inline def apply(allow: Double, identifier: String, timeUnit: minute | hour | day | week | month): QuotaServiceApplyOptions = {
        val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
        __obj.asInstanceOf[QuotaServiceApplyOptions]
      }
      
      extension [Self <: QuotaServiceApplyOptions](x: Self) {
        
        inline def setAllow(value: Double): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
        
        inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
        
        inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        inline def setTimeUnit(value: minute | hour | day | week | month): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
        
        inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait SecureVault extends StObject {
      
      def get(key: String, callback: js.Function2[/* err */ Any, /* data */ Any, Unit]): Unit
      
      def getKeys(callback: js.Function2[/* err */ Any, /* data */ Any, Unit]): Unit
    }
    object SecureVault {
      
      inline def apply(
        get: (String, js.Function2[/* err */ Any, /* data */ Any, Unit]) => Callback,
        getKeys: js.Function2[/* err */ Any, /* data */ Any, Unit] => Callback
      ): SecureVault = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* data */ Any, Unit]) => (get(t0, t1)).runNow()), getKeys = js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* data */ Any, Unit]) => getKeys(t0).runNow()))
        __obj.asInstanceOf[SecureVault]
      }
      
      extension [Self <: SecureVault](x: Self) {
        
        inline def setGet(value: (String, js.Function2[/* err */ Any, /* data */ Any, Unit]) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* data */ Any, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setGetKeys(value: js.Function2[/* err */ Any, /* data */ Any, Unit] => Callback): Self = StObject.set(x, "getKeys", js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* data */ Any, Unit]) => value(t0).runNow()))
      }
    }
  }
}
