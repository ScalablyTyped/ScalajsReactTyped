package typingsJapgolly.angularUiRouter

import typingsJapgolly.angular.mod.ILocationProvider
import typingsJapgolly.angular.mod.ILocationService
import typingsJapgolly.angular.mod.IWindowService
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.mod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocationServicesMod {
  
  @JSImport("angular-ui-router/lib/locationServices", "Ng1LocationServices")
  @js.native
  open class Ng1LocationServices protected ()
    extends StObject
       with LocationConfig
       with LocationServices {
    def this($locationProvider: ILocationProvider) = this()
    
    /* private */ @JSName("$browser")
    var $browser: Any = js.native
    
    /* private */ @JSName("$location")
    var $location: Any = js.native
    
    /* private */ @JSName("$locationProvider")
    var $locationProvider: Any = js.native
    
    /* private */ @JSName("$sniffer")
    var $sniffer: Any = js.native
    
    /* private */ @JSName("$window")
    var $window: Any = js.native
    
    /* private */ var _baseHref: Any = js.native
    
    def _runtimeServices(
      $rootScope: Any,
      $location: ILocationService,
      $sniffer: Any,
      $browser: Any,
      $window: IWindowService
    ): Unit = js.native
    
    /* private */ var _urlListeners: Any = js.native
    
    @JSName("hashPrefix")
    var hashPrefix_FNg1LocationServices: Any = js.native
    
    @JSName("hash")
    var hash_FNg1LocationServices: Any = js.native
    
    @JSName("host")
    var host_FNg1LocationServices: Any = js.native
    
    def onChange(callback: js.Function): js.Function0[js.Array[js.Function]] = js.native
    
    @JSName("path")
    var path_FNg1LocationServices: Any = js.native
    
    @JSName("port")
    var port_FNg1LocationServices: Any = js.native
    
    @JSName("protocol")
    var protocol_FNg1LocationServices: Any = js.native
    
    @JSName("search")
    var search_FNg1LocationServices: Any = js.native
  }
  /* static members */
  object Ng1LocationServices {
    
    @JSImport("angular-ui-router/lib/locationServices", "Ng1LocationServices")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Applys ng1-specific path parameter encoding
      *
      * The Angular 1 `$location` service is a bit weird.
      * It doesn't allow slashes to be encoded/decoded bi-directionally.
      *
      * See the writeup at https://github.com/angular-ui/ui-router/issues/2598
      *
      * This code patches the `path` parameter type so it encoded/decodes slashes as ~2F
      *
      * @param router
      */
    inline def monkeyPatchPathParameterType(router: UIRouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatchPathParameterType")(router.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
