package typingsJapgolly.workboxBuild

import org.scalajs.dom.Response
import typingsJapgolly.workboxBuild.anon.ChannelName
import typingsJapgolly.workboxBuild.anon.Headers
import typingsJapgolly.workboxBuild.anon.MaxAgeSeconds
import typingsJapgolly.workboxBuild.anon.Name
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerCallback
import typingsJapgolly.workboxRouting.typesRouteHandlerMod.RouteHandlerCallbackContext
import typingsJapgolly.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import typingsJapgolly.workboxRouting.typesRouteMatchCallbackMod.RouteMatchCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ManifestEntry extends StObject {
    
    /**
      * Integrity metadata that will be used when making the network request
      * for the URL. based on the file contents.
      */
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      * The revision details for the file. This is a hash generated by node
      * based on the file contents.
      */
    var revision: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to the asset in the manifest.
      */
    var url: String
  }
  object ManifestEntry {
    
    inline def apply(url: String): ManifestEntry = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestEntry]
    }
    
    extension [Self <: ManifestEntry](x: Self) {
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ManifestTransform = js.Function2[
    /* manifestEntries */ js.Array[ManifestEntry], 
    /* compilation */ js.UndefOr[js.Object], 
    js.Promise[ManifestTransformResult]
  ]
  
  trait ManifestTransformResult extends StObject {
    
    var manifest: js.Array[ManifestEntry]
    
    var warnings: js.Array[js.UndefOr[String]]
  }
  object ManifestTransformResult {
    
    inline def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[js.UndefOr[String]]): ManifestTransformResult = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestTransformResult]
    }
    
    extension [Self <: ManifestTransformResult](x: Self) {
      
      inline def setManifest(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifest", js.Array(value*))
      
      inline def setWarnings(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait RuntimeCachingEntry extends StObject {
    
    /**
      * * Either the name of one of the [built-in strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies)
      * or custom handler callback to use when the generated route matches.
      */
    var handler: String | RouteHandlerCallback
    
    /**
      * The [HTTP method](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) that
      * will match the generated route.
      *
      * @default 'GET'
      */
    var method: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[RuntimeCachingEntryOptions] = js.undefined
    
    /**
      * The value that will be passed to [`registerRoute()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-routing#.registerRoute),
      * used to determine whether the generated route will match a given request.
      */
    var urlPattern: String | js.RegExp | RouteMatchCallback[Any]
  }
  object RuntimeCachingEntry {
    
    inline def apply(handler: String | RouteHandlerCallback, urlPattern: String | js.RegExp | RouteMatchCallback[Any]): RuntimeCachingEntry = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeCachingEntry]
    }
    
    extension [Self <: RuntimeCachingEntry](x: Self) {
      
      inline def setHandler(value: String | RouteHandlerCallback): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction1(value: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOptions(value: RuntimeCachingEntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setUrlPattern(value: String | js.RegExp | RouteMatchCallback[Any]): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
      
      inline def setUrlPatternFunction1(value: /* options */ RouteMatchCallbackOptions => Any): Self = StObject.set(x, "urlPattern", js.Any.fromFunction1(value))
    }
  }
  
  trait RuntimeCachingEntryOptions extends StObject {
    
    var backgroundSync: js.UndefOr[Name] = js.undefined
    
    var broadcastUpdate: js.UndefOr[ChannelName] = js.undefined
    
    /**
      * The `cacheName` to use when constructing one of the [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var cacheName: js.UndefOr[String] = js.undefined
    
    var cacheableResponse: js.UndefOr[Headers] = js.undefined
    
    var expiration: js.UndefOr[MaxAgeSeconds] = js.undefined
    
    /**
      * The `fetchOptions` property value to use when constructing one of the
      * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var fetchOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The `matchOptions` property value to use when constructing one of the
      * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var matchOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The `networkTimeoutSeconds` property value to use when creating a
      * [`NetworkFirst`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.NetworkFirst) strategy.
      */
    var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * One or more [additional plugins](https://developers.google.com/web/tools/workbox/guides/using-plugins#custom_plugins)
      * to apply to the handler. Useful when you want a plugin that doesn't have a
      * "shortcut" configuration.
      */
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  }
  object RuntimeCachingEntryOptions {
    
    inline def apply(): RuntimeCachingEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuntimeCachingEntryOptions]
    }
    
    extension [Self <: RuntimeCachingEntryOptions](x: Self) {
      
      inline def setBackgroundSync(value: Name): Self = StObject.set(x, "backgroundSync", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSyncUndefined: Self = StObject.set(x, "backgroundSync", js.undefined)
      
      inline def setBroadcastUpdate(value: ChannelName): Self = StObject.set(x, "broadcastUpdate", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUpdateUndefined: Self = StObject.set(x, "broadcastUpdate", js.undefined)
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setCacheableResponse(value: Headers): Self = StObject.set(x, "cacheableResponse", value.asInstanceOf[js.Any])
      
      inline def setCacheableResponseUndefined: Self = StObject.set(x, "cacheableResponse", js.undefined)
      
      inline def setExpiration(value: MaxAgeSeconds): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setFetchOptions(value: js.Object): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setMatchOptions(value: js.Object): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
