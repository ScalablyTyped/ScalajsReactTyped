package typingsJapgolly.cspHtmlWebpackPlugin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cspHtmlWebpackPlugin.anon.AdditionalOptionspolicyPo
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import typingsJapgolly.tapable.mod.AsyncSeriesWaterfallHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csp-html-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * Setup for our plugin
    * @param policy - the policy object
    * @param additionalOpts - additional config options
    */
  open class ^ ()
    extends StObject
       with CspHtmlWebpackPlugin {
    def this(policy: Policy) = this()
    def this(policy: Unit, additionalOpts: AdditionalOptions) = this()
    def this(policy: Policy, additionalOpts: AdditionalOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  // Fallback when nothing works.
  /**
    * Additional options. Defaults are:
    *
    * ```javascript
    * {
    *   enabled: true
    *   hashingMethod: 'sha256',
    *   hashEnabled: {
    *     'script-src': true,
    *     'style-src': true
    *   },
    *   nonceEnabled: {
    *     'script-src': true,
    *     'style-src': true
    *   }
    * }
    * ```
    */
  trait AdditionalOptions extends StObject {
    
    /**
      * If false, or the function returns false, the empty CSP tag will be
      * stripped from the html output.
      *
      * * The `htmlPluginData` is passed into the function as its first
      *   param.
      * * If `enabled` is set the false, it will disable generating a CSP for
      *   all instances of HtmlWebpackPlugin in your webpack config.
      */
    var enabled: js.UndefOr[Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include hashes.
      */
    var hashEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    /**
      * The hashing method. Your node version must also accept this hashing
      * method.
      */
    var hashingMethod: js.UndefOr[sha256 | sha384 | sha512] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include nonces.
      */
    var nonceEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  }
  object AdditionalOptions {
    
    inline def apply(): AdditionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalOptions]
    }
    
    extension [Self <: AdditionalOptions](x: Self) {
      
      inline def setEnabled(value: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledFunction1(value: /* htmlPluginData */ HtmlPluginData => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHashEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "hashEnabled", value.asInstanceOf[js.Any])
      
      inline def setHashEnabledUndefined: Self = StObject.set(x, "hashEnabled", js.undefined)
      
      inline def setHashingMethod(value: sha256 | sha384 | sha512): Self = StObject.set(x, "hashingMethod", value.asInstanceOf[js.Any])
      
      inline def setHashingMethodUndefined: Self = StObject.set(x, "hashingMethod", js.undefined)
      
      inline def setNonceEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "nonceEnabled", value.asInstanceOf[js.Any])
      
      inline def setNonceEnabledUndefined: Self = StObject.set(x, "nonceEnabled", js.undefined)
    }
  }
  
  trait CspHtmlWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object CspHtmlWebpackPlugin {
    
    inline def apply(apply: Compiler => Callback): CspHtmlWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[CspHtmlWebpackPlugin]
    }
    
    extension [Self <: CspHtmlWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
  
  // HtmlWebpackPlugin v3 and v4 use different hook interfaces. Figure out
  // which we're using and infer the generic type variable inside.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    html-webpack-plugin.html-webpack-plugin.Hooks extends csp-html-webpack-plugin.csp-html-webpack-plugin.HtmlPluginDataHookV3<infer T> ? T : html-webpack-plugin.html-webpack-plugin.Hooks extends csp-html-webpack-plugin.csp-html-webpack-plugin.HtmlPluginDataHookV4<infer U> ? U : any
    }}}
    */
  @js.native
  trait HtmlPluginData extends StObject
  
  // Helpers for extracting the relevant generic types from
  // HtmlWebpackPlugin.Hooks.
  trait HtmlPluginDataHookV3[T] extends StObject {
    
    var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]
  }
  object HtmlPluginDataHookV3 {
    
    inline def apply[T](htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]): HtmlPluginDataHookV3[T] = {
      val __obj = js.Dynamic.literal(htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlPluginDataHookV3[T]]
    }
    
    extension [Self <: HtmlPluginDataHookV3[?], T](x: Self & HtmlPluginDataHookV3[T]) {
      
      inline def setHtmlWebpackPluginAfterHtmlProcessing(value: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]): Self = StObject.set(x, "htmlWebpackPluginAfterHtmlProcessing", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlPluginDataHookV4[T] extends StObject {
    
    var beforeEmit: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]
  }
  object HtmlPluginDataHookV4 {
    
    inline def apply[T](beforeEmit: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]): HtmlPluginDataHookV4[T] = {
      val __obj = js.Dynamic.literal(beforeEmit = beforeEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlPluginDataHookV4[T]]
    }
    
    extension [Self <: HtmlPluginDataHookV4[?], T](x: Self & HtmlPluginDataHookV4[T]) {
      
      inline def setBeforeEmit(value: AsyncSeriesWaterfallHook[T, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeEmit", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A flat object which defines your CSP policy. Values can either be a
    * string or an array of strings.
    *
    * The default policy is:
    *
    * ```javascript
    * {
    *   'base-uri': "'self'",
    *   'object-src': "'none'",
    *   'script-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"],
    *   'style-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"]
    * }
    * ```
    */
  type Policy = StringDictionary[String | js.Array[String]]
  
  /* augmented module */
  object htmlWebpackPluginAugmentingMod {
    
    trait Options extends StObject {
      
      var cspPlugin: js.UndefOr[AdditionalOptionspolicyPo] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCspPlugin(value: AdditionalOptionspolicyPo): Self = StObject.set(x, "cspPlugin", value.asInstanceOf[js.Any])
        
        inline def setCspPluginUndefined: Self = StObject.set(x, "cspPlugin", js.undefined)
      }
    }
  }
}
