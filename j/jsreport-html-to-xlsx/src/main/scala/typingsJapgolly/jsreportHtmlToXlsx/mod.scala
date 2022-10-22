package typingsJapgolly.jsreportHtmlToXlsx

import typingsJapgolly.jsreportCore.mod.Engine
import typingsJapgolly.jsreportCore.mod.ExtensionDefinition
import typingsJapgolly.jsreportCore.mod.Template
import typingsJapgolly.jsreportHtmlToXlsx.anon.HtmlEngine
import typingsJapgolly.jsreportHtmlToXlsx.anon.PartialOptions
import typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-html-to-xlsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Html2XlsxTemplate
    extends StObject
       with Template {
    
    var htmlToXlsx: HtmlEngine
    
    @JSName("recipe")
    var recipe_Html2XlsxTemplate: `html-to-xlsx` | String
  }
  object Html2XlsxTemplate {
    
    inline def apply(content: String, engine: Engine | String, htmlToXlsx: HtmlEngine, recipe: `html-to-xlsx` | String): Html2XlsxTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html2XlsxTemplate]
    }
    
    extension [Self <: Html2XlsxTemplate](x: Self) {
      
      inline def setHtmlToXlsx(value: HtmlEngine): Self = StObject.set(x, "htmlToXlsx", value.asInstanceOf[js.Any])
      
      inline def setRecipe(value: `html-to-xlsx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with typingsJapgolly.jsreportXlsx.mod.Options {
    
    var strategy: String
  }
  object Options {
    
    inline def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double, strategy: String): Options = {
      val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom
    - typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome
  */
  trait htmlEngine extends StObject
  object htmlEngine {
    
    inline def chrome: typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome = "chrome".asInstanceOf[typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome]
    
    inline def phantom: typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom = "phantom".asInstanceOf[typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom]
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var Html2XlsxTemplate: typingsJapgolly.jsreportHtmlToXlsx.mod.Html2XlsxTemplate
    }
    object TemplateRegistry {
      
      inline def apply(Html2XlsxTemplate: Html2XlsxTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(Html2XlsxTemplate = Html2XlsxTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setHtml2XlsxTemplate(value: Html2XlsxTemplate): Self = StObject.set(x, "Html2XlsxTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
