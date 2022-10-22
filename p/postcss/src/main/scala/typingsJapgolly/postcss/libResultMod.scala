package typingsJapgolly.postcss

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postcss.libWarningMod.WarningOptions
import typingsJapgolly.postcss.mod.Document
import typingsJapgolly.postcss.mod.Node
import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcss.mod.ProcessOptions
import typingsJapgolly.postcss.mod.Root_
import typingsJapgolly.postcss.mod.SourceMap
import typingsJapgolly.postcss.mod.TransformCallback
import typingsJapgolly.postcss.mod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultMod {
  
  @JSImport("postcss/lib/result", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Result {
    def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Document, opts: ResultOptions) = this()
    /**
      * @param processor Processor used for this transformation.
      * @param root      Root node after all transformations.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Root_, opts: ResultOptions) = this()
  }
  
  trait Message
    extends StObject
       with /* others */ StringDictionary[Any] {
    
    /**
      * Source PostCSS plugin name.
      */
    var plugin: js.UndefOr[String] = js.undefined
    
    /**
      * Message type.
      */
    var `type`: String
  }
  object Message {
    
    inline def apply(`type`: String): Message = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /**
      * An alias for the `Result#css` property.
      * Use it with syntaxes that generate non-CSS output.
      *
      * ```js
      * result.css === result.content
      * ```
      */
    def content: String = js.native
    
    /**
      * A CSS string representing of `Result#root`.
      *
      * ```js
      * postcss.parse('a{}').toResult().css //=> "a{}"
      * ```
      */
    var css: String = js.native
    
    /**
      * Last runned PostCSS plugin.
      */
    var lastPlugin: Plugin | TransformCallback = js.native
    
    /**
      * An instance of `SourceMapGenerator` class from the `source-map` library,
      * representing changes to the `Result#root` instance.
      *
      * ```js
      * result.map.toJSON() //=> { version: 3, file: 'a.css', … }
      * ```
      *
      * ```js
      * if (result.map) {
      *   fs.writeFileSync(result.opts.to + '.map', result.map.toString())
      * }
      * ```
      */
    var map: SourceMap = js.native
    
    /**
      * Contains messages from plugins (e.g., warnings or custom messages).
      * Each message should have type and plugin properties.
      *
      * ```js
      * AtRule: {
      *   import: (atRule, { result }) {
      *     const importedFile = parseImport(atRule)
      *     result.messages.push({
      *       type: 'dependency',
      *       plugin: 'postcss-import',
      *       file: importedFile,
      *       parent: result.opts.from
      *     })
      *   }
      * }
      * ```
      */
    var messages: js.Array[Message] = js.native
    
    /**
      * Options from the `Processor#process` or `Root#toResult` call
      * that produced this Result instance.]
      *
      * ```js
      * root.toResult(opts).opts === opts
      * ```
      */
    var opts: ResultOptions = js.native
    
    /**
      * The Processor instance used for this transformation.
      *
      * ```js
      * for (const plugin of result.processor.plugins) {
      *   if (plugin.postcssPlugin === 'postcss-bad') {
      *     throw 'postcss-good is incompatible with postcss-bad'
      *   }
      * })
      * ```
      */
    var processor: typingsJapgolly.postcss.libProcessorMod.default = js.native
    
    /**
      * Root node after all transformations.
      *
      * ```js
      * root.toResult().root === root
      * ```
      */
    var root: Root_ | Document = js.native
    
    /**
      * Creates an instance of `Warning` and adds it to `Result#messages`.
      *
      * ```js
      * if (decl.important) {
      *   result.warn('Avoid !important', { node: decl, word: '!important' })
      * }
      * ```
      *
      * @param text Warning message.
      * @param opts Warning options.
      * @return Created warning.
      */
    def warn(message: String): Warning = js.native
    def warn(message: String, options: WarningOptions): Warning = js.native
    
    /**
      * Returns warnings from plugins. Filters `Warning` instances
      * from `Result#messages`.
      *
      * ```js
      * result.warnings().forEach(warn => {
      *   console.warn(warn.toString())
      * })
      * ```
      *
      * @return Warnings from plugins.
      */
    def warnings(): js.Array[Warning] = js.native
  }
  
  trait ResultOptions
    extends StObject
       with ProcessOptions {
    
    /**
      * The CSS node that was the source of the warning.
      */
    var node: js.UndefOr[Node] = js.undefined
    
    /**
      * Name of plugin that created this warning. `Result#warn` will fill it
      * automatically with `Plugin#postcssPlugin` value.
      */
    var plugin: js.UndefOr[String] = js.undefined
  }
  object ResultOptions {
    
    inline def apply(): ResultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultOptions]
    }
    
    extension [Self <: ResultOptions](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    }
  }
}
