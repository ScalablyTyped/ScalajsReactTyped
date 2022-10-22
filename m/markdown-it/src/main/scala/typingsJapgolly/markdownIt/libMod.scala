package typingsJapgolly.markdownIt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.linkifyIt.mod.LinkifyIt
import typingsJapgolly.markdownIt.libCommonUtilsMod.Utils
import typingsJapgolly.markdownIt.libHelpersMod.Helpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod extends Shortcut {
  
  @JSImport("markdown-it/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MarkdownItConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("markdown-it/lib", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with MarkdownIt {
    def this(options: Options) = this()
    def this(presetName: PresetName) = this()
    def this(presetName: PresetName, options: Options) = this()
  }
  
  @js.native
  trait MarkdownIt extends StObject {
    
    /**
      * Instance of [[ParserBlock]]. You may need it to add new rules when
      * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
      * [[MarkdownIt.enable]].
      */
    val block: typingsJapgolly.markdownIt.libParserBlockMod.^ = js.native
    
    /**
      * *chainable*, *internal*
      *
      * Batch load of all options and compenent settings. This is internal method,
      * and you probably will not need it. But if you with - see available presets
      * and data structure [here](https://github.com/markdown-it/markdown-it/tree/master/lib/presets)
      *
      * We strongly recommend to use presets instead of direct config loads. That
      * will give better compatibility with next versions.
      */
    def configure(presets: PresetName): this.type = js.native
    
    /**
      * Instance of [[Core]] chain executor. You may need it to add new rules when
      * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
      * [[MarkdownIt.enable]].
      */
    val core: typingsJapgolly.markdownIt.libParserCoreMod.^ = js.native
    
    /**
      * *chainable*
      *
      * The same as [[MarkdownIt.enable]], but turn specified rules off.
      *
      * @param list rule name or list of rule names to disable.
      * @param ignoreInvalid set `true` to ignore errors when rule not found.
      */
    def disable(list: String): this.type = js.native
    def disable(list: String, ignoreInvalid: Boolean): this.type = js.native
    def disable(list: js.Array[String]): this.type = js.native
    def disable(list: js.Array[String], ignoreInvalid: Boolean): this.type = js.native
    
    /**
      * *chainable*
      *
      * Enable list or rules. It will automatically find appropriate components,
      * containing rules with given names. If rule not found, and `ignoreInvalid`
      * not set - throws exception.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')()
      *             .enable(['sub', 'sup'])
      *             .disable('smartquotes');
      * ```
      *
      * @param list rule name or list of rule names to enable
      * @param ignoreInvalid set `true` to ignore errors when rule not found.
      */
    def enable(list: String): this.type = js.native
    def enable(list: String, ignoreInvalid: Boolean): this.type = js.native
    def enable(list: js.Array[String]): this.type = js.native
    def enable(list: js.Array[String], ignoreInvalid: Boolean): this.type = js.native
    
    val helpers: Helpers = js.native
    
    /**
      * Instance of [[ParserInline]]. You may need it to add new rules when
      * writing plugins. For simple rules control use [[MarkdownIt.disable]] and
      * [[MarkdownIt.enable]].
      */
    val `inline`: typingsJapgolly.markdownIt.libParserInlineMod.^ = js.native
    
    /**
      * [linkify-it](https://github.com/markdown-it/linkify-it) instance.
      * Used by [linkify](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/linkify.js)
      * rule.
      */
    val linkify: LinkifyIt = js.native
    
    /**
      * Function used to encode link url to a machine-readable format,
      * which includes url-encoding, punycode, etc.
      */
    def normalizeLink(url: String): String = js.native
    
    /**
      * Function used to decode link url to a human-readable format`
      */
    def normalizeLinkText(url: String): String = js.native
    
    val options: Options = js.native
    
    /**
      * *internal*
      *
      * Parse input string and returns list of block tokens (special token type
      * "inline" will contain list of inline tokens). You should not call this
      * method directly, until you write custom renderer (for example, to produce
      * AST).
      *
      * `env` is used to pass data between "distributed" rules and return additional
      * metadata like reference info, needed for the renderer. It also can be used to
      * inject data in specific cases. Usually, you will be ok to pass `{}`,
      * and then pass updated object to renderer.
      *
      * @param src source string
      * @param env environment sandbox
      */
    def parse(src: String, env: Any): js.Array[typingsJapgolly.markdownIt.libTokenMod.^] = js.native
    
    /**
      * *internal*
      *
      * The same as [[MarkdownIt.parse]] but skip all block rules. It returns the
      * block tokens list with the single `inline` element, containing parsed inline
      * tokens in `children` property. Also updates `env` object.
      *
      * @param src source string
      * @param env environment sandbox
      */
    def parseInline(src: String, env: Any): js.Array[typingsJapgolly.markdownIt.libTokenMod.^] = js.native
    
    /**
      * Render markdown string into html. It does all magic for you :).
      *
      * `env` can be used to inject additional metadata (`{}` by default).
      * But you will not need it with high probability. See also comment
      * in [[MarkdownIt.parse]].
      *
      * @param src source string
      * @param env environment sandbox
      */
    def render(src: String): String = js.native
    def render(src: String, env: Any): String = js.native
    
    /**
      * Similar to [[MarkdownIt.render]] but for single paragraph content. Result
      * will NOT be wrapped into `<p>` tags.
      *
      * @param src source string
      * @param env environment sandbox
      */
    def renderInline(src: String): String = js.native
    def renderInline(src: String, env: Any): String = js.native
    
    /**
      * Instance of [[Renderer]]. Use it to modify output look. Or to add rendering
      * rules for new token types, generated by plugins.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * function myToken(tokens, idx, options, env, self) {
      *   //...
      *   return result;
      * };
      *
      * md.renderer.rules['my_token'] = myToken
      * ```
      *
      * See [[Renderer]] docs and [source code](https://github.com/markdown-it/markdown-it/blob/master/lib/renderer.js).
      */
    val renderer: typingsJapgolly.markdownIt.libRendererMod.^ = js.native
    
    /**
      * *chainable*
      *
      * Set parser options (in the same format as in constructor). Probably, you
      * will never need it, but you can change options after constructor call.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')()
      *             .set({ html: true, breaks: true })
      *             .set({ typographer: true });
      * ```
      *
      * __Note:__ To achieve the best possible performance, don't modify a
      * `markdown-it` instance options on the fly. If you need multiple configurations
      * it's best to create multiple instances and initialize each with separate
      * config.
      */
    def set(options: Options): this.type = js.native
    
    /**
      * *chainable*
      *
      * Load specified plugin with given params into current parser instance.
      * It's just a sugar to call `plugin(md, params)` with curring.
      *
      * ##### Example
      *
      * ```javascript
      * var iterator = require('markdown-it-for-inline');
      * var md = require('markdown-it')()
      *             .use(iterator, 'foo_replace', 'text', function (tokens, idx) {
      *               tokens[idx].content = tokens[idx].content.replace(/foo/g, 'bar');
      *             });
      * ```
      */
    def use(plugin: PluginSimple): this.type = js.native
    def use(plugin: PluginWithParams, params: Any*): this.type = js.native
    def use[T](plugin: PluginWithOptions[T]): this.type = js.native
    def use[T](plugin: PluginWithOptions[T], options: T): this.type = js.native
    
    val utils: Utils = js.native
    
    /**
      * Link validation function. CommonMark allows too much in links. By default
      * we disable `javascript:`, `vbscript:`, `file:` schemas, and almost all `data:...` schemas
      * except some embedded image types.
      *
      * You can change this behaviour:
      *
      * ```javascript
      * var md = require('markdown-it')();
      * // enable everything
      * md.validateLink = function () { return true; }
      * ```
      */
    def validateLink(url: String): Boolean = js.native
  }
  
  @js.native
  trait MarkdownItConstructor
    extends StObject
       with Instantiable0[MarkdownIt]
       with Instantiable1[(/* options */ Options) | (/* presetName */ PresetName), MarkdownIt]
       with Instantiable2[/* presetName */ PresetName, /* options */ Options, MarkdownIt] {
    
    def apply(): MarkdownIt = js.native
    def apply(options: Options): MarkdownIt = js.native
    def apply(presetName: PresetName): MarkdownIt = js.native
    def apply(presetName: PresetName, options: Options): MarkdownIt = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Set `true` to convert `\n` in paragraphs into `<br>`.
      * @default false
      */
    var breaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Highlighter function for fenced code blocks.
      * Highlighter `function (str, lang, attrs)` should return escaped HTML. It can
      * also return empty string if the source was not changed and should be escaped
      * externally. If result starts with <pre... internal wrapper is skipped.
      * @default null
      */
    var highlight: js.UndefOr[
        (js.Function3[/* str */ String, /* lang */ String, /* attrs */ String, String]) | Null
      ] = js.undefined
    
    /**
      * Set `true` to enable HTML tags in source. Be careful!
      * That's not safe! You may need external sanitizer to protect output from XSS.
      * It's better to extend features via plugins, instead of enabling HTML.
      * @default false
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS language class prefix for fenced blocks.
      * Can be useful for external highlighters.
      * @default 'language-'
      */
    var langPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Set `true` to autoconvert URL-like text to links.
      * @default false
      */
    var linkify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Double + single quotes replacement
      * pairs, when typographer enabled and smartquotes on. For example, you can
      * use `'«»„“'` for Russian, `'„“‚‘'` for German, and
      * `['«\xA0', '\xA0»', '‹\xA0', '\xA0›']` for French (including nbsp).
      * @default '“”‘’'
      */
    var quotes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Set `true` to enable [some language-neutral replacement](https://github.com/markdown-it/markdown-it/blob/master/lib/rules_core/replacements.js) +
      * quotes beautification (smartquotes).
      * @default false
      */
    var typographer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set `true` to add '/' when closing single tags
      * (`<br />`). This is needed only for full CommonMark compatibility. In real
      * world you will need HTML output.
      * @default false
      */
    var xhtmlOut: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
      
      inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
      
      inline def setHighlight(value: (/* str */ String, /* lang */ String, /* attrs */ String) => String): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
      
      inline def setHighlightNull: Self = StObject.set(x, "highlight", null)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
      
      inline def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
      
      inline def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
      
      inline def setLinkifyUndefined: Self = StObject.set(x, "linkify", js.undefined)
      
      inline def setQuotes(value: String | js.Array[String]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setQuotesVarargs(value: String*): Self = StObject.set(x, "quotes", js.Array(value*))
      
      inline def setTypographer(value: Boolean): Self = StObject.set(x, "typographer", value.asInstanceOf[js.Any])
      
      inline def setTypographerUndefined: Self = StObject.set(x, "typographer", js.undefined)
      
      inline def setXhtmlOut(value: Boolean): Self = StObject.set(x, "xhtmlOut", value.asInstanceOf[js.Any])
      
      inline def setXhtmlOutUndefined: Self = StObject.set(x, "xhtmlOut", js.undefined)
    }
  }
  
  type PluginSimple = js.Function1[/* md */ MarkdownIt, Unit]
  
  type PluginWithOptions[T] = js.Function2[/* md */ MarkdownIt, /* options */ js.UndefOr[T], Unit]
  
  @js.native
  trait PluginWithParams extends StObject {
    
    def apply(md: MarkdownIt, params: Any*): Unit = js.native
  }
  
  /**
    * MarkdownIt provides named presets as a convenience to quickly
    * enable/disable active syntax rules and options for common use cases.
    *
    * - ["commonmark"](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/commonmark.js) -
    *   configures parser to strict [CommonMark](http://commonmark.org/) mode.
    * - [default](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/default.js) -
    *   similar to GFM, used when no preset name given. Enables all available rules,
    *   but still without html, typographer & autolinker.
    * - ["zero"](https://github.com/markdown-it/markdown-it/blob/master/lib/presets/zero.js) -
    *   all rules disabled. Useful to quickly setup your config via `.enable()`.
    *   For example, when you need only `bold` and `italic` markup and nothing else.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.markdownIt.markdownItStrings.default
    - typingsJapgolly.markdownIt.markdownItStrings.zero
    - typingsJapgolly.markdownIt.markdownItStrings.commonmark
  */
  trait PresetName extends StObject
  object PresetName {
    
    inline def default: typingsJapgolly.markdownIt.markdownItStrings.default = "default".asInstanceOf[typingsJapgolly.markdownIt.markdownItStrings.default]
    
    inline def commonmark: typingsJapgolly.markdownIt.markdownItStrings.commonmark = "commonmark".asInstanceOf[typingsJapgolly.markdownIt.markdownItStrings.commonmark]
    
    inline def zero: typingsJapgolly.markdownIt.markdownItStrings.zero = "zero".asInstanceOf[typingsJapgolly.markdownIt.markdownItStrings.zero]
  }
  
  type _To = js.Object & MarkdownItConstructor
  
  /* This means you don't have to write `^`, but can instead just say `libMod.foo` */
  override def _to: js.Object & MarkdownItConstructor = ^
}
