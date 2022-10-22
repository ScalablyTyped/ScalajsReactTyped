package typingsJapgolly.angulartics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.angular.mod.ILocationService
import typingsJapgolly.angular.mod.IServiceProvider
import typingsJapgolly.angulartics.anon.BufferFlushDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angulartics", JSImport.Namespace)
  @js.native
  val ^ : IAngularticsStatic = js.native
  
  @js.native
  trait IAnalyticsService extends StObject {
    
    var clearCookies: Any = js.native
    
    def eventTrack(eventName: String): Any = js.native
    def eventTrack(eventName: String, properties: Any): Any = js.native
    
    def exceptionTrack(error: Any, cause: String): Any = js.native
    
    def getOptOut(): Boolean = js.native
    
    def incrementProperty(property: String): Any = js.native
    def incrementProperty(property: String, value: Any): Any = js.native
    
    def pageTrack(path: String): Any = js.native
    def pageTrack(path: String, location: ILocationService): Any = js.native
    
    def setAlias(alias: String): Any = js.native
    
    def setOptOut(value: Boolean): Unit = js.native
    
    def setSuperProperties(superProperties: Any): Any = js.native
    
    def setSuperPropertiesOnce(superProperties: Any): Any = js.native
    
    def setUserProperties(userProperties: Any): Any = js.native
    
    def setUserPropertiesOnce(userProperties: Any): Any = js.native
    
    def setUsername(username: String): Any = js.native
    
    var transactionTrack: Any = js.native
    
    def userTimings(properties: Any): Any = js.native
  }
  
  trait IAnalyticsServiceProvider
    extends StObject
       with IServiceProvider {
    
    def developerMode(value: Boolean): Unit
    
    def excludeRoutes(value: js.Array[String]): Unit
    
    def firstPageview(value: Boolean): Unit
    
    def queryKeysBlacklist(keys: js.Array[String]): Unit
    
    def queryKeysWhitelist(keys: js.Array[String]): Unit
    
    def registerClearCookies(callback: Any): Unit
    
    def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any]): Unit
    
    def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any]): Unit
    
    def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any]): Unit
    
    def registerSetAlias(callback: js.Function1[/* alias */ String, Any]): Unit
    
    def registerSetSuperProperties(callback: js.Function1[/* superProperties */ Any, Any]): Unit
    
    def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ Any, Any]): Unit
    
    def registerSetUserProperties(callback: js.Function1[/* userProperties */ Any, Any]): Unit
    
    def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ Any, Any]): Unit
    
    def registerSetUsername(callback: js.Function1[/* username */ String, Any]): Unit
    
    def registerTransactionTrack(callback: Any): Unit
    
    def registerUserTimings(callback: js.Function1[/* properties */ Any, Any]): Unit
    
    var settings: BufferFlushDelay
    
    def trackExceptions(value: Boolean): Unit
    
    def trackRoutes(value: Boolean): Unit
    
    def trackStates(value: Boolean): Unit
    
    def virtualPageviews(value: Boolean): Unit
    
    def withAutoBase(value: Boolean): Unit
    
    def withBase(value: Boolean): Unit
  }
  object IAnalyticsServiceProvider {
    
    inline def apply(
      $get: Any,
      developerMode: Boolean => Callback,
      excludeRoutes: js.Array[String] => Callback,
      firstPageview: Boolean => Callback,
      queryKeysBlacklist: js.Array[String] => Callback,
      queryKeysWhitelist: js.Array[String] => Callback,
      registerClearCookies: Any => Callback,
      registerEventTrack: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any] => Callback,
      registerIncrementProperty: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any] => Callback,
      registerPageTrack: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any] => Callback,
      registerSetAlias: js.Function1[/* alias */ String, Any] => Callback,
      registerSetSuperProperties: js.Function1[/* superProperties */ Any, Any] => Callback,
      registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ Any, Any] => Callback,
      registerSetUserProperties: js.Function1[/* userProperties */ Any, Any] => Callback,
      registerSetUserPropertiesOnce: js.Function1[/* userProperties */ Any, Any] => Callback,
      registerSetUsername: js.Function1[/* username */ String, Any] => Callback,
      registerTransactionTrack: Any => Callback,
      registerUserTimings: js.Function1[/* properties */ Any, Any] => Callback,
      settings: BufferFlushDelay,
      trackExceptions: Boolean => Callback,
      trackRoutes: Boolean => Callback,
      trackStates: Boolean => Callback,
      virtualPageviews: Boolean => Callback,
      withAutoBase: Boolean => Callback,
      withBase: Boolean => Callback
    ): IAnalyticsServiceProvider = {
      val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], developerMode = js.Any.fromFunction1((t0: Boolean) => developerMode(t0).runNow()), excludeRoutes = js.Any.fromFunction1((t0: js.Array[String]) => excludeRoutes(t0).runNow()), firstPageview = js.Any.fromFunction1((t0: Boolean) => firstPageview(t0).runNow()), queryKeysBlacklist = js.Any.fromFunction1((t0: js.Array[String]) => queryKeysBlacklist(t0).runNow()), queryKeysWhitelist = js.Any.fromFunction1((t0: js.Array[String]) => queryKeysWhitelist(t0).runNow()), registerClearCookies = js.Any.fromFunction1((t0: Any) => registerClearCookies(t0).runNow()), registerEventTrack = js.Any.fromFunction1((t0: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any]) => registerEventTrack(t0).runNow()), registerIncrementProperty = js.Any.fromFunction1((t0: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any]) => registerIncrementProperty(t0).runNow()), registerPageTrack = js.Any.fromFunction1((t0: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any]) => registerPageTrack(t0).runNow()), registerSetAlias = js.Any.fromFunction1((t0: js.Function1[/* alias */ String, Any]) => registerSetAlias(t0).runNow()), registerSetSuperProperties = js.Any.fromFunction1((t0: js.Function1[/* superProperties */ Any, Any]) => registerSetSuperProperties(t0).runNow()), registerSetSuperPropertiesOnce = js.Any.fromFunction1((t0: js.Function1[/* superProperties */ Any, Any]) => registerSetSuperPropertiesOnce(t0).runNow()), registerSetUserProperties = js.Any.fromFunction1((t0: js.Function1[/* userProperties */ Any, Any]) => registerSetUserProperties(t0).runNow()), registerSetUserPropertiesOnce = js.Any.fromFunction1((t0: js.Function1[/* userProperties */ Any, Any]) => registerSetUserPropertiesOnce(t0).runNow()), registerSetUsername = js.Any.fromFunction1((t0: js.Function1[/* username */ String, Any]) => registerSetUsername(t0).runNow()), registerTransactionTrack = js.Any.fromFunction1((t0: Any) => registerTransactionTrack(t0).runNow()), registerUserTimings = js.Any.fromFunction1((t0: js.Function1[/* properties */ Any, Any]) => registerUserTimings(t0).runNow()), settings = settings.asInstanceOf[js.Any], trackExceptions = js.Any.fromFunction1((t0: Boolean) => trackExceptions(t0).runNow()), trackRoutes = js.Any.fromFunction1((t0: Boolean) => trackRoutes(t0).runNow()), trackStates = js.Any.fromFunction1((t0: Boolean) => trackStates(t0).runNow()), virtualPageviews = js.Any.fromFunction1((t0: Boolean) => virtualPageviews(t0).runNow()), withAutoBase = js.Any.fromFunction1((t0: Boolean) => withAutoBase(t0).runNow()), withBase = js.Any.fromFunction1((t0: Boolean) => withBase(t0).runNow()))
      __obj.asInstanceOf[IAnalyticsServiceProvider]
    }
    
    extension [Self <: IAnalyticsServiceProvider](x: Self) {
      
      inline def setDeveloperMode(value: Boolean => Callback): Self = StObject.set(x, "developerMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setExcludeRoutes(value: js.Array[String] => Callback): Self = StObject.set(x, "excludeRoutes", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
      
      inline def setFirstPageview(value: Boolean => Callback): Self = StObject.set(x, "firstPageview", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setQueryKeysBlacklist(value: js.Array[String] => Callback): Self = StObject.set(x, "queryKeysBlacklist", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
      
      inline def setQueryKeysWhitelist(value: js.Array[String] => Callback): Self = StObject.set(x, "queryKeysWhitelist", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
      
      inline def setRegisterClearCookies(value: Any => Callback): Self = StObject.set(x, "registerClearCookies", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRegisterEventTrack(value: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any] => Callback): Self = StObject.set(x, "registerEventTrack", js.Any.fromFunction1((t0: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any]) => value(t0).runNow()))
      
      inline def setRegisterIncrementProperty(value: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any] => Callback): Self = StObject.set(x, "registerIncrementProperty", js.Any.fromFunction1((t0: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any]) => value(t0).runNow()))
      
      inline def setRegisterPageTrack(
        value: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any] => Callback
      ): Self = StObject.set(x, "registerPageTrack", js.Any.fromFunction1((t0: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any]) => value(t0).runNow()))
      
      inline def setRegisterSetAlias(value: js.Function1[/* alias */ String, Any] => Callback): Self = StObject.set(x, "registerSetAlias", js.Any.fromFunction1((t0: js.Function1[/* alias */ String, Any]) => value(t0).runNow()))
      
      inline def setRegisterSetSuperProperties(value: js.Function1[/* superProperties */ Any, Any] => Callback): Self = StObject.set(x, "registerSetSuperProperties", js.Any.fromFunction1((t0: js.Function1[/* superProperties */ Any, Any]) => value(t0).runNow()))
      
      inline def setRegisterSetSuperPropertiesOnce(value: js.Function1[/* superProperties */ Any, Any] => Callback): Self = StObject.set(x, "registerSetSuperPropertiesOnce", js.Any.fromFunction1((t0: js.Function1[/* superProperties */ Any, Any]) => value(t0).runNow()))
      
      inline def setRegisterSetUserProperties(value: js.Function1[/* userProperties */ Any, Any] => Callback): Self = StObject.set(x, "registerSetUserProperties", js.Any.fromFunction1((t0: js.Function1[/* userProperties */ Any, Any]) => value(t0).runNow()))
      
      inline def setRegisterSetUserPropertiesOnce(value: js.Function1[/* userProperties */ Any, Any] => Callback): Self = StObject.set(x, "registerSetUserPropertiesOnce", js.Any.fromFunction1((t0: js.Function1[/* userProperties */ Any, Any]) => value(t0).runNow()))
      
      inline def setRegisterSetUsername(value: js.Function1[/* username */ String, Any] => Callback): Self = StObject.set(x, "registerSetUsername", js.Any.fromFunction1((t0: js.Function1[/* username */ String, Any]) => value(t0).runNow()))
      
      inline def setRegisterTransactionTrack(value: Any => Callback): Self = StObject.set(x, "registerTransactionTrack", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRegisterUserTimings(value: js.Function1[/* properties */ Any, Any] => Callback): Self = StObject.set(x, "registerUserTimings", js.Any.fromFunction1((t0: js.Function1[/* properties */ Any, Any]) => value(t0).runNow()))
      
      inline def setSettings(value: BufferFlushDelay): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setTrackExceptions(value: Boolean => Callback): Self = StObject.set(x, "trackExceptions", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setTrackRoutes(value: Boolean => Callback): Self = StObject.set(x, "trackRoutes", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setTrackStates(value: Boolean => Callback): Self = StObject.set(x, "trackStates", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setVirtualPageviews(value: Boolean => Callback): Self = StObject.set(x, "virtualPageviews", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setWithAutoBase(value: Boolean => Callback): Self = StObject.set(x, "withAutoBase", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setWithBase(value: Boolean => Callback): Self = StObject.set(x, "withBase", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait IAngularticsStatic extends StObject {
    
    def waitForVendorApi(objectName: String, delay: Double): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Unit, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Unit, onTimeout: Boolean): Unit = js.native
  }
  
  type _To = IAngularticsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IAngularticsStatic = ^
}
