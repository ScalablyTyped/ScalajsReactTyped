package typingsJapgolly.turndown

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typingsJapgolly.turndown.turndownStrings.Asterisk
import typingsJapgolly.turndown.turndownStrings.AsteriskAsterisk
import typingsJapgolly.turndown.turndownStrings.GraveaccentGraveaccentGraveaccent
import typingsJapgolly.turndown.turndownStrings.Plussign
import typingsJapgolly.turndown.turndownStrings.TildeTildeTilde
import typingsJapgolly.turndown.turndownStrings.__
import typingsJapgolly.turndown.turndownStrings._underscore
import typingsJapgolly.turndown.turndownStrings.`-_`
import typingsJapgolly.turndown.turndownStrings.atx
import typingsJapgolly.turndown.turndownStrings.collapsed
import typingsJapgolly.turndown.turndownStrings.fenced
import typingsJapgolly.turndown.turndownStrings.full
import typingsJapgolly.turndown.turndownStrings.indented
import typingsJapgolly.turndown.turndownStrings.inlined
import typingsJapgolly.turndown.turndownStrings.referenced
import typingsJapgolly.turndown.turndownStrings.setext
import typingsJapgolly.turndown.turndownStrings.shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("turndown", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TurndownService {
    def this(options: Options) = this()
  }
  
  type Filter = TagName | js.Array[TagName] | FilterFunction
  
  type FilterFunction = js.Function2[/* node */ HTMLElement, /* options */ Options, Boolean]
  
  type Node = HTMLElement | Document | DocumentFragment
  
  trait Options extends StObject {
    
    var blankReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var br: js.UndefOr[String] = js.undefined
    
    var bulletListMarker: js.UndefOr[`-_` | Plussign | Asterisk] = js.undefined
    
    var codeBlockStyle: js.UndefOr[indented | fenced] = js.undefined
    
    var defaultReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var emDelimiter: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var fence: js.UndefOr[GraveaccentGraveaccentGraveaccent | TildeTildeTilde] = js.undefined
    
    var headingStyle: js.UndefOr[setext | atx] = js.undefined
    
    var hr: js.UndefOr[String] = js.undefined
    
    var keepReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var linkReferenceStyle: js.UndefOr[full | collapsed | shortcut] = js.undefined
    
    var linkStyle: js.UndefOr[inlined | referenced] = js.undefined
    
    var strongDelimiter: js.UndefOr[__ | AsteriskAsterisk] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlankReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "blankReplacement", js.Any.fromFunction3(value))
      
      inline def setBlankReplacementUndefined: Self = StObject.set(x, "blankReplacement", js.undefined)
      
      inline def setBr(value: String): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setBulletListMarker(value: `-_` | Plussign | Asterisk): Self = StObject.set(x, "bulletListMarker", value.asInstanceOf[js.Any])
      
      inline def setBulletListMarkerUndefined: Self = StObject.set(x, "bulletListMarker", js.undefined)
      
      inline def setCodeBlockStyle(value: indented | fenced): Self = StObject.set(x, "codeBlockStyle", value.asInstanceOf[js.Any])
      
      inline def setCodeBlockStyleUndefined: Self = StObject.set(x, "codeBlockStyle", js.undefined)
      
      inline def setDefaultReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "defaultReplacement", js.Any.fromFunction3(value))
      
      inline def setDefaultReplacementUndefined: Self = StObject.set(x, "defaultReplacement", js.undefined)
      
      inline def setEmDelimiter(value: _underscore | Asterisk): Self = StObject.set(x, "emDelimiter", value.asInstanceOf[js.Any])
      
      inline def setEmDelimiterUndefined: Self = StObject.set(x, "emDelimiter", js.undefined)
      
      inline def setFence(value: GraveaccentGraveaccentGraveaccent | TildeTildeTilde): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setHeadingStyle(value: setext | atx): Self = StObject.set(x, "headingStyle", value.asInstanceOf[js.Any])
      
      inline def setHeadingStyleUndefined: Self = StObject.set(x, "headingStyle", js.undefined)
      
      inline def setHr(value: String): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "keepReplacement", js.Any.fromFunction3(value))
      
      inline def setKeepReplacementUndefined: Self = StObject.set(x, "keepReplacement", js.undefined)
      
      inline def setLinkReferenceStyle(value: full | collapsed | shortcut): Self = StObject.set(x, "linkReferenceStyle", value.asInstanceOf[js.Any])
      
      inline def setLinkReferenceStyleUndefined: Self = StObject.set(x, "linkReferenceStyle", js.undefined)
      
      inline def setLinkStyle(value: inlined | referenced): Self = StObject.set(x, "linkStyle", value.asInstanceOf[js.Any])
      
      inline def setLinkStyleUndefined: Self = StObject.set(x, "linkStyle", js.undefined)
      
      inline def setStrongDelimiter(value: __ | AsteriskAsterisk): Self = StObject.set(x, "strongDelimiter", value.asInstanceOf[js.Any])
      
      inline def setStrongDelimiterUndefined: Self = StObject.set(x, "strongDelimiter", js.undefined)
    }
  }
  
  type Plugin = js.Function1[/* service */ TurndownService, Unit]
  
  type ReplacementFunction = js.Function3[/* content */ String, /* node */ Node, /* options */ Options, String]
  
  trait Rule extends StObject {
    
    var filter: Filter
    
    var replacement: js.UndefOr[ReplacementFunction] = js.undefined
  }
  object Rule {
    
    inline def apply(filter: Filter): Rule = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* node */ HTMLElement, /* options */ Options) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterVarargs(value: TagName*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction3(value))
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
  
  trait Rules extends StObject {
    
    def add(key: Filter, rule: Rule): Unit
    
    var array: js.Array[Rule]
    
    def blankRule(content: String, node: Node, options: Options): String
    @JSName("blankRule")
    var blankRule_Original: ReplacementFunction
    
    def defaultRule(content: String, node: Node, options: Options): String
    @JSName("defaultRule")
    var defaultRule_Original: ReplacementFunction
    
    def forEach(callback: js.Function2[/* rule */ Rule, /* index */ Double, Any]): Unit
    
    def forNode(node: Node): Rule
    
    def keep(filter: Filter): Unit
    
    def keepReplacement(content: String, node: Node, options: Options): String
    @JSName("keepReplacement")
    var keepReplacement_Original: ReplacementFunction
    
    var options: Options
    
    def remove(filter: Filter): Unit
  }
  object Rules {
    
    inline def apply(
      add: (Filter, Rule) => Callback,
      array: js.Array[Rule],
      blankRule: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      defaultRule: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      forEach: js.Function2[/* rule */ Rule, /* index */ Double, Any] => Callback,
      forNode: Node => Rule,
      keep: Filter => Callback,
      keepReplacement: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      options: Options,
      remove: Filter => Callback
    ): Rules = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: Filter, t1: Rule) => (add(t0, t1)).runNow()), array = array.asInstanceOf[js.Any], blankRule = js.Any.fromFunction3(blankRule), defaultRule = js.Any.fromFunction3(defaultRule), forEach = js.Any.fromFunction1((t0: js.Function2[/* rule */ Rule, /* index */ Double, Any]) => forEach(t0).runNow()), forNode = js.Any.fromFunction1(forNode), keep = js.Any.fromFunction1((t0: Filter) => keep(t0).runNow()), keepReplacement = js.Any.fromFunction3(keepReplacement), options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: Filter) => remove(t0).runNow()))
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def setAdd(value: (Filter, Rule) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: Filter, t1: Rule) => (value(t0, t1)).runNow()))
      
      inline def setArray(value: js.Array[Rule]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Rule*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setBlankRule(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "blankRule", js.Any.fromFunction3(value))
      
      inline def setDefaultRule(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "defaultRule", js.Any.fromFunction3(value))
      
      inline def setForEach(value: js.Function2[/* rule */ Rule, /* index */ Double, Any] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* rule */ Rule, /* index */ Double, Any]) => value(t0).runNow()))
      
      inline def setForNode(value: Node => Rule): Self = StObject.set(x, "forNode", js.Any.fromFunction1(value))
      
      inline def setKeep(value: Filter => Callback): Self = StObject.set(x, "keep", js.Any.fromFunction1((t0: Filter) => value(t0).runNow()))
      
      inline def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "keepReplacement", js.Any.fromFunction3(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Filter => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Filter) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.turndown.turndownStrings.a
    - typingsJapgolly.turndown.turndownStrings.abbr
    - typingsJapgolly.turndown.turndownStrings.address
    - typingsJapgolly.turndown.turndownStrings.area
    - typingsJapgolly.turndown.turndownStrings.article
    - typingsJapgolly.turndown.turndownStrings.aside
    - typingsJapgolly.turndown.turndownStrings.audio
    - typingsJapgolly.turndown.turndownStrings.b
    - typingsJapgolly.turndown.turndownStrings.base
    - typingsJapgolly.turndown.turndownStrings.bdi
    - typingsJapgolly.turndown.turndownStrings.bdo
    - typingsJapgolly.turndown.turndownStrings.blockquote
    - typingsJapgolly.turndown.turndownStrings.body
    - typingsJapgolly.turndown.turndownStrings.br
    - typingsJapgolly.turndown.turndownStrings.button
    - typingsJapgolly.turndown.turndownStrings.canvas
    - typingsJapgolly.turndown.turndownStrings.caption
    - typingsJapgolly.turndown.turndownStrings.cite
    - typingsJapgolly.turndown.turndownStrings.code
    - typingsJapgolly.turndown.turndownStrings.col
    - typingsJapgolly.turndown.turndownStrings.colgroup
    - typingsJapgolly.turndown.turndownStrings.data
    - typingsJapgolly.turndown.turndownStrings.datalist
    - typingsJapgolly.turndown.turndownStrings.dd
    - typingsJapgolly.turndown.turndownStrings.del
    - typingsJapgolly.turndown.turndownStrings.details
    - typingsJapgolly.turndown.turndownStrings.dfn
    - typingsJapgolly.turndown.turndownStrings.dialog
    - typingsJapgolly.turndown.turndownStrings.div
    - typingsJapgolly.turndown.turndownStrings.dl
    - typingsJapgolly.turndown.turndownStrings.dt
    - typingsJapgolly.turndown.turndownStrings.em
    - typingsJapgolly.turndown.turndownStrings.embed
    - typingsJapgolly.turndown.turndownStrings.fieldset
    - typingsJapgolly.turndown.turndownStrings.figcaption
    - typingsJapgolly.turndown.turndownStrings.figure
    - typingsJapgolly.turndown.turndownStrings.footer
    - typingsJapgolly.turndown.turndownStrings.form
    - typingsJapgolly.turndown.turndownStrings.h1
    - typingsJapgolly.turndown.turndownStrings.h2
    - typingsJapgolly.turndown.turndownStrings.h3
    - typingsJapgolly.turndown.turndownStrings.h4
    - typingsJapgolly.turndown.turndownStrings.h5
    - typingsJapgolly.turndown.turndownStrings.h6
    - typingsJapgolly.turndown.turndownStrings.head
    - typingsJapgolly.turndown.turndownStrings.header
    - typingsJapgolly.turndown.turndownStrings.hgroup
    - typingsJapgolly.turndown.turndownStrings.hr
    - typingsJapgolly.turndown.turndownStrings.html
    - typingsJapgolly.turndown.turndownStrings.i
    - typingsJapgolly.turndown.turndownStrings.iframe
    - typingsJapgolly.turndown.turndownStrings.img
    - typingsJapgolly.turndown.turndownStrings.input
    - typingsJapgolly.turndown.turndownStrings.ins
    - typingsJapgolly.turndown.turndownStrings.kbd
    - typingsJapgolly.turndown.turndownStrings.label
    - typingsJapgolly.turndown.turndownStrings.legend
    - typingsJapgolly.turndown.turndownStrings.li
    - typingsJapgolly.turndown.turndownStrings.link
    - typingsJapgolly.turndown.turndownStrings.main
    - typingsJapgolly.turndown.turndownStrings.map
    - typingsJapgolly.turndown.turndownStrings.mark
    - typingsJapgolly.turndown.turndownStrings.menu
    - typingsJapgolly.turndown.turndownStrings.meta
    - typingsJapgolly.turndown.turndownStrings.meter
    - typingsJapgolly.turndown.turndownStrings.nav
    - typingsJapgolly.turndown.turndownStrings.noscript
    - typingsJapgolly.turndown.turndownStrings.`object`
    - typingsJapgolly.turndown.turndownStrings.ol
    - typingsJapgolly.turndown.turndownStrings.optgroup
    - typingsJapgolly.turndown.turndownStrings.option
    - typingsJapgolly.turndown.turndownStrings.output
    - typingsJapgolly.turndown.turndownStrings.p
    - typingsJapgolly.turndown.turndownStrings.picture
    - typingsJapgolly.turndown.turndownStrings.pre
    - typingsJapgolly.turndown.turndownStrings.progress
    - typingsJapgolly.turndown.turndownStrings.q
    - typingsJapgolly.turndown.turndownStrings.rp
    - typingsJapgolly.turndown.turndownStrings.rt
    - typingsJapgolly.turndown.turndownStrings.ruby
    - typingsJapgolly.turndown.turndownStrings.s
    - typingsJapgolly.turndown.turndownStrings.samp
    - typingsJapgolly.turndown.turndownStrings.script
    - typingsJapgolly.turndown.turndownStrings.section
    - typingsJapgolly.turndown.turndownStrings.select
    - typingsJapgolly.turndown.turndownStrings.slot
    - typingsJapgolly.turndown.turndownStrings.small
    - typingsJapgolly.turndown.turndownStrings.source
    - typingsJapgolly.turndown.turndownStrings.span
    - typingsJapgolly.turndown.turndownStrings.strong
    - typingsJapgolly.turndown.turndownStrings.style
    - typingsJapgolly.turndown.turndownStrings.sub
    - typingsJapgolly.turndown.turndownStrings.summary
    - typingsJapgolly.turndown.turndownStrings.sup
    - typingsJapgolly.turndown.turndownStrings.table
    - typingsJapgolly.turndown.turndownStrings.tbody
    - typingsJapgolly.turndown.turndownStrings.td
    - typingsJapgolly.turndown.turndownStrings.template
    - typingsJapgolly.turndown.turndownStrings.textarea
    - typingsJapgolly.turndown.turndownStrings.tfoot
    - typingsJapgolly.turndown.turndownStrings.th
    - typingsJapgolly.turndown.turndownStrings.thead
    - typingsJapgolly.turndown.turndownStrings.time
    - typingsJapgolly.turndown.turndownStrings.title
    - typingsJapgolly.turndown.turndownStrings.tr
    - typingsJapgolly.turndown.turndownStrings.track
    - typingsJapgolly.turndown.turndownStrings.u
    - typingsJapgolly.turndown.turndownStrings.ul
    - typingsJapgolly.turndown.turndownStrings.`var`
    - typingsJapgolly.turndown.turndownStrings.video
    - typingsJapgolly.turndown.turndownStrings.wbr
  */
  trait TagName extends StObject
  
  @js.native
  trait TurndownService extends StObject {
    
    def addRule(key: String, rule: Rule): this.type = js.native
    
    def escape(str: String): String = js.native
    
    def keep(filter: Filter): this.type = js.native
    
    var options: Options = js.native
    
    def remove(filter: Filter): this.type = js.native
    
    var rules: Rules = js.native
    
    def turndown(html: String): String = js.native
    def turndown(html: Node): String = js.native
    
    def use(plugins: js.Array[Plugin]): this.type = js.native
    def use(plugins: Plugin): this.type = js.native
  }
}
