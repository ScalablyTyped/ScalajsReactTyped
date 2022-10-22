package typingsJapgolly.solutionCenterCommunicator

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScCommunicator {
  
  trait Environment extends StObject {
    
    /**
      * Domain where to set a cookie in case it's needed for that environment
      */
    var DOMAIN: String
    
    /**
      * URL where to reach the GoodData service API
      */
    var GOODDATA_SERVICE: js.UndefOr[String] = js.undefined
    
    /**
      * URL where to reach the merchant management service API
      */
    var MERCHANT_SERVICE: js.UndefOr[String] = js.undefined
    
    /**
      * URL where to reach the module service API
      */
    var MODULE_SERVICE: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the environment
      */
    var NAME: String
    
    /**
      * In case that the domain is localhost, a port can be also specified
      */
    var PORT: js.UndefOr[String] = js.undefined
    
    /**
      * URL where to reach the token management service API
      */
    var TOKEN_SERVICE: js.UndefOr[String] = js.undefined
    
    /**
      * URL where to reach the frontend of the environment
      */
    var URL: String
    
    /**
      * URL where to reach the user management service API
      */
    var USER_SERVICE: js.UndefOr[String] = js.undefined
    
    /**
      * URL where to reach the new user service API
      */
    var USER_SERVICE_NEW: js.UndefOr[String] = js.undefined
  }
  object Environment {
    
    inline def apply(DOMAIN: String, NAME: String, URL: String): Environment = {
      val __obj = js.Dynamic.literal(DOMAIN = DOMAIN.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    extension [Self <: Environment](x: Self) {
      
      inline def setDOMAIN(value: String): Self = StObject.set(x, "DOMAIN", value.asInstanceOf[js.Any])
      
      inline def setGOODDATA_SERVICE(value: String): Self = StObject.set(x, "GOODDATA_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setGOODDATA_SERVICEUndefined: Self = StObject.set(x, "GOODDATA_SERVICE", js.undefined)
      
      inline def setMERCHANT_SERVICE(value: String): Self = StObject.set(x, "MERCHANT_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setMERCHANT_SERVICEUndefined: Self = StObject.set(x, "MERCHANT_SERVICE", js.undefined)
      
      inline def setMODULE_SERVICE(value: String): Self = StObject.set(x, "MODULE_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setMODULE_SERVICEUndefined: Self = StObject.set(x, "MODULE_SERVICE", js.undefined)
      
      inline def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      inline def setPORT(value: String): Self = StObject.set(x, "PORT", value.asInstanceOf[js.Any])
      
      inline def setPORTUndefined: Self = StObject.set(x, "PORT", js.undefined)
      
      inline def setTOKEN_SERVICE(value: String): Self = StObject.set(x, "TOKEN_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setTOKEN_SERVICEUndefined: Self = StObject.set(x, "TOKEN_SERVICE", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setUSER_SERVICE(value: String): Self = StObject.set(x, "USER_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setUSER_SERVICEUndefined: Self = StObject.set(x, "USER_SERVICE", js.undefined)
      
      inline def setUSER_SERVICE_NEW(value: String): Self = StObject.set(x, "USER_SERVICE_NEW", value.asInstanceOf[js.Any])
      
      inline def setUSER_SERVICE_NEWUndefined: Self = StObject.set(x, "USER_SERVICE_NEW", js.undefined)
    }
  }
  
  trait Environments extends StObject {
    
    /**
      * Development environment
      */
    var DEVELOPMENT: Environment
    
    /**
      * Integration environment
      */
    var INTEGRATION: Environment
    
    /**
      * Local environment
      */
    var LOCAL: Environment
    
    /**
      * Production environment
      */
    var PRODUCTION: Environment
    
    /**
      * Stage environment
      */
    var STAGE: Environment
    
    /**
      * Testing environment
      */
    var TESTING: Environment
  }
  object Environments {
    
    inline def apply(
      DEVELOPMENT: Environment,
      INTEGRATION: Environment,
      LOCAL: Environment,
      PRODUCTION: Environment,
      STAGE: Environment,
      TESTING: Environment
    ): Environments = {
      val __obj = js.Dynamic.literal(DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], INTEGRATION = INTEGRATION.asInstanceOf[js.Any], LOCAL = LOCAL.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any], TESTING = TESTING.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environments]
    }
    
    extension [Self <: Environments](x: Self) {
      
      inline def setDEVELOPMENT(value: Environment): Self = StObject.set(x, "DEVELOPMENT", value.asInstanceOf[js.Any])
      
      inline def setINTEGRATION(value: Environment): Self = StObject.set(x, "INTEGRATION", value.asInstanceOf[js.Any])
      
      inline def setLOCAL(value: Environment): Self = StObject.set(x, "LOCAL", value.asInstanceOf[js.Any])
      
      inline def setPRODUCTION(value: Environment): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      inline def setSTAGE(value: Environment): Self = StObject.set(x, "STAGE", value.asInstanceOf[js.Any])
      
      inline def setTESTING(value: Environment): Self = StObject.set(x, "TESTING", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScEnvironmentsProvider extends StObject {
    
    /**
      * Access to the public methods of the service
      */
    @JSName("$get")
    def $get(): Any
    
    /**
      * Get current environment
      * If environment was not previously configured, use default environment
      *
      * @returns Current or default environment
      */
    def getCurrentEnvironment(): Environment
    
    /**
      * Get specific environment
      *
      * @param name - Environment name
      * @returns Specific or default environment
      */
    def getSpecificEnvironment(name: String): Environment
    
    /**
      * Set current environment
      *
      * @param env - Environment name or custom environment object
      * @returns Named or custom environment
      */
    def setCurrentEnvironment(env: Any): Environment
  }
  object ScEnvironmentsProvider {
    
    inline def apply(
      $get: CallbackTo[Any],
      getCurrentEnvironment: CallbackTo[Environment],
      getSpecificEnvironment: String => Environment,
      setCurrentEnvironment: Any => Environment
    ): ScEnvironmentsProvider = {
      val __obj = js.Dynamic.literal($get = $get.toJsFn, getCurrentEnvironment = getCurrentEnvironment.toJsFn, getSpecificEnvironment = js.Any.fromFunction1(getSpecificEnvironment), setCurrentEnvironment = js.Any.fromFunction1(setCurrentEnvironment))
      __obj.asInstanceOf[ScEnvironmentsProvider]
    }
    
    extension [Self <: ScEnvironmentsProvider](x: Self) {
      
      inline def set$get(value: CallbackTo[Any]): Self = StObject.set(x, "$get", value.toJsFn)
      
      inline def setGetCurrentEnvironment(value: CallbackTo[Environment]): Self = StObject.set(x, "getCurrentEnvironment", value.toJsFn)
      
      inline def setGetSpecificEnvironment(value: String => Environment): Self = StObject.set(x, "getSpecificEnvironment", js.Any.fromFunction1(value))
      
      inline def setSetCurrentEnvironment(value: Any => Environment): Self = StObject.set(x, "setCurrentEnvironment", js.Any.fromFunction1(value))
    }
  }
}
