package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersAppShellSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * Script that exports the Server AppModule to render. This should be the main JavaScript
      * outputted by the server target. By default we will resolve the outputPath of the
      * serverTarget and find a bundle named 'main' in it (whether or not there's a hash tag).
      */
    var appModuleBundle: js.UndefOr[String] = js.undefined
    
    /**
      * A browser builder target use for rendering the application shell in the format of
      * `project:target[:configuration]`. You can also pass in more than one configuration name
      * as a comma-separated list. Example: `project:target:production,staging`.
      */
    var browserTarget: String
    
    /**
      * The input path for the index.html file. By default uses the output index.html of the
      * browser target.
      */
    var inputIndexPath: js.UndefOr[String] = js.undefined
    
    /**
      * The output path of the index.html file. By default will overwrite the input file.
      */
    var outputIndexPath: js.UndefOr[String] = js.undefined
    
    /**
      * The route to render.
      */
    var route: js.UndefOr[String] = js.undefined
    
    /**
      * A server builder target use for rendering the application shell in the format of
      * `project:target[:configuration]`. You can also pass in more than one configuration name
      * as a comma-separated list. Example: `project:target:production,staging`.
      */
    var serverTarget: String
  }
  object Schema {
    
    inline def apply(browserTarget: String, serverTarget: String): Schema = {
      val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any], serverTarget = serverTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAppModuleBundle(value: String): Self = StObject.set(x, "appModuleBundle", value.asInstanceOf[js.Any])
      
      inline def setAppModuleBundleUndefined: Self = StObject.set(x, "appModuleBundle", js.undefined)
      
      inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
      
      inline def setInputIndexPath(value: String): Self = StObject.set(x, "inputIndexPath", value.asInstanceOf[js.Any])
      
      inline def setInputIndexPathUndefined: Self = StObject.set(x, "inputIndexPath", js.undefined)
      
      inline def setOutputIndexPath(value: String): Self = StObject.set(x, "outputIndexPath", value.asInstanceOf[js.Any])
      
      inline def setOutputIndexPathUndefined: Self = StObject.set(x, "outputIndexPath", js.undefined)
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setServerTarget(value: String): Self = StObject.set(x, "serverTarget", value.asInstanceOf[js.Any])
    }
  }
}
