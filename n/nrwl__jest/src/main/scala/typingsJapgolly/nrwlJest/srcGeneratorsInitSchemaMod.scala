package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.nrwlJestStrings.babel
import typingsJapgolly.nrwlJest.nrwlJestStrings.swc
import typingsJapgolly.nrwlJest.nrwlJestStrings.tsc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsInitSchemaMod {
  
  trait JestInitSchema extends StObject {
    
    /**
      * @deprecated
      */
    var babelJest: js.UndefOr[Boolean] = js.undefined
    
    var compiler: js.UndefOr[tsc | babel | swc] = js.undefined
    
    @JSName("js")
    var js_ : js.UndefOr[Boolean] = js.undefined
    
    var skipPackageJson: js.UndefOr[Boolean] = js.undefined
  }
  object JestInitSchema {
    
    inline def apply(): JestInitSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JestInitSchema]
    }
    
    extension [Self <: JestInitSchema](x: Self) {
      
      inline def setBabelJest(value: Boolean): Self = StObject.set(x, "babelJest", value.asInstanceOf[js.Any])
      
      inline def setBabelJestUndefined: Self = StObject.set(x, "babelJest", js.undefined)
      
      inline def setCompiler(value: tsc | babel | swc): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setJs_(value: Boolean): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
    }
  }
}
