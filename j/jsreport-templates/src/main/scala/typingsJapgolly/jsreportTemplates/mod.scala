package typingsJapgolly.jsreportTemplates

import typingsJapgolly.jsreportCore.mod.Engine
import typingsJapgolly.jsreportCore.mod.ExtensionDefinition
import typingsJapgolly.jsreportCore.mod.Recipe
import typingsJapgolly.jsreportCore.mod.TemplateBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NamedTemplate
    extends StObject
       with TemplateBase {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object NamedTemplate {
    
    inline def apply(engine: Engine | String, recipe: Recipe | String): NamedTemplate = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedTemplate]
    }
    
    extension [Self <: NamedTemplate](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var NamedTemplate: typingsJapgolly.jsreportTemplates.mod.NamedTemplate
    }
    object TemplateRegistry {
      
      inline def apply(NamedTemplate: NamedTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(NamedTemplate = NamedTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setNamedTemplate(value: NamedTemplate): Self = StObject.set(x, "NamedTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
