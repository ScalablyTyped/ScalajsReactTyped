package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.nrwlJestStrings._empty
import typingsJapgolly.nrwlJest.nrwlJestStrings.`web-components`
import typingsJapgolly.nrwlJest.nrwlJestStrings.angular
import typingsJapgolly.nrwlJest.nrwlJestStrings.babel
import typingsJapgolly.nrwlJest.nrwlJestStrings.jsdom
import typingsJapgolly.nrwlJest.nrwlJestStrings.node
import typingsJapgolly.nrwlJest.nrwlJestStrings.none
import typingsJapgolly.nrwlJest.nrwlJestStrings.swc
import typingsJapgolly.nrwlJest.nrwlJestStrings.tsc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsJestProjectSchemaMod {
  
  trait JestProjectSchema extends StObject {
    
    /**
      * @deprecated
      */
    var babelJest: js.UndefOr[Boolean] = js.undefined
    
    var compiler: js.UndefOr[tsc | babel | swc] = js.undefined
    
    @JSName("js")
    var js_ : js.UndefOr[Boolean] = js.undefined
    
    var project: String
    
    var setupFile: js.UndefOr[angular | `web-components` | none] = js.undefined
    
    var skipFormat: js.UndefOr[Boolean] = js.undefined
    
    var skipPackageJson: js.UndefOr[Boolean] = js.undefined
    
    var skipSerializers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var skipSetupFile: js.UndefOr[Boolean] = js.undefined
    
    var supportTsx: js.UndefOr[Boolean] = js.undefined
    
    var testEnvironment: js.UndefOr[node | jsdom | _empty] = js.undefined
  }
  object JestProjectSchema {
    
    inline def apply(project: String): JestProjectSchema = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestProjectSchema]
    }
    
    extension [Self <: JestProjectSchema](x: Self) {
      
      inline def setBabelJest(value: Boolean): Self = StObject.set(x, "babelJest", value.asInstanceOf[js.Any])
      
      inline def setBabelJestUndefined: Self = StObject.set(x, "babelJest", js.undefined)
      
      inline def setCompiler(value: tsc | babel | swc): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setJs_(value: Boolean): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setSetupFile(value: angular | `web-components` | none): Self = StObject.set(x, "setupFile", value.asInstanceOf[js.Any])
      
      inline def setSetupFileUndefined: Self = StObject.set(x, "setupFile", js.undefined)
      
      inline def setSkipFormat(value: Boolean): Self = StObject.set(x, "skipFormat", value.asInstanceOf[js.Any])
      
      inline def setSkipFormatUndefined: Self = StObject.set(x, "skipFormat", js.undefined)
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
      
      inline def setSkipSerializers(value: Boolean): Self = StObject.set(x, "skipSerializers", value.asInstanceOf[js.Any])
      
      inline def setSkipSerializersUndefined: Self = StObject.set(x, "skipSerializers", js.undefined)
      
      inline def setSkipSetupFile(value: Boolean): Self = StObject.set(x, "skipSetupFile", value.asInstanceOf[js.Any])
      
      inline def setSkipSetupFileUndefined: Self = StObject.set(x, "skipSetupFile", js.undefined)
      
      inline def setSupportTsx(value: Boolean): Self = StObject.set(x, "supportTsx", value.asInstanceOf[js.Any])
      
      inline def setSupportTsxUndefined: Self = StObject.set(x, "supportTsx", js.undefined)
      
      inline def setTestEnvironment(value: node | jsdom | _empty): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
    }
  }
}
