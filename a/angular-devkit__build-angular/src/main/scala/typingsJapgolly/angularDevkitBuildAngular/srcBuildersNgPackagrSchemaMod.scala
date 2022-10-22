package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersNgPackagrSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The file path for the ng-packagr configuration file, relative to the current workspace.
      */
    var project: String
    
    /**
      * The full path for the TypeScript configuration file, relative to the current workspace.
      */
    var tsConfig: js.UndefOr[String] = js.undefined
    
    /**
      * Run build when files change.
      */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(project: String): Schema = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
