package typingsJapgolly.postcss

import typingsJapgolly.postcss.anon.ToString
import typingsJapgolly.postcss.mod.AcceptedPlugin
import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcss.mod.ProcessOptions
import typingsJapgolly.postcss.mod.TransformCallback
import typingsJapgolly.postcss.mod.Transformer
import typingsJapgolly.postcss.mod._AcceptedPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessorMod {
  
  @JSImport("postcss/lib/processor", JSImport.Default)
  @js.native
  /**
    * @param plugins PostCSS plugins
    */
  open class default ()
    extends StObject
       with Processor
       with _AcceptedPlugin {
    def this(plugins: js.Array[AcceptedPlugin]) = this()
  }
  
  @js.native
  trait Processor extends StObject {
    
    /**
      * Plugins added to this processor.
      *
      * ```js
      * const processor = postcss([autoprefixer, postcssNested])
      * processor.plugins.length //=> 2
      * ```
      */
    var plugins: js.Array[Plugin | Transformer | TransformCallback] = js.native
    
    /**
      * Parses source CSS and returns a `LazyResult` Promise proxy.
      * Because some plugins can be asynchronous it doesn’t make
      * any transformations. Transformations will be applied
      * in the `LazyResult` methods.
      *
      * ```js
      * processor.process(css, { from: 'a.css', to: 'a.out.css' })
      *   .then(result => {
      *      console.log(result.css)
      *   })
      * ```
      *
      * @param css String with input CSS or any object with a `toString()` method,
      *            like a Buffer. Optionally, senda `Result` instance
      *            and the processor will take the `Root` from it.
      * @param opts Options.
      * @return Promise proxy.
      */
    def process(css: String): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: String, options: ProcessOptions): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: ToString): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: ToString, options: ProcessOptions): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libLazyResultMod.default): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libLazyResultMod.default, options: ProcessOptions): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libResultMod.default): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libResultMod.default, options: ProcessOptions): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libRootMod.default): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    def process(css: typingsJapgolly.postcss.libRootMod.default, options: ProcessOptions): typingsJapgolly.postcss.libLazyResultMod.default | typingsJapgolly.postcss.libNoWorkResultMod.default = js.native
    
    /**
      * Adds a plugin to be used as a CSS processor.
      *
      * PostCSS plugin can be in 4 formats:
      * * A plugin in `Plugin` format.
      * * A plugin creator function with `pluginCreator.postcss = true`.
      *   PostCSS will call this function without argument to get plugin.
      * * A function. PostCSS will pass the function a @{link Root}
      *   as the first argument and current `Result` instance
      *   as the second.
      * * Another `Processor` instance. PostCSS will copy plugins
      *   from that instance into this one.
      *
      * Plugins can also be added by passing them as arguments when creating
      * a `postcss` instance (see [`postcss(plugins)`]).
      *
      * Asynchronous plugins should return a `Promise` instance.
      *
      * ```js
      * const processor = postcss()
      *   .use(autoprefixer)
      *   .use(postcssNested)
      * ```
      *
      * @param plugin PostCSS plugin or `Processor` with plugins.
      * @return Current processor to make methods chain.
      */
    def use(plugin: AcceptedPlugin): this.type = js.native
    
    /**
      * Current PostCSS version.
      *
      * ```js
      * if (result.processor.version.split('.')[0] !== '6') {
      *   throw new Error('This plugin works only with PostCSS 6')
      * }
      * ```
      */
    var version: String = js.native
  }
}
