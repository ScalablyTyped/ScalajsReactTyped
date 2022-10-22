package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersProtractorSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * Base URL for protractor to connect to.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * A dev-server builder target to run tests against in the format of
      * `project:target[:configuration]`. You can also pass in more than one configuration name
      * as a comma-separated list. Example: `project:target:production,staging`.
      */
    var devServerTarget: js.UndefOr[String] = js.undefined
    
    /**
      * Execute specs whose names match the pattern, which is internally compiled to a RegExp.
      */
    var grep: js.UndefOr[String] = js.undefined
    
    /**
      * Host to listen on.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Invert the selection specified by the 'grep' option.
      */
    var invertGrep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The port to use to serve the application.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the Protractor configuration file.
      */
    var protractorConfig: String
    
    /**
      * Override specs in the protractor config.
      */
    var specs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Override suite in the protractor config.
      */
    var suite: js.UndefOr[String] = js.undefined
    
    /**
      * Try to update webdriver.
      */
    var webdriverUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(protractorConfig: String): Schema = {
      val __obj = js.Dynamic.literal(protractorConfig = protractorConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setDevServerTarget(value: String): Self = StObject.set(x, "devServerTarget", value.asInstanceOf[js.Any])
      
      inline def setDevServerTargetUndefined: Self = StObject.set(x, "devServerTarget", js.undefined)
      
      inline def setGrep(value: String): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
      
      inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInvertGrep(value: Boolean): Self = StObject.set(x, "invertGrep", value.asInstanceOf[js.Any])
      
      inline def setInvertGrepUndefined: Self = StObject.set(x, "invertGrep", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtractorConfig(value: String): Self = StObject.set(x, "protractorConfig", value.asInstanceOf[js.Any])
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      inline def setWebdriverUpdate(value: Boolean): Self = StObject.set(x, "webdriverUpdate", value.asInstanceOf[js.Any])
      
      inline def setWebdriverUpdateUndefined: Self = StObject.set(x, "webdriverUpdate", js.undefined)
    }
  }
}
