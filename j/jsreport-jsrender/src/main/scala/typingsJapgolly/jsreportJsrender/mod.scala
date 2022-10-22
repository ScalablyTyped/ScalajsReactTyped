package typingsJapgolly.jsreportJsrender

import typingsJapgolly.jsreportCore.mod.ExtensionDefinition
import typingsJapgolly.jsreportCore.mod.Recipe
import typingsJapgolly.jsreportCore.mod.Template
import typingsJapgolly.jsreportJsrender.jsreportJsrenderStrings.jsrender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-jsrender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsRenderTemplate
    extends StObject
       with Template {
    
    @JSName("engine")
    var engine_JsRenderTemplate: jsrender | String
  }
  object JsRenderTemplate {
    
    inline def apply(content: String, engine: jsrender | String, recipe: Recipe | String): JsRenderTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsRenderTemplate]
    }
    
    extension [Self <: JsRenderTemplate](x: Self) {
      
      inline def setEngine(value: jsrender | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var JsRenderTemplate: typingsJapgolly.jsreportJsrender.mod.JsRenderTemplate
    }
    object TemplateRegistry {
      
      inline def apply(JsRenderTemplate: JsRenderTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(JsRenderTemplate = JsRenderTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setJsRenderTemplate(value: JsRenderTemplate): Self = StObject.set(x, "JsRenderTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
