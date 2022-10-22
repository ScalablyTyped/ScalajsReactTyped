package typingsJapgolly.edxNewRelicSourceMapWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.edxNewRelicSourceMapWebpackPlugin.edxNewRelicSourceMapWebpackPluginStrings.auto
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@edx/new-relic-source-map-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NewRelicPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  trait NewRelicPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object NewRelicPlugin {
    
    inline def apply(apply: Compiler => Callback): NewRelicPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[NewRelicPlugin]
    }
    
    extension [Self <: NewRelicPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * API Key
      * @link {https://docs.newrelic.com/docs/apis/rest-api-v2/requirements/api-keys}
      */
    var apiKey: String
    
    /**
      * applicationId
      * @link {https://docs.newrelic.com/docs/browser/browser-monitoring/configuration/browser-license-key-app-id/}
      */
    var applicationId: String
    
    /**
      *  A function for error callback.
      * Default is: 'console.warn(`New Relic sourcemap upload error: ${err}`)'
      */
    var errorCallback: js.UndefOr[ErrorCallback] = js.undefined
    
    /**
      * a regex used to find js files
      * @default /\.js$/
      */
    var extensionRegex: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Control boolean that decides whether or not to run the plugin.
      * Set to true for builds where you don't want to upload assets to new relic.
      */
    var noop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * unique version for the release identifier
      */
    var releaseId: js.UndefOr[String | Null] = js.undefined
    
    /**
      * unique identifier for the release name
      */
    var releaseName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * the domain your production assets are served from.
      * Written as a complete url.
      * Example: "examplecdn.com"
      */
    var staticAssetUrl: String
    
    /**
      * A function for building the production url your js file is built from.
      * Will be called for every javascript file with four arguments: staticAssetUrl,
      * the public path from your webpack config, the filename, and the webpack stats instance.
      * Defaults to `${removeLastCharIfSlash(url)}${removeLastCharIfSlash(publicPath)}/${file}`
      */
    var staticAssetUrlBuilder: js.UndefOr[StaticAssetUrlBuilder] = js.undefined
  }
  object Options {
    
    inline def apply(apiKey: String, applicationId: String, staticAssetUrl: String): Options = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], staticAssetUrl = staticAssetUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setErrorCallback(value: /* err */ js.Error => Callback): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      inline def setExtensionRegex(value: js.RegExp): Self = StObject.set(x, "extensionRegex", value.asInstanceOf[js.Any])
      
      inline def setExtensionRegexUndefined: Self = StObject.set(x, "extensionRegex", js.undefined)
      
      inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
      
      inline def setNoopUndefined: Self = StObject.set(x, "noop", js.undefined)
      
      inline def setReleaseId(value: String): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
      
      inline def setReleaseIdNull: Self = StObject.set(x, "releaseId", null)
      
      inline def setReleaseIdUndefined: Self = StObject.set(x, "releaseId", js.undefined)
      
      inline def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
      
      inline def setReleaseNameNull: Self = StObject.set(x, "releaseName", null)
      
      inline def setReleaseNameUndefined: Self = StObject.set(x, "releaseName", js.undefined)
      
      inline def setStaticAssetUrl(value: String): Self = StObject.set(x, "staticAssetUrl", value.asInstanceOf[js.Any])
      
      inline def setStaticAssetUrlBuilder(value: (/* url */ String, /* publicPath */ auto | String, /* file */ String) => String): Self = StObject.set(x, "staticAssetUrlBuilder", js.Any.fromFunction3(value))
      
      inline def setStaticAssetUrlBuilderUndefined: Self = StObject.set(x, "staticAssetUrlBuilder", js.undefined)
    }
  }
  
  type StaticAssetUrlBuilder = js.Function3[/* url */ String, /* publicPath */ auto | String, /* file */ String, String]
}
