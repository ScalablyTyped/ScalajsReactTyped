package typingsJapgolly.consolidate

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.consolidate.anon.DictotherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("consolidate", JSImport.Namespace)
  @js.native
  val ^ : Consolidate = js.native
  
  trait Consolidate
    extends StObject
       with ConsolidateType {
    
    /**
      * Clear the cache.
      *
      * @api public
      */
    def clearCache(): Unit
    
    /**
      * expose the instance of the engine
      */
    var requires: RequiresType
  }
  object Consolidate {
    
    inline def apply(
      `arc-templates`: RendererInterface,
      atpl: RendererInterface,
      bracket: RendererInterface,
      clearCache: Callback,
      dot: RendererInterface,
      dust: RendererInterface,
      eco: RendererInterface,
      ect: RendererInterface,
      ejs: RendererInterface,
      haml: RendererInterface,
      `haml-coffee`: RendererInterface,
      hamlet: RendererInterface,
      handlebars: RendererInterface,
      hogan: RendererInterface,
      htmling: RendererInterface,
      jade: RendererInterface,
      jazz: RendererInterface,
      jqtpl: RendererInterface,
      just: RendererInterface,
      liquid: RendererInterface,
      liquor: RendererInterface,
      lodash: RendererInterface,
      marko: RendererInterface,
      mote: RendererInterface,
      mustache: RendererInterface,
      nunjucks: RendererInterface,
      plates: RendererInterface,
      pug: RendererInterface,
      qejs: RendererInterface,
      ractive: RendererInterface,
      razor: RendererInterface,
      react: RendererInterface,
      requires: RequiresType,
      slm: RendererInterface,
      squirrelly: RendererInterface,
      swig: RendererInterface,
      teacup: RendererInterface,
      templayed: RendererInterface,
      toffee: RendererInterface,
      twig: RendererInterface,
      underscore: RendererInterface,
      vash: RendererInterface,
      velocityjs: RendererInterface,
      walrus: RendererInterface,
      whiskers: RendererInterface
    ): Consolidate = {
      val __obj = js.Dynamic.literal(atpl = atpl.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], clearCache = clearCache.toJsFn, dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consolidate]
    }
    
    extension [Self <: Consolidate](x: Self) {
      
      inline def setClearCache(value: Callback): Self = StObject.set(x, "clearCache", value.toJsFn)
      
      inline def setRequires(value: RequiresType): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ engine in consolidate.consolidate.SupportedTemplateEngines ]: consolidate.consolidate.RendererInterface} */
  trait ConsolidateType extends StObject {
    
    def `arc-templates`(path: String): typingsJapgolly.bluebird.mod.^[String]
    def `arc-templates`(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def `arc-templates`(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def `arc-templates`(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("arc-templates")
    var `arc-templates_Original`: RendererInterface
    
    def atpl(path: String): typingsJapgolly.bluebird.mod.^[String]
    def atpl(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def atpl(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def atpl(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("atpl")
    var atpl_Original: RendererInterface
    
    def bracket(path: String): typingsJapgolly.bluebird.mod.^[String]
    def bracket(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def bracket(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def bracket(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("bracket")
    var bracket_Original: RendererInterface
    
    def dot(path: String): typingsJapgolly.bluebird.mod.^[String]
    def dot(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def dot(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def dot(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("dot")
    var dot_Original: RendererInterface
    
    def dust(path: String): typingsJapgolly.bluebird.mod.^[String]
    def dust(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def dust(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def dust(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("dust")
    var dust_Original: RendererInterface
    
    def eco(path: String): typingsJapgolly.bluebird.mod.^[String]
    def eco(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def eco(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def eco(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("eco")
    var eco_Original: RendererInterface
    
    def ect(path: String): typingsJapgolly.bluebird.mod.^[String]
    def ect(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def ect(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def ect(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("ect")
    var ect_Original: RendererInterface
    
    def ejs(path: String): typingsJapgolly.bluebird.mod.^[String]
    def ejs(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def ejs(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def ejs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("ejs")
    var ejs_Original: RendererInterface
    
    def haml(path: String): typingsJapgolly.bluebird.mod.^[String]
    def haml(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def haml(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def haml(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    
    def `haml-coffee`(path: String): typingsJapgolly.bluebird.mod.^[String]
    def `haml-coffee`(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def `haml-coffee`(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def `haml-coffee`(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("haml-coffee")
    var `haml-coffee_Original`: RendererInterface
    
    @JSName("haml")
    var haml_Original: RendererInterface
    
    def hamlet(path: String): typingsJapgolly.bluebird.mod.^[String]
    def hamlet(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def hamlet(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def hamlet(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("hamlet")
    var hamlet_Original: RendererInterface
    
    def handlebars(path: String): typingsJapgolly.bluebird.mod.^[String]
    def handlebars(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def handlebars(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def handlebars(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("handlebars")
    var handlebars_Original: RendererInterface
    
    def hogan(path: String): typingsJapgolly.bluebird.mod.^[String]
    def hogan(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def hogan(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def hogan(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("hogan")
    var hogan_Original: RendererInterface
    
    def htmling(path: String): typingsJapgolly.bluebird.mod.^[String]
    def htmling(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def htmling(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def htmling(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("htmling")
    var htmling_Original: RendererInterface
    
    def jade(path: String): typingsJapgolly.bluebird.mod.^[String]
    def jade(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def jade(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def jade(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("jade")
    var jade_Original: RendererInterface
    
    def jazz(path: String): typingsJapgolly.bluebird.mod.^[String]
    def jazz(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def jazz(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def jazz(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("jazz")
    var jazz_Original: RendererInterface
    
    def jqtpl(path: String): typingsJapgolly.bluebird.mod.^[String]
    def jqtpl(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def jqtpl(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def jqtpl(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("jqtpl")
    var jqtpl_Original: RendererInterface
    
    def just(path: String): typingsJapgolly.bluebird.mod.^[String]
    def just(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def just(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def just(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("just")
    var just_Original: RendererInterface
    
    def liquid(path: String): typingsJapgolly.bluebird.mod.^[String]
    def liquid(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def liquid(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def liquid(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("liquid")
    var liquid_Original: RendererInterface
    
    def liquor(path: String): typingsJapgolly.bluebird.mod.^[String]
    def liquor(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def liquor(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def liquor(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("liquor")
    var liquor_Original: RendererInterface
    
    def lodash(path: String): typingsJapgolly.bluebird.mod.^[String]
    def lodash(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def lodash(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def lodash(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("lodash")
    var lodash_Original: RendererInterface
    
    def marko(path: String): typingsJapgolly.bluebird.mod.^[String]
    def marko(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def marko(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def marko(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("marko")
    var marko_Original: RendererInterface
    
    def mote(path: String): typingsJapgolly.bluebird.mod.^[String]
    def mote(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def mote(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def mote(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("mote")
    var mote_Original: RendererInterface
    
    def mustache(path: String): typingsJapgolly.bluebird.mod.^[String]
    def mustache(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def mustache(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def mustache(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("mustache")
    var mustache_Original: RendererInterface
    
    def nunjucks(path: String): typingsJapgolly.bluebird.mod.^[String]
    def nunjucks(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def nunjucks(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def nunjucks(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("nunjucks")
    var nunjucks_Original: RendererInterface
    
    def plates(path: String): typingsJapgolly.bluebird.mod.^[String]
    def plates(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def plates(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def plates(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("plates")
    var plates_Original: RendererInterface
    
    def pug(path: String): typingsJapgolly.bluebird.mod.^[String]
    def pug(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def pug(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def pug(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("pug")
    var pug_Original: RendererInterface
    
    def qejs(path: String): typingsJapgolly.bluebird.mod.^[String]
    def qejs(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def qejs(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def qejs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("qejs")
    var qejs_Original: RendererInterface
    
    def ractive(path: String): typingsJapgolly.bluebird.mod.^[String]
    def ractive(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def ractive(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def ractive(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("ractive")
    var ractive_Original: RendererInterface
    
    def razor(path: String): typingsJapgolly.bluebird.mod.^[String]
    def razor(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def razor(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def razor(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("razor")
    var razor_Original: RendererInterface
    
    def react(path: String): typingsJapgolly.bluebird.mod.^[String]
    def react(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def react(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def react(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("react")
    var react_Original: RendererInterface
    
    def slm(path: String): typingsJapgolly.bluebird.mod.^[String]
    def slm(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def slm(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def slm(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("slm")
    var slm_Original: RendererInterface
    
    def squirrelly(path: String): typingsJapgolly.bluebird.mod.^[String]
    def squirrelly(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def squirrelly(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def squirrelly(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("squirrelly")
    var squirrelly_Original: RendererInterface
    
    def swig(path: String): typingsJapgolly.bluebird.mod.^[String]
    def swig(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def swig(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def swig(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("swig")
    var swig_Original: RendererInterface
    
    def teacup(path: String): typingsJapgolly.bluebird.mod.^[String]
    def teacup(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def teacup(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def teacup(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("teacup")
    var teacup_Original: RendererInterface
    
    def templayed(path: String): typingsJapgolly.bluebird.mod.^[String]
    def templayed(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def templayed(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def templayed(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("templayed")
    var templayed_Original: RendererInterface
    
    def toffee(path: String): typingsJapgolly.bluebird.mod.^[String]
    def toffee(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def toffee(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def toffee(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("toffee")
    var toffee_Original: RendererInterface
    
    def twig(path: String): typingsJapgolly.bluebird.mod.^[String]
    def twig(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def twig(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def twig(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("twig")
    var twig_Original: RendererInterface
    
    def underscore(path: String): typingsJapgolly.bluebird.mod.^[String]
    def underscore(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def underscore(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def underscore(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("underscore")
    var underscore_Original: RendererInterface
    
    def vash(path: String): typingsJapgolly.bluebird.mod.^[String]
    def vash(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def vash(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def vash(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("vash")
    var vash_Original: RendererInterface
    
    def velocityjs(path: String): typingsJapgolly.bluebird.mod.^[String]
    def velocityjs(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def velocityjs(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def velocityjs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("velocityjs")
    var velocityjs_Original: RendererInterface
    
    def walrus(path: String): typingsJapgolly.bluebird.mod.^[String]
    def walrus(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def walrus(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def walrus(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("walrus")
    var walrus_Original: RendererInterface
    
    def whiskers(path: String): typingsJapgolly.bluebird.mod.^[String]
    def whiskers(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any
    def whiskers(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String]
    def whiskers(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any
    @JSName("whiskers")
    var whiskers_Original: RendererInterface
  }
  object ConsolidateType {
    
    inline def apply(
      `arc-templates`: RendererInterface,
      atpl: RendererInterface,
      bracket: RendererInterface,
      dot: RendererInterface,
      dust: RendererInterface,
      eco: RendererInterface,
      ect: RendererInterface,
      ejs: RendererInterface,
      haml: RendererInterface,
      `haml-coffee`: RendererInterface,
      hamlet: RendererInterface,
      handlebars: RendererInterface,
      hogan: RendererInterface,
      htmling: RendererInterface,
      jade: RendererInterface,
      jazz: RendererInterface,
      jqtpl: RendererInterface,
      just: RendererInterface,
      liquid: RendererInterface,
      liquor: RendererInterface,
      lodash: RendererInterface,
      marko: RendererInterface,
      mote: RendererInterface,
      mustache: RendererInterface,
      nunjucks: RendererInterface,
      plates: RendererInterface,
      pug: RendererInterface,
      qejs: RendererInterface,
      ractive: RendererInterface,
      razor: RendererInterface,
      react: RendererInterface,
      slm: RendererInterface,
      squirrelly: RendererInterface,
      swig: RendererInterface,
      teacup: RendererInterface,
      templayed: RendererInterface,
      toffee: RendererInterface,
      twig: RendererInterface,
      underscore: RendererInterface,
      vash: RendererInterface,
      velocityjs: RendererInterface,
      walrus: RendererInterface,
      whiskers: RendererInterface
    ): ConsolidateType = {
      val __obj = js.Dynamic.literal(atpl = atpl.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsolidateType]
    }
    
    extension [Self <: ConsolidateType](x: Self) {
      
      inline def `setArc-templates`(value: RendererInterface): Self = StObject.set(x, "arc-templates", value.asInstanceOf[js.Any])
      
      inline def setAtpl(value: RendererInterface): Self = StObject.set(x, "atpl", value.asInstanceOf[js.Any])
      
      inline def setBracket(value: RendererInterface): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
      
      inline def setDot(value: RendererInterface): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDust(value: RendererInterface): Self = StObject.set(x, "dust", value.asInstanceOf[js.Any])
      
      inline def setEco(value: RendererInterface): Self = StObject.set(x, "eco", value.asInstanceOf[js.Any])
      
      inline def setEct(value: RendererInterface): Self = StObject.set(x, "ect", value.asInstanceOf[js.Any])
      
      inline def setEjs(value: RendererInterface): Self = StObject.set(x, "ejs", value.asInstanceOf[js.Any])
      
      inline def setHaml(value: RendererInterface): Self = StObject.set(x, "haml", value.asInstanceOf[js.Any])
      
      inline def `setHaml-coffee`(value: RendererInterface): Self = StObject.set(x, "haml-coffee", value.asInstanceOf[js.Any])
      
      inline def setHamlet(value: RendererInterface): Self = StObject.set(x, "hamlet", value.asInstanceOf[js.Any])
      
      inline def setHandlebars(value: RendererInterface): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHogan(value: RendererInterface): Self = StObject.set(x, "hogan", value.asInstanceOf[js.Any])
      
      inline def setHtmling(value: RendererInterface): Self = StObject.set(x, "htmling", value.asInstanceOf[js.Any])
      
      inline def setJade(value: RendererInterface): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      inline def setJazz(value: RendererInterface): Self = StObject.set(x, "jazz", value.asInstanceOf[js.Any])
      
      inline def setJqtpl(value: RendererInterface): Self = StObject.set(x, "jqtpl", value.asInstanceOf[js.Any])
      
      inline def setJust(value: RendererInterface): Self = StObject.set(x, "just", value.asInstanceOf[js.Any])
      
      inline def setLiquid(value: RendererInterface): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
      
      inline def setLiquor(value: RendererInterface): Self = StObject.set(x, "liquor", value.asInstanceOf[js.Any])
      
      inline def setLodash(value: RendererInterface): Self = StObject.set(x, "lodash", value.asInstanceOf[js.Any])
      
      inline def setMarko(value: RendererInterface): Self = StObject.set(x, "marko", value.asInstanceOf[js.Any])
      
      inline def setMote(value: RendererInterface): Self = StObject.set(x, "mote", value.asInstanceOf[js.Any])
      
      inline def setMustache(value: RendererInterface): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setNunjucks(value: RendererInterface): Self = StObject.set(x, "nunjucks", value.asInstanceOf[js.Any])
      
      inline def setPlates(value: RendererInterface): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      inline def setPug(value: RendererInterface): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      inline def setQejs(value: RendererInterface): Self = StObject.set(x, "qejs", value.asInstanceOf[js.Any])
      
      inline def setRactive(value: RendererInterface): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
      
      inline def setRazor(value: RendererInterface): Self = StObject.set(x, "razor", value.asInstanceOf[js.Any])
      
      inline def setReact(value: RendererInterface): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setSlm(value: RendererInterface): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
      
      inline def setSquirrelly(value: RendererInterface): Self = StObject.set(x, "squirrelly", value.asInstanceOf[js.Any])
      
      inline def setSwig(value: RendererInterface): Self = StObject.set(x, "swig", value.asInstanceOf[js.Any])
      
      inline def setTeacup(value: RendererInterface): Self = StObject.set(x, "teacup", value.asInstanceOf[js.Any])
      
      inline def setTemplayed(value: RendererInterface): Self = StObject.set(x, "templayed", value.asInstanceOf[js.Any])
      
      inline def setToffee(value: RendererInterface): Self = StObject.set(x, "toffee", value.asInstanceOf[js.Any])
      
      inline def setTwig(value: RendererInterface): Self = StObject.set(x, "twig", value.asInstanceOf[js.Any])
      
      inline def setUnderscore(value: RendererInterface): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      inline def setVash(value: RendererInterface): Self = StObject.set(x, "vash", value.asInstanceOf[js.Any])
      
      inline def setVelocityjs(value: RendererInterface): Self = StObject.set(x, "velocityjs", value.asInstanceOf[js.Any])
      
      inline def setWalrus(value: RendererInterface): Self = StObject.set(x, "walrus", value.asInstanceOf[js.Any])
      
      inline def setWhiskers(value: RendererInterface): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RendererInterface extends StObject {
    
    def apply(path: String): typingsJapgolly.bluebird.mod.^[String] = js.native
    def apply(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any = js.native
    def apply(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String] = js.native
    def apply(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any = js.native
    
    def render(path: String): typingsJapgolly.bluebird.mod.^[String] = js.native
    def render(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, Any]): Any = js.native
    def render(path: String, options: DictotherOptions): typingsJapgolly.bluebird.mod.^[String] = js.native
    def render(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ js.Error, /* html */ String, Any]
    ): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.consolidate.consolidateStrings.extend
    - typingsJapgolly.consolidate.consolidateStrings.ReactDOM
    - typingsJapgolly.consolidate.consolidateStrings.babel
    - typingsJapgolly.consolidate.consolidateStrings.`arc-templates`
    - typingsJapgolly.consolidate.consolidateStrings.atpl
    - typingsJapgolly.consolidate.consolidateStrings.bracket
    - typingsJapgolly.consolidate.consolidateStrings.dot
    - typingsJapgolly.consolidate.consolidateStrings.dust
    - typingsJapgolly.consolidate.consolidateStrings.eco
    - typingsJapgolly.consolidate.consolidateStrings.ejs
    - typingsJapgolly.consolidate.consolidateStrings.ect
    - typingsJapgolly.consolidate.consolidateStrings.haml
    - typingsJapgolly.consolidate.consolidateStrings.`haml-coffee`
    - typingsJapgolly.consolidate.consolidateStrings.hamlet
    - typingsJapgolly.consolidate.consolidateStrings.handlebars
    - typingsJapgolly.consolidate.consolidateStrings.hogan
    - typingsJapgolly.consolidate.consolidateStrings.htmling
    - typingsJapgolly.consolidate.consolidateStrings.jade
    - typingsJapgolly.consolidate.consolidateStrings.jazz
    - typingsJapgolly.consolidate.consolidateStrings.jqtpl
    - typingsJapgolly.consolidate.consolidateStrings.just
    - typingsJapgolly.consolidate.consolidateStrings.liquid
    - typingsJapgolly.consolidate.consolidateStrings.liquor
    - typingsJapgolly.consolidate.consolidateStrings.lodash
    - typingsJapgolly.consolidate.consolidateStrings.marko
    - typingsJapgolly.consolidate.consolidateStrings.mote
    - typingsJapgolly.consolidate.consolidateStrings.mustache
    - typingsJapgolly.consolidate.consolidateStrings.nunjucks
    - typingsJapgolly.consolidate.consolidateStrings.plates
    - typingsJapgolly.consolidate.consolidateStrings.pug
    - typingsJapgolly.consolidate.consolidateStrings.qejs
    - typingsJapgolly.consolidate.consolidateStrings.ractive
    - typingsJapgolly.consolidate.consolidateStrings.razor
    - typingsJapgolly.consolidate.consolidateStrings.react
    - typingsJapgolly.consolidate.consolidateStrings.slm
    - typingsJapgolly.consolidate.consolidateStrings.squirrelly
    - typingsJapgolly.consolidate.consolidateStrings.swig
    - typingsJapgolly.consolidate.consolidateStrings.teacup
    - typingsJapgolly.consolidate.consolidateStrings.templayed
    - typingsJapgolly.consolidate.consolidateStrings.toffee
    - typingsJapgolly.consolidate.consolidateStrings.twig
    - typingsJapgolly.consolidate.consolidateStrings.underscore
    - typingsJapgolly.consolidate.consolidateStrings.vash
    - typingsJapgolly.consolidate.consolidateStrings.velocityjs
    - typingsJapgolly.consolidate.consolidateStrings.walrus
    - typingsJapgolly.consolidate.consolidateStrings.whiskers
  */
  trait Requires extends StObject
  object Requires {
    
    inline def ReactDOM: typingsJapgolly.consolidate.consolidateStrings.ReactDOM = "ReactDOM".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ReactDOM]
    
    inline def `arc-templates`: typingsJapgolly.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.`arc-templates`]
    
    inline def atpl: typingsJapgolly.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.atpl]
    
    inline def babel: typingsJapgolly.consolidate.consolidateStrings.babel = "babel".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.babel]
    
    inline def bracket: typingsJapgolly.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.bracket]
    
    inline def dot: typingsJapgolly.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.dot]
    
    inline def dust: typingsJapgolly.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.dust]
    
    inline def eco: typingsJapgolly.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.eco]
    
    inline def ect: typingsJapgolly.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ect]
    
    inline def ejs: typingsJapgolly.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ejs]
    
    inline def extend: typingsJapgolly.consolidate.consolidateStrings.extend = "extend".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.extend]
    
    inline def haml: typingsJapgolly.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.haml]
    
    inline def `haml-coffee`: typingsJapgolly.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.`haml-coffee`]
    
    inline def hamlet: typingsJapgolly.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.hamlet]
    
    inline def handlebars: typingsJapgolly.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.handlebars]
    
    inline def hogan: typingsJapgolly.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.hogan]
    
    inline def htmling: typingsJapgolly.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.htmling]
    
    inline def jade: typingsJapgolly.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jade]
    
    inline def jazz: typingsJapgolly.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jazz]
    
    inline def jqtpl: typingsJapgolly.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jqtpl]
    
    inline def just: typingsJapgolly.consolidate.consolidateStrings.just = "just".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.just]
    
    inline def liquid: typingsJapgolly.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.liquid]
    
    inline def liquor: typingsJapgolly.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.liquor]
    
    inline def lodash: typingsJapgolly.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.lodash]
    
    inline def marko: typingsJapgolly.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.marko]
    
    inline def mote: typingsJapgolly.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.mote]
    
    inline def mustache: typingsJapgolly.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.mustache]
    
    inline def nunjucks: typingsJapgolly.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.nunjucks]
    
    inline def plates: typingsJapgolly.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.plates]
    
    inline def pug: typingsJapgolly.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.pug]
    
    inline def qejs: typingsJapgolly.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.qejs]
    
    inline def ractive: typingsJapgolly.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ractive]
    
    inline def razor: typingsJapgolly.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.razor]
    
    inline def react: typingsJapgolly.consolidate.consolidateStrings.react = "react".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.react]
    
    inline def slm: typingsJapgolly.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.slm]
    
    inline def squirrelly: typingsJapgolly.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.squirrelly]
    
    inline def swig: typingsJapgolly.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.swig]
    
    inline def teacup: typingsJapgolly.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.teacup]
    
    inline def templayed: typingsJapgolly.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.templayed]
    
    inline def toffee: typingsJapgolly.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.toffee]
    
    inline def twig: typingsJapgolly.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.twig]
    
    inline def underscore: typingsJapgolly.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.underscore]
    
    inline def vash: typingsJapgolly.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.vash]
    
    inline def velocityjs: typingsJapgolly.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.velocityjs]
    
    inline def walrus: typingsJapgolly.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.walrus]
    
    inline def whiskers: typingsJapgolly.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.whiskers]
  }
  
  /* Inlined {[ engine in consolidate.consolidate.Requires ]: any} */
  trait RequiresType extends StObject {
    
    var ReactDOM: Any
    
    var `arc-templates`: Any
    
    var atpl: Any
    
    var babel: Any
    
    var bracket: Any
    
    var dot: Any
    
    var dust: Any
    
    var eco: Any
    
    var ect: Any
    
    var ejs: Any
    
    var extend: Any
    
    var haml: Any
    
    var `haml-coffee`: Any
    
    var hamlet: Any
    
    var handlebars: Any
    
    var hogan: Any
    
    var htmling: Any
    
    var jade: Any
    
    var jazz: Any
    
    var jqtpl: Any
    
    var just: Any
    
    var liquid: Any
    
    var liquor: Any
    
    var lodash: Any
    
    var marko: Any
    
    var mote: Any
    
    var mustache: Any
    
    var nunjucks: Any
    
    var plates: Any
    
    var pug: Any
    
    var qejs: Any
    
    var ractive: Any
    
    var razor: Any
    
    var react: Any
    
    var slm: Any
    
    var squirrelly: Any
    
    var swig: Any
    
    var teacup: Any
    
    var templayed: Any
    
    var toffee: Any
    
    var twig: Any
    
    var underscore: Any
    
    var vash: Any
    
    var velocityjs: Any
    
    var walrus: Any
    
    var whiskers: Any
  }
  object RequiresType {
    
    inline def apply(
      ReactDOM: Any,
      `arc-templates`: Any,
      atpl: Any,
      babel: Any,
      bracket: Any,
      dot: Any,
      dust: Any,
      eco: Any,
      ect: Any,
      ejs: Any,
      extend: Any,
      haml: Any,
      `haml-coffee`: Any,
      hamlet: Any,
      handlebars: Any,
      hogan: Any,
      htmling: Any,
      jade: Any,
      jazz: Any,
      jqtpl: Any,
      just: Any,
      liquid: Any,
      liquor: Any,
      lodash: Any,
      marko: Any,
      mote: Any,
      mustache: Any,
      nunjucks: Any,
      plates: Any,
      pug: Any,
      qejs: Any,
      ractive: Any,
      razor: Any,
      react: Any,
      slm: Any,
      squirrelly: Any,
      swig: Any,
      teacup: Any,
      templayed: Any,
      toffee: Any,
      twig: Any,
      underscore: Any,
      vash: Any,
      velocityjs: Any,
      walrus: Any,
      whiskers: Any
    ): RequiresType = {
      val __obj = js.Dynamic.literal(ReactDOM = ReactDOM.asInstanceOf[js.Any], atpl = atpl.asInstanceOf[js.Any], babel = babel.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresType]
    }
    
    extension [Self <: RequiresType](x: Self) {
      
      inline def `setArc-templates`(value: Any): Self = StObject.set(x, "arc-templates", value.asInstanceOf[js.Any])
      
      inline def setAtpl(value: Any): Self = StObject.set(x, "atpl", value.asInstanceOf[js.Any])
      
      inline def setBabel(value: Any): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setBracket(value: Any): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
      
      inline def setDot(value: Any): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDust(value: Any): Self = StObject.set(x, "dust", value.asInstanceOf[js.Any])
      
      inline def setEco(value: Any): Self = StObject.set(x, "eco", value.asInstanceOf[js.Any])
      
      inline def setEct(value: Any): Self = StObject.set(x, "ect", value.asInstanceOf[js.Any])
      
      inline def setEjs(value: Any): Self = StObject.set(x, "ejs", value.asInstanceOf[js.Any])
      
      inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setHaml(value: Any): Self = StObject.set(x, "haml", value.asInstanceOf[js.Any])
      
      inline def `setHaml-coffee`(value: Any): Self = StObject.set(x, "haml-coffee", value.asInstanceOf[js.Any])
      
      inline def setHamlet(value: Any): Self = StObject.set(x, "hamlet", value.asInstanceOf[js.Any])
      
      inline def setHandlebars(value: Any): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHogan(value: Any): Self = StObject.set(x, "hogan", value.asInstanceOf[js.Any])
      
      inline def setHtmling(value: Any): Self = StObject.set(x, "htmling", value.asInstanceOf[js.Any])
      
      inline def setJade(value: Any): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      inline def setJazz(value: Any): Self = StObject.set(x, "jazz", value.asInstanceOf[js.Any])
      
      inline def setJqtpl(value: Any): Self = StObject.set(x, "jqtpl", value.asInstanceOf[js.Any])
      
      inline def setJust(value: Any): Self = StObject.set(x, "just", value.asInstanceOf[js.Any])
      
      inline def setLiquid(value: Any): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
      
      inline def setLiquor(value: Any): Self = StObject.set(x, "liquor", value.asInstanceOf[js.Any])
      
      inline def setLodash(value: Any): Self = StObject.set(x, "lodash", value.asInstanceOf[js.Any])
      
      inline def setMarko(value: Any): Self = StObject.set(x, "marko", value.asInstanceOf[js.Any])
      
      inline def setMote(value: Any): Self = StObject.set(x, "mote", value.asInstanceOf[js.Any])
      
      inline def setMustache(value: Any): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setNunjucks(value: Any): Self = StObject.set(x, "nunjucks", value.asInstanceOf[js.Any])
      
      inline def setPlates(value: Any): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      inline def setPug(value: Any): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      inline def setQejs(value: Any): Self = StObject.set(x, "qejs", value.asInstanceOf[js.Any])
      
      inline def setRactive(value: Any): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
      
      inline def setRazor(value: Any): Self = StObject.set(x, "razor", value.asInstanceOf[js.Any])
      
      inline def setReact(value: Any): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setReactDOM(value: Any): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      inline def setSlm(value: Any): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
      
      inline def setSquirrelly(value: Any): Self = StObject.set(x, "squirrelly", value.asInstanceOf[js.Any])
      
      inline def setSwig(value: Any): Self = StObject.set(x, "swig", value.asInstanceOf[js.Any])
      
      inline def setTeacup(value: Any): Self = StObject.set(x, "teacup", value.asInstanceOf[js.Any])
      
      inline def setTemplayed(value: Any): Self = StObject.set(x, "templayed", value.asInstanceOf[js.Any])
      
      inline def setToffee(value: Any): Self = StObject.set(x, "toffee", value.asInstanceOf[js.Any])
      
      inline def setTwig(value: Any): Self = StObject.set(x, "twig", value.asInstanceOf[js.Any])
      
      inline def setUnderscore(value: Any): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      inline def setVash(value: Any): Self = StObject.set(x, "vash", value.asInstanceOf[js.Any])
      
      inline def setVelocityjs(value: Any): Self = StObject.set(x, "velocityjs", value.asInstanceOf[js.Any])
      
      inline def setWalrus(value: Any): Self = StObject.set(x, "walrus", value.asInstanceOf[js.Any])
      
      inline def setWhiskers(value: Any): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.consolidate.consolidateStrings.`arc-templates`
    - typingsJapgolly.consolidate.consolidateStrings.atpl
    - typingsJapgolly.consolidate.consolidateStrings.bracket
    - typingsJapgolly.consolidate.consolidateStrings.dot
    - typingsJapgolly.consolidate.consolidateStrings.dust
    - typingsJapgolly.consolidate.consolidateStrings.eco
    - typingsJapgolly.consolidate.consolidateStrings.ejs
    - typingsJapgolly.consolidate.consolidateStrings.ect
    - typingsJapgolly.consolidate.consolidateStrings.haml
    - typingsJapgolly.consolidate.consolidateStrings.`haml-coffee`
    - typingsJapgolly.consolidate.consolidateStrings.hamlet
    - typingsJapgolly.consolidate.consolidateStrings.handlebars
    - typingsJapgolly.consolidate.consolidateStrings.hogan
    - typingsJapgolly.consolidate.consolidateStrings.htmling
    - typingsJapgolly.consolidate.consolidateStrings.jade
    - typingsJapgolly.consolidate.consolidateStrings.jazz
    - typingsJapgolly.consolidate.consolidateStrings.jqtpl
    - typingsJapgolly.consolidate.consolidateStrings.just
    - typingsJapgolly.consolidate.consolidateStrings.liquid
    - typingsJapgolly.consolidate.consolidateStrings.liquor
    - typingsJapgolly.consolidate.consolidateStrings.lodash
    - typingsJapgolly.consolidate.consolidateStrings.marko
    - typingsJapgolly.consolidate.consolidateStrings.mote
    - typingsJapgolly.consolidate.consolidateStrings.mustache
    - typingsJapgolly.consolidate.consolidateStrings.nunjucks
    - typingsJapgolly.consolidate.consolidateStrings.plates
    - typingsJapgolly.consolidate.consolidateStrings.pug
    - typingsJapgolly.consolidate.consolidateStrings.qejs
    - typingsJapgolly.consolidate.consolidateStrings.ractive
    - typingsJapgolly.consolidate.consolidateStrings.razor
    - typingsJapgolly.consolidate.consolidateStrings.react
    - typingsJapgolly.consolidate.consolidateStrings.slm
    - typingsJapgolly.consolidate.consolidateStrings.squirrelly
    - typingsJapgolly.consolidate.consolidateStrings.swig
    - typingsJapgolly.consolidate.consolidateStrings.teacup
    - typingsJapgolly.consolidate.consolidateStrings.templayed
    - typingsJapgolly.consolidate.consolidateStrings.toffee
    - typingsJapgolly.consolidate.consolidateStrings.twig
    - typingsJapgolly.consolidate.consolidateStrings.underscore
    - typingsJapgolly.consolidate.consolidateStrings.vash
    - typingsJapgolly.consolidate.consolidateStrings.velocityjs
    - typingsJapgolly.consolidate.consolidateStrings.walrus
    - typingsJapgolly.consolidate.consolidateStrings.whiskers
  */
  trait SupportedTemplateEngines extends StObject
  object SupportedTemplateEngines {
    
    inline def `arc-templates`: typingsJapgolly.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.`arc-templates`]
    
    inline def atpl: typingsJapgolly.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.atpl]
    
    inline def bracket: typingsJapgolly.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.bracket]
    
    inline def dot: typingsJapgolly.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.dot]
    
    inline def dust: typingsJapgolly.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.dust]
    
    inline def eco: typingsJapgolly.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.eco]
    
    inline def ect: typingsJapgolly.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ect]
    
    inline def ejs: typingsJapgolly.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ejs]
    
    inline def haml: typingsJapgolly.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.haml]
    
    inline def `haml-coffee`: typingsJapgolly.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.`haml-coffee`]
    
    inline def hamlet: typingsJapgolly.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.hamlet]
    
    inline def handlebars: typingsJapgolly.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.handlebars]
    
    inline def hogan: typingsJapgolly.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.hogan]
    
    inline def htmling: typingsJapgolly.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.htmling]
    
    inline def jade: typingsJapgolly.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jade]
    
    inline def jazz: typingsJapgolly.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jazz]
    
    inline def jqtpl: typingsJapgolly.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.jqtpl]
    
    inline def just: typingsJapgolly.consolidate.consolidateStrings.just = "just".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.just]
    
    inline def liquid: typingsJapgolly.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.liquid]
    
    inline def liquor: typingsJapgolly.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.liquor]
    
    inline def lodash: typingsJapgolly.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.lodash]
    
    inline def marko: typingsJapgolly.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.marko]
    
    inline def mote: typingsJapgolly.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.mote]
    
    inline def mustache: typingsJapgolly.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.mustache]
    
    inline def nunjucks: typingsJapgolly.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.nunjucks]
    
    inline def plates: typingsJapgolly.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.plates]
    
    inline def pug: typingsJapgolly.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.pug]
    
    inline def qejs: typingsJapgolly.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.qejs]
    
    inline def ractive: typingsJapgolly.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.ractive]
    
    inline def razor: typingsJapgolly.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.razor]
    
    inline def react: typingsJapgolly.consolidate.consolidateStrings.react = "react".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.react]
    
    inline def slm: typingsJapgolly.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.slm]
    
    inline def squirrelly: typingsJapgolly.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.squirrelly]
    
    inline def swig: typingsJapgolly.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.swig]
    
    inline def teacup: typingsJapgolly.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.teacup]
    
    inline def templayed: typingsJapgolly.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.templayed]
    
    inline def toffee: typingsJapgolly.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.toffee]
    
    inline def twig: typingsJapgolly.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.twig]
    
    inline def underscore: typingsJapgolly.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.underscore]
    
    inline def vash: typingsJapgolly.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.vash]
    
    inline def velocityjs: typingsJapgolly.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.velocityjs]
    
    inline def walrus: typingsJapgolly.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.walrus]
    
    inline def whiskers: typingsJapgolly.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typingsJapgolly.consolidate.consolidateStrings.whiskers]
  }
  
  type _To = Consolidate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Consolidate = ^
}
