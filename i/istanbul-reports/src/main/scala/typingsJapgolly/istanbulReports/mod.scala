package typingsJapgolly.istanbulReports

import typingsJapgolly.istanbulLibReport.mod.Node
import typingsJapgolly.istanbulLibReport.mod.ReportBase
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`html-spa`
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`json-summary`
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`text-lcov`
import typingsJapgolly.istanbulReports.istanbulReportsStrings.`text-summary`
import typingsJapgolly.istanbulReports.istanbulReportsStrings.branches
import typingsJapgolly.istanbulReports.istanbulReportsStrings.clover
import typingsJapgolly.istanbulReports.istanbulReportsStrings.cobertura
import typingsJapgolly.istanbulReports.istanbulReportsStrings.functions
import typingsJapgolly.istanbulReports.istanbulReportsStrings.html
import typingsJapgolly.istanbulReports.istanbulReportsStrings.json
import typingsJapgolly.istanbulReports.istanbulReportsStrings.lcov
import typingsJapgolly.istanbulReports.istanbulReportsStrings.lcovonly
import typingsJapgolly.istanbulReports.istanbulReportsStrings.lines
import typingsJapgolly.istanbulReports.istanbulReportsStrings.none
import typingsJapgolly.istanbulReports.istanbulReportsStrings.statements
import typingsJapgolly.istanbulReports.istanbulReportsStrings.teamcity
import typingsJapgolly.istanbulReports.istanbulReportsStrings.text
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-reports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create_clover(name: clover): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_clover(name: clover, options: Partial[CloverOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_cobertura(name: cobertura): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_cobertura(name: cobertura, options: Partial[CoberturaOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_html(name: html): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_html(name: html, options: Partial[HtmlOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_htmlspa(name: `html-spa`): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_htmlspa(name: `html-spa`, options: Partial[HtmlSpaOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_json(name: json): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_json(name: json, options: Partial[JsonOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_jsonsummary(name: `json-summary`): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_jsonsummary(name: `json-summary`, options: Partial[JsonSummaryOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_lcov(name: lcov): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_lcov(name: lcov, options: Partial[LcovOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_lcovonly(name: lcovonly): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_lcovonly(name: lcovonly, options: Partial[LcovOnlyOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_none(name: none): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_none(name: none, options: Partial[scala.Nothing]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_teamcity(name: teamcity): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_teamcity(name: teamcity, options: Partial[TeamcityOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_text(name: text): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_text(name: text, options: Partial[TextOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_textlcov(name: `text-lcov`): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_textlcov(name: `text-lcov`, options: Partial[TextLcovOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  inline def create_textsummary(name: `text-summary`): ReportBase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[ReportBase]
  inline def create_textsummary(name: `text-summary`, options: Partial[TextSummaryOptions]): ReportBase = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReportBase]
  
  trait CloverOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object CloverOptions {
    
    inline def apply(file: String, projectRoot: String): CloverOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloverOptions]
    }
  }
  
  trait CoberturaOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object CoberturaOptions {
    
    inline def apply(file: String, projectRoot: String): CoberturaOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoberturaOptions]
    }
  }
  
  trait FileOptions extends StObject {
    
    var file: String
  }
  object FileOptions {
    
    inline def apply(file: String): FileOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlOptions extends StObject {
    
    var linkMapper: LinkMapper
    
    var skipEmpty: Boolean
    
    var subdir: String
    
    var verbose: Boolean
  }
  object HtmlOptions {
    
    inline def apply(linkMapper: LinkMapper, skipEmpty: Boolean, subdir: String, verbose: Boolean): HtmlOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlOptions]
    }
    
    extension [Self <: HtmlOptions](x: Self) {
      
      inline def setLinkMapper(value: LinkMapper): Self = StObject.set(x, "linkMapper", value.asInstanceOf[js.Any])
      
      inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      inline def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlSpaOptions
    extends StObject
       with HtmlOptions {
    
    var metricsToShow: js.Array[lines | branches | functions | statements]
  }
  object HtmlSpaOptions {
    
    inline def apply(
      linkMapper: LinkMapper,
      metricsToShow: js.Array[lines | branches | functions | statements],
      skipEmpty: Boolean,
      subdir: String,
      verbose: Boolean
    ): HtmlSpaOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], metricsToShow = metricsToShow.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlSpaOptions]
    }
    
    extension [Self <: HtmlSpaOptions](x: Self) {
      
      inline def setMetricsToShow(value: js.Array[lines | branches | functions | statements]): Self = StObject.set(x, "metricsToShow", value.asInstanceOf[js.Any])
      
      inline def setMetricsToShowVarargs(value: (lines | branches | functions | statements)*): Self = StObject.set(x, "metricsToShow", js.Array(value*))
    }
  }
  
  type JsonOptions = FileOptions
  
  type JsonSummaryOptions = FileOptions
  
  trait LcovOnlyOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object LcovOnlyOptions {
    
    inline def apply(file: String, projectRoot: String): LcovOnlyOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovOnlyOptions]
    }
  }
  
  trait LcovOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object LcovOptions {
    
    inline def apply(file: String, projectRoot: String): LcovOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovOptions]
    }
  }
  
  @js.native
  trait LinkMapper extends StObject {
    
    def assetPath(node: Node, name: String): String = js.native
    
    def getPath(node: String): String = js.native
    def getPath(node: Node): String = js.native
    
    def relativePath(source: String, target: String): String = js.native
    def relativePath(source: String, target: Node): String = js.native
    def relativePath(source: Node, target: String): String = js.native
    def relativePath(source: Node, target: Node): String = js.native
  }
  
  trait ProjectOptions extends StObject {
    
    var projectRoot: String
  }
  object ProjectOptions {
    
    inline def apply(projectRoot: String): ProjectOptions = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectOptions]
    }
    
    extension [Self <: ProjectOptions](x: Self) {
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportOptions extends StObject {
    
    var clover: CloverOptions
    
    var cobertura: CoberturaOptions
    
    var html: HtmlOptions
    
    var `html-spa`: HtmlSpaOptions
    
    var json: JsonOptions
    
    var `json-summary`: JsonSummaryOptions
    
    var lcov: LcovOptions
    
    var lcovonly: LcovOnlyOptions
    
    var teamcity: TeamcityOptions
    
    var text: TextOptions
    
    var `text-lcov`: TextLcovOptions
    
    var `text-summary`: TextSummaryOptions
  }
  object ReportOptions {
    
    inline def apply(
      clover: CloverOptions,
      cobertura: CoberturaOptions,
      html: HtmlOptions,
      `html-spa`: HtmlSpaOptions,
      json: JsonOptions,
      `json-summary`: JsonSummaryOptions,
      lcov: LcovOptions,
      lcovonly: LcovOnlyOptions,
      teamcity: TeamcityOptions,
      text: TextOptions,
      `text-lcov`: TextLcovOptions,
      `text-summary`: TextSummaryOptions
    ): ReportOptions = {
      val __obj = js.Dynamic.literal(clover = clover.asInstanceOf[js.Any], cobertura = cobertura.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lcov = lcov.asInstanceOf[js.Any], lcovonly = lcovonly.asInstanceOf[js.Any], teamcity = teamcity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("html-spa")(`html-spa`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-lcov")(`text-lcov`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportOptions]
    }
    
    extension [Self <: ReportOptions](x: Self) {
      
      inline def setClover(value: CloverOptions): Self = StObject.set(x, "clover", value.asInstanceOf[js.Any])
      
      inline def setCobertura(value: CoberturaOptions): Self = StObject.set(x, "cobertura", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HtmlOptions): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def `setHtml-spa`(value: HtmlSpaOptions): Self = StObject.set(x, "html-spa", value.asInstanceOf[js.Any])
      
      inline def setJson(value: JsonOptions): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def `setJson-summary`(value: JsonSummaryOptions): Self = StObject.set(x, "json-summary", value.asInstanceOf[js.Any])
      
      inline def setLcov(value: LcovOptions): Self = StObject.set(x, "lcov", value.asInstanceOf[js.Any])
      
      inline def setLcovonly(value: LcovOnlyOptions): Self = StObject.set(x, "lcovonly", value.asInstanceOf[js.Any])
      
      inline def setTeamcity(value: TeamcityOptions): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def `setText-lcov`(value: TextLcovOptions): Self = StObject.set(x, "text-lcov", value.asInstanceOf[js.Any])
      
      inline def `setText-summary`(value: TextSummaryOptions): Self = StObject.set(x, "text-summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.clover
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.cobertura
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.`html-spa`
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.html
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.json
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.`json-summary`
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.lcov
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.lcovonly
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.none
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.teamcity
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.text
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.`text-lcov`
    - typingsJapgolly.istanbulReports.istanbulReportsStrings.`text-summary`
  */
  trait ReportType extends StObject
  
  trait TeamcityOptions
    extends StObject
       with FileOptions {
    
    var blockName: String
  }
  object TeamcityOptions {
    
    inline def apply(blockName: String, file: String): TeamcityOptions = {
      val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamcityOptions]
    }
    
    extension [Self <: TeamcityOptions](x: Self) {
      
      inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    }
  }
  
  type TextLcovOptions = ProjectOptions
  
  trait TextOptions
    extends StObject
       with FileOptions {
    
    var maxCols: Double
    
    var skipEmpty: Boolean
    
    var skipFull: Boolean
  }
  object TextOptions {
    
    inline def apply(file: String, maxCols: Double, skipEmpty: Boolean, skipFull: Boolean): TextOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], maxCols = maxCols.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], skipFull = skipFull.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
      
      inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      inline def setSkipFull(value: Boolean): Self = StObject.set(x, "skipFull", value.asInstanceOf[js.Any])
    }
  }
  
  type TextSummaryOptions = FileOptions
}
