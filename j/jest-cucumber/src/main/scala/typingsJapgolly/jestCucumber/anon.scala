package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcModelsMod.ErrorOptions
import typingsJapgolly.jestCucumber.distSrcModelsMod.ScenarioNameTemplateVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean | ErrorOptions] = js.undefined
    
    var loadRelativePath: js.UndefOr[Boolean] = js.undefined
    
    var scenarioNameTemplate: js.UndefOr[js.Function1[/* vars */ ScenarioNameTemplateVars, String]] = js.undefined
    
    var tagFilter: js.UndefOr[String] = js.undefined
  }
  object Errors {
    
    inline def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: Boolean | ErrorOptions): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setLoadRelativePath(value: Boolean): Self = StObject.set(x, "loadRelativePath", value.asInstanceOf[js.Any])
      
      inline def setLoadRelativePathUndefined: Self = StObject.set(x, "loadRelativePath", js.undefined)
      
      inline def setScenarioNameTemplate(value: /* vars */ ScenarioNameTemplateVars => String): Self = StObject.set(x, "scenarioNameTemplate", js.Any.fromFunction1(value))
      
      inline def setScenarioNameTemplateUndefined: Self = StObject.set(x, "scenarioNameTemplate", js.undefined)
      
      inline def setTagFilter(value: String): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
      
      inline def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
