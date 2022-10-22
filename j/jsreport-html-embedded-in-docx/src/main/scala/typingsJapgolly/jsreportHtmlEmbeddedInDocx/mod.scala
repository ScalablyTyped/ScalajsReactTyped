package typingsJapgolly.jsreportHtmlEmbeddedInDocx

import typingsJapgolly.jsreportCore.mod.Engine
import typingsJapgolly.jsreportCore.mod.ExtensionDefinition
import typingsJapgolly.jsreportCore.mod.Template
import typingsJapgolly.jsreportHtmlEmbeddedInDocx.jsreportHtmlEmbeddedInDocxStrings.`html-embedded-in-docx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-html-embedded-in-docx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HtmlEmbeddedInDocxTemplate
    extends StObject
       with Template {
    
    @JSName("recipe")
    var recipe_HtmlEmbeddedInDocxTemplate: `html-embedded-in-docx` | String
  }
  object HtmlEmbeddedInDocxTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: `html-embedded-in-docx` | String): HtmlEmbeddedInDocxTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlEmbeddedInDocxTemplate]
    }
    
    extension [Self <: HtmlEmbeddedInDocxTemplate](x: Self) {
      
      inline def setRecipe(value: `html-embedded-in-docx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var HtmlEmbeddedInDocxTemplate: typingsJapgolly.jsreportHtmlEmbeddedInDocx.mod.HtmlEmbeddedInDocxTemplate
    }
    object TemplateRegistry {
      
      inline def apply(HtmlEmbeddedInDocxTemplate: HtmlEmbeddedInDocxTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(HtmlEmbeddedInDocxTemplate = HtmlEmbeddedInDocxTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setHtmlEmbeddedInDocxTemplate(value: HtmlEmbeddedInDocxTemplate): Self = StObject.set(x, "HtmlEmbeddedInDocxTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
